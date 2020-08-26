package Entidade;

public class Invalido extends Exception {
	private static final long serialVersionUID = 1L;
	
	public Invalido(String mensagem) {
		super(mensagem);
	}

}