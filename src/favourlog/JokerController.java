/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favourlog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author NIPUN
 */
public class JokerController implements Initializable{
    /**
     * Initializes the controller class.
     */
    private float sum=0;
    private int sum2=0;
    StringBuffer srcCopy=null;
    StringBuffer srcCopy1=null;
    StringBuffer srcCopy2=null;
    //String ch;
    ObservableList<String>ratinglist=FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10");
    
    @FXML
    private Button ok;
    @FXML
    private ChoiceBox ratingbox;
    @FXML
    private Button backmovies1;
    @FXML
    private TextField sum1;
    @FXML
    private Button view;
    
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
    //@FXML

     @FXML
    private void ok(ActionEvent event) {
        
        sum=sum+Float.parseFloat(ratingbox.getSelectionModel().getSelectedItem().toString());
        sum2++;
        float sum3=0;
        sum3=sum/sum2;
        System.out.println(sum3);
        sum1.setText(String.format("%,.1f",sum3));
        String str=String.format("%,.1f",sum3);
        /*String str1=String.format("%,.1f",sum);
        String str2=String.format("%",sum2);*/
        
        //String str="D:\\STUDY\\2.1\\SD\\Favourlog 01\\Favourlog 01\\src\\favourlog";
        try
        {
            FileOutputStream fos=new FileOutputStream("D:\\\\STUDY\\\\2.1\\\\SD\\\\Favourlog 01\\\\Favourlog 01\\\\src\\\\favourlog\\\\favourlog2.txt");
            DataOutputStream dos=new DataOutputStream(fos);
            
            /*FileOutputStream fos1=new FileOutputStream("D:\\\\STUDY\\\\2.1\\\\SD\\\\Favourlog 01\\\\Favourlog 01\\\\src\\\\favourlog\\\\favourlog3.txt");
            DataOutputStream dos1=new DataOutputStream(fos1);
            
            FileOutputStream fos2=new FileOutputStream("D:\\\\STUDY\\\\2.1\\\\SD\\\\Favourlog 01\\\\Favourlog 01\\\\src\\\\favourlog\\\\favourlog4.txt");
            DataOutputStream dos2=new DataOutputStream(fos2);*/
            
               dos.writeChars(str);
               dos.close();
               
               /*dos1.writeChars(str1);
               dos1.close();
    
               dos2.writeChars(str2);
               dos2.close();*/
        }
        catch (IOException e)
    {
      e.printStackTrace();
    }
        /*FileReader fr1=null;
        FileReader fr2=null;
        
        try
        {
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            fr1=new FileReader("D:\\\\STUDY\\\\2.1\\\\SD\\\\Favourlog 01\\\\Favourlog 01\\\\src\\\\favourlog\\\\favourlog3.txt");
            fr2=new FileReader("D:\\\\STUDY\\\\2.1\\\\SD\\\\Favourlog 01\\\\Favourlog 01\\\\src\\\\favourlog\\\\favourlog4.txt");
            int data;
            while((data=fr1.read())!=-1)
            {
                sb1.append((char)data);
            }
            while((data=fr2.read())!=-1)
            {
                sb2.append((char)data);
            }
            srcCopy1=new StringBuffer(sb1.toString());
            srcCopy2=new StringBuffer(sb2.toString());
            sum=0;
            sum2=0;
            sum2=sum2+Integer.parseInt(srcCopy2.toString());
            sum=sum+Integer.parseInt(srcCopy1.toString());
            System.out.println(sum);
            System.out.println(sum2);
            fr1.close();
            fr2.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/
    }


    @FXML
    private void view(ActionEvent event) {
        FileReader fr=null;
        
        try
        {
            StringBuilder sb=new StringBuilder();
            fr=new FileReader("D:\\\\STUDY\\\\2.1\\\\SD\\\\Favourlog 01\\\\Favourlog 01\\\\src\\\\favourlog\\\\favourlog2.txt");
       
            int data;
            while((data=fr.read())!=-1)
            {
                sb.append((char)data);
            }

            srcCopy=new StringBuffer(sb.toString());
            sum1.setText(srcCopy.toString());
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {
            //System.out.println(ch);
            try {
                // Close the input stream
                System.out.println(srcCopy);
                //sum1.setText(String.format("%,.1f",srcCopy));
       
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        
          //sum1.setText(String.format("%,.1f",srcCopy));
          ratingbox.setValue("1");
          ratingbox.setItems(ratinglist);
        
    }


}
