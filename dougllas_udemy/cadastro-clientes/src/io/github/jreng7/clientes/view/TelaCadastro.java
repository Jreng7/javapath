package io.github.jreng7.clientes.view;

// Imports
import io.github.jreng7.clientes.dominio.enums.TipoSexo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe Main
public class TelaCadastro extends JFrame {

  // Atributos
  private JLabel labelNome;
  private JLabel labelCpf;
  private JLabel labelSexo;

  private JTextField campoNome;
  private JTextField campoCpf;
  private JComboBox<TipoSexo> campoSexo;

  private JButton botaoSalvar;

  // Constructor
  public TelaCadastro() {
    construirTela();
  }

  // Classes
  private void construirTela() {

    setSize(600, 500);
    setTitle("Cadastro de Clientes");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(null);

    this.adicionarCampo();

  }

  private void adicionarCampo() {

    labelNome = new JLabel("Nome:");
    labelNome.setBounds(20, 30, 200, 23);
    getContentPane().add(labelNome);

    campoNome = new JTextField();
    campoNome.setBounds(20, 50, 200, 23);
    getContentPane().add(campoNome);

    labelCpf = new JLabel("CPF:");
    labelCpf.setBounds(20, 80, 200, 23);
    getContentPane().add(labelCpf);

    campoCpf = new JTextField();
    campoCpf.setBounds(20, 100, 200, 23);
    getContentPane().add(campoCpf);

    labelSexo = new JLabel("Sexo:");
    labelSexo.setBounds(20, 130, 200, 23);
    getContentPane().add(labelSexo);

    TipoSexo[] tiposSexo = {null, TipoSexo.MASCULINO, TipoSexo.FEMININO};
    campoSexo = new JComboBox<>(tiposSexo);
    campoSexo.setBounds(20, 155, 200, 23);
    getContentPane().add(campoSexo);
  }

}