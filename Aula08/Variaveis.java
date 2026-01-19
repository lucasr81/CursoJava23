package Aula08;

public class Variaveis {
   /**
    * 1 - Nãopode conter caracteres especiais
    * 2 - Não pode utilizar espaços
    * 3 - Nãopode iniciar com numeros
    * 4 - Não iniciar co letras maiúculas
    * 5 - Nã ultilizar palavras reservadas, exemplo:public
    */
   public static void main(String[] args){
    String nome = "Marcos";
    char sexo = 'M';
    int idade = 20;
    double altura = 1.80;
    boolean estuda = true;

    System.out.println(nome);
    System.out.println(sexo);
    System.out.println(idade);
    System.out.println(altura);
    System.out.println(estuda);

   }
}
