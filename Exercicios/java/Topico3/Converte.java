package Exercicios.java.Topico3;

import java.util.Scanner;

class Temperatura {
  private Double temperatura;

  public Double getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(Double temperatura) {
    this.temperatura = temperatura;
  }

  public Temperatura(Double temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public String toString() {
    return "temperatura: " + temperatura + " graus ";
  }

  public void CelsiusToFahrenheit(Double temperatura) {
    this.setTemperatura(this.getTemperatura() * 9.0 / 5.0 + 32);
  }

  public void FahrenheitToCelsius(Double temperatura) {
    this.setTemperatura((this.getTemperatura() - 32) * 5.0 / 9.0);
  }
}

public class Converte {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Double temperaturaInicial = entrada.nextDouble();
    Temperatura temperatura = new Temperatura(temperaturaInicial);
    temperatura.CelsiusToFahrenheit(temperaturaInicial);
    System.out.println(temperatura.toString() + "fahrenheit");
    temperatura.FahrenheitToCelsius(temperaturaInicial);
    System.out.println(temperatura.toString() + "celsius");
    entrada.close();
  }
}
