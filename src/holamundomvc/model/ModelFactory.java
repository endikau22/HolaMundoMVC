/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import java.util.ResourceBundle;

/**
 * Esta clase es una factoria para crear objetos de el modelo.
 *
 * @author Endika Ubierna Lopez
 */
public class ModelFactory {

    /**
     *
     * @return Retorna un nuevo modelo. El tipo que devuelve es la interfaz pero
     * en realidad por polimorfismo devuelve una nueva instancia de la clase
     * ModelImplementation
     */
    public Model getModel() {
        ResourceBundle rb = ResourceBundle.getBundle("holamundomvc.model.tipomodel");
        int opc = 2;
        try {

            opc = Integer.parseInt(rb.getString("model"));

        } catch (Exception e) {

        }

        switch (opc) {
            case 1:
                return new ModelImplementationBD();
            case 2:
                return new ModelImplementation();
            default:
                return new ModelImplementation();
        }
    }
}
