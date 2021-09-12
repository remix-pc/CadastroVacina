package classes;

public class Vacina {
	
	public String nome, vacina, data, tel, endereco;
	public String vacina2, data2, tel2, endereco2;

	public Vacina(String nome, String vacina, String data, String tel, String endereco, String vacina2, String data2) {
		super();
		this.nome = nome;
		this.vacina = vacina;
		this.data = data;
		this.tel = tel;
		this.endereco = endereco;
		this.vacina2 = vacina2;
		this.data2 = data2;
	}
	
	public String mostrarDadosP() {
		
		return "Nome: " + this.nome + "\nFabricante da Vacina: " + this.vacina + "\nData: " + this.data + "\nTelefone: " + this.tel + "\nEndereço: " + this.endereco;
		
	}
	
	public String mostrarDadosS() {
		return "Nome: " + this.nome + "\nFabricante da Vacina: " + this.vacina2 + "\nData: " + this.data2 + "\nTelefone: " + this.tel + "\nEndereço: " + this.endereco;
	}
	
	

}
