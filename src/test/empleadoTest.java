package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.empleado;
import pkg.empleado.TipoEmpleado;

class empleadoTest {

	private empleado e = new empleado();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNominaBrutaSinPrimaVendedor() {
		assertEquals(2060,e.calculoNominaBruta(TipoEmpleado.Vendedor, 999, 2));
	}
	
	@Test
	void testNominaBrutaSinPrimaEncargado() {
		assertEquals(2500,e.calculoNominaBruta(TipoEmpleado.Encargado, 999, 0));
	}
	
	@Test
	void testNominaBrutaConPrima100VendedorLI() {
		assertEquals(2220,e.calculoNominaBruta(TipoEmpleado.Vendedor, 1000, 4));
	}
	
	@Test
	void testNominaBrutaConPrima100VendedorLS() {
		assertEquals(2100,e.calculoNominaBruta(TipoEmpleado.Vendedor, 1499, 0));
	}
	
	@Test
	void testNominaBrutaConPrima100EncargadoLI() {
		assertEquals(2600,e.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0));
	}
	
	@Test
	void testNominaBrutaConPrima100EncargadoLS() {
		assertEquals(2750,e.calculoNominaBruta(TipoEmpleado.Encargado, 1499, 5));
	}
	
	@Test
	void testNominaBrutaConPrima200Vendedor() {
		assertEquals(2500,e.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 10));
	}
	
	@Test
	void testNominaBrutaConPrima200Encargado() {
		assertEquals(2700,e.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 0));
	}
	
	@Test
	void testNominaNetaInf2100() {
		assertEquals(2099,e.calculoNominaNeta(2099));
	}
	
	@Test
	void testNominaNetaSup2100LI() {
		assertEquals(1785.8501f,e.calculoNominaNeta(2101));
	}
	
	@Test
	void testNominaNetaSup2100LS() {
		assertEquals(2124.1501f,e.calculoNominaNeta(2499));
	}
	
	@Test
	void testNominaNetaSup2500() {
		assertEquals(2050,e.calculoNominaNeta(2500));
	}
	
}
	

