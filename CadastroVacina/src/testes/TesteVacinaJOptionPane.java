package testes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.Vacina;

public class TesteVacinaJOptionPane {

	public static void main(String[] args) {
		
		//Variáveis
		String nome, vacina, data, tel, endereco;
		String vacina2, data2;
		
		//Entradas
		
		
		JOptionPane.showMessageDialog(null, "Primeira Dose", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/seringa.png"));
		
		nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa Vacinada: ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		vacina = JOptionPane.showInputDialog(null, "Digite a Fabricante da Vacina aplicada:  ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		data = JOptionPane.showInputDialog(null, "Digite a data da Vacinação: ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		tel = JOptionPane.showInputDialog(null, "Telefone: ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		endereco = JOptionPane.showInputDialog(null, "Endereço da pessoa: ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Segunda Dose", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/seringa.png"));
		
		vacina2 = JOptionPane.showInputDialog(null, "Digite a Fabricante da Vacina aplicada: ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		data2 = JOptionPane.showInputDialog(null, "Digite a data da Vacinação: ", "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE);
		
		//Objeto do tipo Vacina
		
		Vacina cliente = new Vacina(nome, vacina, data, tel, endereco, vacina2, data2);
		
		//Saída
		JOptionPane.showMessageDialog(null, "Primeira Dose" + "\n" + cliente.mostrarDadosP() + "\n" + "\nSegunda Dose" + "\n" + cliente.mostrarDadosS()  , "Instituto Piuki's (COVID-19)", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/seringa.png"));

		

	}

}
