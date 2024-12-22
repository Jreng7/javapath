package aula_classes_metodos_objetos.labs;

public class NumberExerc87 {

  private static int instances;
  private final int numeroRecebiPeloConstrutor;

  private NumberExerc87(int construtorRecebeNumero){
    this.numeroRecebiPeloConstrutor = construtorRecebeNumero;
    instances++;
  }

  public int getNumber(){
    return numeroRecebiPeloConstrutor;
  }

  public static NumberExerc87 add(NumberExerc87 n1, NumberExerc87 n2){
    return new NumberExerc87(n1.getNumber() + n2.getNumber());
  }

  public static int getInstances(){
    return instances;
  }

  // metodo estatico é do tipo "construtor"
  public static NumberExerc87 newNumber(int n){
    return new NumberExerc87(n);
  }
}
