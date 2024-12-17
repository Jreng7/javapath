public class KeyBoardInput {
  /*
   O KeyBoardInput é a leitura de dados via teclado, ou seja, os dados ou valores digitados pelo usuário
   São capturados e enviados ao programa para serem processados. Para capturar (ler) é usado o metodo "Scanner"

   new java.util.Scanner(System.in);

   o console no java é o "System.in", ou seja, ele lê "captura" é a entrada padrão de dados.

  */
  public static void main(String[] args){
    var lerDados = new java.util.Scanner(System.in);  // Cria uma instância (um OBJ) de Scanner para ler dados do teclado

    // String info1 = lerDados.nextLine();  // Usa o metodo nextLine() do objeto "lerDados" para capturar uma linha de entrada do usuário

    // O dado capturado é armazenado na variável "info1" do tipo "String"

    System.out.print("Texto 1: ");
    String info2 = lerDados.nextLine();

    System.out.print("Texto 2: ");
    String info3 = lerDados.nextLine();

    System.out.println(info2 + info3);
  }
}

