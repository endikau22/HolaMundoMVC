/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import holamundomvc.view.View;
import holamundomvc.model.Model;
import java.util.logging.Logger;


/**
 * Esta clase contiene al controlador de mi aplicacion, esta trabaja con ambas interfaces. Es la que permite que las 
 * capas de la aplicación se comuniquen.
 * @author Endika Ubierna
 */
public class Controller{
    /**
     * Atributo Logger para rastrear los pasos de ejecución del programa.
     */
    private static final Logger LOGGER = 
            Logger.getLogger("holaMundoMVC.ControllerClass");    
    /**
     * Muestra un String.
     * @param vista Una vista, tenemos una clase que implementa la interfaz vista.
     * @param modelo Un modelo, tenemos una clase que implementa la interfaz modelo.
     */
    public void run(View vista,Model modelo){
        LOGGER.info("Metodo run del controller");
        String saludo;
        saludo = modelo.getGreeting();
        vista.showGreeting(saludo);
    }
}
