package strategy.exemplo1;

public class ConversorDeStrings {

	/**
	 *  Mostra como é a programacao orientada a inteface, nao a implementacao.
	 *  Essa classe recebe a interface (tipo mais generico) e executa um metodo
	 *  comum a todas as classe que implementam a interface (assinam o contrato).
	 *  
	 *	Usa o Padrão de Projeto Strategy
	 *
	 * @param conversora
	 * @param string
	 * @return
	 */
	public String converter(Conversora conversora, String string) {
		return conversora.converte(string);
	}
	
}
