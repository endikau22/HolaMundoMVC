/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

/**
 * Esta interfaz será usada por el controller. Contiene los datos del proyecto.
 * @author 2dam
 */
public interface Model{
    /**
     * Este metodo devuelve un String que sera el saludo que está recogido en un sistema de almacenamiento a decidir.
     * @return Devuelve el saludo que vamos a mostrar.
     */
    public String getGreeting();
}
