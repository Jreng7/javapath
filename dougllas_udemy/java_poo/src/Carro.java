
  // Classe
public class Carro {

  // Atributos
  int cavalos;
  String cor;
  String transmissao;
  String montadora;
  int capacidadeTanque;
  int tanqueCombustivel;
  int kmPorLitros;

  // Metodos
  int abastecer(int litros){
    int soma = tanqueCombustivel + litros;
    if(soma > capacidadeTanque){
      tanqueCombustivel = capacidadeTanque;
      int sobra = soma - capacidadeTanque;
      return sobra;
    } else {
      tanqueCombustivel = soma;
      return 0;
    }
  }

  int autonomiaCombustivel(){
    int autonomia = kmPorLitros * tanqueCombustivel;
    return autonomia;
  }

}

