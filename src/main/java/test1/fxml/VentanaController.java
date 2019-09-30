/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.fxml;

import TDA.Filtros;
import TDA.Funciones;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
    @FXML
    private ComboBox<String> idf;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final Funciones f = new Funciones();
        int s = 0;
        
        ObservableList<String> filtros = FXCollections.observableArrayList();
        filtros.addAll(
                Filtros.TODOS.toString(),
                Filtros.LOGIC_1.toString(),
                Filtros.LOGIC_2.toString(),
                Filtros.STRING_1.toString(),
                Filtros.STRING_2.toString(),
                Filtros.ARRAY_2.toString(),
                Filtros.MAP_1.toString(),
                Filtros.WARMUP_2.toString());
        idf.getItems().addAll(filtros);
        
        idf.getSelectionModel().select(0);
        
        idf.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>()
        {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue)
            {
                cambiar(true);
                System.out.println(newvalue);
                if(Filtros.TODOS.toString().equals(newvalue))
                {
                    cambiar(false);
                }
                if(Filtros.LOGIC_1.toString().equals(newvalue))
                {
                    id1.setDisable(false);
                    id2.setDisable(false);
                }
                if(Filtros.LOGIC_2.toString().equals(newvalue))
                {
                    id3.setDisable(false);
                    id4.setDisable(false);
                    id5.setDisable(false);
                }
                if(Filtros.STRING_1.toString().equals(newvalue))
                {
                    id13.setDisable(false);
                    id14.setDisable(false);
                    id15.setDisable(false);
                }
                if(Filtros.STRING_2.toString().equals(newvalue))
                {
                    id6.setDisable(false);
                    id7.setDisable(false);
                }
                if(Filtros.ARRAY_2.toString().equals(newvalue))
                {
                    id8.setDisable(false);
                    id9.setDisable(false);
                }
                if(Filtros.MAP_1.toString().equals(newvalue))
                {
                    id10.setDisable(false);
                    id11.setDisable(false);
                    id12.setDisable(false);
                }
                if(Filtros.WARMUP_2.toString().equals(newvalue))
                {
                    id16.setDisable(false);
                }
            }
        });
        
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
                    taDescripcion.setText(f.problema2());
                    taSolucion.setText(f.resultado2());
                    taPruebas.setText(f.pruebasString2());
                }
                if(id3.isSelected())
                {
                    System.out.println("3");
                    taDescripcion.setText(f.problema3());
                    taSolucion.setText(f.resultado3());
                    taPruebas.setText(f.pruebasString3());
                    
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
                    taDescripcion.setText(f.problema5());
                    taSolucion.setText(f.resultado5());
                    taPruebas.setText(f.pruebasString5());
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
                    taDescripcion.setText(f.problema9());
                    taSolucion.setText(f.resultado9());
                    taPruebas.setText(f.pruebasString9());
                }
                if(id10.isSelected())
                {
                    System.out.println("10");
                    taDescripcion.setText(f.problema10());
                    taSolucion.setText(f.resultado10());
                    taPruebas.setText(f.pruebasString10());
                }
                if(id11.isSelected())
                {
                    System.out.println("11");
                    taDescripcion.setText(f.problema11());
                    taSolucion.setText(f.resultado11());
                    taPruebas.setText(f.pruebasString11());
                }
                if(id12.isSelected())
                {
                    System.out.println("12");
                }
                if(id13.isSelected())
                {
                    System.out.println("13");
                    taDescripcion.setText(f.problema13());
                    taSolucion.setText(f.resultado13());
                    taPruebas.setText(f.pruebasString13());
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
                    String r[][] = f.pruebas2();
                    int a;
                    boolean b; 
                    for(int i=0;i<r.length;i++)
                    {
                        a = Integer.parseInt(r[i][0]);
                        b = Boolean.parseBoolean(r[i][1]);
                        if(f.resolver2(a) == b)
                            taResultados.setText(taResultados.getText()+"n="+a+" , resultado="+b+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"n="+a+" , resultado="+f.resolver2(a)+" Error\n");
                    }
                }
                if(id3.isSelected())
                {
                    System.out.println("3");
                    int a,b,c;
                    int r[][] = f.pruebas3();
                    boolean r2[] = f.prueba3Resultados();
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = r[i][2];
                        if(f.resolver3(a,b,c) == r2[i])
                            taResultados.setText(taResultados.getText()+"small="+a+" , big="+b+" , goal ="+c+" , resultado="+r2[i]+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"small="+a+" , big="+b+" , goal ="+c+" , resultado="+f.resolver3(a,b,c)+" Error\n");
                    }
                    
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
                    
                    int a,b,c,d;
                    int r[][] = f.pruebas5();
                    
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        c = r[i][2];
                        d = r[i][3];
                        
                        if(f.resolver5(a, b, c) == c)
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" , c="+c+" , resultado="+d+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"a="+a+" , b="+b+" , c="+c+" , resultado="+f.resolver5(a, b, c)+" Correcto\n");
                    }
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
                    
                    int r[][] = f.pruebas9();
                    boolean r2[] = f.prueba9Resultados();
                    int a[];
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i];
                        if(f.resolver9(a) == r2[i])
                            taResultados.setText(taResultados.getText()+"nums="+Arrays.toString(a)+" , resultado="+r2[i]+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"nums="+Arrays.toString(a)+" , resultado="+f.resolver9(a)+" Error\n");
                    }
                }
                if(id10.isSelected())
                {
                    System.out.println("10");
                    System.out.println("11");
                    Map<String, String> r[] = f.pruebas10();
                    Map<String, String> r2[] = f.prueba10Resultados();
                    Map<String, String> a;
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i];
                        if(f.resolver10(a).equals(r2[i]))
                            taResultados.setText(taResultados.getText()+"Map="+a.toString()+" , resultado="+r2[i]+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"Map="+a.toString()+" , resultado="+f.resolver10(a).toString()+" Error\n");
                    }
                }
                if(id11.isSelected())
                {
                    System.out.println("11");
                    Map<String, String> r[] = f.pruebas11();
                    Map<String, String> r2[] = f.prueba11Resultados();
                    Map<String, String> a;
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i];
                        if(f.resolver11(a).equals(r2[i]))
                            taResultados.setText(taResultados.getText()+"Map="+a.toString()+" , resultado="+r2[i]+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"Map="+a.toString()+" , resultado="+f.resolver11(a).toString()+" Error\n");
                    }
                }
                if(id12.isSelected())
                {
                    System.out.println("12");
                }
                if(id13.isSelected())
                {
                    System.out.println("13");
                    String r[][] = f.pruebas13();
                    String a, b;
                    
                    for(int i=0;i<r.length;i++)
                    {
                        a = r[i][0];
                        b = r[i][1];
                        if(f.resolver13(a).equals(b))
                            taResultados.setText(taResultados.getText()+"str="+a+" , resultado="+b+" Correcto\n");
                        else
                            taResultados.setText(taResultados.getText()+"str="+a+" , resultado="+f.resolver13(a)+" Error\n");
                    }
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
                    
                    int a;
                    boolean b;
                    
                    a = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero (n)"));
                    
                    b = f.resolver2(a);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+b);
                }
                if(id3.isSelected())
                {
                    System.out.println("3");
                    
                    int a, b, c;
                    boolean d;
                    
                    a = Integer.parseInt(JOptionPane.showInputDialog("Dame numero(small)"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Dame numero(big)"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Dame numero(goal)"));
                    
                    d = f.resolver3(a,b,c);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+d);
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
                    
                    int a,b,c,d;
                    
                    a = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero (a)"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero (b)"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero (c)"));
                    
                    d = f.resolver5(a, b, c);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+d);
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
                    
                    int a[],n;
                    boolean b;
                    
                    n = Integer.parseInt(JOptionPane.showInputDialog("Dame la longitud del array[n]"));
                    
                    a = new int[n];
                    for(int i=0;i<n;i++)
                        a[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame numero"));
                    
                    b = f.resolver9(a);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+b);
                }
                if(id10.isSelected())
                {
                    System.out.println("10");
                }
                if(id11.isSelected())
                {
                    System.out.println("11");
                    
                    Map<String, String> a = new HashMap<String, String>(), b;
                    int n;
                    String k, v;
                    
                    n = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de elementos del Map[n]"));
                    for(int i=0;i<n;i++)
                    {
                        k = JOptionPane.showInputDialog("Dame key");
                        v = JOptionPane.showInputDialog("Dame value");
                        a.put(k,v);
                    }
                    
                    b = f.resolver11(a);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+b.toString());
                }
                if(id12.isSelected())
                {
                    System.out.println("12");
                }
                if(id13.isSelected())
                {
                    System.out.println("13");
                    String a, b;
                    
                    a = JOptionPane.showInputDialog("Dame una cadena (str)");
                    
                    b = f.resolver13(a);
                    
                    JOptionPane.showMessageDialog(null, "El resultado es "+b);
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
    
    public void cambiar(boolean c)
    {
        id1.setDisable(c);
        id2.setDisable(c);
        id3.setDisable(c);
        id4.setDisable(c);
        id5.setDisable(c);
        id6.setDisable(c);
        id7.setDisable(c);
        id8.setDisable(c);
        id9.setDisable(c);
        id10.setDisable(c);
        id11.setDisable(c);
        id12.setDisable(c);
        id13.setDisable(c);
        id14.setDisable(c);
        id15.setDisable(c);
        id16.setDisable(c);
    }
}
