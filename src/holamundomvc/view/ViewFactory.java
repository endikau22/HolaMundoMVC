/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Factoria de la vista.
 * @author Endika Ubierna Lopez
 */
public class ViewFactory{
    /**
     * Este metodo se encarga de crear una implementacion de la vista.
     * @return Devuelve la interfaz Vista. //Nunca retornar una clase siempre la interfaz.

     */
     private static final Logger LOGGER = Logger.getLogger("holamundomvc.view");
    public View getView(){
        
        ResourceBundle rb = ResourceBundle.getBundle("holamundomvc.view.tipovista");

        int opc = 3;
        try {
            opc = Integer.parseInt(rb.getString("vista"));
        } catch (Exception e) {
            LOGGER.severe("Tipo de dato erroneo opcion 3 selecionada por defecto. ");
        }

        switch (opc) {
            case 1:
                return new ViewVentanaFx();
            case 2:
                return new ViewVentana();              
            default:
                return new ViewImplementation();
        }
        
    }
}

