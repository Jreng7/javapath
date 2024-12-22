package aula_classes_metodos_objetos.labs;

import aula_classes_metodos_objetos.Account;

public class FullyQualifiedName {

  // Fully Qualified Name = Nome completo da Classe. Não consigo acessar a classe externa somente com "Account"

  // Account novaConta = new Account();   <-- Esse código acusa erro sem o import!
  // Fully Qualified Name é usado para ter classes com o mesmo nome, porém, de pacotes diferentes.

  // O código abaixo pode ser usado, porém, ele é muito verboso e inviável.
  // aula_classes_metodos_objetos.Account novaConta = new aula_classes_metodos_objetos.Account("a");

  // Logo, a maneira correta é usando "import" sempre abaixo do package e acima da "public class".

  Account novaConta = new Account("a");

  // Detalhe! Se eu fizer "import aula_classes_metodos_objetos.*;"
  // Veja que eu tirei o nome do arquivo "Account" e coloquei "*" ele da acesso a TODOS a todas as classes dentro
  // do pacote "aula_classes_metodos_objetos" suponto que há 500 classes, você tem acesso a todas elas.

}
