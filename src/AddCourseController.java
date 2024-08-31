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
import javafx.stage.Window;
import static oopprojectv2.AddStudentController.s;
import static oopprojectv2.FXMLDocumentController.aast;

/**
 * FXML Controller class
 *
 * @author Amr
 */
public class AddCourseController implements Initializable {

    /**
     * Initializes the controller class.
     */
    static course c = new course();
    @FXML
    TextField name;
    @FXML
    TextField code;

    @FXML
    private void saveCourse(ActionEvent event) {
        try {

            c.name = name.getText();
            c.code = Integer.parseInt(code.getText());

            aast.courses.add(c);
        } catch (Exception e) {

            System.out.println(e);
        }

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        //((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
