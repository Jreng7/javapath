package fundamentos;

public class ContadorNumerosParesComFor {
  public static void main(String[] args) {

//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Digite um número de 1 a 100: ");
//    int contador = scanner.nextInt();
//
//    for (int i = 2; i <= contador; i++){
//      if(i % 2 == 0){
//        System.out.println(i);
//      }
//

    // Maneira mais fácil para achar número par.
    int contador = 100;

    for (int i = 0; i <= contador; i+=2){
      System.out.println(i);
    }
  }
}

