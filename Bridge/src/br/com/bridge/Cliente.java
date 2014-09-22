package br.com.bridge;

/*	5-Cliente da aplica��o.
 * 	Ele fara uso apenas da classe que define uma janela,
 * 	assim poder� ficar livre de qualquer detalhes de abstra��o e implente��o.
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

