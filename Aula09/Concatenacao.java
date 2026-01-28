package Aula09;

public class Concatenacao {
    public static void main(String[]args){
        //Variáveis
        String nome = "Marcos";
        int idade = 20;
        //Concatenacao
        //System.out.println("Olá " + nome + " você tem " + idade + " Anos");
        System.out.println(String.format("Olá %s, sua idade é %s anos",nome, idade));
    }
    
}
