/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtHub.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Fayechi
 */
public class TestFXMainTarek extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        try {
<<<<<<< HEAD:src/ArtHub/gui/TestFXMain.java
            Parent root = FXMLLoader.load(getClass().getResource("AfficherEvenement.fxml")); //replace with add if i wanna add
=======
            Parent root = FXMLLoader.load(getClass().getResource("AddLabel.fxml"));
>>>>>>> dd2f1db385aefb086574cc7a3485dc53ff3d9cfe:src/ArtHub/gui/TestFXMainTarek.java
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(TestFXMainTarek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
