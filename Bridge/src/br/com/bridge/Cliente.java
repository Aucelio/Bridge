package br.com.bridge;

/*	5-Cliente da aplicação.
 * 	Ele fara uso apenas da classe que define uma janela,
 * 	assim poderá ficar livre de qualquer detalhes de abstração e implenteção.
 */

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();

		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();

	}

}	

