package ClassModel;
import java.util.Date;


public class BoletimOcorrencia {
    private String descricao;
    private String numero;
    private String envolvidos[];
    private Date data;

    private Multa multa_detran;

    //construtor
    public  BoletimOcorrencia(String descricao, Date data){
        this.descricao = descricao;
        this.data = data;

        this.envolvidos = new String[10];
    }
    //construtor 2
    public BoletimOcorrencia(String descricao, String numero, String[] envolvidos, Date data, Multa multa_detran) {
        this.descricao = descricao;
        this.numero = numero;
        this.envolvidos = new String[10];
        this.data = data;
        this.multa_detran = multa_detran;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public Multa getMulta_detran() {
        return multa_detran;
    }

    public String get_envolvido(int indice){
        return this.envolvidos[indice];
    }

    public void add_envolvido(String nome){
        if(envolvidos.length < 10){
            envolvidos[envolvidos.length - 1] = nome;
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setMulta_detran(Multa multa_detran) {
        this.multa_detran = multa_detran;
    }
}
