package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import packMain.Relogio;

class TesteRelogio {
	Relogio relogioTest = new Relogio();
	@Test
	void testReiniciaMeiaNoite() {
		relogioTest.reiniciaMeiaNoite();
		assertEquals(0, relogioTest.getHora());
        assertEquals(0, relogioTest.getMinuto());
        assertEquals(0, relogioTest.getSegundo());
	}

}
