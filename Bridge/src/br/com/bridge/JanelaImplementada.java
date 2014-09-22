package br.com.bridge;

/*	1-Janelas das platarformas.
 * Essa classe será a interface comum a todas as implementações *
 * Nela definimos que todas as janelas desenham uma janela e um botão. 
 */

public interface JanelaImplementada {

	void desenharJanela(String titulo);

	void desenharBotao(String titulo);

}
