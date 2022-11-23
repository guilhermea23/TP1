package Exercicios.java.Topico3;

import java.text.DecimalFormat;
import java.util.Scanner;

class Conta {
  int numeroConta;
  String nomeCliente;
  Double saldoConta;
  int senhaConta;

  public Conta(int numeroConta, int senhaConta, String nomeCliente, Double saldoConta) {
    this.numeroConta = numeroConta;
    this.nomeCliente = nomeCliente;
    this.senhaConta = senhaConta;
    this.saldoConta = saldoConta;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public Double getSaldoConta() {
    return saldoConta;
  }

  public void setSaldoConta(Double saldoConta) {
    this.saldoConta = saldoConta;
  }

  public int getSenhaConta() {
    return senhaConta;
  }

  public void setSenhaConta(int senhaConta) {
    this.senhaConta = senhaConta;
  }

  public boolean sacar(Double valor, int senha) {
    if (valor > 0 && valor < this.getSaldoConta() && senha == this.getSenhaConta()) {
      this.setSaldoConta(this.getSaldoConta() - valor);
      return true;
    } else {
      return false;
    }
  }

  public boolean depositar(Double valor, int senha) {
    if (valor > 0 && senha == this.getSenhaConta()) {
      this.setSaldoConta(this.getSaldoConta() + valor);
      return true;
    } else {
      return false;
    }
  }

  public boolean transferir(Double valor, int senha, Conta conta2) {
    if (valor > 0 && valor <= this.getSaldoConta() && senha == this.getSenhaConta()) {
      conta2.depositar(valor, conta2.getSenhaConta());
      this.sacar(valor, this.getSenhaConta());
      return true;
    } else {
      return false;
    }
  }

}

public class Banco {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in, "UTF-8");
    DecimalFormat df = new DecimalFormat("##.00");
    String[] dados = new String[2];
    for (int iterator = 0; iterator < 2; iterator++) {
      String dadosLinha = entrada.nextLine();
      dados[iterator] = dadosLinha;
    }

    String[] dadosConta1 = dados[0].split(" ");
    String[] dadosConta2 = dados[1].split(" ");
    Conta conta1 = new Conta(Integer.parseInt(dadosConta1[0]), Integer.parseInt(dadosConta1[1]), dadosConta1[2],
        Double.parseDouble(dadosConta1[3]));
    Conta conta2 = new Conta(Integer.parseInt(dadosConta2[0]), Integer.parseInt(dadosConta2[1]), dadosConta2[2],
        Double.parseDouble(dadosConta2[3]));
    while (true) {
      int option = entrada.nextInt();
      if (option == 5) {
        entrada.close();
        break;
      } else if (option == 1) { // visualizar saldo
        int senhaParaVerificacao = entrada.nextInt();
        if (senhaParaVerificacao == conta1.getSenhaConta()) {
          System.out.println(df.format(conta1.getSaldoConta()));
        } else {
          System.out.println("senha incorreta");
        }
      } else if (option == 2) { // sacar
        Double valor = entrada.nextDouble();
        int senhaParaVerificacao = entrada.nextInt();
        if (senhaParaVerificacao == conta1.getSenhaConta()) {
          if (conta1.sacar(valor, senhaParaVerificacao)) {
            System.out.println("saque realizado");
          } else {
            System.out.println("saque não realizado");
          }
        } else {
          System.out.println("saque não realizado");
        }
      } else if (option == 3) { // depositar
        Double valorDeposito = entrada.nextDouble();
        int senhaParaVerificacao = entrada.nextInt();
        if (senhaParaVerificacao == conta1.getSenhaConta()) {
          if (conta1.depositar(valorDeposito, senhaParaVerificacao)) {
            System.out.println("depósito realizado");
          } else {
            System.out.println("depósito não realizado");
          }
        } else {
          System.out.println("depósito não realizado");
        }
      } else if (option == 4) { // transferência entre contas
        String nomeCliente = entrada.next();
        if (nomeCliente.equals(conta2.getNomeCliente())) {
          Double valorTransferencia = entrada.nextDouble();
          int senhaParaVerificacao = entrada.nextInt();
          if (conta1.transferir(valorTransferencia, senhaParaVerificacao, conta2)) {
            System.out.println("transferência realizada");
          } else {
            System.out.println("transferência não realizada");
          }
        } else {
          System.out.println("nenhum usuário encontrado");
        }
        entrada.close();
      }
    }
  }
}