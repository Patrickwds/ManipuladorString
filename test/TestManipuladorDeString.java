import static org.junit.Assert.*;

import org.junit.Test;


public class TestManipuladorDeString {

	@Test
	public void manipularStringDeRatoRoeu() {
		String fraseFormatada = ManipuladorDeString.ordenar("O rato roeu a roupa do rei de roma");
		assertEquals("O a do de rei rato roeu roma roupa", fraseFormatada);
	}
	
	@Test
	public void manipularStringDeCegonhas() {
		String fraseFormatada = ManipuladorDeString.ordenar("Um pequeno jabuti xereta viu dez cegonhas felizes.");
		assertEquals("Um viu dez jabuti xereta pequeno cegonhas felizes.", fraseFormatada);
	}
	
	@Test
	public void manipularStringDoJoao() {
		String fraseFormatada = ManipuladorDeString.ordenar("A Maria compro pao na casa do Joao.");
		assertEquals("A na do pao casa Maria Joao. compro", fraseFormatada);
	}
}
