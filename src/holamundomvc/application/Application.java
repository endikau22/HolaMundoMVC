/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.application;

import holamundomvc.controller.Controller;
import holamundomvc.model.ModelFactory;
import holamundomvc.view.ViewFactory;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Esta es la clase aplicación para el proyecto HolaMundoMVC.
 * @author Endika Ubierna.
 */
public class Application{
    /**
     * Atributo Logger para rastrear los pasos de ejecución del programa.
     */
    private static final Logger LOGGER = 
            Logger.getLogger("holaMundoMVC.application");
    /**
     * Esta clase va a pedir objetos de la vista y el modelo a las factorias respectivas.
     * @param args the command line arguments
     */
    public static void main(String[] args){
        LOGGER.info("Metodo start de la clase Application");
        // TODO code application logic here
        //Esta clase lee el contenido de ficheros properties java.
        ResourceBundle rb = ResourceBundle.getBundle("almacen.ficheroSaludo");
        //Para ver la solucion en pantalla y recoger los datos de un fichero cambiar los parametros. Ver en el config properties
        final String vistaElegida = rb.getString("vistaSwing");
        final String modeloElegido = rb.getString("modelFichero");
        
        new Controller().run(ViewFactory.getView(vistaElegida),ModelFactory.getModel(modeloElegido));       
    }   
}
