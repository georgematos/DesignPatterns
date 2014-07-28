package strategy.exemplo2;

public abstract class Imprimivel {
	
	protected String texto;
	
	public Imprimivel (String texto) {
		this.texto = texto;
	}

	abstract String imprimir();
	
}
