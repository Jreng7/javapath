package fundamentos;

public class TiposString {
  public static void main(String[] args){

    System.out.println("Olá Pessoal".charAt(2));

    // No código acima eu estou acessando, através do "." ponto (notação ponto) o metodo charAt();
    // ou seja, não preciso fazer " String texto = "Olá pessoal" consigo fazer direto.
    // o metodo charAt(2) acessa a posição do índice da String em questão, no exemplo acima
    // Ela vai acessar o índice 2 que representa "á".

    String texto = "curso de programação.";

    System.out.println(texto.startsWith("c")); // startsWith  ( O próprio nome já diz tudo. ) Retorno é valor booleano.
    System.out.println(texto.endsWith("ção")); // endsWith também já diz tudo.
    // Cuidado, pois, eu coloquei "ção", mas deu FALSE, porquanto termina com um ponto "." e não somente "ção"
  }
}
