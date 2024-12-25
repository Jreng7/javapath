public class MainCarro {
  public static void main(String[] ars){

    Carro fiatUno = new Carro();
    fiatUno.cavalos = 100;
    fiatUno.cor = "Preto";
    fiatUno.montadora = "Fiat";
    fiatUno.transmissao = "Manual";
    fiatUno.capacidadeTanque = 48;
    fiatUno.tanqueCombustivel = 10;
    fiatUno.kmPorLitros = 10;

    fiatUno.abastecer(20);
    fiatUno.abastecer(70);

    System.out.println("Você abasteceu e agora tem " + fiatUno.tanqueCombustivel + " livros de gasolina.");
    System.out.println("Autonomia do Fiat Uno: " + fiatUno.autonomiaCombustivel() + "km");
  }
}
