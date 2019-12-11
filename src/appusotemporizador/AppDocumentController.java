/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotemporizador;

import CustomController.CustomControl;
import Temporizador.Temporizador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class AppDocumentController implements Initializable {

    @FXML
    private Label res;
    @FXML
    private Temporizador temp;
    @FXML
    private CustomControl ctn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ctn.addEventHandler(EventType.ROOT, event->{
                if(event.getEventType().getName().equalsIgnoreCase("Action")){
                temp.setTiempo(Integer.parseInt(ctn.getText()));
                temp.initTemporizador(); 
           }
        });
       
       temp.addEventHandler(EventType.ROOT, eventHandler->{
           if(temp.getX()==0)
               res.setText("Temporizador finalizado");
       });
       
 
    }    
}
