package tela;

import java.awt.Color;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import classes.Vacina;

public class telaVacina extends JFrame {
	
	JLabel jlPrimeiraDose, jlSegundaDose;
	JLabel jlPiuki;
	JLabel jlNome, jlVacina, jlVacina2, jlData, jlData2, jlTel, jlEndereco;
	JTextField jtfNome, jtfVacina, jtfVacina2, jtfData, jtfData2, jtfTel, jtfEndereco;
	JButton jbDados;
	
	//Construtor
	public telaVacina(String title) throws HeadlessException {
		super(title);
		setSize(600, 500); //Tamanho da tela (largura, altura)
		setLayout(null);  //Desabilitar o dimensionamento automático
		getContentPane().setBackground(new Color(245, 245, 245)); //Coloração no background
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		
		// Coloca um texto na tela
		jlPiuki = new JLabel("Digite para o Instituto Piuki's (COVID-19)");
		jlPrimeiraDose = new JLabel("Primeira dose");
		jlSegundaDose = new JLabel("Segunda dose");
		jlNome = new JLabel("Cadastre seu nome");
		jlVacina = new JLabel("Digite a fabricante da vacina aplicada");
		jlVacina2 = new JLabel("Digite a fabricante da vacina aplicada");
		jlData = new JLabel("Digite a data da aplicação da vacina");
		jlData2 = new JLabel("Digite a data da aplicação da vacina"); 
		jlTel = new JLabel("Digite o seu telefone");
		jlEndereco = new JLabel("Digite o seu endereço");
		
		//Abre uma caixa de texto
		jtfNome = new JTextField();
		jtfVacina = new JTextField();
		jtfVacina2 = new JTextField();
		jtfData = new JTextField();
		jtfData2 = new JTextField();
		jtfTel = new JTextField();
		jtfEndereco = new JTextField();
		
		//Cria um botão
		
		jbDados = new JButton("Cadastrar");
		
		//Adicionar os componentes na tela
		
		add(jlPiuki);
		add(jlPrimeiraDose);
		add(jlSegundaDose);
		add(jlNome);
		add(jlVacina);
		add(jlVacina2);
		add(jlData);
		add(jlData2);
		add(jlTel);
		add(jlEndereco);
		add(jtfEndereco);
		add(jtfNome);
		add(jtfVacina);
		add(jtfVacina2);
		add(jtfData);
		add(jtfData2);
		add(jtfTel);
		add(jtfEndereco);
		add(jbDados);
		
		//Dimensionar o componente
		
		jlPiuki.setBounds(170,20,500,20);
		jlPrimeiraDose.setBounds(20,40,400,20);
		jlNome.setBounds(20,60,300,20);
		jtfNome.setBounds(20,80,250,20);
		jlVacina.setBounds(20,100,300,20);
		jtfVacina.setBounds(20,120,250,20);
		jlData.setBounds(20,140,300,20);
		jtfData.setBounds(20,160,250,20);
		jlTel.setBounds(20,180,300,20);
		jtfTel.setBounds(20,200,250,20);
		jlEndereco.setBounds(20,220,300,20);
		jtfEndereco.setBounds(20,240,250,20);
		jlSegundaDose.setBounds(20,280,300,20);
		jlVacina2.setBounds(20,320,300,20);
		jtfVacina2.setBounds(20,340,250,20);
		jlData2.setBounds(20,360,300,20);
		jtfData2.setBounds(20,380,250,20);
		jbDados.setBounds(350,120,150,100);
		
		
		
	}

	private void criarEventos() {
		
		jbDados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = jtfNome.getText();
				String vacina = jtfVacina.getText();
				String data = jtfData.getText();
				String tel = jtfTel.getText();
				String endereco = jtfEndereco.getText();
				String vacina2 = jtfVacina2.getText();
				String data2 = jtfData2.getText();
				
				Vacina cliente = new Vacina(nome, vacina, data, tel, endereco, vacina2, data2);
				
				JOptionPane.showMessageDialog(null, "Primeira Dose" + "\n" + cliente.mostrarDadosP() + "\n" + "\nSegunda Dose" + "\n" + cliente.mostrarDadosS()  , "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/seringa.png"));
			
			}
		});
		
	}
	
	
	
	

}
