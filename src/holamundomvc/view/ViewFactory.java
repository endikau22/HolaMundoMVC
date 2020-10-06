/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.model.ModelImplementation;
import holamundomvc.model.ModelImplementationBD;
import java.util.ResourceBundle;

/**
 * Factoria de la vista.
 * @author Endika Ubierna Lopez
 */
public class ViewFactory{
    /**
     * Este metodo se encarga de crear una implementacion de la vista.
     * @return Devuelve la interfaz Vista. //Nunca retornar una clase siempre la interfaz.

     */
    public View getView(){
        ResourceBundle rb = ResourceBundle.getBundle("holamundomvc.view.tipovista");

        int opc = 2;
        try {

            opc = Integer.parseInt(rb.getString("vista"));

        } catch (Exception e) {

        }

        switch (opc) {
            case 1:
                return new ViewVentanaFx();
            case 2:
                return new ViewVentana();
                case 3:
                return new ViewImplementation();
            default:
                return new ViewImplementation();
        }
        
    }
}

