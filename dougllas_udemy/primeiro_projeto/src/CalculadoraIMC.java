import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args){
    // Cálculo do IMC => peso dividido pela (altura x altura)

    Scanner leitorTeclado = new Scanner(System.in);

    System.out.print("Digite o seu peso: ");
    float peso = leitorTeclado.nextFloat();

    System.out.print("Digite a sua altura: ");
    float altura = leitorTeclado.nextFloat();

    float imc = peso / (altura * altura);
    System.out.print("O seu imc é: " + imc);

    leitorTeclado.close();
  }
}
