/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

/**
 * Esta interfaz contiene el metodo showGreeting, el cual será usado por el controller
 * 
 * @author Endika Ubierna Lopez
 */
public interface View{
   
    /**
     * Muestra el saludo que recibe en la interfaz de usuario.
     * @param greeting Este parametro es el String del fichero en el que guardamos el saludo
     */
    public void showGreeting(String greeting);
}
