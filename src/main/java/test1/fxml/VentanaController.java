/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.fxml;

import TDA.Funciones;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author dzp
 */
public class VentanaController implements Initializable {

    @FXML
    private ToggleGroup xxx;
    @FXML
    private RadioButton id1;
    @FXML
    private RadioButton id2;
    @FXML
    private RadioButton id3;
    @FXML
    private RadioButton id4;
    @FXML
    private RadioButton id5;
    @FXML
    private RadioButton id6;
    @FXML
    private RadioButton id7;
    @FXML
    private RadioButton id8;
    @FXML
    private RadioButton id9;
    @FXML
    private RadioButton id10;
    @FXML
    private RadioButton id11;
    @FXML
    private RadioButton id12;
    @FXML
    private RadioButton id13;
    @FXML
    private RadioButton id14;
    @FXML
    private RadioButton id15;
    @FXML
    private RadioButton id16;
    @FXML
    private TextArea taDescripcion;
    @FXML
    private TextArea taSolucion;
    @FXML
    private Button btnChecar;
    @FXML
    private Button btnNueva;
    @FXML
    private TextArea taPruebas;
    @FXML
    private TextArea taResultados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final Funciones f = new Funciones();
        int s = 0;
        
        xxx.selectedToggleProperty().addListener(new ChangeListener<Toggle>()  
        {
            public void changed(ObservableValue<? extends Toggle> ob,                 Toggle o, Toggle n) 
            {
                taDescripcion.setText("");
                taSolucion.setText("");
                taPruebas.setText("");
                taResultados.setText("");
                
                if(id1.isSelected())
                {
                    System.out.println("1");
                }
                if(id2.isSelected())
                {
                    System.out.println("2");
                }
                if(id3.isSelected())
                {
                    System.out.println("3");
                    
                }
                if(id4.isSelected())
                {
                    System.out.println("4");
                    taDescripcion.setText(f.problema4());
                    taSolucion.setText(f.resultado4());
                    taPruebas.setText(f.pruebasString4());
                }
                if(id5.isSelected())
                {
                    System.out.println("5");
                }
                if(id6.isSelected())
                {
                    System.out.println("6");
                }
                if(id7.isSelected())
                {
                    System.out.println("7");
                }
                if(id8.isSelected())
                {
                    System.out.println("8");
                }
                if(id9.isSelected())
                {
                    System.out.println("9");
                }
                if(id10.isSelected())
                {
                    System.out.println("10");
                }
                if(id11.isSelected())
                {
                    System.out.println("11");
                }
                if(id12.isSelected())
                {
                    System.out.println("12");
                }
                if(id13.isSelected())
                {
                    System.out.println("13");
                }
                if(id14.isSelected())
                {
                    System.out.println("14");
                }
                if(id15.isSelected())
                {
                    System.out.println("15");
                }
                if(id16.isSelected())
                {
                    System.out.println("16");
                }
                
                /*
                RadioButton rb = (RadioButton)xxx.getSelectedToggle(); 
  
                if (rb != null) { 
                    String s = rb.getText(); 
  
                    // change the label 
                    taResultados.setText(s + " selected"); 
                } */
            } 
        });
        
        btnChecar.setOnAction (new EventHandler< ActionEvent >(){
            public void handle(ActionEvent e){
                taResultados.setText("");
                if(id1.isSelected())
                {
                    System.out.println("1");
                }
                if(id2.isSelected())
                {
                    System.out.println("2");
                }
                if(id3.isSelected())
                {
                    System.out.println("3");
                    
                }
                if(id4.isSelected())
                {
                    System.out.println("4");
                    //JOptionPane.showInputDialog("Dame a")
                    int r[][] = f.pruebas4();
                    int a, b, c;
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = r[i][2];
                        
                        if(f.resolver4(a, b) == c)
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" resultado="+c+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" resultado="+c+" Error\n");
                    }
                }
                if(id5.isSelected())
                {
                    System.out.println("5");
                }
                if(id6.isSelected())
                {
                    System.out.println("6");
                }
                if(id7.isSelected())
                {
                    System.out.println("7");
                }
                if(id8.isSelected())
                {
                    System.out.println("8");
                }
                if(id9.isSelected())
                {
                    System.out.println("9");
                }
                if(id10.isSelected())
                {
                    System.out.println("10");
                }
                if(id11.isSelected())
                {
                    System.out.println("11");
                }
                if(id12.isSelected())
                {
                    System.out.println("12");
                }
                if(id13.isSelected())
                {
                    System.out.println("13");
                }
                if(id14.isSelected())
                {
                    System.out.println("14");
                }
                if(id15.isSelected())
                {
                    System.out.println("15");
                }
                if(id16.isSelected())
                {
                    System.out.println("16");
                }
            }     
        });
        
        btnNueva.setOnAction (new EventHandler< ActionEvent >(){
            public void handle(ActionEvent e){
                taResultados.setText("");
                if(id1.isSelected())
                {
                    System.out.println("1");
                }
                if(id2.isSelected())
                {
                    System.out.println("2");
                }
                if(id3.isSelected())
                {
                    System.out.println("3");
                    
                }
                if(id4.isSelected())
                {
                    System.out.println("4");
                    //JOptionPane.showInputDialog("Dame a")
                    int a, b, c;
                    a = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero A"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero B"));
                    
                    c = f.resolver4(a, b);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+c);
                }
                if(id5.isSelected())
                {
                    System.out.println("5");
                }
                if(id6.isSelected())
                {
                    System.out.println("6");
                }
                if(id7.isSelected())
                {
                    System.out.println("7");
                }
                if(id8.isSelected())
                {
                    System.out.println("8");
                }
                if(id9.isSelected())
                {
                    System.out.println("9");
                }
                if(id10.isSelected())
                {
                    System.out.println("10");
                }
                if(id11.isSelected())
                {
                    System.out.println("11");
                }
                if(id12.isSelected())
                {
                    System.out.println("12");
                }
                if(id13.isSelected())
                {
                    System.out.println("13");
                }
                if(id14.isSelected())
                {
                    System.out.println("14");
                }
                if(id15.isSelected())
                {
                    System.out.println("15");
                }
                if(id16.isSelected())
                {
                    System.out.println("16");
                }
            }     
        });
    }   
}
