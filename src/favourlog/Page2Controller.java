/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favourlog;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Page2Controller implements Initializable {
    
    Connection con=null;
    PreparedStatement pst=null;

    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField email;
    @FXML
    private Button submit;
    @FXML
    private TextField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void submit(ActionEvent event)throws IOException {

                
     
        
       try{
            
        String query= "INSERT INTO `user`(`firstname`, `lastname`, `email`, `password`) VALUES (?, ?, ?, ?)";
        con= DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");
        pst=con.prepareStatement(query);
        pst.setString(1,firstname.getText());
        pst.setString(2,lastname.getText());
        pst.setString(3,email.getText());
        pst.setString(4,password.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY");
        
         
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/FXMLDocument.fxml"));  
        
        Scene homepageScene= new Scene(root);
        
        Stage appStage=(Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
    
        
        
       
    

