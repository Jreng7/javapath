package fundamentos;

public class TiposPrimitivos {
  public static void main(String[] args){

    //  "Valor Literal"
    // É o valor que vai ser atribuido a variável, por exemplo, int number = 10; (10 é o valor literal)

    // DETALHE O "VALOR LITERAL" NÃO É O VALOR INSERIDO PELO USUÁRIO E NEM FOI PEGO PELO BANCO DE DADOS.
    // É UM VALOR QUE É SETADO PELO PROGRAMADOR DIRETO NO PROGRAMA.

    /*
     Em Java (e em várias outras linguagens de programação), valores literais são valores fixos que você
     insere diretamente no código-fonte e que não dependem de fontes externas, como banco de dados ou entrada do usuário.
     Esses valores são usados para representar diretamente os tipos primitivos ou objetos em seu programa.

      ** O QUE NÃO É VALOR LITERAL ?
      Valores pegos de um banco de dados (ex.: resultado de uma query).
      Dados fornecidos pelo usuário (ex.: entrada pelo teclado, clique em botão).
      Valores calculados durante a execução (ex.: soma de duas variáveis ou um método retornando um valor).
    */


    // Informações do Funcionário (Para treinar os tipos primitivos).

    // TIPOS NUMÉRICOS INTEIROS.
    byte anosDeEmpresa = 23; // 23 é um valor literal do tipo byte
    short numeroDeVoos = 32767; // 32767 é um valor literal do tipo short
    int id = 5781425;
    long pontosAcumulados = 3_234_845_220L; // Leva a letra "L" no final.

    // TIPOS NUMÉRICOS REAIS.
    float salario = 11_445.44F; // vai a letra "f" no final. Poser ser letra maiúscula ou minúscula.
    double vendasAcumuladas = 2_991_797_103.01;

    // Tipo booleano
    boolean estaDeFerais = true;

    // Tipo caractere
    char sexo = 'M';  // O Tipo caractere não aceita aspas duplas "" somente aspas simples.

    char status = '\u0010'; // Como que aceitou? Esse código representa um valor na tabela unicode.
    // Logo, ele usa isso para representar um valor.

  }
}
