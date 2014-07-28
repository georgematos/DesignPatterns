package strategy.exemplo2;

public class Revista extends Imprimivel {
	
	public Revista(String texto) {
		super(texto);
	}
	
	@Override
	public String imprimir() {
		return texto;
	}

}
