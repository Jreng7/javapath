package aula_classes_metodos_objetos.labs;

public class NumberExerc87Copia {

  public static void main(String[] args){

    var num1 = NumberExerc87.newNumber(15);
    System.out.println(num1.getNumber()); // retorna o valor armazena em number (numeroRecebiPeloConstrutor).

    var num2 = NumberExerc87.newNumber(5);
    var num3 = NumberExerc87.add(num1, num2); // Está atrelado a classe pelo "static"
    System.out.println(num3.getNumber());

    System.out.println(NumberExerc87.getInstances()); // Retorna o número de instâncias criadas.

   }
 }