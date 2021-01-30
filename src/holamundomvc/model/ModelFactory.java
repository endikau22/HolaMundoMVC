/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

/**
 * Esta clase es una factoria para crear objetos de el modelo.
 * @author Endika Ubierna Lopez
 */
public class ModelFactory {

    /**
     * Metodo que devuelve el modelo de la aplicación. Este está almacenado en un fichero o en una BBDD.
     * @param modelo String del fichero de propiedades
     * @return Retorna un nuevo modelo. 
     * ModelImplementation
     */
    //Se devuelve la interface no la implementación.
    public static Model getModel(String modelo) {
        switch (modelo) {
            case "fichero":
                return new ModelImplementation();
            case "bbdd": 
                return new ModelImplementationBD();
            default:
                return new ModelImplementation();
        }
    }
}
