package Estrutura_Condicional_Secao_5;
import java.util.Scanner;

public class Exercicio_03 {
  public static void main(String[] args){/*
   Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
   Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
   ordem crescente ou decrescente.
    */

    Scanner number = new Scanner(System.in);

    int A, B;

    System.out.print("Digite o valor para A: ");
    A = number.nextInt();
    System.out.print("Digite o valor para B: ");
    B = number.nextInt();

    if(A % B == 0 || B % A == 0){
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }

      number.close();
  }
}