package fundamentos;

public class TiposStringEquals {
  public static void main(String[] args){

    System.out.println("2" == "2");  // true

    String texto = new String("2");
    System.out.println("2" == texto); // false.
    System.out.println("2".equals(texto)); // true
  }
}
