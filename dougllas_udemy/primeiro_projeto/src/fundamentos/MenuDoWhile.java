package fundamentos;

import java.util.Scanner;

public class MenuDoWhile {
  public static void main(String[] args) {

    Scanner menu = new Scanner(System.in);
    int opcao = 0;

    do {
        System.out.println("Digite uma opção do Menu: ");
        System.out.println("Digite 1. Pizza");
        System.out.println("Digite 2. Sorvete");
        System.out.println("Digite 3. Hamburguer");
        System.out.println("Digite 0 para sair");

        opcao = menu.nextInt();

        if (opcao == 0) {
          System.out.println("Saindo do sistema...");
        } else if (opcao == 1){
          System.out.println("Você escolheu Pizza");
        } else if (opcao == 2){
          System.out.println("Você escolheu sorvete");
        } else {
          System.out.println("Você escolheu Hamburguer");
        }
    } while (opcao != 0);

    menu.close();
  }
}
