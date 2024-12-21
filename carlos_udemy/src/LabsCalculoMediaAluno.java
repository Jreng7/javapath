public class LabsCalculoMediaAluno {
  public static void main(String[] args){

    var leituraDados = new java.util.Scanner(System.in);
    int n = 1;
    double sum = 0.0;

    while(true){
      System.out.print("Digite a nota " + n + ": ");

      String line = leituraDados.nextLine();

      if (line.isBlank()) {
        n--;
        break;
      }

      sum += Double.parseDouble(line);
      n++;
    }

    double avg = sum / n;
    System.out.println(n + " nota(s) fornecidas(s)");
    System.out.println("A média é: " + avg);

  }
}
