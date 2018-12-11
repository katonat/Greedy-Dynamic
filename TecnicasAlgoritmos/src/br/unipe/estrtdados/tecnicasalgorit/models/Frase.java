package br.unipe.estrtdados.tecnicasalgorit.models;

public class Frase implements Comparable<Frase> {

	private int tamanho;
	private int qnt_teamo;

	public Frase(int tamanho, int qnt_teamo) {
		this.setTamanho(tamanho);
		this.setQnt_teamo(qnt_teamo);
	}

	public Frase() {
	}

	public float calculaProporcao() {
		return (float)this.getQnt_teamo() / this.getTamanho();
	}

	public int compareTo (Frase o) {
		if(this.calculaProporcao() >  o.calculaProporcao())
			return -1;
		else if(this.calculaProporcao() < o.calculaProporcao())
			return 0;
		else {
			if(this.getTamanho() < o.getTamanho())
				return -1;
			else
				return 1;
		}
	}

	public void setTamanho(int tamanho) {
		if(tamanho < 8 || tamanho > 200) {
			System.out.println("Tamanho de frase inválido.");
			return;
		}
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public void setQnt_teamo(int qnt) {
		if(qnt < 1 || qnt > 25) {
			System.out.println("Quantidade inválida.");
			return;
		}
		this.qnt_teamo = qnt;
	}

	public int getQnt_teamo() {
		return this.qnt_teamo;
	}



}