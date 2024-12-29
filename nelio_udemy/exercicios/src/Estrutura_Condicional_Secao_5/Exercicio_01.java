package Estrutura_Condicional_Secao_5;
import java.util.Scanner;

public class Exercicio_01 {
  public static void main(String[] args){
    // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    Scanner number = new Scanner(System.in);

    int x;

    System.out.print("Digite um número inteiro: ");
    x = number.nextInt();

    if(x >- 0){
      System.out.print("NAO NEGATIVO");
    } else {
      System.out.print("NEGATIVO");
    }

    number.close();
  }
}
