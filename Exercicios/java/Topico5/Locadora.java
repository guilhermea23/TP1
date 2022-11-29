package TP1.Exercicios.java.Topico5;

import java.util.Scanner;

class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    private void setAno(Integer ano) {
        this.ano = ano;
    }

    public Veiculo(String placa, String marca, String modelo, String cor, Integer ano){
        this.setPlaca(placa);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
    }

    public Veiculo(){}
}

class Motorista{
    private Integer id;
    private String nome;
    private String telefone;
    private String cnh;

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getCnh() {
        return cnh;
    }

    private void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Motorista(Integer id, String nome, String telefone, String cnh){
        this.setId(id);
        this.setCnh(cnh);
        this.setNome(nome);
        this.setTelefone(telefone);
    }

    public Motorista(){}
}

class Cliente{
    private Integer id;
    private String rg;
    private String cpf;
    private String nome;
    private String telefone;

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    private void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(Integer id, String rg, String cpf, String nome,String telefone){
       this.setId(id);
       this.setRg(rg); 
       this.setCpf(cpf);
       this.setNome(nome);
       this.setTelefone(telefone);
    }

    public Cliente(){}
}

class Chamado{
    private Integer id;
    private String data;
    private String tipo;
    private String origem;
    private String destino;
    private String horarioPartida;
    private String horarioRetorno;
    private Double kmInicialVeiculo;
    private Double kmFinalVeiculo;
    private Double valorTotal;
    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    private void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    private void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioPartida() {
        return horarioPartida;
    }

    private void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getHorarioRetorno() {
        return horarioRetorno;
    }

    private void setHorarioRetorno(String horarioRetorno) {
        this.horarioRetorno = horarioRetorno;
    }

    public Double getKmInicialVeiculo() {
        return kmInicialVeiculo;
    }

    private void setKmInicialVeiculo(Double kmInicialVeiculo) {
        this.kmInicialVeiculo = kmInicialVeiculo;
    }

    public Double getKmFinalVeiculo() {
        return kmFinalVeiculo;
    }

    private void setKmFinalVeiculo(Double kmFinalVeiculo) {
        this.kmFinalVeiculo = kmFinalVeiculo;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    private void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    private void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    private void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Chamado(Integer id, String data, String tipo, String origem, String destino, String horarioPartida, String horarioRetorno, Double kmInicialVeiculo, Double kmFinalVeiculo, Double valorTotal, Cliente cliente, Motorista motorista, Veiculo veiculo){
        this.setId(id);
        this.setData(data);
        this.setTipo(tipo);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setHorarioPartida(horarioPartida);
        this.setHorarioRetorno(horarioRetorno);
        this.setKmInicialVeiculo(kmInicialVeiculo);
        this.setKmFinalVeiculo(kmFinalVeiculo);
        this.setValorTotal(valorTotal);
        this.setCliente(cliente);
        this.setMotorista(motorista);
        this.setVeiculo(veiculo);

    }

    public Chamado(){}
}

public class Locadora{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "UTF-8");
        String linha1 = entrada.nextLine(); // informações do veículo
        String linha2 = entrada.nextLine(); // informações do motorista
        String linha3 = entrada.nextLine(); // informações do cliente
        String linha4 = entrada.nextLine(); // informações do chamado
        for (String string : linha1.split(" ")) {
            System.out.println(string);
            System.out.println("-");
        }
        for (String string : linha2.split(" ")) {
            System.out.println(string);
            System.out.println("-");            
        }
        for (String string : linha3.split(" ")) {
            System.out.println(string);
            System.out.println("-");
        }
        for (String string : linha4.split(" ")) {
            System.out.println(string);
            System.out.println("-");            
        }
        entrada.close();
    }
}