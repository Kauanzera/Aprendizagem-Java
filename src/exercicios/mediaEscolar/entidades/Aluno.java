package exercicios.mediaEscolar.entidades;

public class Aluno {
	
	public String nome;
	public int a;
	public int b;
	public int c;
	
	public int calcMedia() {
		return a + b + c;
	}
	
	public String situacao() {
		String sit;
		if (calcMedia() >= 60) {
			sit = "APROVADO!";
		} else {
			sit = String.format("REPROVADO! \nFaltam %d pontos.", 60 - calcMedia());
		}
		return sit;
	}
	
	public String toString() {
		return String.format("\nALUNO: %s \nMÉDIA FINAL: %d \n%s", nome, calcMedia(), situacao());
	}

}
