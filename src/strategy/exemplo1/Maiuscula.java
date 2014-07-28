package strategy.exemplo1;

public class Maiuscula implements Conversora {

	@Override
	public String converte(String string) {
		return string.toUpperCase();
	}
	
}
