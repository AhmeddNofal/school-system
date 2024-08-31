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
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import static oopprojectv2.AddStudentController.s;
import static oopprojectv2.AddTeacherController.t;
//import static oopprojectv2.AddCourseController.c;
import static oopprojectv2.FXMLDocumentController.aast;

import static oopprojectv2.FXMLDocumentController.p;
/**
 * FXML Controller class
 *
 * @author Amr
 */
public class FormShowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
      ListView list;
    @FXML
 private void show(ActionEvent event) {
                if (p == "t") {
           for (int i = 0; i< aast.teachers.size();i++) {
            list.getItems().add(aast.teachers.get(i).name);
            list.getItems().add(aast.teachers.get(i).age);
            list.getItems().add(aast.teachers.get(i).tId);
            list.getItems().add(aast.teachers.get(i).course);
            list.getItems().add("////////");

             }
//        
         } else if (p == "s") {
               for (int i = 0; i< aast.students.size();i++) {
            list.getItems().add(aast.students.get(i).name);
            list.getItems().add(aast.students.get(i).age);
            list.getItems().add(aast.students.get(i).sId);
            list.getItems().add(aast.students.get(i).course);
            list.getItems().add("////////");

             } 
         } else if (p == "c") {
             for (int i = 0; i< aast.courses.size();i++) {
               list.getItems().add(aast.courses.get(i).name);
               list.getItems().add(aast.courses.get(i).code);
               list.getItems().add("////////");
             }
         
         }
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // if (p == "t") {
          // for (int i = 0; i< aast.teachers.size();i++) {
               // list.getItems().add(aast.teachers.get(i).name);
                //list.itemsProperty().bind(aast.teachers.get(i).name);
            // }
            //list.itemsProperty().bind(aast.teachers);
        // }
    }   
     
}
