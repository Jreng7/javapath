package classe;

public class ValorVsReferencia {
  public static void main(String[] args){

      // ATRIBUIÇÃO POR VALOR. (TIPO PRIMITIVO).
      double a = 2;
      double b = a;  //  Atribuição por valor, ou seja, ocorreu uma cópia na memória de a = 2 para b = 2.
      a++;  // Resultado => 3
      b--;  // Resultado => 1  (Cópia do valor da variável a que é "2") Passa a ser 1, pois houve decremento.
      // Pois o valores são independentes, ou seja, 2 espaços na memória.


      // ATRIBUIÇÃO POR REFERÊNCIA.
      Data d1 = new Data(1, 6, 2022);
      Data d2 = d1; // Atribuição por referência. (Objeto).
  }
}
