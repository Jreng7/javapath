package fundamentos;

import java.util.Scanner;

public class LoopWithFor {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");

    int valor = scanner.nextInt();

    for(int contador = 1; contador <= valor; contador++){
      System.out.print(contador);
    }

    scanner.close();
  }
}
