package br.com.bridge;

//	2.1-classe Concreta Janela Linux

public class JanelaLinux implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " Janela Linux");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " Botao Linux");
	}

}
