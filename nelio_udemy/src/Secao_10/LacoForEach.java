package Secao_10;

public class LacoForEach {
  public static void main(String[] args){

    String[] vect = new String[] {"José", "Joaquina", "Pedro"};

    System.out.println("Usando o For normal com iteração de i = 0 etc...");
    for(int i = 0; i < vect.length; i++){
      System.out.println(vect[i]);
    }

    System.out.println("===================================");

    System.out.println("Agora, usando For-Each");
    for(String itemDoArray : vect){
      System.out.println(itemDoArray);
    }

    /*  No segundo for, que é um for-each, ele funciona assim: primeiro, dentro do for, devemos
    colocar o TIPO, que neste caso é String. Depois, devemos colocar o nome que vai "percorrer" os itens do
    array. No exemplo, coloquei itemDoArray. Os dois pontos (:) significam "para cada item do array", seguido
    pelo nome do array. Resumindo: para cada item do array vect, faça o que está dentro do bloco abaixo.

    Ele chama cada elemento do vetor pelo nome dado no For Each, no caso, cada elemento foi chamado de "itemDoArray".

    */
  }
}
