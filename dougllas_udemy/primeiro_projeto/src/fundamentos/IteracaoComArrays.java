package fundamentos;

public class IteracaoComArrays {
  public static void main(String[] args){

    // Como iterar um array de números? Usando laço de repetição. Veja abaixo.

    int[] numeros = {1,2,3,4,5,6,7,8,9,10};

    for(int index = 0; index < numeros.length; index++){
      System.out.println(numeros[index]);
    }

    String[] emails = new String[5];
    emails[0] = "fulano1@gmail.com";
    emails[1] = "ciclano2@gmail.com";
    emails[2] = "beltrano3@gmail.com";
    emails[3] = "ideia4@gmail.com";
    emails[4] = "bmw15@gmail.com";

    for(int i = 0; i < emails.length; i++){
      System.out.println(emails[i]);
    }

    // Foreach (item são cada elemento do array emails ).
    for ( String item : emails) {
      System.out.println(item);
    }
  }
}
