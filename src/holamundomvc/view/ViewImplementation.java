/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

/**
 * Esta clase implementa la interfaz View. Implementa el saludo en una interfaz de tipo texto.
 * @author Endika Ubierna Lopez, 
 */
public class ViewImplementation implements View{
    /**
     * Muestra el saludo que recibe en la interfaz de usuario.
     * @param greeting Este parametro es el String del fichero en el que guardamos el saludo
     */    
    @Override
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
    
    
}
