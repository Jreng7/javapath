package fundamentos;

import java.util.Scanner;

public class LoopWithWhile {
  public static void main(String[] args){
    // Laço de repetição "While"

    Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("Digite um número de 1 até 100: ");
    int contadorAte100 = scanner.nextInt();
    int valorInicial = 2;

    while( valorInicial <= contadorAte100 ){
      if(valorInicial % 2 == 0){
        System.out.println(valorInicial);
      }
      valorInicial++;
    }
  }
}
