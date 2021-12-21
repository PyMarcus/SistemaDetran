package Controller;

import ClassModel.Condutor;
import Tools.Validacao;

import java.util.Random;
import java.util.Scanner;

public class CondutorControler {
    private Scanner input;
    private Random gerador;

    public CondutorControler(){
        input = new Scanner(System.in);
        gerador = new Random();
    }

    public boolean cadastroCondutor(){
        System.out.println("Informe o nome do condutor");
        String nome = Validacao.entrada_texto();
        System.out.println("Informe o endereço do condutor");
        String endereco = Validacao.entrada_texto();
        System.out.println("Informe o contato do condutor");
        String contato = Validacao.entrada_texto();
        System.out.println("Informe a data de nascimento do condutor");
        String entrada = Validacao.entrada_texto();
        return true;
    }
}
