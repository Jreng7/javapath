package Exercicios_secao_04;
import java.util.Scanner;

public class ExercicioPdf03 {
  public static void main(String[] args){
    // 3. Escreva um programa Java que calcule a média de três números inteiros.

    Scanner calculoInteiro = new java.util.Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = calculoInteiro.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = calculoInteiro.nextInt();

    System.out.print("Digite o terceiro número: ");
    int num3 = calculoInteiro.nextInt();

    int media = (num1 + num2+ num3) / 3;

    System.out.println("A média entres os três números é: " + media);
    calculoInteiro.close();
  }
}
