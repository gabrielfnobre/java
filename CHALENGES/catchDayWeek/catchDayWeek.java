//Nesse desafio temos que pegar um dia da semana digitado com o nome do dia e retornar o numeral correspondente ao dia
//Por exemplo:
//      Domingo -> 1
//      Terça -> 3
//      Sexta -> 6

import java.util.Scanner;

public class catchDayWeek {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de um dia da semana (Sem acento, maiusculas ou caracteres especiais):");
        String day = sc.nextLine();

        if(day.equals("domingo")){
            System.out.println(day + " corresponde ao dia: 1");
        } else if (day.equals("segunda")){
            System.out.println(day + " corresponde ao dia: 2");
        } else if (day.equals("terca")){
            System.out.println(day + " corresponde ao dia: 3");
        } else if (day.equals("quarta")){
            System.out.println(day + " corresponde ao dia: 4");
        } else if (day.equals("quinta")){
            System.out.println(day + " corresponde ao dia: 5");
        } else if (day.equals("sexta")){
            System.out.println(day + " corresponde ao dia: 6");
        } else if (day.equals("sabado")){
            System.out.println(day + " corresponde ao dia: 7");
        }

        sc.close();

    }
    
}
