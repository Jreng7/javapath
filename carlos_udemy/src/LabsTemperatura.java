public class LabsTemperatura {
  public static void main(String[] args){

    // TC = (TF - 32) / 9 * 5 "Fórmula para transformar temperatura de Fahrenheit em Celcius."

    var valores = new java.util.Scanner(System.in);

    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = Double.parseDouble(valores.nextLine());

    double celcius = (fahrenheit - 32) / 9 * 5;

    System.out.println("A temperatura em Celcius é: " + celcius);

  }
}
