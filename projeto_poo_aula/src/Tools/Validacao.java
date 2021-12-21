package Tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validacao {
    public static String entrada_texto(){
        Scanner input = new Scanner(System.in);
        String resultado;
        boolean segunda_diante = false;

        do{
            if(segunda_diante){
                System.out.println("A informação não pode ser vazia...");
            }
            resultado = input.nextLine(); //se for vazio
            segunda_diante = true;
        }while (resultado.isEmpty());
        return resultado;
    }

    public static String entrada_contato(){
        String tel = entrada_texto();
        while(tel.length() < 8 || tel.length() > 13){
            System.out.println("Quantidade de digitos inválida");
            tel = entrada_texto();
        }
        return tel;
    }

    public static Date entrada_data(){
        String data = entrada_texto();
        //formata a data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date dia_date = formatador.parse(data);
            return dia_date;
        }catch (ParseException ex){
            System.out.println("Erro no formato da data inserido");
            return null;

        }
    }
}
