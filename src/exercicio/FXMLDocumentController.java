/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label LabelNum;
    @FXML
    private Label labelDobro;
    @FXML
    private Label labelTriplo;
    @FXML
    private Label labelQuadruplo;
    @FXML
    private Label labelCubo;
    @FXML
    private TextField recebenum;
    @FXML
    private Button button1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("label 1 ok");
        String t = recebenum.getText();
          double c =Double.parseDouble(t);
          double D = c*2;
          double T = c*3;
          double Q = c*c;
          double Cub = c*c*c;
          
          
                
         labelDobro.setText("Dobro: "+ Double.toString(D));
         labelTriplo.setText("Triplo:" + Double.toString(T));
         labelQuadruplo.setText("Quadrado:" + Double.toString(Q));
         labelCubo.setText("Cubo:" + Double.toString(Cub));
    }
        private void dobro(ActionEvent event) {
        
     
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(MouseEvent event) {
    }
    
}
