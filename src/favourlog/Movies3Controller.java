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
 * @author NIPUN
 */
public class Movies3Controller implements Initializable {

    @FXML
    private Button school;
    @FXML
    private Button showman;
    @FXML
    private Button jurassic;
    @FXML
    private Button thor;
    @FXML
    private Button backmovies3;
    @FXML
    private Button nextmovies3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(ActionEvent event) throws IOException {

    try{
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/movies2.fxml"));  
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
    private void next(ActionEvent event) throws IOException {

    try{
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/movies4.fxml"));  
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
    
}
