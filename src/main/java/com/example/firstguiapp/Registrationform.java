package com.example.firstguiapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Registrationform {
    private    Button regButton;
    @FXML
    private TextField regID;

    private PasswordField passwordField;
    private DatePicker datePicker;
    @FXML
    public void setRegButton() throws FileNotFoundException {
        File file=new File("logins.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNext()){
            while (scanner.hasNext()) {

                String[] loginpassword=scanner.nextLine().split(" ");
                if (loginpassword[0].equals(regID.getText())){
                    System.out.println("This login is not available!");

                }
            }
        }


}

}
