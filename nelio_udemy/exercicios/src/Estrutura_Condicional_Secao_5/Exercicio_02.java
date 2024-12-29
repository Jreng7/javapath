package Estrutura_Condicional_Secao_5;
import java.util.Scanner;

public class Exercicio_02 {
  public static void main(String[] args){
    // 2) Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

    Scanner number = new java.util.Scanner(System.in);

    int inteiro;
    System.out.print("Digite um número: ");
    inteiro = number.nextInt();

    if(inteiro % 2 == 0){
      System.out.print("PAR");
    } else {
      System.out.print("IMPAR");
    }

    number.close();
  }
}
