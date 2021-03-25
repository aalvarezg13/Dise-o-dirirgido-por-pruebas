/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDomain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leysa
 */
public class CuentaAhorrosTest {

    public CuentaAhorrosTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of consignar method, of class CuentaAhorros.
     */
    /**
     * VALOR DE CONSIGNACION ES NEGATIVO O 0 H1: Como Usuario quiero realizar
     * consignaciones a una cuenta de ahorro para salvaguardar el dinero.
     * Criterio de Aceptación: 1.2 El valor a abono no puede ser menor o igual a
     * 0. Dado El cliente tiene una cuenta de ahorro Número 10001, Nombre
     * “Cuenta ejemplo”, Saldo de 0 Cuando Va a consignar un valor menor o igual
     * a cero Entonces El sistema presentará el mensaje. “El valor a consignar
     * es incorrecto”
     */
    @Test
    public void testConsignar() {
        //ARRANQUE // DADO // PREPARAR
        System.out.println("consignar");
        double valor = -200.00;
        String ciudad = "VALLEDUPAR";
        CuentaAhorros instance = new CuentaAhorros("10001", "Cuenta ejemplo", ciudad);
        String expResult = "El valor a consignar es incorrecto";
        String result = instance.consignar(valor, ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of retirar method, of class CuentaAhorros. Escenario: Consignación
     * Inicial Correcta HU: Como Usuario quiero realizar consignaciones a una
     * cuenta de ahorro para salvaguardar el dinero. Criterio de Aceptación: 1.1
     * La consignación inicial debe ser mayor o igual a 50 mil pesos 1.3 El
     * valor de la consignación se le adicionará al valor del saldo aumentará
     * Dado El cliente tiene una cuenta de ahorro Número 10001, Nombre “Cuenta
     * ejemplo”, Saldo de 0 Cuando Va a consignar el valor inicial de 50 mil
     * pesos Entonces El sistema registrará la consignación AND presentará el
     * mensaje. “Su Nuevo Saldo es de $50.000,00 pesos m/c”.
     */
    @Test

    public void testConsignarInicialCorrecta() {
        //ARRANQUE // DADO // PREPARAR
        System.out.println("Inicial Correcta");
        double valor = 50000;
        String ciudad = "VALLEDUPAR";
        CuentaAhorros instance = new CuentaAhorros("", "", ciudad);
        String expResult = "Su Nuevo Saldo es de $50000.0 pesos m/c";
        String result = instance.consignar(valor, ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Escenario: Consignación Inicial Incorrecta HU: Como Usuario quiero
     * realizar consignaciones a una cuenta de ahorro para salvaguardar el
     * dinero. Criterio de Aceptación: 1.1 La consignación inicial debe ser
     * mayor o igual a 50 mil pesos Dado El cliente tiene una cuenta de ahorro
     * con Número 10001, Nombre “Cuenta ejemplo”, Saldo de 0 Cuando Va a
     * consignar el valor inicial de $49.950 pesos Entonces El sistema no
     * registrará la consignación AND presentará el mensaje. “El valor mínimo de
     * la primera consignación debe ser de $50.000 mil pesos. Su nuevo saldo es
     * $0 pesos”.
     */
    public void testConsignarInicialIncorrecta() {
        //ARRANQUE // DADO // PREPARAR
        System.out.println("Consignacion Inicial Incorrecta");
        double valor = 49950;
        String ciudad = "VALLEDUPAR";
        CuentaAhorros instance = new CuentaAhorros("", "", ciudad);
        String expResult = "El valor mínimo de la primera consignación debe ser\n"
                + "de $50.000 mil pesos. Su nuevo saldo es $0 pesos";
        String result = instance.consignar(valor, ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     *
     * Escenario: Consignación posterior a la inicial correcta 
     * HU: Como Usuario quiero realizar consignaciones a una cuenta de ahorro para salvaguardar
     * el dinero. 
     * Criterio de Aceptación: 1.3 El valor de la consignación se le
     * adicionará al valor del saldo aumentará 
     * Dado El cliente tiene una cuenta de ahorro con un saldo de 30.000 
     * Cuando Va a consignar el valor inicial
     * de $49.950 pesos Entonces El sistema registrará la consignación AND
     * presentará el mensaje. “Su Nuevo Saldo es de $79.950,00 pesos m/c”
     */
        public void testConsignacionPosteriorInicialIncorrecta() {
        //ARRANQUE // DADO // PREPARAR
        System.out.println("Consignacion Posteriror Inicial Incorrecta");
        double valor = 49950;
        String ciudad = "VALLEDUPAR";
        CuentaAhorros instance = new CuentaAhorros("", "", ciudad);
        instance.setSaldo(30000);
        String expResult = "Su Nuevo Saldo es de $79950.0 pesos m/c";
        String result = instance.consignar(valor, ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
    
    /**
     * @Test
     *
     * public void testRetirar() { System.out.println("retirar"); double valor =
     * 0.0; String ciudad = ""; CuentaAhorros instance = new CuentaAhorros("",
     * "", ciudad) ; String expResult = ""; String result =
     * instance.retirar(valor, ciudad); assertEquals(expResult, result); // TODO
     * review the generated test code and remove the default call to fail.
     * fail("The test case is a prototype."); }
     */
    public class CuentaAhorrosImpl extends CuentaAhorros {

        public CuentaAhorrosImpl() {
            super("", "", "");
        }
    }

}
