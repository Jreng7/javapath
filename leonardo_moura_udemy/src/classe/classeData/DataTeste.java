package classe.classeData;

public class DataTeste {
  public static void main(String[] args){
      Data d1 = new Data();
      d1.dia = 3;
      d1.mes = 1;
      d1.ano = 2025;
    System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano); //  3/1/2025
  }
}
