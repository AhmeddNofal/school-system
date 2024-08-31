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
import static oopprojectv2.FXMLDocumentController.aast;

/**
 * FXML Controller class
 *
 * @author Amr
 */
public class AddStudentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    static student s = new student();
    @FXML
    TextField studentName;
    @FXML
    TextField studentAge;
    @FXML
    TextField studentId;
    @FXML
    TextField studentMajor;
    @FXML
    TextField studentAddress;
    @FXML
    TextField studentCourse;

    @FXML
    private void save(ActionEvent event) {

        s.name = studentName.getText();
        s.age = Integer.valueOf(studentAge.getText());
        s.sId = Integer.parseInt(studentId.getText());
        s.major = studentMajor.getText();
        s.course = studentCourse.getText();
        aast.students.add(s);

        //System.out.println(s.name);
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
