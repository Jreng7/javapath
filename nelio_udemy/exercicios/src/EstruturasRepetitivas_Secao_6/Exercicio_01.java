package EstruturasRepetitivas_Secao_6;
import java.util.Scanner;

public class Exercicio_01 {
  public static void main(String[] args){
    //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    Scanner ano = new Scanner(System.in);

    int senha;

    System.out.print("Digite uma senha válida: ");
    senha = ano.nextInt();

    while (senha != 2002){
      System.out.print("Senha Invalida. ");
      if(senha != 2002) {
        System.out.println("Digite novamente: ");
        senha = ano.nextInt();
      }
    }
      System.out.println("Acesso Permitido!");

      ano.close();
  }
}
