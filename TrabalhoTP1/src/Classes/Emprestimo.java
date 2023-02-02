package Classes;

import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Classes.Acervo;
import Classes.Artigo;
import Classes.Filme;
import Classes.Livro;
import Classes.Cliente;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;




public class Emprestimo {

    private long idEmprestimo = 1;
    private Date dataRetirada;
    private boolean atraso = false;
    private long cliente;
    private Date dataDevolucao;
    private final String filePath = "src\\Arquivos\\Emprestimos.txt";
    private final String filePath2 = "src\\Arquivos\\Clientes.txt";
    
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Emprestimo() {
        
    }
    
    public Emprestimo(long id, long matricula) {
        this.idEmprestimo = id;
        this.cliente = matricula;
        this.dataRetirada = new Date();
        this.dataDevolucao = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000); // 7 dias a partir da data de empréstimo
    }

    public Emprestimo(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setIdEmprestimo(long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

        Acervo acervo = new Acervo();

        
        
    public String lerCliente(long mat) {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath2));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts[0].equals(mat)) {
                    return parts[0];
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de usuários: " + e.getMessage());
        }
        return null;
    }    

    public void salvarEmprestimo(long codigoLivro, long idCliente) {
        
        Livro idLivro = new Livro();
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            
            //Cliente clientes = new Cliente();
            Livro livro = new Livro();
            long matricula = idCliente;
            
            livro.setEmprestado(true);
            
            writer.write(getIdEmprestimo() + "," + matricula + "," + livro.getIdLivro());
            writer.newLine();
            writer.close();
            idEmprestimo++;
        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo de emprestimos: " + e.getMessage());
        }
    }
    
    public Livro pegarLivroDoAcervo(String idItem) {
        List<Livro> acervo = carregarAcervoDeLivros();
        for (Livro livro : acervo) {
            if (Long.toString(livro.getIdLivro()).equals(idItem) && !livro.isEmprestado()) { {
                    return livro;
                }
            }
        }
        return null;
    }

    private static List<Livro> carregarAcervoDeLivros() {

        List<Livro> acervo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("acervoLivro.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                String titulo = dadosLivro[1];
                String genero = dadosLivro[2];
                int quantidadePaginas = Integer.parseInt(dadosLivro[3]);
                int edicao = Integer.parseInt(dadosLivro[4]);
                int anoPublicacao = Integer.parseInt(dadosLivro[5]);
                boolean emprestado = Boolean.parseBoolean(dadosLivro[6]);

                Livro livro = new Livro(id, titulo, genero, quantidadePaginas, edicao, anoPublicacao, emprestado);
                acervo.add(livro);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de livros: " + e.getMessage());
        }
        return acervo;
    }

    //Artigo
    //Faz a leitura e retorna o artigo a ser emprestado
    public static Artigo pegarArtigoDoAcervo(String idItem) {
        List<Artigo> acervo = carregarAcervoDeArtigos();
        for (Artigo artigo : acervo) {
            if (Long.toString(artigo.idArtigo()).equals(idItem) && !artigo.isEmprestado()) {
                return artigo;
            }
        }
        return null;
    }
    //Carrega o acervo de artigos em uma lista

    private static List<Artigo> carregarAcervoDeArtigos() {

        List<Artigo> acervo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("acervoArtigo.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                String titulo = dadosLivro[1];
                int anoPublicacao = Integer.parseInt(dadosLivro[2]);
                String autorArtigo = dadosLivro[3];
                boolean emprestado = Boolean.parseBoolean(dadosLivro[4]);

                Artigo artigo = new Artigo(id, titulo, anoPublicacao, autorArtigo, emprestado);
                acervo.add(artigo);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de artigos: " + e.getMessage());
        }
        return acervo;
    }

    //Filme
    public static Filme pegarFilmeDoAcervo(String idItem) {
        List<Filme> acervo = carregarAcervoDeFilmes();
        for (Filme filme : acervo) {
            if (Long.toString(filme.getIdFilme()).equals(idItem) && !filme.isEmprestado()) {
                return filme;
            }
        }
        return null;
    }

    private static List<Filme> carregarAcervoDeFilmes() {

        List<Filme> acervo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("acervoFilme.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                String titulo = dadosLivro[1];
                String genero = dadosLivro[2];
                int anoLancamento = Integer.parseInt(dadosLivro[3]);
                boolean emprestado = Boolean.parseBoolean(dadosLivro[4]);

                Filme filme = new Filme(id, titulo, genero, anoLancamento, emprestado);
                acervo.add(filme);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return acervo;
    }

}
