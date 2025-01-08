package com.example.javafx;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController extends BaseController implements Initializable {
    @FXML
    private TableView<StudentModel> tbData;
    @FXML
    public TableColumn<StudentModel, Integer> id;
    @FXML
    public TableColumn<StudentModel, String> firstName;
    @FXML
    public TableColumn<StudentModel, String> lastName;
    @FXML
    public TableColumn<StudentModel, String> room;
    @FXML
    public TableColumn<StudentModel, Integer> age;

    private Label erabiltzailea;

    public void setErabiltzailea(String izena) {
        erabiltzailea.setText(izena);
    }
    public String getErabiltzailea() {
        return erabiltzailea.getText();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        id.setCellValueFactory(new PropertyValueFactory<>("Id"));
//        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
//        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
//        room.setCellValueFactory(new PropertyValueFactory<>("Room"));
//        age.setCellValueFactory(new PropertyValueFactory<>("Age"));
//
//        tbData.setItems(FXCollections.observableArrayList(
//                new StudentModel(1, "Student 1", "Last Name 1", "1MG3", 20),
//                new StudentModel(2, "Student 2", "Last Name 2", "1MG3", 21),
//                new StudentModel(3, "Student 3", "Last Name 3", "2MG3", 22),
//                new StudentModel(4, "Student 4", "Last Name 4", "1MG3", 23)
//        ));
    }
}
