/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author bodao
 */
public class Editora {
    private long idEditora;    
    private String nomeEditora;
    private String enderecoEditora;
    private String telefoneEditora;
    private final String filePath = "src\\Arquivos\\EditorasCadastradas.txt";
    
    public Editora(){}
    public Editora(long idEditora,String nomeEditora, String paisEditora, String telefoneEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
        this.enderecoEditora = paisEditora;
        this.telefoneEditora = telefoneEditora;        
    }
    
    public void cadastraEditora(long idEditora,String nomeEditora, String paisEditora, String telefoneEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
        this.enderecoEditora = paisEditora;
        this.telefoneEditora = telefoneEditora;        
    }

    public long getIdEditora() {
        return idEditora;
    }

    public String getEnderecoEditora() {
        return enderecoEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public String getPaisEditora() {
        return enderecoEditora;
    }

    public String getTelefoneEditora() {
        return telefoneEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void setPaisEditora(String enderecoEditora) {
        this.enderecoEditora = enderecoEditora;
    }

    public void setTelefoneEditora(String telefoneEditora) {
        this.telefoneEditora = telefoneEditora;
    }
    
    @Override
    public String toString() {
        return nomeEditora + "," + enderecoEditora + "," + telefoneEditora ;
    }
    
    public long idEditora(){
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
    
    //Fazer o cadastro do autor
    public void editoraCadastro() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados da editora: " + e.getMessage());
        }

    }
    
}
