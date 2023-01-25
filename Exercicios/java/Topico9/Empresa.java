import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

interface Classificavel {
  public boolean menorElemento(Classificavel obj);
}

class Classificador {
  public void ordena(Classificavel[] a) {
    Classificavel elem, menor;
    int pos;

    for (int i = 0; i < a.length - 1; i++) {
      elem = a[i];
      menor = a[i + 1];
      pos = i + 1;

      // for (int j = i + 2; j < a.length; j++) {
      // if (a[j].menorElemento(menor)) {
      // menor = a[j];
      // pos = j;
      // }

      if (menor.menorElemento(elem)) {
        a[i] = a[pos];
        a[pos] = elem;
      }
    }
  }
}

/* Sort pelo código */
class Produto implements Classificavel {
  private int codigo;
  private String nome;
  private Double preco;

  public Produto(int codigo, String nome, Double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }

  @Override
  public boolean menorElemento(Classificavel obj) {
    Produto compara = (Produto) obj;

    return this.codigo < compara.codigo;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return codigo + " " + nome + " " + preco;
  }

}

/* Sort pelo nome */
class Cliente implements Classificavel, Comparable<Cliente> {
  private String cpf;
  private String nome;
  private String endereco;

  public Cliente(String cpf, String nome, String endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.endereco = endereco;
  }

  @Override
  public boolean menorElemento(Classificavel obj) {
    Cliente compara = (Cliente) obj;
    int resposta = this.getNome().compareTo(compara.getNome());
    return resposta == 1;
  }

  @Override
  public int compareTo(Cliente o) {
    return this.getNome().compareTo(o.getNome());
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return cpf + " " + nome + " " + endereco;
  }

}

/* Sort pelo preco */
class Servico implements Classificavel {
  private Double preco;
  private String data;
  private String tipoServico;

  public Servico(String tipoServico, Double preco, String data) {
    this.preco = preco;
    this.data = data;
    this.tipoServico = tipoServico;
  }

  @Override
  public boolean menorElemento(Classificavel obj) {
    Servico compara = (Servico) obj;
    return this.preco < compara.preco;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getTipoServico() {
    return tipoServico;
  }

  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

  @Override
  public String toString() {
    return tipoServico + " " + preco + " " + data;
  }

}

public class Empresa {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Classificador classificador = new Classificador();

    String[] sizeArrays = entrada.nextLine().split(" ");
    Integer numProdutos = Integer.valueOf(sizeArrays[0]);
    Integer numClientes = Integer.valueOf(sizeArrays[1]);
    Integer numServicos = Integer.valueOf(sizeArrays[2]);
    Produto produtos[] = new Produto[numProdutos];
    Cliente clientes[] = new Cliente[numClientes];
    Servico servicos[] = new Servico[numServicos];

    for (int entradaProdutos = 0; entradaProdutos < numProdutos; entradaProdutos++) {
      String[] dadosProduto = entrada.nextLine().split(" ");
      Produto produtoNovo = new Produto(Integer.parseInt(dadosProduto[0]), dadosProduto[1],
          Double.parseDouble(dadosProduto[2]));
      produtos[entradaProdutos] = produtoNovo;
    }

    for (int entradaClientes = 0; entradaClientes < numClientes; entradaClientes++) {
      String[] dadosCliente = entrada.nextLine().split(" ");
      Cliente clienteNovo = new Cliente(dadosCliente[0], dadosCliente[1], dadosCliente[2]);
      clientes[entradaClientes] = clienteNovo;
    }

    for (int entradaServicos = 0; entradaServicos < numServicos; entradaServicos++) {
      String[] dadosServico = entrada.nextLine().split(" ");
      Servico servicoNovo = new Servico(dadosServico[0], Double.parseDouble(dadosServico[1]), dadosServico[2]);
      servicos[entradaServicos] = servicoNovo;
    }
    entrada.close();

    classificador.ordena(produtos);
    // classificador.ordena(clientes);
    Arrays.sort(clientes);
    classificador.ordena(servicos);

    for (Produto produto : produtos) {
      System.out.println(produto.toString());
    }

    for (Cliente cliente : clientes) {
      System.out.println(cliente.toString());
    }

    for (Servico servico : servicos) {
      System.out.println(servico.toString());
    }
  }
}
