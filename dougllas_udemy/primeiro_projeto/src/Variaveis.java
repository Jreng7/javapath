public class Variaveis {  // Aqui é considerado "Escopo Global".

  static final float VALOR_PI = 3.14f;

  /*
    O nome da constante, por convenção, deve ser escrita com letras maiúsculas, como no exemplo acima.
    *** POR QUE USAR CONSTANTE?
    RESPOSTA: Isso economiza memória, já que a constante é compartilhada por todas as instâncias da classe.
    Ou seja, só existe uma cópia de VALOR_PI na memória, independentemente do número de objetos criados.


      OBS 1) => O "final" é o que transforma uma variável em uma constante.
      OBS 2) => "static" Pertence à classe, não às instâncias:


  O QUE É "static" => Quando algo é static, ele não é recriado para cada objeto da classe.
  O modificador static significa que a constante pertence à classe e não a uma
  instância (objeto) da classe. Como ele pertence à classe, você pode acessá-lo diretamente usando o
  nome da classe, sem precisar criar um objeto, logo, é possível acessar um atributo ou metodo que é
  static de outro arquivo sem instanciar. No exemplo, VALOR_PI é uma constante que pertence à classe
  "Variaveis" e pode ser acessada diretamente, assim: System.out.println(NomeDaClasse.VALOR_PI); nome
  da classe aqui é Variaveis, ficando assim: System.out.print(Variaveis.VALOR_PI);


  O que acontece durante a execução?
  Quando você declara algo como static, ele é carregado na memória no momento em que a classe é carregada
  pela JVM (Java Virtual Machine). Isso significa que:
  Antes mesmo de você criar qualquer objeto, os membros static já estão disponíveis.
  Se você criar 10 objetos da classe, o static não será duplicado, pois pertence apenas à classe.


  O QUE É "final" => O modificador "final" significa que o valor da variável não pode ser alterado depois de atribuído.
  No caso de NUMERO_PI, uma vez que você define o valor como 3.14f, ele não pode ser modificado.
  Qualquer tentativa de atribuir outro valor resultará em erro de compilação
  *** RESUMO: Quando você usa a palavra-chave final em uma variável, ela se torna imutável, ou seja, não pode ser
  modificada após ser inicializada.

  *** POR QUE USAR?
  RESPOSTA: final é usado para criar constantes. Isso ajuda a proteger valores que nunca
  devem ser alterados durante a execução do programa.

  float => É um tipo de dado primitivo que armazena números com ponto decimal, no caso, ponto flutuante.
  Aqui, f é necessário para informar ao compilador que o número 3.14 é um valor do tipo float. Sem o f, o Java
  assume que o número é do tipo double, que tem maior precisão.

  */

  // VEJA ABAIXO UM EXEMPLO DO USO DE STATIC E FINAL.

  public class Utilidade {
    public static String saudacao = "Olá!";

    public static void exibirSaudacao() {
      System.out.println(saudacao);
    }
  }

  public class Teste {
    public static void main(String[] args) {
      // Acessando membros estáticos de Utilidade sem instanciar a classe
      System.out.println(Utilidade.saudacao); // "Olá!"
      Utilidade.exibirSaudacao();            // "Olá!"
    }
  }

  // **** Código acima é apenas um exemplo. **** //


  public static void main(String[] args){

    int idade;
    idade = 25;
    idade = 30; // Pode ser reatribuido.

    /*
      A constante não é declarada dentro do metodo (Aqui no "main"), antes ela deve ser declarada
      no escopo da "Class". Veja lá começo do arquivo em "public class Variaveis"
      a constante é declarada abaixo dela.
    */

    System.out.println(idade);
  }
}
