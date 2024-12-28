public class Comparacao {
  public static void main(String[] ars) {

    String pessoa = "João";
    String pesso1 = new String("joão");

    System.out.println(pessoa == pesso1); // false. Só é true quando pessoa1 é "String pessoa1 = "João".
    System.out.println(pessoa.equals(pesso1)); // false. Pois java é case sensitive.
    System.out.println(pessoa.equalsIgnoreCase(pesso1)); // True


  }
}