/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author gabri
 */
public class Filme {
    
    private long idFilme;
    private String titulo, genero;
    private int anoLancamento;

    public Filme(long idFilme, String titulo, String genero, int anoLancamento) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
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
    
}
