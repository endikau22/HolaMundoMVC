/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

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
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
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
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        ModelFactory modeloFactory = new ModelFactory();
        Model miModelo = modeloFactory.getModel();
        assertNotNull("El objeto instanciado es nulo, no se ha creado",miModelo);

    }
    
}
