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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class AddController implements Initializable {

    /**
     * Initializes the controller class.
     */
   
    

    @FXML
    private void newStudent(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("addStudent.fxml"));
            Parent root2 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage2.setTitle("New Student");
            stage2.setScene(new Scene(root2));
            stage2.show();
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
           
        } catch (Exception e) {
            System.out.println("erer" + e.getCause());
        }
    }
    
      @FXML
    private void newTeacher(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("addTeacher.fxml"));
            Parent root2 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage2.setTitle("New Teacher");
            stage2.setScene(new Scene(root2));
            stage2.show();
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
           
        } catch (Exception e) {
            System.out.println("erer" + e.getCause());
        }
    }
    
         @FXML
    private void newCourse(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("addCourse.fxml"));
            Parent root2 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            // stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage2.setTitle("New Teacher");
            stage2.setScene(new Scene(root2));
            stage2.show();
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
           
        } catch (Exception e) {
            System.out.println("erer" + e.getCause());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
