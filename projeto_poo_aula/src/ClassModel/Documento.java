package ClassModel;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class Documento {
    private String numero;
    private Date data_emissao;
    private int ano_corrente;
    private String observacao;
    private String estado;

    private Condutor proprietario; // agregacao, onde um condutor tem varios documentos, assim, o documento depende de
    // documento --> condutor

    //construtor1:
    public Documento(String numero, Date data_emisao, int ano_atual, String observacao, String estado, Condutor dono) {
        this.numero = numero;
        this.data_emissao = data_emisao;
        this.ano_corrente = ano_atual;
        this.observacao = observacao;
        this.estado = estado;
        this.proprietario = dono;
    }

    //condutor 2 - primeira vez de inicialização
    public Documento(String observacao, String estado, Condutor proprietario) {
        this.observacao = observacao;
        this.estado = estado;
        this.proprietario = proprietario;
        inicia_atributos_auto_sistema();
    }

    // inicia atributo automatico
    private void inicia_atributos_auto_sistema(){
        Random gerador = new Random();
        this.numero = "" + (System.currentTimeMillis()/100) + "" + gerador.nextInt(50000);

        Calendar hoje = Calendar.getInstance();
        this.data_emissao = hoje.getTime();

        this.ano_corrente = hoje.get(Calendar.YEAR);
    }

    public String getNumero() {
        return numero;
    }

    public Date getData_emissao() {
        return data_emissao;
    }

    public int getAno_corrente() {
        return ano_corrente;
    }

    public String getObservacao() {
        return observacao;
    }

    public String getEstado() {
        return estado;
    }

    public Condutor getProprietario() {
        return proprietario;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setProprietario(Condutor proprietario) {
        this.proprietario = proprietario;
    }
}
