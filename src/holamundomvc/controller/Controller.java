/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import holamundomvc.view.View;
import holamundomvc.model.Model;


/**
 * Esta clase contiene al controlador de mi aplicacion, esta trabaja con ambas interfaces.
 * @author 2dam
 */
public class Controller{
    /**
     * 
     * @param vista Una vista, tenemos una clase que implementa la interfaz vista.
     * @param modelo Un modelo, tenemos una clase que implementa la interfaz modelo.
     */
    public void run(View vista,Model modelo){
        String saludo;
        saludo = modelo.getGreeting();
        vista.showGreeting(saludo);
    }
}
