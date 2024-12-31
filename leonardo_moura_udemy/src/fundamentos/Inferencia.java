package fundamentos;

public class Inferencia {
  public static void main(String[] args){

    double a = 4.5;
    System.out.println(a);

    // Inferência => Mesmo não passando o tipo, o Java infere porquanto 4.5 pode ser do tipo double.
    var b = 4.5;
    System.out.println(b);

    // Pelo valor colocado na variável c o Java faz a inferência "Dizendo que é do tipo texto".
    var c = "Texto";
    System.out.println(c);

    c = "Outro texto";
    System.out.println(c);

    /*
       O que não é permitido na inferência é colocar um tipo diferente do qual foi setado anteriormente.
       Exemplo:  var c = "Texto";  => Não posso fazer  " c = 4.5; "

       OBS: A inferência só vai funcionar quando o valor for SETADO, ou seja, não pode apenas DECLARAR
       tem que DECLARAR e INICIALIZAR, exemplo: var numero = 10;

       ** Não pode fazer => var letra;
                         letra = "ABC"; Porquanto o Java precisa saber qual tipo vai ser inferido.
    */

    double d;  // Aqui a variável foi declarada.  (Ainda não pode ser usada).
    d = 123.65; // Aqui a variável foi inicializada.
    System.out.println(d); // Aqui foi usada. Imprime o valor 123.65

    double e = 157.75; // Aqui a variável foi declarada e inicializada. OBS: Já pode ser usada.
  }
}
