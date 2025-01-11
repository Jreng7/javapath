package classe;

public class ValorVsReferencia {
  public static void main(String[] args){

      // ATRIBUIÇÃO POR VALOR. (TIPO PRIMITIVO).
      double a = 2;
      double b = a;  //  Atribuição por valor, ou seja, ocorreu uma cópia na memória de a = 2 para b = 2.
      a++;  // Resultado => 3
      b--;  // Resultado => 1  (Cópia do valor da variável "a" que é "2") Passa a ser 1, pois houve decremento.
      // Pois o valores são independentes, ou seja, 2 espaços na memória.


      // ATRIBUIÇÃO POR REFERÊNCIA.
      Data d1 = new Data(1, 6, 2022);
      Data d2 = d1; // Atribuição por referência. (Objeto).

      // Tanto d1 quanto d2 apontam para o mesmo local na memória.
  }

//      O que acontece é que tanto d1 quanto d2 passam a "apontar" para o mesmo objeto na memória.
//
//      Isso é conhecido como atribuição por referência, porque ambas as variáveis referenciam o mesmo local
//      na memória onde o objeto Data foi alocado.
//

//      EXEMPLO DE ALTERAÇÃO => d2.setDia(2);

//      Isso também irá refletir em d1, porque ambos estão se referindo ao mesmo objeto na memória.
//
//      Isso é diferente de quando você trabalha com tipos primitivos, como int, double, etc., onde a atribuição seria
//      por valor, e o valor seria copiado para a nova variável, sem afetar a original.
//
}
