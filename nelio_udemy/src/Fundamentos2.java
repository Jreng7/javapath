import java.util.Scanner;

public class Fundamentos2 {
  public static void main(String[] args){

    Scanner leitor = new Scanner(System.in);

    char x;
    System.out.print("Digite alguma coisa: ");
    x = leitor.next().charAt(0); // charAt pega o item de índice 0, ou seja, primeira posição.
    System.out.println("O primeiro caractere da palavra que você digitou é: " + x);

    // Se for digitado "Bom dia" A primeira letra será "B".

    leitor.close();
  }
}
