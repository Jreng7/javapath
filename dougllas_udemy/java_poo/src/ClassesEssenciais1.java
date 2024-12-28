public class ClassesEssenciais1 {
  public static void main(String[] args){

    // System.err.print("Err representa erro. Essa mensagem ficará da cor vermelha");

    // Outro exemplo com Try e Catch.
    try {
      System.out.println("Dividindo 1/0");
      System.out.println(1/0);
    } catch (Exception ex){
      System.err.println("Houve um erro na tentativa da divisão de 1/0" + ex.getMessage());
    }

    /*
      ex dentro de catch: É apenas o nome da variável usada para armazenar o objeto da exceção.
      Você pode usar qualquer outro nome no lugar de ex, como e, erro, etc.

      Exemplo:
      catch (Exception erro) {
        System.err.println("Erro capturado: " + erro.getMessage());
      }

      A variável ex pode ser usada para acessar informações sobre o erro. Por exemplo:
      ex.getMessage(): Obtém a mensagem detalhada da exceção.
    */

  }
}

