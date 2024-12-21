package aula_classes_metodos_objetos;

public class ObjetoAccount1 {
  public static void main(String[] args){

    /*
    Account objetoInstancia1: Declara a variável objetoInstancia1 do tipo "Account."
    ou seja, Account é uma classe que foi definida em outro local com atributos.

    "Account objInstancia1:" Isso informa ao compilador que você deseja criar um espaço na memória que
    pode armazenar um objeto da classe Account, MAS, ainda não foi inicializado!

    No caso, Account objetoInstancia1: Até aqui nenhuma instância (ou objeto) foi criado ainda.
    Apenas definimos o TIPO, assim como em " int i; "

    "new Account():"
    Cria uma instância (ou seja, um objeto real) da classe "Account" na memória.
    Este é o momento em que o construtor da classe é chamado, inicializando o objeto.

    */

    Account objetoInstacia1 = new Account();
    objetoInstacia1.accountNumber = "1234-5";
    objetoInstacia1.accountOwner = "Joaquim Silvera";
    objetoInstacia1.balance = 25.750;

    Account cliente2 = new Account();

    cliente2.accountNumber = "2475-5";
    cliente2.accountOwner = "Patricia Martins";
    cliente2.balance = 150.0;

    System.out.println("Conta: " + objetoInstacia1.accountNumber);
    System.out.println("Nome: " + objetoInstacia1.accountOwner);
    System.out.println("Saldo: " + objetoInstacia1.balance);
    System.out.println("------------------------");
    System.out.println("Conta: " + cliente2.accountNumber);
    System.out.println("Nome: " + cliente2.accountOwner);
    System.out.println("Saldo: " + cliente2.balance);




















  }
}
