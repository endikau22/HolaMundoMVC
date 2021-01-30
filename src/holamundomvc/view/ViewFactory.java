/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import java.util.logging.Logger;

/**
 * Factoria de la vista.
 * @author Endika Ubierna Lopez
 */
public class ViewFactory{
    /**
     * Logger object used to control activity from class
     * SectorManagerImplementation.
     */
    private static final Logger LOGGER = Logger.getLogger("ViewFactory");
    /**
     * Este metodo se encarga de crear una implementacion de la vista.
     * @param vista
     * @return Devuelve la interfaz Vista. //Nunca retornar una clase siempre la interfaz.
     */
    public static  View getView(String vista){
        switch (vista) {
            case "swing":
                return new ViewVentana();              
            default:
                return new ViewImplementation();
        }
        
    }
}

