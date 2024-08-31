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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static oopprojectv2.AddStudentController.s;
import static oopprojectv2.FXMLDocumentController.aast;

/**
 * FXML Controller class
 *
 * @author Amr
 */
public class AddTeacherController implements Initializable {

    /**
     * Initializes the controller class.
     */
    static teacher t = new teacher();
    
    @FXML
    TextField name;
    @FXML
    TextField age;
    @FXML
    TextField id;
    @FXML
    TextField no;
    @FXML
    TextField address;
    @FXML
    TextField course;

        @FXML
    private void save(ActionEvent event) {

        t.name = name.getText();
        t.age = Integer.parseInt(age.getText());
        t.tId = Integer.parseInt(id.getText());
        t.phNo = Integer.parseInt(no.getText());
        t.course = course.getText();
        aast.teachers.add(t);
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        t = new teacher();
    }    
    
}
