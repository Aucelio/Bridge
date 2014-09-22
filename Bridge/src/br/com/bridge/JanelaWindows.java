package br.com.bridge;

/*	2- Classe concreta que desenha as janela Windows
 * 	Apenas exibição no terminal que irá mostrar as mensagens 
 * 	verificado que ocorreu tudo bem.
 */

public class JanelaWindows implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " Janela Windows");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " Botao Windows");
	}

}
