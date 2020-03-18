package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public abstract class AssertTest {

	@Test
	public void test() {

		assertTrue(true);
		assertFalse(false);
		assertEquals(1, 1);
		assertNotEquals(1, 2);
		assertEquals(0.51, 0.5, 0.1);
		assertEquals(0.512, 0.51, 0.01);
		assertEquals(0.5123, 0.512, 0.001);
		assertEquals(Math.PI, 3.14, 0.1);
		assertEquals(Math.PI, 3.14, 0.01);

		int i = 5;
		Integer i2 = 5;

		assertEquals(Integer.valueOf(i), i2);
		assertEquals(i, i2.intValue());
		assertNotEquals("bola", "Bola");
		assertEquals("bola", "bola");
		assertTrue("bola".equalsIgnoreCase("Bola"));
		assertTrue("bola".startsWith("bo"));

		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");

		assertEquals(u1, u2);
		assertEquals(u1, u1);
		assertSame(u1, u1);

		Usuario u3 = u2;
		
		assertSame(u3, u2);

		Usuario u4 = null;
		
		assertNull(u4);
		assertNotNull(u2);

	}

}