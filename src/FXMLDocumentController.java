/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectv2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import oopprojectv2.AddStudentController;
import static oopprojectv2.AddStudentController.s;
import static oopprojectv2.AddTeacherController.t;
//import static oopprojectv2.AddCourseController.c;

/**
 *
 * @author Owner
 */
public class FXMLDocumentController implements Initializable {
    
    static college aast = new college();
    static String p;

    @FXML
     Label label;
     Button add;
   
    
    @FXML
    private void teachers(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("formShow.fxml"));
            Parent root2 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage2.setTitle("Contents");
            stage2.setScene(new Scene(root2));
            stage2.show();
           
            p = "t";
            
            

        } catch (Exception e) {
            System.out.println("erer" + e.getCause());
        }
    }
    
    
    @FXML
    private void courses(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("formShow.fxml"));
            Parent root2 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage2.setTitle("Contents");
            stage2.setScene(new Scene(root2));
            stage2.show();
            p = "c";
            
            

        } catch (Exception e) {
            System.out.println("erer" + e.getCause());
        }
    }
    
    
    @FXML
    private void students(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("formShow.fxml"));
            Parent root2 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage2.setTitle("Contents");
            stage2.setScene(new Scene(root2));
            stage2.show();
           p = "s";
            
            

        } catch (Exception e) {
            System.out.println("erer" + e.getCause());
        }
    } 
    

    @FXML
    private void Add(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Add.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Add");
            stage.setScene(new Scene(root1));
            stage.show();
           
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    

    



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }

}
