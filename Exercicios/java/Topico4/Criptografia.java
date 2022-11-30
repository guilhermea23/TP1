package Exercicios.java.Topico4;

import java.util.Scanner;

public class Criptografia {
  private String frase;

  public Criptografia(String frase) {
    this.frase = frase;
  }

  public String getFrase() {
    return frase;
  }

  public void setFrase(String frase) {
    this.frase = frase;
  }

  public String criptografarFrase() {
    for (int iterator = 0; iterator < this.frase.length(); iterator++) {
      String vogais = "aeiouãõ";
      vogais = vogais.concat(vogais.toUpperCase());
      String acentos = "áéíóúàèìòùâêîôû";
      acentos = acentos.concat(acentos.toUpperCase());
      char caracter = this.frase.charAt(iterator);
      if (vogais.contains(String.valueOf(caracter)) || acentos.contains(String.valueOf(caracter))) {
        this.setFrase(this.frase.replace(caracter, '*'));
      }
    }
    return this.frase;
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in, "UTF-8");
    String frase1 = entrada.nextLine();
    String frase2 = entrada.nextLine();
    String novaEntrada = entrada.nextLine();
    Criptografia cripto = new Criptografia(frase1);
    System.out.println(frase2);
    cripto.setFrase(novaEntrada);
    System.out.println(cripto.criptografarFrase());
  }
}