package ClassModel;


import java.util.Calendar;
import java.util.Date;

public class Multa {
    private double valor;
    private Condutor primeiro_condutor; // agregacao
    private String descricao;
    private boolean pago;
    private String local;
    private int pontuacao;
    private Date dia;
    private ProcessoJari segundo_condutor;

    //construtor
    public Multa(double valor, Condutor primeiro_condutor1, String descricao, boolean pago, String local, int pontuacao, Date dia, ProcessoJari segundo_condutor1) {
        this.valor = valor;
        primeiro_condutor = primeiro_condutor1;
        this.descricao = descricao;
        this.pago = pago;
        this.local = local;
        this.pontuacao = pontuacao;
        this.dia = dia;
        segundo_condutor = segundo_condutor1;
    }

    //construtor
    public Multa(double valor, Condutor primeiro_condutor1, String descricao, boolean pago, String local, int pontuacao, Date dia) {
        this.valor = valor;
        primeiro_condutor = primeiro_condutor1;
        this.descricao = descricao;
        this.pago = pago;
        this.local = local;
        this.pontuacao = pontuacao;
        this.dia = dia;
    }

    //segundo construtor
    public Multa(Condutor primeiro_condutor1, String descricao, String local) {
        primeiro_condutor = primeiro_condutor1;
        this.descricao = descricao;
        this.local = local;
        this.pago = false;

        Calendar hoje = Calendar.getInstance();
        this.dia = hoje. getTime();
        inicia_atraves_descricao();
    }
    private void inicia_atraves_descricao(){
        switch (this.descricao){

            case "velocidade":{
                this.valor = 1750;
                this.pontuacao = 7;
            }break;

            case "semaforo":{
                this.valor = 1054;
                this.pontuacao = 5;
            }break;

            case "colisao":{
                this.valor = 3100;
                this.pontuacao = 7;
            }break;

            case "estacionar":{
                this.valor = 415;
                this.pontuacao = 3;
            }break;

            default:{
                this.valor = 890;
                this.pontuacao = 4;
            }
        }
    }

    public double getValor() {
        return valor;
    }

    public Condutor getPrimeiro_condutor() {
        return primeiro_condutor;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isPago() {
        return pago;
    }

    public String getLocal() {
        return local;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public Date getDia() {
        return dia;
    }

    public ProcessoJari getSegundo_condutor() {
        return segundo_condutor;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setSegundo_condutor(ProcessoJari segundo_condutor) {
        this.segundo_condutor = segundo_condutor;
    }


}
