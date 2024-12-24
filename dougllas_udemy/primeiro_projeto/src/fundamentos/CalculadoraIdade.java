package fundamentos;

import java.util.Scanner;

public class CalculadoraIdade {
  public static void main(String[] args){
     /*
      1) Pegar o ano atual.
      2) pegar o ano de nascimento.
      3) Subtrair o ano atual pelo ano de nascimento.
     */

    Scanner coletarDados = new java.util.Scanner(System.in);

    System.out.print("Digite o ano atual: ");
    int anoAtual = coletarDados.nextInt();

    System.out.print("Digite o ano do seu nascimento: ");
    int anoNascimento = coletarDados.nextInt();

    int idade = anoAtual - anoNascimento;

    System.out.println("A sua idade é: " + idade + " anos.");
    coletarDados.close();
  }
}
