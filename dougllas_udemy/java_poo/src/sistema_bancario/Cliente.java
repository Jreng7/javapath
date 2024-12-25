package sistema_bancario;

public class Cliente {
  private String cpf;
  private String nome;

  Cliente(){}

  Cliente(String cpfCliente, String nomeCliente){
    this.cpf = cpfCliente;
    this.nome = nomeCliente;
  }

  // Set => (Modificar)
  public void setCpf(String novoCpf){
    this.cpf = novoCpf;
  }

  // Get => (Pegar)
  public String getCpf(){
    return this.cpf;
  }

  public void setNome(String novoNome){
    this.nome = novoNome;
  }

  public String getNome(){
    return this.nome;
  }
}

