package Exercicios_secao_05;

public class Exer02 {
  public static void main(String[] args){

    //  2) Escreva um programa Java que calcule a soma dos números de 1 a 100 usando um loop while.

      int num = 1;
      int soma = 0;

      while (num <= 100){
        soma = soma + num;
        num++;
      }

      System.out.println("Soma: " + soma);
  }
}
