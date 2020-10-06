/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ViewVentanaFx implements View{
    
     private static void initAndShowGUI(String greeting) {
        
        JFrame frame = new JFrame("Swing and JavaFX");
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel, greeting);
            }
       });
    }

    private static void initFX(JFXPanel fxPanel,String greeting) {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene(greeting);
        fxPanel.setScene(scene);
    }

    private static Scene createScene(String greeting) {
        Group  root  =  new  Group();
        Scene  scene  =  new  Scene(root, Color.ALICEBLUE);
        Text  text  =  new  Text();
        
        text.setX(40);
        text.setY(100);
        text.setFont(new Font(25));
        text.setText(greeting);

        root.getChildren().add(text);

        return (scene);
    }
    

    @Override
    public void showGreeting(String greeting) {
       initAndShowGUI(greeting); 
       
       
    }
    
}
