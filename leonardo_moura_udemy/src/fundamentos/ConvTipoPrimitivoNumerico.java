package fundamentos;

public class ConvTipoPrimitivoNumerico {
  public static void main(String[] args){

    // Conversão de tipos primitivos numéricos.

    //  "CASTING IMPLÍCITO"
    double a = 1; // Ocorreu a conversão de "int" para "double". Mas por quê?
    /* Porque o valor 1 é um literal inteiro e, por padrão, é interpretado como int em Java.
    Quando você atribui esse valor a uma variável do tipo double, o Java realiza a conversão de
    int para double automaticamente. o Java realiza o que chamamos de conversão implícita
    ou promoção numérica.*/

    float b = 1.0f;
      // POR QUE COLOCAR O "f" no final do float?
    /* Isso aconteceu porque, no Java, números decimais literais como 1.0 são tratados automaticamente
      como double. Ou seja, o compilador assume que 1.0 é do tipo double, e como o float tem uma precisão
      menor, o Java não faz a conversão automaticamente de double para float sem que você especifique. */

    //  "CASTING EXPLÍCITO"
    float c = (float) 2.0;

    int e = 4;
    byte f = (byte) e; // Outra conversão explícita (casting explícito).
    // OBS IMPORTANTE: O JAVA NÃO ANALISA VALORES, MAS SIM OS TIPOS!
  }
}
