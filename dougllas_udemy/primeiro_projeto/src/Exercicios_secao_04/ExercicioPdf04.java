package Exercicios_secao_04;
import java.util.Scanner;

public class ExercicioPdf04 {
  public static void main(String[] args) {
    // 4. Escreva um programa que determine se um número é positivo, negativo ou zero.

    Scanner currentValue = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = currentValue.nextInt();

    if(num > 0){
      System.out.println("O número: " + num + " é positivo");
    } else if (num == 0) {
      System.out.println("Você digitou número 0");
    } else {
      System.out.println("O número: " + num + " é negativo.");
    }

    currentValue.close();
  }
}
