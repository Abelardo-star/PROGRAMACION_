package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.CuentaBancaria;

public class CuentaBancariaTest {
    private CuentaBancaria cuenta;

    @Before
    public void setUp() {
        cuenta = new CuentaBancaria("Juan Perez", 100.0);
    }



    @Test
    public void testDepositarIncrementaSaldo() {
        cuenta.depositar(50.0);
        assertEquals(150.0, cuenta.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositarCantidadNegativaLanzaExcepcion() {
        cuenta.depositar(-1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositarCeroLanzaExcepcion() {

        cuenta.depositar(0.0);
    }



    @Test
    public void testRetirarDisminuyeSaldo() {
        cuenta.retirar(40.0);
        assertEquals(60.0, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testRetirarTodoDejaSaldoCero() {
        cuenta.retirar(100.0);
        assertEquals(0.0, cuenta.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetirarMasDelDisponibleLanzaExcepcion() {
        cuenta.retirar(150.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetirarCantidadNegativaLanzaExcepcion() {
        cuenta.retirar(-10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetirarCeroLanzaExcepcion() {

        cuenta.retirar(0.0);
    }


    @Test
    public void testGetSetTitular() {

        assertEquals("Juan Perez", cuenta.getTitular());

        cuenta.setTitular("Maria Garcia");
        assertEquals("Maria Garcia", cuenta.getTitular());
    }

    @Test
    public void testSetSaldo() {
        cuenta.setSaldo(500.0);
        assertEquals(500.0, cuenta.getSaldo(), 0.001);
    }
}