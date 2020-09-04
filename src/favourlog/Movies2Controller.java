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
public class Movies2Controller implements Initializable {

    @FXML
    private Button aquaman;
    @FXML
    private Button jonnhy;
    @FXML
    private Button steel;
    @FXML
    private Button coco;
    @FXML
    private Button nextmovies2;
    @FXML
    private Button backmovies2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void next(ActionEvent event) throws IOException {

    try{
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/movies3.fxml"));  
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
    private void back(ActionEvent event) throws IOException {

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
    
}
