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
	@Test
	void testProgramaHoraMinSeg() {
		relogioTest.programaHoraMinSeg((byte)2, (byte)30, (byte)40);
		assertEquals(2, relogioTest.getHora());
        assertEquals(30, relogioTest.getMinuto());
        assertEquals(40, relogioTest.getSegundo());
	}
	@Test
	void testCronometro() {
		int segPassados = relogioTest.cronometro((byte)2, (byte)30, (byte)40, (byte)4, (byte)33, (byte)55);
		assertEquals(7395, segPassados);
       
	}
	

	@Test
	void testImprimeHoraAM() {
		relogioTest.programaHoraMinSeg((byte)20, (byte)30, (byte)40);
		
		assertEquals("08:30:40", relogioTest.imprimeHoraAM());
	}
	@Test
	void testImprimeHora24h() {
		relogioTest.programaHoraMinSeg((byte)20, (byte)30, (byte)40);
		
		assertEquals("20:30:40", relogioTest.imprimeHora24h());
	}

	@Test
	void testAtualizaHora() {
		relogioTest.atualizaHora();
		//deu certo na hora
		assertEquals(18, relogioTest.getHora());
        assertEquals(57, relogioTest.getMinuto());
        assertEquals(30, relogioTest.getSegundo());
	}
}
