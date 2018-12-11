package br.unipe.estrtdados.tecnicasalgorit.principal;

import java.util.ArrayList;
import java.util.Scanner;

import br.unipe.estrtdados.tecnicasalgorit.models.Cartao;
import br.unipe.estrtdados.tecnicasalgorit.models.Frase;

public class EntradasUsuario {
	
	private ArrayList<Cartao> cartoes;
	private int qnt_frases;	
	Scanner leitor = new Scanner(System.in);
	
	public EntradasUsuario(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
		this.qnt_frases = 0;
	}
	
	public void capturaEntradas() {
		int i = 0;
		int comprimento = 0;
		Frase f = new Frase();
		ArrayList<Frase> frases = new ArrayList<Frase>();
		Cartao c = new Cartao();
		
		do {
			System.out.println("Entrada:");
			comprimento = leitor.nextInt();
			this.setQnt_frases(leitor.nextInt());


			if(comprimento != 0 && this.getQnt_frases() != 0) {
				for(i = 0; i < this.getQnt_frases(); i++) {
					f = new Frase(leitor.nextInt(), leitor.nextInt());
					frases.add(f);
				}
				try {
					frases.sort(null);
				} catch (NullPointerException e) {
					e.printStackTrace();
				} catch (ClassCastException e) {
					e.printStackTrace();
				}	
				
				c = new Cartao(comprimento, frases);
				this.cartoes.add(c);
				c.greedy(); //salva o resultado após efetuar o método greedy
				frases.clear(); //limpa o array de frases para receber o proximo teste
				System.out.println("");
			}
		} while(comprimento != 0 && this.getQnt_frases() != 0);

	}


	public int getQnt_frases() {
		return qnt_frases;
	}

	public void setQnt_frases(int qnt_frases) {
		if(qnt_frases < 0 || qnt_frases > 50) {
			System.out.println("Número máximo de frases ultrapassado.");
			return;
		}
		this.qnt_frases = qnt_frases;
	}

	

}
