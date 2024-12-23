import java.util.Scanner;

public class ExercicioPdf09 {
  public static void main(String[] args) {
    /* 9)

       Escreva um programa que leia as medidas dos lados de um triângulo e escreva se
       ele é Equilátero, Isósceles ou Escaleno. Sendo que:

       a. Triângulo Equilátero: possui os 3 lados iguais.
       b. Triângulo Isósceles: possui 2 lados iguais.
       c. Triângulo Escaleno: possui 3 lados diferentes */

    Scanner scanner = new Scanner(System.in);

    // Entrada das medidas dos lados
    System.out.print("Digite o valor do primeiro lado: ");
    double lado1 = scanner.nextDouble();

    System.out.print("Digite o valor do segundo lado: ");
    double lado2 = scanner.nextDouble();

    System.out.print("Digite o valor do terceiro lado: ");
    double lado3 = scanner.nextDouble();

    // Verifica se os lados podem formar um triângulo
    if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
      // Classifica o tipo do triângulo
      if (lado1 == lado2 && lado2 == lado3) {
        System.out.println("O triângulo é Equilátero (todos os lados são iguais).");
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        System.out.println("O triângulo é Isósceles (dois lados são iguais).");
      } else {
        System.out.println("O triângulo é Escaleno (todos os lados são diferentes).");
      }
    } else {
      System.out.println("As medidas não formam um triângulo válido.");
    }

    scanner.close(); // Fecha o Scanner
  }
}
