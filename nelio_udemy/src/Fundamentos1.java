import java.util.Locale;

public class Fundamentos1 {
  public static void main(String[] args){

    // Escrever uma variável com ponto flutuante com apenas 2 casas decimais.

    double y = 10.32758;

    System.out.println(y); // Valor normal, sem formatação. 10.32758

    System.out.printf("%.2f%n", y); // O valor vai ficar 10,33 (lembrando que ele arredonda pra cima.)
    // Aqui o código %.2f%n formata para no máximo 2 casas decimais.
    // Além do que temos que fazer .out.printf (usamos 'f' no fim) e não ln.


    // Está imprimindo com vírgula por causa da config português. Para sair com ponto, basta usar Locale.
    double x = 11.78925;
    Locale.setDefault(Locale.US);
    System.out.printf("%.2f%n", x);
    // Resultado 11.79

  }
}
