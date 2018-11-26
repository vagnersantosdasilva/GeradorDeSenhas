import static org.junit.Assert.*;

import org.junit.Test;

public class TesteGeradorDeSenhas {

	@Test
	public void test() {
		String senha1=GeradorDeSenhas.gerarSenha(4);
		String senha2=GeradorDeSenhas.gerarSenha(6);
		String senha3=GeradorDeSenhas.gerarSenha(8);
		String senha4=GeradorDeSenhas.gerarSenha(12);
		
		assertEquals(4, senha1.length());
		assertEquals(6, senha2.length());
		assertEquals(8, senha3.length());
		assertEquals(12, senha4.length());
	}

}
