package Conta_Corrente;

public class Estatistica {
	
	int CodigoCidade;
	String NomeCidade;
	int QtdAcidentes;
	
	Estatistica(){
		this(0,"",0);
	}
	
	public Estatistica(int cod, String nome, int qtd) {
		CodigoCidade = cod;
		NomeCidade = nome;
		QtdAcidentes = qtd;
	}

}
