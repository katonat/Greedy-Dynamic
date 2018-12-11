package br.unipe.estrtdados.tecnicasalgorit.models;

import java.util.ArrayList;

public class Cartao {

	private int comprimento;
	private ArrayList<Frase> frasesEscolhidas;
	private ArrayList<Frase> frases;
	private int greedyResult;
	private int dynamicpResult;

	public Cartao(int comprimento, ArrayList<Frase> frases) {
		this.frasesEscolhidas = new ArrayList<Frase>();		
		this.setComprimento(comprimento);
		this.frases = frases;
		this.greedyResult = 0;
		this.dynamicpResult = 0;
	}
	
	public Cartao() {
		
	}

	public void addFrase(Frase frase) {
		this.frasesEscolhidas.add(frase);
	}
	
	public int ocorrenciaTeamo() {
		int totalTeamo = 0;
		for(Frase f : this.frasesEscolhidas)
			totalTeamo += f.getQnt_teamo();	
		return totalTeamo;
	}
	
	// ------------------------ GREEDY METHOD ---------------------
	public void greedy() {
		int comprimentoAtual = this.getComprimento();
		for(int i = 0; i < frases.size(); i++) {
			if(this.frases.get(i).getTamanho() <= comprimentoAtual) {
				comprimentoAtual -= this.frases.get(i).getTamanho();
				this.addFrase(this.frases.get(i));
			}
		}
		this.greedyResult = this.ocorrenciaTeamo();
	}
	
	public int getGreeyResult() {
		return this.greedyResult;
	}
			
	
	// -------------------- DYNAMIC PROGRAMING METHOD ---------------
	public void dynamicPrograming() {
		
	}
	
	public int getDynamicp() {
		return this.dynamicpResult;
	}
	
	
	public void setComprimento(int comprimento) {
		if(comprimento < 8 || comprimento > 1000) {
			System.out.println("Tamanho do cartão inválido.");
			return;
		}
		this.comprimento = comprimento;
	}

	public int getComprimento() {
		return this.comprimento;
	}

}