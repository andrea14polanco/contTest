import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testSum() {
		Calculadora c = new Calculadora();
		int n = 5;
		int m = 6;
		assertEquals(c.sum(n, m), 11);
	}
	@Test
	public void testDif() {
		Calculadora c = new Calculadora();
		int n = 5;
		int m = 7;
		assertEquals(c.dif(n, m), -2);
	}
	@Test
	public void testMult() {
		Calculadora c = new Calculadora();
		int n = 5;
		int m = 6;
		assertEquals(c.mult(n, m),30);
	}
	@Test
	public void testDiv() {
		Calculadora c = new Calculadora();
		int n = 5;
		int m = 6;
		
		assertEquals(c.div(n, 0), -1);
	}
}
