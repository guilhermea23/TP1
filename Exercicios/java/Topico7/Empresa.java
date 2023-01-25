import java.util.ArrayList;
import java.util.Scanner;

class Chefe extends Funcionario {

    String departamento;

    public Chefe(String nome, String dataNascimento, float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    public Chefe(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Departamento:" + departamento;
    }

}

class Vendedor extends Funcionario {

    private float comissaoVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
        super(nome, dataNascimento, salario + comissaoVenda * quantidadeVendas);
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    public Vendedor(float comissaoVenda, int quantidadeVendas) {
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public String toString() {
        return "\nComissão por Venda:" + comissaoVenda
                + "\nNúmero de Vendas:" + quantidadeVendas;
    }

}

class Operario extends Funcionario {

    private float valorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, valorProducao * quantidadeProduzida);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public Operario(float valorProducao, int quantidadeProduzida) {
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

}

class Horista extends Funcionario {

    private float valorHora;
    private int totalHoras;

    public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        super(nome, dataNascimento, valorHora * totalHoras);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public Horista(float valorHora, int totalHoras) {
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public String toString() {
        return "Horista:" + "\nValor por Hora:" + valorHora + "\nTotal de Horas:" + totalHoras;
    }

}

class Funcionario {

    private String nome;
    private String dataNascimento;
    private float salario;

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nData de Nascimento: " + dataNascimento
                + "\nSalário: " + salario;
    }
}

class FolhaPagamento {

    void mostraPagamentos(String nome, String cidade, String mes, ArrayList<Funcionario> funcionarios) {
        System.out.println("Nome da Empresa: " + nome
                + "\nEndereço: " + cidade
                + "\nMês: " + mes);
        System.out.println();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Chefe) {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
                System.out.println("Salário: R$" + funcionario.getSalario());
                System.out.println("Departamento: " + ((Chefe) funcionario).getDepartamento());
                System.out.println("Cargo: chefe");
                System.out.println();
            } else if (funcionario instanceof Vendedor) {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
                System.out.println("Salário: R$" + funcionario.getSalario());
                System.out.println("Cargo: vendedor");
                System.out.println("Comissão por Venda: R$" + ((Vendedor) funcionario).getComissaoVenda());
                System.out.println("Número de vendas: " + ((Vendedor) funcionario).getQuantidadeVendas());
                System.out.println();
            } else if (funcionario instanceof Operario) {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
                System.out.println("Salário: R$" + funcionario.getSalario());
                System.out.println("Cargo: Operário");
                System.out.println("Valor por Produção: R$" + ((Operario) funcionario).getValorProducao());
                System.out.println("Quantidade produzida: " + ((Operario) funcionario).getQuantidadeProduzida());
                System.out.println();
            } else {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
                System.out.println("Salário: R$" + funcionario.getSalario());
                System.out.println("Cargo: horista");
                System.out.println("Valor por Hora: R$" + ((Horista) funcionario).getValorHora());
                System.out.println("Total de horas: " + ((Horista) funcionario).getTotalHoras());
            }
        }
    }
}

public class Empresa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "utf-8");
        String[] dadosEmpresaFolha = entrada.nextLine().split(" ");
        String nomeEmpresa = dadosEmpresaFolha[0];
        String cidadeEmpresa = dadosEmpresaFolha[1];
        String mesFolha = dadosEmpresaFolha[2];
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        String[] dadosChefe = entrada.nextLine().split(" ");
        String nomeChefe = dadosChefe[0];
        String dataNascChefe = dadosChefe[1];
        float salarioChefe = Float.parseFloat(dadosChefe[2]);
        String departamentoChefe = dadosChefe[3];
        Chefe chefe = new Chefe(nomeChefe, dataNascChefe, salarioChefe, departamentoChefe);
        funcionarios.add(chefe);

        String[] dadosVendedor = entrada.nextLine().split(" ");
        String nomeVendedor = dadosVendedor[0];
        String dataNascVendedor = dadosVendedor[1];
        float salarioVendedor = Float.parseFloat(dadosVendedor[2]);
        float comissaoVenda = Float.parseFloat(dadosVendedor[3]);
        int qtdVendas = Integer.parseInt(dadosVendedor[4]);
        Vendedor vendedor = new Vendedor(nomeVendedor, dataNascVendedor, salarioVendedor, comissaoVenda, qtdVendas);
        funcionarios.add(vendedor);

        String[] dadosOperario = entrada.nextLine().split(" ");
        String nomeOperario = dadosOperario[0];
        String dataNascOperario = dadosOperario[1];
        float salarioOperario = Float.parseFloat(dadosOperario[2]);
        float valorProducao = Float.parseFloat(dadosOperario[3]);
        int qtdProduzida = Integer.parseInt(dadosOperario[4]);
        Operario operario = new Operario(nomeOperario, dataNascOperario, salarioOperario, valorProducao, qtdProduzida);
        funcionarios.add(operario);

        String[] dadosHorista = entrada.nextLine().split(" ");
        String nomeHorista = dadosHorista[0];
        String dataNascHorista = dadosHorista[1];
        float salarioHorista = Float.parseFloat(dadosHorista[2]);
        float valorHora = Float.parseFloat(dadosHorista[3]);
        int totalHoras = Integer.parseInt(dadosHorista[4]);
        Horista horista = new Horista(nomeHorista, dataNascHorista, salarioHorista, valorHora, totalHoras);
        funcionarios.add(horista);

        FolhaPagamento fp = new FolhaPagamento();
        fp.mostraPagamentos(nomeEmpresa, cidadeEmpresa, mesFolha, funcionarios);
    }
}
