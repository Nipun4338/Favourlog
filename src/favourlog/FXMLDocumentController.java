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
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {

    Connection con=null;
    PreparedStatement pst=null;
    
    @FXML
    private ImageView favourlog;
    @FXML
    private Button signin;
    @FXML
    private Button createaccount;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(MouseEvent event) {
    }

    @FXML
    private void signIn (ActionEvent event)  throws IOException {
       
        
       String sql="select * from user where email=? and password=?";
       try{
            
        con=DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");
        pst=con.prepareStatement(sql);
        pst.setString(1,username.getText());
        pst.setString(2,password.getText());
        ResultSet rs = pst.executeQuery();
        if(rs.next())
        {
            
            
        
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/page1.fxml"));  
        
        Scene homepageScene= new Scene(root);
        
        Stage appStage=(Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
        
        label.setText("Login Success");

        }

        else
        {

            JOptionPane.showMessageDialog(null,"Username and Password do not matched!!!");

        }
       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }
        
        
    

    @FXML
    private void createAccount(ActionEvent event) throws IOException {
        
       try{
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/page2.fxml"));  
        
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
    private void handleButtonAction(ActionEvent event) {
    }
    
}
