public class LabsSomarParesIntervalo {
  public static void main(String[] args){

   // Pega todos os números PAR do intervalo entre 0 a 100 e soma.

    int sum = 0;

    for (int i = 0; i <= 100; i++){
      sum = i % 2 == 0 ? sum + i : sum;
    }
    System.out.println("Resultado: " + sum);
  }
}
