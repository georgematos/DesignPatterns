package strategy.exemplo1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import strategy.exemplo1.ConversorDeStrings;
import strategy.exemplo1.Conversora;
import strategy.exemplo1.Maiuscula;
import strategy.exemplo1.Minuscula;
import strategy.exemplo1.RemoveEspacos;

public class ConversorDeStringsTest {

	private ConversorDeStrings conversor;
	
	@Before
	public void inicia() {
		conversor = new ConversorDeStrings();
	}
	
	@Test
	public void deveRetornarStringMaiuscula() {
		Conversora conversora = new Maiuscula();
		
		String convertida = conversor.converter(conversora, "quanta");
		assertEquals("QUANTA", convertida);
	}
	
	@Test
	public void deveRetornarStringMinuscula() {
		Conversora conversora = new Minuscula();
		
		String convertida = conversor.converter(conversora, "QUANTA");
		assertEquals("quanta", convertida);
	}
	
	@Test
	public void deveRetornarStringSemEspacos() {
		Conversora conversora = new RemoveEspacos();
		
		String convertida = conversor.converter(conversora, " quanta ");
		assertEquals("quanta", convertida);
	}
	
	
}
