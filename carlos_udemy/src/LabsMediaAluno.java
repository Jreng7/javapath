public class LabsMediaAluno {
  public static void main(String[] args){

    var notas = new java.util.Scanner(System.in);

    System.out.print("Digite a sua nota1: ");
    double nota1 = Double.parseDouble(notas.nextLine());

    System.out.print("Digite a sua nota2: ");
    double nota2 = Double.parseDouble(notas.nextLine());

    System.out.print("Digite a sua nota3: ");
    double nota3 = Double.parseDouble(notas.nextLine());

    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A sua média é: " + media);
  }
}
