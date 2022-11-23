import java.util.Scanner;

class Impressora {
  String modelo, cor, tipoPapel;
  boolean bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;

  public Impressora() {

  }

  /**
   * @description método para ligar a impressora
   */
  void ligar() {
    if (!this.ligada) {
      this.ligada = true;
      System.out.println("ligando...");
    }
  }

  /**
   * @description método para desligar a impressora
   */
  void desligar() {
    if (this.ligada) {
      this.ligada = false;
      System.out.println("desligando...");
    }
  }

  /**
   * @description método para imprimir se a estiver ligada e com papel
   * @case se tiver ligada e com papel imprime "Imprimindo..."
   * @case se não tiver papel imprime "sem papel"
   * @case se não tiver ligada imprime "impressora desligada"
   */
  void imprimir() {
    if (this.ligada && this.papel) {
      System.out.println("Imprimindo...");
    } else if (this.ligada && !this.papel) {
      System.out.println("sem papel");
    } else {
      System.out.println("impressora desligada");
    }
  }

  /**
   * @description método para digitalizar se a estiver ligada e com papel
   * @case se tiver ligada e com papel imprime "digitalização sendo realizada..."
   * @case se não tiver papel imprime "não é possível digitalizar"
   * @case se não tiver ligada imprime "impressora desligada"
   */
  void digitalizar() {
    if (this.ligada && this.digitalizadora) {
      System.out.println("digitalização sendo realizada...");
    } else if (this.ligada && !this.digitalizadora) {
      System.out.println("não é possível digitalizar");
    } else {
      System.out.println("impressora desligada");
    }
  }

  /**
   * @description método para copiar se a estiver ligada e com papel
   * @case se tiver ligada e com papel imprime "cópia sendo realizada..."
   * @case se não tiver papel imprime "não é possível copiar"
   * @case se não tiver ligada imprime "impressora desligada"
   */
  void copiar() {
    if (this.ligada && this.copiadora) {
      System.out.println("cópia sendo realizada...");
    } else if (this.ligada && !this.copiadora) {
      System.out.println("não é possível copiar");
    } else {
      System.out.println("impressora desligada");
    }
  }

  /**
   * @description método para mostrar o status da impressora
   */
  void status() {
    System.out.println(this.modelo);
    System.out.println(this.cor);
    System.out.println(this.tipoPapel);
    if (this.bluetooth) {
      System.out.println("bluetooth on");
    } else {
      System.out.println("bluetooth off");
    }

    if (this.wifi) {
      System.out.println("wifi on");
    } else {
      System.out.println("wifi off");
    }

    if (this.colorida) {
      System.out.println("impressão colorida");
    } else {
      System.out.println("impressão preto e branco");
    }

    if (this.ligada) {
      System.out.println("impressora on");
    } else {
      System.out.println("impressora off");
    }

    if (this.papel) {
      System.out.println("tem papel");
    } else {
      System.out.println("não tem papel");
    }

    if (this.digitalizadora) {
      System.out.println("digitalizadora on");
    } else {
      System.out.println("digitalizadora off");
    }

    if (this.copiadora) {
      System.out.println("copiadora on");
    } else {
      System.out.println("copiadora off");
    }
  }
}

public class UsaImpressora {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Impressora impressora = new Impressora();
    impressora.bluetooth = true;
    impressora.wifi = true;
    impressora.colorida = true;
    impressora.papel = true;
    impressora.digitalizadora = true;
    impressora.ligada = false;
    impressora.copiadora = false;
    String line = entrada.nextLine();
    String values[] = line.split(" ");
    impressora.modelo = values[0];
    impressora.cor = values[1];
    impressora.tipoPapel = values[2];
    impressora.status();
    impressora.ligar();
    impressora.digitalizar();
    impressora.copiar();
    impressora.desligar();
    impressora.imprimir();
    entrada.close();
  }
}
