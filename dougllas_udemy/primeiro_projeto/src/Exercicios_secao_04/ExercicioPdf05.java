package Exercicios_secao_04;
import java.util.Scanner;

public class ExercicioPdf05 {
  public static void main(String[] args) {
    // 5. Escreva um programa Java que converta graus Celsius para Fahrenheit.

    // A fórma é C = ( F - 32 ) * 5 / 9

    Scanner convert = new Scanner(System.in);

    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = Double.parseDouble(convert.nextLine());

    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println("A temperatura em Celsius é: " + celsius);

    convert.close();
  }
}
