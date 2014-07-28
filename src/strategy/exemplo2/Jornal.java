package strategy.exemplo2;

public class Jornal extends Imprimivel {
	
	public Jornal(String texto) {
		super(texto);
	}
	
	@Override
	public String imprimir() {
		return texto;
	}

}
