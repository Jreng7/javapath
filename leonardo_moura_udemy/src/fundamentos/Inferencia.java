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
    */

    double d;  // Aqui a variável foi declarada.
  }
}
