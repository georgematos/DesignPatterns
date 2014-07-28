package strategy.exemplo1;

public class RemoveEspacos implements Conversora {

	@Override
	public String converte(String string) {
		return string.trim();
	}

}
