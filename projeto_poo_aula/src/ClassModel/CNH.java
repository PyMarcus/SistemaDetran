package ClassModel;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CNH {
    private String numero;
    private String tipo;
    private String estado;
    private String observacoes;
    private Date data_validade;
    private Date data_emissao;

    //construtor (inicializa o objeto)
    public CNH(String estado, String observacoes, String tipo){
        this.estado = estado;
        this.observacoes = observacoes;
        this.tipo = tipo;

        inicia_parametros_sistema_auto();
    }
    //construtor 2
    public CNH(String numero, String tipo, String estado, String observacoes, Date data_validade, Date data_emissao) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.observacoes = observacoes;
        this.data_validade = data_validade;
        this.data_emissao = data_emissao;
    }

    // método para gerar parametros do sistema, automaticamente
    private void inicia_parametros_sistema_auto(){
        Random gerador = new Random();
        this.numero = "" + System.currentTimeMillis() + "" + gerador.nextInt(100000000);

        // gerar validade
        Calendar hoje = Calendar.getInstance(); // pega data atual
        this.data_emissao = hoje.getTime();

        hoje.add(Calendar.YEAR, 1); // adiciona 1 ano ao ano atual(data atual)
        this.data_validade = hoje.getTime(); // pega o valor com acrescimo de 1 ano
    }
}
