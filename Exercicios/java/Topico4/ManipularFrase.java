package Exercicios.java.Topico4;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class Frase {
  private String frase;

  public Frase(String frase) {
    this.frase = frase;
  }

  public String getFrase() {
    return frase;
  }

  public void setFrase(String frase) {
    this.frase = frase;
  }

  public int contarPalavras() {
    String[] response = this.frase.split(" ");
    return response.length;
  }

  public int contarVogais() {
    int qtd = 0;
    String vogais = "aeiouãõ";
    vogais = vogais.concat(vogais.toUpperCase());
    String acentos = "áéíóúàèìòùâêîôû";
    acentos = acentos.concat(acentos.toUpperCase());
    for (int iterator = 0; iterator < this.frase.length(); iterator++) {
      char caractere = this.frase.charAt(iterator);
      if (vogais.contains(String.valueOf(caractere)) || acentos.contains(String.valueOf(caractere))) {
        qtd++;
      }
    }
    return qtd;

  }

}

public class ManipularFrase {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in, "UTF-8");
    String frase1 = entrada.nextLine();
    String frase2 = entrada.nextLine();
    Frase f1 = new Frase(frase1);
    Frase f2 = new Frase(frase2);
    System.out.println(f1.contarPalavras());
    System.out.println(f2.contarVogais());
    entrada.close();
  }
}
