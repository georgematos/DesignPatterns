package strategy.exemplo2;

public class Livro extends Imprimivel {
	
	public Livro(String texto) {
		super(texto);
	}
	
	@Override
	public String imprimir() {
		return texto;
	}

}