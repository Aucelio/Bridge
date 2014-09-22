package br.com.bridge;

/* 3-Abstração pois não definem uma janela específica, 
 * mas usarao os metodos destas janelas concretas para construir suas janelas.
 * ela é referencia para interface por isso conseguimos variar a implementação.
 */

public abstract class JanelaAbstrata {

	protected JanelaImplementada janela;

	public JanelaAbstrata(JanelaImplementada j) {

		janela = j;

	}

	public void desenharJanela(String titulo) {

		janela.desenharJanela(titulo);

	}

	public void desenharBotao(String titulo) {

		janela.desenharBotao(titulo);
	}

	public abstract void desenhar();

}
