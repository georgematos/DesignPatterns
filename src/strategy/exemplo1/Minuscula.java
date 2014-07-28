package strategy.exemplo1;

public class Minuscula implements Conversora {

	@Override
	public String converte(String string) {
		return string.toLowerCase();
	}

}
