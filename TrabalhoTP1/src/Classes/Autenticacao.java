/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Autenticacao {
    
    private ArrayList<String> Cliente;

    public Autenticacao(ArrayList<String> Cliente) {
        this.Cliente = Cliente;
    }
    
    public ArrayList<String> getCliente() {
        return Cliente;
    }

    public void setCliente(ArrayList<String> Cliente) {
        this.Cliente = Cliente;
    }
    
    
    
}
