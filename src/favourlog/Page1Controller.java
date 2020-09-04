/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favourlog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Page1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
     @FXML
    private Button movies;

    @FXML
    void movies(ActionEvent event)throws IOException {
        try{
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/movies1.fxml"));  
        
        Scene homepageScene= new Scene(root);
        
        Stage appStage=(Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    @FXML
    private Button books;

    @FXML
    void books(ActionEvent event) throws IOException {
        try{
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/Book1.fxml"));  
        
        Scene homepageScene= new Scene(root);
        
        Stage appStage=(Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
