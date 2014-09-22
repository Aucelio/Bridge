package br.com.bridge;

/*	4-Essa classe abstrai uma janela de dialogo para todas as plataformas.
 * 	Em uma janela de dialogo sempre existira sim, nao, cancelar indepedente da platarforma usada.
 *  se fosse uma janela de aviso bastaria a mensagem e o "ok".
 */

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada j) {

		super(j);

	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Dialogo");
		desenharBotao("Botao Sim");
		desenharBotao("Botao Nao");
		desenharBotao("Botao Cancelar");
	}

}
