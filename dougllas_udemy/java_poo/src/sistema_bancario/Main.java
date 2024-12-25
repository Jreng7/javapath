package sistema_bancario;

public class Main {
  public static void main(String[] args){

    // Criando cliente "Fulano".
    Cliente fulano = new Cliente("124789000-05", "Fulano");

    // Criando a conta do Fulano.
    Conta contaFulano = new Conta(fulano, 5787_5, 400);


    // Criando cliente "Ciclano".
    Cliente ciclano = new Cliente();
    ciclano.setNome("Ciclano");
    ciclano.setCpf("785.458.001-70");

    // Criando a conta do Ciclano.
    Conta contaCiclano = new Conta(ciclano, 7547_4, 100);
    contaCiclano.imprimirSaldo();

    // Criando o Banco.
    Banco sistemaBancario = new Banco();

    // Depositando
    sistemaBancario.depositar(contaFulano, 100);
    System.out.println("Saldo após o depósito de R$ 100,00: ");
    contaFulano.imprimirSaldo();

    // Sacando o valor
    sistemaBancario.sacar(contaFulano, 30);
    System.out.println("Saldo atual após o saque de R$ 30,00 reais.");
    contaFulano.imprimirSaldo();

    // Realizando a transferência.
    System.out.println("Realizando a trasferência de R$ 30,00 reais");
    sistemaBancario.transferir(contaFulano, contaCiclano, 30);

    System.out.println("Saldo do Ciclano após receber a transferência é de: ");
    contaCiclano.imprimirSaldo();

    System.out.println("Saldo do Fulano após enviar a transferência: ");
    contaFulano.imprimirSaldo();




















  }
}
