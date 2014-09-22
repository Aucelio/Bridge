package br.com.bridge;

/*	2- Classe concreta que desenha as janela Windows
 * 	Apenas exibi��o no terminal que ir� mostrar as mensagens 
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
