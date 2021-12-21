package ClassModel;

import java.util.ArrayList;

public class Veiculo {
    private String tipo;
    private String montadora;
    private String chassi;
    private int ano_fabricacao;
    private int ano_modelo;
    private String nome;
    private String cor;
    private String placa;
    private ArrayList<Integer> multas; //composicao
    private Documento crlv; //composicao documento do veículo

    public Veiculo(String tipo, String montadora, String chassi, int ano_fabricacao, int ano_modelo, String nome, String cor, String placa, ArrayList<Double> multas, Documento crlv) {
        this.tipo = tipo;
        this.montadora = montadora;
        this.chassi = chassi;
        this.ano_fabricacao = ano_fabricacao;
        this.ano_modelo = ano_modelo;
        this.nome = nome;
        this.cor = cor;
        this.placa = placa;
        this.multas = new ArrayList<>();
        this.crlv = crlv;
    }

    public Veiculo(String placa) {
        this.placa = placa;
        this.multas = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public String getMontadora() {
        return montadora;
    }

    public String getChassi() {
        return chassi;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public ArrayList<Integer> getMultas() {
        return multas;
    }

    public Documento getCrlv() {
        return crlv;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMultas(ArrayList<Integer> multas) {
        this.multas = multas;
    }

    public void setCrlv(Documento crlv) {
        this.crlv = crlv;
    }
    public Integer multa_numero(int indice){
        return this.multas.get(indice);
    }
}
