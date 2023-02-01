/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabri
 */
public class Filme {
    private long idFilme;
    private String titulo, genero;
    private int anoLancamento;
    private boolean emprestado;
    private final String filePath = "src\\Arquivos\\FilmesCadastrados.txt";
    
    public Filme(){}
    public Filme(long idFilme, String titulo, String genero, int anoLancamento, boolean emprestado) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.emprestado = emprestado;
    }
    
    public void cadastrarFilme(long idFilme, String titulo, String genero, int anoLancamento, boolean emprestado) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.emprestado = emprestado;
    }
    
    public long getIdFilme() {
        return idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setIdFilme(long idFilme) {
        this.idFilme = idFilme;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public String toString() {
        return titulo + "," + genero + "," + anoLancamento + "," + emprestado ;
    }
    
    public long idFilme(){
        int id = 1;
        try{
            BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                id++;
            }
            reader.close();
        }catch (IOException e) {
            System.err.println("Erro ao escrever dados do livro: " + e.getMessage());
        }
        
        return id;        
    }
    
    //Fazer o cadastro filme
    public void filmeCadastro() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do filme: " + e.getMessage());
        }

    }

}
