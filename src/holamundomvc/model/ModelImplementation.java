/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import java.util.ResourceBundle;

/**
 * Clase que implementa la interfaz Model. Recoge un String de un fichero de propiedades.
 * @author 2dam
 */
public class ModelImplementation implements Model{

    @Override
    public String getGreeting(){
       String greeting;
       //Voy a traer de un fichero de propiedades el saludo.
       ResourceBundle miResource = ResourceBundle.getBundle("almacen.ficheroSaludo");
       greeting = miResource.getString("saludo");
       return greeting;
    }
    
}
 