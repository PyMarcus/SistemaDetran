package ClassModel;

import java.util.Calendar;
import java.util.Date;

public class ProcessoJari {
    private String numero;
    private Date data_inicio;
    private Date data_termino;
    private String descricao;

    private Condutor condutor;

    //construtor
    public ProcessoJari(String numero, Date data_inicio, String descricao, Condutor condutor1) {
        this.numero = numero;
        this.data_inicio = data_inicio;
        this.descricao = descricao;
        condutor = condutor1;
    }

    //construtor2
    public ProcessoJari(String descricao, Condutor condutor) {
        this.descricao = descricao;
        condutor = condutor;

        Calendar hoje = Calendar.getInstance();
        this.data_inicio = hoje.getTime();

        this.numero = "" + System.currentTimeMillis();
    }

    //construtor3
    public ProcessoJari(String numero, Date data_inicio, Date data_termino, String descricao, Condutor condutor1) {
        this.numero = numero;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.descricao = descricao;
        condutor = condutor1;
    }

    public String getNumero() {
        return numero;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public Date getData_termino() {
        return data_termino;
    }

    public String getDescricao() {
        return descricao;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
