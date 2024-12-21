public class IteracaoFor {
  public static void main(String[] args){
//    Esse é o for tradicional

//    for (int i = 0; i < 10; i++){ Imprime o resultado de 0 a 9
//      System.out.println(i);

      // Esse for podemos usar mais de uma variável. Posso usar elas, mas não posso declarar elas dentro do bloco FOR
      // Veja, quando é usado mais de 1 variável, todas devem ser declaradas fora da variável.

//      int i, j;
//      for (i = 0, j = 9; i < 10; i++, j--){
//        System.out.println(i + " - " + j);
//    }

      for (int a = 0; a < 200; a++){
        if (a % 2 == 0) {
          continue;
        }
        System.out.println(a);
      }

      System.out.println("FIM");
  }
}
