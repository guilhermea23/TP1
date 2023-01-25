import java.util.ArrayList;
import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

/**
 *
 * @author Guilherme
 */
abstract class Contato {

    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public abstract String imprimirBasico();

    public abstract String imprimirContato();

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

}

class Amigo extends Contato {

    protected int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String imprimirBasico() {
        if (grau == 1) {
            return "Nome: " + nome
                    + "\nApelido: " + apelido
                    + "\nEmail: " + email
                    + "\nAniversário: " + aniversario
                    + "\nGrau: Melhor Amigo";
        } else if (grau == 2) {
            return "Nome: " + nome
                    + "\nApelido: " + apelido
                    + "\nEmail: " + email
                    + "\nAniversário: " + aniversario
                    + "\nGrau: Amigo";
        } else {
            return "Nome: " + nome
                    + "\nApelido: " + apelido
                    + "\nEmail: " + email
                    + "\nAniversário: " + aniversario
                    + "\nGrau: Conhecido";
        }
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico();
    }

}

class Familia extends Contato {

    protected String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String imprimirBasico() {
        return "Nome: " + nome
                + "\nApelido: " + apelido
                + "\nEmail: " + email
                + "\nAniversário: " + aniversario
                + "\nParentesco: " + parentesco;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico();
    }

}

class ColegasDeTrabalho extends Contato {

    protected String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String imprimirBasico() {
        return "Nome: " + nome
                + "\nApelido: " + apelido
                + "\nEmail: " + email
                + "\nAniversário: " + aniversario
                + "\nRelacionamento de trabalho: " + tipo;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico();
    }
}

public class UsoContatos {
    static ArrayList<Contato> contatos = new ArrayList<>();

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in, "utf-8");
        while (true) {
            String[] entradas = entrada.nextLine().split(" ");
            if (entradas[0].equals("1")) {
                String[] dados = entrada.nextLine().split(" ");
                if (entradas[1].equals("1")) {
                    Contato contatoAmigo = new Amigo(dados[0], dados[1], dados[2], dados[3],
                            Integer.parseInt(dados[4]));
                    contatos.add(contatoAmigo);
                } else if (entradas[1].equals("2")) {
                    Contato contatoFamilia = new Familia(dados[0], dados[1], dados[2], dados[3], dados[4]);
                    contatos.add(contatoFamilia);
                } else {
                    Contato contatoColegaDeTrabalho = new ColegasDeTrabalho(dados[0], dados[1], dados[2], dados[3],
                            dados[4]);
                    contatos.add(contatoColegaDeTrabalho);
                }
            } else if (entradas[0].equals("2")) {
                for (Contato contato : contatos) {
                    System.out.println(contato.imprimirContato());
                }
            } else if (entradas[0].equals("3")) {
                for (Contato contato : contatos) {
                    if (contato instanceof Familia) {
                        System.out.println(contato.imprimirContato());
                    }
                }
            } else if (entradas[0].equals("4")) {
                for (Contato contato : contatos) {
                    if (contato instanceof Amigo) {
                        System.out.println(contato.imprimirContato());
                    }
                }
            } else if (entradas[0].equals("5")) {
                for (Contato contato : contatos) {
                    if (contato instanceof ColegasDeTrabalho) {
                        System.out.println(contato.imprimirContato());
                    }
                }
            } else if (entradas[0].equals("6")) {
                for (Contato contato : contatos) {
                    if (contato instanceof Amigo) {
                        if (((Amigo) contato).getGrau() == 1) {
                            System.out.println(((Amigo) contato).imprimirContato());
                        }
                    }

                    if (contato instanceof Familia) {
                        if (((Familia) contato).getParentesco().equals("irmão")) {
                            System.out.println(((Familia) contato).imprimirContato());
                        }
                    }

                    if (contato instanceof ColegasDeTrabalho) {
                        if (((ColegasDeTrabalho) contato).getTipo().equals("colega")) {
                            System.out.println(((ColegasDeTrabalho) contato).imprimirContato());
                        }
                    }
                }
            } else if (entradas[0].equals("7")) {
                String indiceString = entrada.next();
                int indiceInteiro = Integer.parseInt(indiceString) - 1;
                Contato contatoSelecionado = contatos.get(indiceInteiro);
                if (contatoSelecionado instanceof Familia) {
                    System.out.println(((Familia) contatoSelecionado).imprimirContato());
                } else if (contatoSelecionado instanceof Amigo) {
                    System.out.println(((Amigo) contatoSelecionado).imprimirContato());
                } else if (contatoSelecionado instanceof ColegasDeTrabalho) {
                    System.out.println(((ColegasDeTrabalho) contatoSelecionado).imprimirContato());
                }

            } else {
                break;
            }
        }
        entrada.close();
    }
}
