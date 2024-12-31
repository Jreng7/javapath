package fundamentos;

public class Temperatura {
  public static void main(String[] args){
    // C = (32 - F) * 5 / 9
    final double FATOR = 5.0/9;
    final double AJUSTE = 32;

    final double fahrenheit = 86;
    final double celcius = ( fahrenheit - AJUSTE ) * FATOR;
    System.out.println(celcius);
  }
}
