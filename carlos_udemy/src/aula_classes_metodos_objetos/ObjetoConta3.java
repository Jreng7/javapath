package aula_classes_metodos_objetos;

public class ObjetoConta3 {
  public static void main(String[] args){

    Account contaCarlos = new Account();
    contaCarlos.deposit(1000);
    contaCarlos.deposit("500");

    Account contaPatricia = new Account();
    contaPatricia.deposit(100);

    contaCarlos.transfer(200, contaPatricia);

    contaCarlos.printBalance();
    contaPatricia.printBalance();

  }
}
