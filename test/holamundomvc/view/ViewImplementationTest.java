/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author endika
 */
public class ViewImplementationTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public ViewImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showGreeting method, of class ViewImplementationTexto.
     */
    @Test
    public void testShowGreeting() {
        ViewImplementation vista = new ViewImplementation();
        String prueba = "Messi";
        vista.showGreeting(prueba);
        
        
        assertEquals("La frase no coincide.",prueba,outputStreamCaptor.toString().trim());
    }
    
}
