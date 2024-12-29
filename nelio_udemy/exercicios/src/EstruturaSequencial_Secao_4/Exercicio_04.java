package EstruturaSequencial_Secao_4;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
  public static void main(String[] args){
    /*
      Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
      hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
      decimais.
    */

    Locale.setDefault(Locale.US);
    Scanner number = new Scanner(System.in);

    int func, horasTrab;
    double salario, valorHora;

    System.out.print("Digite o seu número de funcionário: ");
    func = number.nextInt();
    System.out.print("Digite quantas horas você trabalha: ");
    horasTrab = number.nextInt();
    System.out.print("Digite qual o valor que você recebe por hora trabalhada: ");
    valorHora = number.nextDouble();

    salario = horasTrab * valorHora;

    System.out.println("NUMBER = " + func);
    System.out.printf("SALARY = U$ %.2f%n", salario);

    number.close();
  }
}
