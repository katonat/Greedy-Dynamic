package br.unipe.estrtdados.tecnicasalgorit.principal;

import java.util.ArrayList;

import br.unipe.estrtdados.tecnicasalgorit.models.Cartao;

class Main {
	public static void main(String[] args) {

		ArrayList <Cartao> cartoes = new ArrayList<Cartao>();
		EntradasUsuario entradas = new EntradasUsuario(cartoes);
		
		entradas.capturaEntradas();
		for(int i = 0; i < cartoes.size(); i ++) {
			System.out.println("Teste " + (i + 1));
			System.out.println("Solução Gulosa: " + cartoes.get(i).getGreeyResult());
			
		}

	
	}
}