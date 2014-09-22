package br.com.bridge;

/*	1-Janelas das platarformas.
 * Essa classe ser� a interface comum a todas as implementa��es *
 * Nela definimos que todas as janelas desenham uma janela e um bot�o. 
 */

public interface JanelaImplementada {

	void desenharJanela(String titulo);

	void desenharBotao(String titulo);

}
