/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holab;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Herson
 */
public class PrincipalController implements Initializable {
    @FXML
    Label nameLabel;
    @FXML
    TextField nameTextField;
    
    @FXML
    public void copyName(){
        String name = nameTextField.getText();
        String result = String.format("Hola: %s", name);
        nameLabel.setText(result);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
