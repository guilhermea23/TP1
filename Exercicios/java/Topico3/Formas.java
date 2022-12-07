package Exercicios.java.Topico3;

import java.util.Scanner;

class Retangulo {
  private int comprimento = 1;
  private int largura = 1;

  public int getComprimento() {
    return comprimento;
  }

  public void setComprimento(int comprimento) {
    if (comprimento > 0 && comprimento < 20) {
      this.comprimento = comprimento;
    }
  }

  public int getLargura() {
    return largura;
  }

  public void setLargura(int largura) {
    if (largura > 0 && largura < 20) {
      this.largura = largura;
    }
  }

  public int perimetro(int comprimento, int largura) {
    return (2 * (this.getComprimento() + this.getLargura()));
  }

  public int area(int comprimento, int largura) {
    return this.getComprimento() * this.getLargura();

  }
}

public class Formas {
  public static void main(String[] args) {
    Retangulo retangulo1 = new Retangulo();
    Retangulo retangulo2 = new Retangulo();
    Scanner entrada = new Scanner(System.in);
    String primeiraEntrada = entrada.nextLine();
    String segundaEntrada = entrada.nextLine();
    String primeiroArray[] = primeiraEntrada.split(" ");
    String segundoArray[] = segundaEntrada.split(" ");
    retangulo1.setComprimento(Integer.parseInt(primeiroArray[0]));
    retangulo1.setLargura(Integer.parseInt(primeiroArray[1]));
    retangulo2.setComprimento(Integer.parseInt(segundoArray[0]));
    retangulo2.setLargura(Integer.parseInt(segundoArray[1]));
    System.out.printf("%d %d %d %d%n",
        retangulo1.getComprimento(),
        retangulo1.getLargura(),
        retangulo1.perimetro(retangulo1.getComprimento(), retangulo1.getLargura()),
        retangulo1.area(retangulo1.getComprimento(), retangulo1.getLargura()));
    System.out.printf("%d %d %d %d%n",
        retangulo2.getComprimento(),
        retangulo2.getLargura(),
        retangulo2.perimetro(retangulo2.getComprimento(), retangulo2.getLargura()),
        retangulo2.area(retangulo2.getComprimento(), retangulo2.getLargura()));
    entrada.close();
  }
}
