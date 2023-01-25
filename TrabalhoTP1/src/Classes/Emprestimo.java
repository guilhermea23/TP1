/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class Emprestimo {
    
    private long idEmprestimo;
    private Date dataRetirada, dataRetorno, prazoRetorno;
    private boolean atraso = false;

    public Emprestimo(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public Date getPrazoRetorno() {
        return prazoRetorno;
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

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public void setPrazoRetorno(Date prazoRetorno) {
        this.prazoRetorno = prazoRetorno;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }
    
    
}
