package testes;

import java.util.Scanner;

import classes.Vacina;

public class TestaVacinaScanner {

	public static void main(String[] args) {
		
		//Variáveis
		String nome, vacina, data, tel, endereco;
		String vacina2, data2;
		
		
		//Objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Entradas
		
		System.out.println("Instituto Piuki's (COVID-19)");
		
		System.out.println("Primeira dose");
		
		System.out.print("Digite o nome da pessoa: ");
		nome = entrada.nextLine();
		
		System.out.print("Digite a Fabricante da Vacina aplicada: ");
		vacina = entrada.nextLine();
		
		System.out.print("Digite a data da Vacinação: ");
		data = entrada.nextLine();
		
		System.out.print("Telefone: ");
		tel = entrada.nextLine();
		
		System.out.print("Endereço da pessoa: ");
		endereco = entrada.nextLine();
		
		System.out.println("Segunda Dose");
		
		
		System.out.print("Digite a Fabricante da Vacina aplicada: ");
		vacina2 = entrada.nextLine();
		
		System.out.print("Digite a data da Vacinação: ");
		data2 = entrada.nextLine();
		
		//Saída
		
		Vacina cliente = new Vacina(nome, vacina, data, tel, endereco, vacina2, data2);
		
		System.out.println(cliente.mostrarDadosP() +"\n" + cliente.mostrarDadosS());
		
	
		
		

	}

}
