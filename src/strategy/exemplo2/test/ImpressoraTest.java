package strategy.exemplo2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import strategy.exemplo2.Impressora;
import strategy.exemplo2.Imprimivel;
import strategy.exemplo2.Jornal;
import strategy.exemplo2.Livro;
import strategy.exemplo2.Revista;

public class ImpressoraTest {

	private Impressora impressora;

	@Before
	public void boot() {
		impressora = new Impressora();
	}

	@Test
	public void deveImprimirUmaRevista() {
		// Uma revista é um imprimivel
		Imprimivel imprimivel = new Revista("Texto da revista...");

		// Imprime uma revista (Cria uma String com um texto que representa a
		// revista)
		String revista = impressora.imprimir(imprimivel);

		// Imprime a revista no console
		System.out.println(revista);

		assertEquals("Texto da revista...", revista);
	}

	@Test
	public void deveImprimirUmLivro() {
		Imprimivel imprimivel = new Livro("Texto do livro...");

		String livro = impressora.imprimir(imprimivel);

		System.out.println(livro);

		assertEquals("Texto do livro...", livro);
	}

	@Test
	public void deveImprimirUmJornal() {
		Imprimivel imprimivel = new Jornal("Texto do jornal...");

		String jornal = impressora.imprimir(imprimivel);

		System.out.println(jornal);

		assertEquals("Texto do jornal...", jornal);
	}

}
