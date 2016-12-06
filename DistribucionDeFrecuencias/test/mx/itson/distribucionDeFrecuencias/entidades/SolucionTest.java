/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.distribucionDeFrecuencias.entidades;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas Unitarias realizadas para la entidad Solucion
 * @author SaulUrias
 */
public class SolucionTest {
    
    public SolucionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of numeroDeDatos method, of class Solucion.
     */
    @Test
    public void testNumeroDeDatos() {
        System.out.println("numeroDeDatos");
        List lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
        Solucion instance = new Solucion();
        int expResult = 12;
        int result = instance.numeroDeDatos(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of valorMaximo method, of class Solucion.
     */
    @Test
    public void testValorMaximo() {
        System.out.println("valorMaximo");
        List lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
        Solucion instance = new Solucion();
        int expResult = 9;
        int result = instance.valorMaximo(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of valorMinimo method, of class Solucion.
     */
    @Test
    public void testValorMinimo() {
        System.out.println("valorMinimo");
        List lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
        Solucion instance = new Solucion();
        int expResult = 1;
        int result = instance.valorMinimo(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of rango method, of class Solucion.
     */
    @Test
    public void testRango() {
        System.out.println("rango");
        int valorMaximo = 9;
        int valorMinimo = 1;
        Solucion instance = new Solucion();
        int expResult = 8;
        int result = instance.rango(valorMaximo, valorMinimo);
        assertEquals(expResult, result);
    }

    /**
     * Test of intervalos method, of class Solucion.
     */
    @Test
    public void testIntervalos() {
        System.out.println("intervalos");
        int numeroDeDatos = 12;
        Solucion instance = new Solucion();
        int expResult = 4;
        int result = instance.intervalos(numeroDeDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of amplitudDeClase method, of class Solucion.
     */
    @Test
    public void testAmplitudDeClase() {
        System.out.println("amplitudDeClase");
        int rango = 8;
        int intervalos = 4;
        Solucion instance = new Solucion();
        int expResult = 2;
        int result = instance.amplitudDeClase(rango, intervalos);
        assertEquals(expResult, result);
    }

    /**
     * Test of media method, of class Solucion.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        List lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
        Solucion instance = new Solucion();
        double expResult = 4.75;
        double result = instance.media(lista);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of mediana method, of class Solucion.
     */
    @Test
    public void testMediana() {
        System.out.println("mediana");
        List lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
        Solucion instance = new Solucion();
        double expResult = 4.5;
        double result = instance.mediana(lista);
        assertEquals(expResult, result, 0.0);
    }
    
}
