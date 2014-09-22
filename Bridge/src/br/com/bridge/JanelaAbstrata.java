package br.com.bridge;

/* 3-Abstra��o pois n�o definem uma janela espec�fica, 
 * mas usarao os metodos destas janelas concretas para construir suas janelas.
 * ela � referencia para interface por isso conseguimos variar a implementa��o.
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
