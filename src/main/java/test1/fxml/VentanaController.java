/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.fxml;

import TDA.Funciones;
import java.net.URL;
import java.util.Arrays;
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
                    taDescripcion.setText(f.problema1());
                    taSolucion.setText(f.resultado1());
                    taPruebas.setText(f.pruebasString1());
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
                    taDescripcion.setText(f.problema6());
                    taSolucion.setText(f.resultado6());
                    taPruebas.setText(f.pruebasString6());
                }
                if(id7.isSelected())
                {
                    System.out.println("7");
                    taDescripcion.setText(f.problema7());
                    taSolucion.setText(f.resultado7());
                    taPruebas.setText(f.pruebasString7());
                }
                if(id8.isSelected())
                {
                    System.out.println("8");
                    taDescripcion.setText(f.problema8());
                    taSolucion.setText(f.resultado8());
                    taPruebas.setText(f.pruebasString8());
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
                    taDescripcion.setText(f.problema14());
                    taSolucion.setText(f.resultado14());
                    taPruebas.setText(f.pruebasString14());
                }
                if(id15.isSelected())
                {
                    System.out.println("15");
                    taDescripcion.setText(f.problema15());
                    taSolucion.setText(f.resultado15());
                    taPruebas.setText(f.pruebasString15());
                }
                if(id16.isSelected())
                {
                    System.out.println("16");
                    taDescripcion.setText(f.problema16());
                    taSolucion.setText(f.resultado16());
                    taPruebas.setText(f.pruebasString16());
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
                    String r[][] = f.pruebas1();
                    int a;
                    boolean b, c; 
                    for(int i=0;i<r.length;i++)
                    {
                        a = Integer.parseInt(r[i][0]);
                        b = Boolean.parseBoolean(r[i][1]);
                        c = Boolean.parseBoolean(r[i][2]);
                        if(f.resolver1(a, b) == c)
                            taResultados.setText(taResultados.getText()+"temp="+a+" , isSummer="+b+" , resultado="+c+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"temp="+a+" , isSummer="+b+" , resultado="+f.resolver1(a, b)+" Error\n");
                    }
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
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" resultado="+f.resolver4(a, b)+" Error\n");
                    }
                }
                if(id5.isSelected())
                {
                    System.out.println("5");
                }
                if(id6.isSelected())
                {
                    System.out.println("6");
                    
                    String r[][] = f.pruebas6();
                    String a, b, d; 
                    int c;
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = Integer.parseInt(r[i][2]);
                        d = r[i][3];
                        if(f.resolver6(a, b, c).equals(d))
                            taResultados.setText(taResultados.getText()+"word="+a+" , sep="+b+" , count="+c+" resultado="+d+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"word="+a+" , sep="+b+" , count="+c+" resultado="+f.resolver6(a, b, c)+" Error\n");
                    }
                }
                if(id7.isSelected())
                {
                    System.out.println("7");
                    String r[][] = f.pruebas7();
                    String a, b;
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        
                        if(f.resolver7(a).equals(b))
                            taResultados.setText(taResultados.getText()+"str="+a+" , resultado="+b+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"str="+a+" , resultado="+f.resolver7(a)+" Error\n");
                    }
                }
                if(id8.isSelected())
                {
                    System.out.println("8");
                    int r[][] = f.pruebas8();
                    int[] a;
                    int b;
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i];
                        b = a[a.length-1];
                        a = Arrays.copyOfRange(a, 0, a.length-1);
                        
                        
                        if(f.resolver8(a) == b)
                            taResultados.setText(taResultados.getText()+"nums="+Arrays.toString(a)+" , resultado="+b+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"nums="+Arrays.toString(a)+" , resultado="+f.resolver8(a)+" Error\n");
                    }
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
                    
                    String r[][] = f.pruebas14();
                    String a, b, c; 
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = r[i][2];
                        if(f.resolver14(a, b).equals(c))
                            taResultados.setText(taResultados.getText()+"out="+a+" , word="+b+" , resultado="+c+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"out="+a+" , word="+b+" , resultado="+f.resolver14(a, b)+" Error\n");
                    }
                }
                if(id15.isSelected())
                {
                    System.out.println("15");
                    
                    String r[][] = f.pruebas15();
                    String a, b, c; 
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = r[i][2];
                        if(f.resolver15(a, b).equals(c))
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" , resultado="+c+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" , resultado="+f.resolver15(a, b)+" Error\n");
                    }
                }
                if(id16.isSelected())
                {
                    System.out.println("16");
                    
                    String r[][] = f.pruebas16();
                    String a, b;
                    int c; 
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = Integer.parseInt(r[i][2]);
                        if(f.resolver16(a, b)==c)
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" , resultado="+c+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" , resultado="+f.resolver16(a, b)+" Error\n");
                    }
                }
            }     
        });
        
        btnNueva.setOnAction (new EventHandler< ActionEvent >(){
            public void handle(ActionEvent e){
                taResultados.setText("");
                if(id1.isSelected())
                {
                    System.out.println("1");
                    
                    int a;
                    boolean b, c;
                    
                    a = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero (temp)"));
                    b = Boolean.parseBoolean(JOptionPane.showInputDialog("Dame un booleano (true o false)"));
                    
                    c = f.resolver1(a, b);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+c);
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
                    
                    String a, b, d; 
                    int c;
                    
                    a = JOptionPane.showInputDialog("Dame una cadena (word)");
                    b = JOptionPane.showInputDialog("Dame una cadena (sep)");
                    c = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero (count)"));
                    
                    d = f.resolver6(a, b, c);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+d);
                }
                if(id7.isSelected())
                {
                    System.out.println("7");
                    
                    String a, b;
                    
                    a = JOptionPane.showInputDialog("Dame una cadena (str)");
                    b = f.resolver7(a);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+b);
                }
                if(id8.isSelected())
                {
                    System.out.println("8");
                    
                    int a[],n,b;
                    
                    n = Integer.parseInt(JOptionPane.showInputDialog("Dame la longitud del array[n]"));
                    
                    a = new int[n];
                    for(int i=0;i<n;i++)
                        a[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame numero"));
                    
                    b = f.resolver8(a);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+b);
                    
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
                    String a, b, c;
                    
                    a = JOptionPane.showInputDialog("Dame una cadena (out)");
                    b = JOptionPane.showInputDialog("Dame una cadena (word)");
                    
                    c = f.resolver14(a, b);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+c);
                }
                if(id15.isSelected())
                {
                    System.out.println("15");
                    String a, b, c;
                    
                    a = JOptionPane.showInputDialog("Dame una cadena (a)");
                    b = JOptionPane.showInputDialog("Dame una cadena (b)");
                    
                    c = f.resolver15(a, b);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+c);
                }
                if(id16.isSelected())
                {
                    System.out.println("16");
                    String a, b;
                    int c;
                    
                    a = JOptionPane.showInputDialog("Dame una cadena (a)");
                    b = JOptionPane.showInputDialog("Dame una cadena (b)");
                    
                    c = f.resolver16(a, b);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+c);
                }
            }     
        });
    }   
}
