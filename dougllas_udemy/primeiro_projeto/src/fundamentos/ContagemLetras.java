package fundamentos;

import java.util.Scanner;

public class ContagemLetras {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a sua frase: ");
    String frase = scanner.nextLine();
    int quantidadeLetras = 0;
    // VISA
    // 0123
    for (int indice = 0; indice < frase.length(); indice++) {
      char letra = frase.charAt(indice);
      boolean isLetter = Character.isLetter(letra);

      if(isLetter){
        quantidadeLetras++;
      }
    }
    System.out.print("A quantidade de letras é: " + quantidadeLetras);
    scanner.close();
  }
}
