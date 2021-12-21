package ClassModel;

import java.util.Date;

public class Condutor {
    private String nome;
    private String endereco;
    private String cpf;
    private String rg;
    private String tipo_sanguineo;
    private Date data_nascimento;
    private String contato;
    private int pontuacao;
    private CNH carteira; //cnh (compoe o condutor) e condutor fazem composicao, sendo o condutor o mais forte

    private Multa multa; //agregação

    public Condutor(String nome, String endereco, String cpf, String rg, String tipo_sanguineo, Date data_nascimento, String contato, int pontuacao, CNH carteira1, Multa multa) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.tipo_sanguineo = tipo_sanguineo;
        this.data_nascimento = data_nascimento;
        this.contato = contato;
        this.pontuacao = pontuacao;
        carteira = carteira1;
        this.multa = multa;
    }

    public Condutor(String nome, String endereco, String cpf, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Condutor(String nome, String endereco, String cpf, String rg, Date data_nascimento){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }


    /*métodos de acesso*/
    public String get_nome(){
        return this.nome;
    }

    private String get_endereco() {
        return endereco;
    }

    private String get_contato() {
        return contato;
    }

    private int get_pontuacao() {
        return pontuacao;
    }

    private Multa get_multa() {
        return multa;
    }

    private void set_nome(String novo_nome){
        this.nome = novo_nome;
    }

    public void set_endereco(String endereco) {
        this.endereco = endereco;
    }

    public void set_Contato(String contato) {
        this.contato = contato;
    }

    public void set_pontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void set_carteira(CNH carteira1) {
        carteira = carteira1;
    }

    public void set_multa(Multa multa) {
        this.multa = multa;
    }


    /*métodos de instância*/
    public boolean decrementa_pontuacao(int pontuacao_infracao){
        if(pontuacao_infracao >= this.pontuacao){
            carteira = null; //perde a pontuacao
            this.pontuacao = 0;
            return false;
        }else{
            this.pontuacao -= pontuacao_infracao;
            return true;
        }
    }

    public void renova_pontos(){
        this.pontuacao = 21;
    }
}
