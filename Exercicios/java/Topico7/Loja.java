import java.util.ArrayList;
import java.util.Scanner;

class Veiculo {
  protected String placa;
  protected int numeroPortas;
  protected float preco;

  public Veiculo() {
  }

  public Veiculo(String placa, int numeroPortas, float preco) {
    this.placa = placa;
    this.numeroPortas = numeroPortas;
    this.preco = preco;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getNumeroPortas() {
    return numeroPortas;
  }

  public void setNumeroPortas(int numeroPortas) {
    this.numeroPortas = numeroPortas;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Placa: " + placa +
        " Número de portas: " + numeroPortas +
        " Preço: R$" + preco;
  }
}

class Carro extends Veiculo {
  private String cor;

  public Carro() {
  }

  public Carro(String placa, int numeroPortas, float preco, String cor) {
    super(placa, numeroPortas, preco);
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "Placa: " + this.placa +
        " Número de portas: " + this.numeroPortas +
        " Preço: R$" + this.preco +
        " Cor: " + cor;
  }
}

class Moto extends Veiculo {

  private int qtdeCilidradas;

  public Moto() {
  }

  public Moto(String placa, int numeroPortas, float preco, int qtdeCilidradas) {
    super(placa, numeroPortas, preco);
    this.qtdeCilidradas = qtdeCilidradas;
  }

  public int getQtdeCilidradas() {
    return qtdeCilidradas;
  }

  public void setQtdeCilidradas(int qtdeCilidradas) {
    this.qtdeCilidradas = qtdeCilidradas;
  }

  @Override
  public String toString() {
    return "Placa: " + this.placa +
        " Número de portas: " + this.numeroPortas +
        " Preço: R$" + this.preco +
        " Quantidade de cilindradas: " + qtdeCilidradas;
  }
}

public class Loja {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in, "utf-8");
    String[] dadosVeiculo = entrada.nextLine().split(" ");
    String[] dadosCarro = entrada.nextLine().split(" ");
    String[] dadosMoto = entrada.nextLine().split(" ");
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    Veiculo veiculo = new Veiculo();
    veiculo.setPlaca(dadosVeiculo[0]);
    veiculo.setNumeroPortas(Integer.parseInt(dadosVeiculo[1]));
    veiculo.setPreco(Float.parseFloat(dadosVeiculo[2]));
    Carro carro = new Carro(dadosCarro[0], Integer.parseInt(dadosCarro[1]),
        Float.parseFloat(dadosCarro[2]),
        dadosCarro[3]);
    Moto moto = new Moto(dadosMoto[0], Integer.parseInt(dadosMoto[1]),
        Float.parseFloat(dadosMoto[2]),
        Integer.parseInt(dadosMoto[3]));

    veiculos.add(veiculo);
    veiculos.add(carro);
    veiculos.add(moto);

    for (Veiculo v : veiculos) {
      System.out.println(v.toString());
    }
  }

}
