package EstruturaSequencial_Secao_4;
import java.util.Scanner;

public class Exercicio_03 {
  public static void main(String[] args){/*

  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
  de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
  */

    Scanner number = new java.util.Scanner(System.in);

    int A, B, C, D, diferenca;

    System.out.print("Digite o primeiro número inteiro, pode ser positivo ou negativo:");
    A = number.nextInt();
    System.out.print("Digite o segundo: ");
    B = number.nextInt();
    System.out.print("Digite o terceiro: ");
    C = number.nextInt();
    System.out.print("Por último, digite o quarto número: ");
    D = number.nextInt();

    diferenca = (A * B - C * D);
    System.out.print("DIFERENÇA = " + diferenca);

    number.close();
  }
}
