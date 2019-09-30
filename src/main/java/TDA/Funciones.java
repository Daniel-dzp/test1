/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dzp
 */
public class Funciones{
    public String problema1()
    {
        return "Las ardillas en Palo Alto pasan la mayor parte del día jugando. \n" +
"En particular, juegan si la temperatura está entre 60 y 90 (inclusive). \n" +
"A menos que sea verano, el límite superior es 100 en lugar de 90. \n" +
"Dada una temperatura interna y un valor booleano es Verano, \n" +
"devuelve verdadero si las ardillas juegan y falso en caso contrario.";
    }
    public String resultado1()
    {
        return "boolean squirrelPlay(int temp, boolean isSummer) {\n" +
"    boolean play=false;\n" +
"    if(isSummer==true)\n" +
"    {\n" +
"        if(temp>=60 && temp <=100)\n" +
"        {\n" +
"            play = true;\n" +
"        }\n" +
"    }\n" +
"    else\n" +
"    {\n" +
"        if(temp>=60 && temp<=90)\n" +
"        {\n" +
"            play = true;\n" +
"        }\n" +
"    }\n" +
"\n" +
"    return play;\n" +
"}";
    }
    public boolean resolver1(int temp, boolean isSummer)
    {
        boolean play=false;
        if(isSummer==true)
        {
            if(temp>=60 && temp <=100)
            {
                play = true;
            }
        }
        else
        {
            if(temp>=60 && temp<=90)
            {
                play = true;
            }
        }

        return play;
    }
    
    public String pruebasString1()
    {
        return "squirrelPlay(70, false) → true\n" +
"squirrelPlay(95, false) → false\n" +
"squirrelPlay(95, true) → true";
    }
    
    public String[][] pruebas1()
    {
        String resulados[][] = {{"70", "false", "true"},{"95", "false", "false"},{"95", "true", "true"}};
        return resulados;
    }
    
    public String problema2()
    {
        return "Digamos que un numero especial es multiplo de 11 o si es un mayor a un multiplo de 11.\n" +
"Regresame true si el numero ingresado es espacial y false si no.";
    }
    public String resultado2()
    {
        return "public boolean specialEleven(int n) {\n" +
"  boolean flag = false;\n" +
"  \n" +
"  if(n%11==0 || (n-1)%11==0)\n" +
"    flag = true;\n" +
" \n" +
"  return flag;\n" +
"  \n" +
"}";
    }
    public boolean resolver2(int n)
    {
        boolean flag = false;

        if(n%11==0 || (n-1)%11==0)
          flag = true;

        return flag;

      
    }
    
    public String pruebasString2()
    {
        return "specialEleven(22) → true\n" +
"specialEleven(23) → true\n" +
"specialEleven(24) → false";
    }
    
    public String[][] pruebas2()
    {
        String resulados[][] = {{"22", "true"},{"23", "true"},{"24", "false"}};
        return resulados;
    }
    
    public String problema3()
    {
        return "Queremos hacer una hilera de ladrillos que tenga pulgadas de largo. \n" +
"Tenemos varios ladrillos pequeños (1 pulgada cada uno) \n" +
"y ladrillos grandes (5 pulgadas cada uno). Devuelve verdadero si es posible \n" +
"lograr el objetivo eligiendo entre los ladrillos dados. \n" +
"Esto es un poco más difícil de lo que parece y se puede hacer sin ningún bucle. \n" +
"Ver también: Introducción a MakeBricks";
    }
    public String resultado3()
    {
        return "public boolean makeBricks(int small, int big, int goal) {\n" +
"    boolean flag = false;\n" +
"\n" +
"    if(small>=(goal%5) && goal <= (small +(big*5)))\n" +
"        flag = true;\n" +
"\n" +
"    return flag;\n" +
"}";
    }
    public boolean resolver3(int small, int big, int goal)
    {
        boolean flag = false;

        if(small>=(goal%5) && goal <= (small +(big*5)))
            flag = true;

        return flag;
    }
    
    public String pruebasString3()
    {
        return "makeBricks(3, 1, 8) → true\n" +
"makeBricks(3, 1, 9) → false\n" +
"makeBricks(3, 2, 10) → true";
    }
    
    public int[][] pruebas3()
    {
        int resulados[][] = {{3, 1, 8},{3, 1, 9},{3, 2, 10}};
        return resulados;
    }
    
    public boolean[] prueba3Resultados()
    {
        boolean r[] = {true, false, true};
        return r;
    }
   
    public String problema4()
    {
        return "Dados 2 valores int mayores que 0, devuelve el valor más cercano a 21 sin pasar.\n Devuelve 0 si ambos pasan.";
    }
    public String resultado4()
    {
        return "public int blackjack(int a, int b) {\n" +
"  if(a>21 && b>21)\n" +
"    return 0;\n" +
"  \n" +
"  if(a>21)\n" +
"    return b;\n" +
"  \n" +
"  if(b>21)\n" +
"    return a;\n" +
"    \n" +
"  if(a>b)\n" +
"    return a;\n" +
"  else\n" +
"    return b;\n" +
"}";
    }
    public int resolver4(int a, int b)
    {
        if(a>21 && b>21)
            return 0;

          if(a>21)
            return b;

          if(b>21)
            return a;

          if(a>b)
            return a;
          else
            return b;
    }
    
    public String pruebasString4()
    {
        return "blackjack(19, 21) → 21\n" +
"blackjack(21, 19) → 21\n" +
"blackjack(19, 22) → 19";
    }
    
    public int[][] pruebas4()
    {
        int resulados[][] = {{19,21,21},{21,19,21},{19,22,19}};
        return resulados;
    }
    
    public String problema5()
    {
        return "Dados 3 valores int, a b c, devuelven su suma. Sin embargo, \n" +
"si uno de los valores es 13, \n" +
"entonces no cuenta para la suma y los valores a su derecha no cuentan. ";
    }
    public String resultado5()
    {
        return "public int luckySum(int a, int b, int c) {\n" +
"	int sum;\n" +
"	if(a==13)\n" +
"            sum=0;\n" +
"       else\n" +
"       {\n" +
"            if(b==13)\n" +
"                sum = a;\n" +
"            else\n" +
"            {\n" +
"                if(c==13)\n" +
"                    sum= a+b;\n" +
"                else\n" +
"                {\n" +
"                    sum= a+b+c;\n" +
"                }\n" +
"            }\n" +
"        }\n" +
"        return sum;\n" +
"}";
    }
    public int resolver5(int a, int b, int c)
    {
	int sum;
	if(a==13)
            sum=0;
        else
        {
            if(b==13)
                sum = a;
            else
            {
                if(c==13)
                    sum= a+b;
                else
                {
                    sum= a+b+c;
                }
            }
        }
        return sum;
    }
    
    public String pruebasString5()
    {
        return "luckySum(1, 2, 3) → 6\n" +
"luckySum(1, 2, 13) → 3\n" +
"luckySum(1, 13, 3) → 1";
    }
    
    public int[][] pruebas5()
    {
        int resulados[][] = {{1, 2, 3, 6},{1, 2, 13, 3},{1, 13, 3, 1}};
        return resulados;
    }
    
    public String problema6()
    {
        return "Dadas dos cadenas, palabra y un separador separador, \ndevuelve una gran cadena hecha de recuentos de la palabra, \nseparada por la cadena del separador.";
    }
    public String resultado6()
    {
        return "public String repeatSeparator(String word, String sep, int count) {\n" +
"  String cadena=\"\";\n" +
"  \n" +
"  for(int i=0;i<count;i++)\n" +
"  {\n" +
"    if(i>0)\n" +
"      cadena += sep;\n" +
"    cadena += word;\n" +
"  }\n" +
"  \n" +
"  return cadena;\n" +
"}";
    }
    public String resolver6(String word, String sep, int count)
    {
        String cadena="";

        for(int i=0;i<count;i++)
        {
          if(i>0)
            cadena += sep;
          cadena += word;
        }

        return cadena;
    }
    
    public String pruebasString6()
    {
        return "repeatSeparator(\"Word\", \"X\", 3) → \"WordXWordXWord\"\n" +
"repeatSeparator(\"This\", \"And\", 2) → \"ThisAndThis\"\n" +
"repeatSeparator(\"This\", \"And\", 1) → \"This\"";
    }
    
    public String[][] pruebas6()
    {
        String resulados[][] = {{"Word", "X", "3","WordXWordXWord"},
                            {"This", "And", "2", "ThisAndThis"},
                            {"This", "And", "1", "This"}};
        return resulados;
    }
    
    public String problema7()
    {
        return "Busque patrones como \"zip\" y \"zap\" en la cadena - longitud-3, \ncomenzando con 'z' y terminando con 'p'. Devuelve una cadena donde para todas esas palabras,\n la letra del medio se ha ido, por lo que \"zipXzap\" produce \"zpXzp\".";
    }
    public String resultado7()
    {
        return "public String zipZap(String str) {\n" +
"  int longitud = str.length();\n" +
"  String cadena = \"\";\n" +
"  int i = 0;\n" +
"  \n" +
"  while(i+2<longitud)\n" +
"  {\n" +
"    if(str.charAt(i)=='z' && str.charAt(i+2)=='p')\n" +
"    {\n" +
"      cadena += \"zp\";\n" +
"      i += 3;\n" +
"    }\n" +
"    else\n" +
"    {\n" +
"      cadena += str.charAt(i);\n" +
"      i++;\n" +
"    }\n" +
"  }\n" +
"  \n" +
"  while(i<longitud)\n" +
"  {\n" +
"    cadena += str.charAt(i);\n" +
"    i++;\n" +
"  }\n" +
"  \n" +
"  return cadena;\n" +
"}";
    }
    public String resolver7(String str)
    {
        int longitud = str.length();
        String cadena = "";
        int i = 0;

        while(i+2<longitud)
        {
          if(str.charAt(i)=='z' && str.charAt(i+2)=='p')
          {
            cadena += "zp";
            i += 3;
          }
          else
          {
            cadena += str.charAt(i);
            i++;
          }
        }

        while(i<longitud)
        {
          cadena += str.charAt(i);
          i++;
        }

        return cadena;
    }
    
    public String pruebasString7()
    {
        return "zipZap(\"zipXzap\") → \"zpXzp\"\n" +
"zipZap(\"zopzop\") → \"zpzp\"\n" +
"zipZap(\"zzzopzop\") → \"zzzpzp\"";
    }
    
    public String[][] pruebas7()
    {
        String resulados[][] = {{"zipXzap","zpXzp"},
                            {"zopzop", "zpzp"},
                            {"zzzopzop", "zzzpzp"}};
        return resulados;
    }
    
    
    public String problema8()
    {
        return "Devuelve el promedio \"centrado\" de una matriz de entradas, \nque diremos que es la media promedio de los valores, \nexcepto ignorando los valores más grandes y más pequeños de la matriz. \nSi hay varias copias del valor más pequeño, ignore solo una copia, \ny del mismo modo para el valor más grande. Use int division para producir el promedio final. \nPuede suponer que la matriz tiene una longitud de 3 o más.";
    }
    public String resultado8()
    {
        return "public int centeredAverage(int[] nums) {\n" +
"  int longitud = nums.length;\n" +
"  int suma = 0;\n" +
"  int min = 0;\n" +
"  int max = 0;\n" +
"  \n" +
"  min = max = nums[0];\n" +
"  for(int i=0;i<longitud;i++)\n" +
"  {\n" +
"    suma += nums[i];\n" +
"    \n" +
"    if(nums[i]>max)\n" +
"      max = nums[i];\n" +
"    \n" +
"    if(nums[i]<min)\n" +
"      min = nums[i];\n" +
"  }\n" +
"  \n" +
"  suma -= min;\n" +
"  suma -= max;\n" +
"  \n" +
"  return suma/(longitud-2);\n" +
"}";
    }
    public int resolver8(int[] nums)
    {
        int longitud = nums.length;
        int suma = 0;
        int min = 0;
        int max = 0;

        min = max = nums[0];
        for(int i=0;i<longitud;i++)
        {
          suma += nums[i];

          if(nums[i]>max)
            max = nums[i];

          if(nums[i]<min)
            min = nums[i];
        }

        suma -= min;
        suma -= max;

        return suma/(longitud-2);
    }
    
    public String pruebasString8()
    {
        return "centeredAverage([1, 2, 3, 4, 100]) → 3\n" +
"centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5\n" +
"centeredAverage([-10, -4, -2, -4, -2, 0]) → -3";
    }
    
    public int[][] pruebas8()
    {
        int resulados[][] = {{1, 2, 3, 4, 100,3},
                            {1, 1, 5, 5, 10, 8, 7,5},
                            {-10, -4, -2, -4, -2, 0,-3}};
        return resulados;
    }
    
    public String problema9()
    {
        return "Dada una matriz de entradas, devuelve verdadero si la matriz contiene dos 7 al lado del otro, \n" +
"o si hay dos 7 separados por un elemento, como con {7, 1, 7}.";
    }
    public String resultado9()
    {
        return "public boolean has77(int[] nums) {\n" +
"    boolean check = false;\n" +
"    int found7 = 0;\n" +
"    int cont = 0;\n" +
"    for(int i=0;i<nums.length;i++){\n" +
"        if(nums[i]==7 && found7 == 1 && cont<2){\n" +
"            found7 = 0;\n" +
"            check = true;\n" +
"        } else if (nums[i]==7){\n" +
"            found7 = 1;\n" +
"        } else if(found7 == 1){\n" +
"            cont+=1;\n" +
"        }\n" +
"        if(found7==1 && cont>1){\n" +
"            found7 = 0;\n" +
"            cont = 0;\n" +
"        }\n" +
"    }\n" +
"    return check;\n" +
"}";
    }
    public boolean resolver9(int[] nums)
    {
        boolean check = false;
        int found7 = 0;
        int cont = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==7 && found7 == 1 && cont<2){
                found7 = 0;
                check = true;
            } else if (nums[i]==7){
                found7 = 1;
            } else if(found7 == 1){
                cont+=1;
            }
            if(found7==1 && cont>1){
                found7 = 0;
                cont = 0;
            }
        }
        return check;
    }
    
    public String pruebasString9()
    {
        return "has77([1, 7, 7]) → true\n" +
"has77([1, 7, 1, 7]) → true\n" +
"has77([1, 7, 1, 1, 7]) → false";
    }
    
    public int[][] pruebas9()
    {
        int resulados[][] = {{1, 7, 7},
                            {1, 7, 1, 7},
                            {1, 7, 1, 1, 7}};
        return resulados;
    }
    
    public boolean[] prueba9Resultados()
    {
        boolean r[] = {true, true, false};
        return r;
    }
    
    public String problema10()
    {
        return "Dado un mapa de claves de alimentos y valores de cobertura, \n" +
"modifique y devuelva el mapa de la siguiente manera: \n" +
"si la clave \"helado\" está presente, establezca su valor en \"cereza\". \n" +
"En todos los casos, \n" +
"configure la clave \"pan\" para que tenga el valor \"mantequilla\".";
    }
    public String resultado10()
    {
        return "public Map<String, String> topping1(Map<String, String> map) {\n" +
"  if(map.containsKey(\"ice cream\")) {\n" +
"    map.put(\"ice cream\", \"cherry\");\n" +
"  }\n" +
"  map.put(\"bread\",\"butter\");\n" +
"  return map;\n" +
"}";
    }
    public Map<String, String> resolver10(Map<String, String> map)
    {
        if(map.containsKey("ice cream")) {
          map.put("ice cream", "cherry");
        }
        map.put("bread","butter");
        return map;
    }
    
    public String pruebasString10()
    {
        return "topping1({\"ice cream\": \"peanuts\"}) → {\"bread\": \"butter\", \"ice cream\": \"cherry\"}\n" +
"topping1({}) → {\"bread\": \"butter\"}\n" +
"topping1({\"pancake\": \"syrup\"}) → {\"bread\": \"butter\", \"pancake\": \"syrup\"}";
    }
    
    public Map<String, String>[] pruebas10()
    {
        Map<String, String> resulados[];
        
        resulados = new Map[3];
        
        resulados[0] = new HashMap<String, String>();
        resulados[0].put("ice cream", "peanuts");
        
        resulados[1] = new HashMap<String, String>();
        
        resulados[2] = new HashMap<String, String>();
        resulados[2].put("pancake", "syrup");
                
        return resulados;
    }
    
    public Map<String, String>[] prueba10Resultados()
    {
        Map<String, String> resulados[];
        
        resulados = new Map[3];
        
        resulados[0] = new HashMap<String, String>();
        resulados[0].put("bread", "butter");
        resulados[0].put( "ice cream", "cherry");
        
        resulados[1] = new HashMap<String, String>();
        resulados[1].put("bread", "butter");
        
        resulados[2] = new HashMap<String, String>();
        resulados[2].put("bread", "butter");
        resulados[2].put("pancake", "syrup");
                
        return resulados;
    }
    
    public String problema11()
    {
        return "Modifique y devuelva el mapa dado de la siguiente manera: si la clave \"a\" tiene un valor, \n" +
"configure la clave \"b\" para que tenga ese mismo valor. En todos los casos, elimine la clave \"c\", \n" +
"dejando el resto del mapa sin cambios.";
    }
    public String resultado11()
    {
        return "public Map<String, String> mapShare(Map<String, String> map) {\n" +
"  map.remove(\"c\");\n" +
"  if(map.containsKey(\"a\")) {\n" +
"    map.put(\"b\", map.get(\"a\"));\n" +
"  }\n" +
"  return map;\n" +
"}";
    }
    public Map<String, String> resolver11(Map<String, String> map)
    {
        map.remove("c");
        if(map.containsKey("a")) {
          map.put("b", map.get("a"));
        }
        return map;
      
    }
    
    public String pruebasString11()
    {
        return "mapShare({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"}) → {\"a\": \"aaa\", \"b\": \"aaa\"}\n" +
"mapShare({\"b\": \"xyz\", \"c\": \"ccc\"}) → {\"b\": \"xyz\"}\n" +
"mapShare({\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"}) → {\"a\": \"aaa\", \"b\": \"aaa\", \"d\": \"hi\"}";
    }
    
    public Map<String, String>[] pruebas11()
    {
        Map<String, String> resulados[];
        
        resulados = new Map[3];
        
        resulados[0] = new HashMap<String, String>();
        resulados[0].put("a","aaa");
        resulados[0].put("b","bbb");
        resulados[0].put("c","ccc");
        
        resulados[1] = new HashMap<String, String>();
        resulados[1].put("b","xyz");
        resulados[1].put("c","ccc");
        
        resulados[2] = new HashMap<String, String>();
        resulados[2].put("a","aaa");
        resulados[2].put("c","meh");
        resulados[2].put("d","hi");
                
        return resulados;
    }
    
    public Map<String, String>[] prueba11Resultados()
    {
        Map<String, String> resulados[];
        
        resulados = new Map[3];
        
        resulados[0] = new HashMap<String, String>();
        resulados[0].put("a","aaa");
        resulados[0].put("b","aaa");
        
        resulados[1] = new HashMap<String, String>();
        resulados[1].put("b","xyz");
        
        resulados[2] = new HashMap<String, String>();
        resulados[2].put("a","aaa");
        resulados[2].put("b","aaa");
        resulados[2].put("d","hi");
                
        return resulados;
    }
    
    
    public String problema13()
    {
        return "Dada una cadena, si uno o los dos primeros caracteres son 'x', \n" +
"devuelve la cadena sin esos caracteres 'x' y, \n" +
"de lo contrario, devuelve la cadena sin cambios. \n" +
"Esto es un poco más difícil de lo que parece.";
    }
    public String resultado13()
    {
        return "public String withoutX2(String str) {\n" +
"    if (str.isEmpty()){\n" +
"        return str;\n" +
"    }\n" +
"    if(str.equals(\"x\")){\n" +
"        return \"\";\n" +
"    }\n" +
"    if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {\n" +
"        str = str.substring(2, str.length());\n" +
"    } else {\n" +
"        if (str.charAt(0) == 'x') {\n" +
"            str = str.substring(1);\n" +
"        } else {\n" +
"            if (str.charAt(1) == 'x') {\n" +
"                String aux = str.substring(2, str.length());\n" +
"                String aux2 = str.substring(0, 1);\n" +
"                str = aux2 + aux;\n" +
"            }\n" +
"        }\n" +
"    }\n" +
"\n" +
"    return str;\n" +
"}";
    }
    public String resolver13(String str)
    {
        if (str.isEmpty()){
            return str;
        }
        if(str.equals("x")){
            return "";
        }
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            str = str.substring(2, str.length());
        } else {
            if (str.charAt(0) == 'x') {
                str = str.substring(1);
            } else {
                if (str.charAt(1) == 'x') {
                    String aux = str.substring(2, str.length());
                    String aux2 = str.substring(0, 1);
                    str = aux2 + aux;
                }
            }
        }

        return str;
    }
    
    public String pruebasString13()
    {
        return "withoutX2(\"xHi\") → \"Hi\"\n" +
"withoutX2(\"Hxi\") → \"Hi\"\n" +
"withoutX2(\"Hi\") → \"Hi\"";
    }
    
    public String[][] pruebas13()
    {
        String resulados[][] = {{"xHi","Hi"},
                            {"Hxi","Hi"},
                            {"Hi","Hi"}};
        return resulados;
    }
    
    public String problema14()
    {
        return "Dado un \"out\" string de amaño 4, como: \"<<>>\" y una palabra (nombre variable= word),\n devuelve un nuevo string en donde la palabra (word) quede en medio de out.";
    }
    public String resultado14()
    {
        return "public String makeOutWord(String out, String word) {\n" +
"  \n" +
"	String res =\"\";\n" +
"  \n" +
"	int tam = out.length();\n" +
"  \n" +
"	for(int i=0;i<tam;i++)\n" +
"       {\n" +
"		res = res +  out.charAt(i);\n" +
"		if(i==1)\n" +
"			res = res + word;\n" +
"	}\n" +
"	return res;\n" +
"}";
    }
    public String resolver14(String out, String word)
    {
	String res ="";
  
	int tam = out.length();
  
	for(int i=0;i<tam;i++)
    {
		res = res +  out.charAt(i);
		if(i==1)
			res = res + word;
	}
	return res;
    }
    
    public String pruebasString14()
    {
        return "makeOutWord(\"<<>>\", \"Yay\") ? \"<<Yay>>\"\n" +
"makeOutWord(\"<<>>\", \"WooHoo\") ? \"<<WooHoo>>\"\n" +
"makeOutWord(\"[[]]\", \"word\") ? \"[[word]]\"";
    }
    
    public String[][] pruebas14()
    {
        String resulados[][] = {{"<<>>", "Yay","<<Yay>>"},
                            {"<<>>", "WooHoo","<<WooHoo>>"},
                            {"[[]]", "word","[[word]]"}};
        return resulados;
    }
    
    public String problema15()
    {
        return "Dados 2 strings a y b, regresa un nuevo string en la forma corto+largo+corto, es decir:\n" +
"que el string más largo quede dentro de los strings cortos. \"aveMARIAave\"";
    }
    public String resultado15()
    {
        return "public String comboString(String a, String b) {\n" +
"	int tam1 = a.length();\n" +
"	int tam2 = b.length();\n" +
"  \n" +
"	String res=\"\";\n" +
"  \n" +
"	if(tam1>tam2)\n" +
"		res=b+a+b;\n" +
"	else\n" +
"		res = a+b+a;\n" +
"	return res; \n" +
"}";
    }
    public String resolver15(String a, String b)
    {
	int tam1 = a.length();
	int tam2 = b.length();
  
	String res="";
  
	if(tam1>tam2)
		res=b+a+b;
	else
		res = a+b+a;
	return res; 
    }
    
    public String pruebasString15()
    {
        return "comboString(\"Hello\", \"hi\") ? \"hiHellohi\"\n" +
"comboString(\"hi\", \"Hello\") ? \"hiHellohi\"\n" +
"comboString(\"aaa\", \"b\") ? \"baaab\"";
    }
    
    public String[][] pruebas15()
    {
        String resulados[][] = {{"Hello", "hi","hiHellohi"},
                            {"hi", "Hello","hiHellohi"},
                            {"aaa", "b","baaab"}};
        return resulados;
    }
    
    
    public String problema16()
    {
        return "Dados 2 strings a y b, regresa la cantidad de veces que se repitan substrings de 2, \n" +
"dentro de la otra. por ejemplo: \"xxcaazz\" y \"xxbaaz\" regresa 3, \n" +
"porque de la primera string, sacamos substrings \"xx\" \"xc\" \"ca\" \"aa\" \"az\" \"zz\" \n" +
"y 3 de esas substrings se encuentran dentro de string2";
    }
    public String resultado16()
    {
        return "public int stringMatch(String a, String b) {\n" +
"	int tam = Math.min(a.length(), b.length());\n" +
"	int contador = 0;  \n" +
"	String aSub,bSub;\n" +
"\n" +
"	for (int i=0; i<tam-1; i++) {\n" +
"		aSub = a.substring(i, i+2);\n" +
"		bSub = b.substring(i, i+2);\n" +
"    \n" +
"		if (aSub.equals(bSub)) \n" +
"			contador++;\n" +
"	}\n" +
"	return contador;\n" +
"}";
    }
    public int resolver16(String a, String b)
    {
	int tam = Math.min(a.length(), b.length());
	int contador = 0;  
	String aSub,bSub;

	for (int i=0; i<tam-1; i++) {
		aSub = a.substring(i, i+2);
		bSub = b.substring(i, i+2);
    
		if (aSub.equals(bSub)) 
			contador++;
	}
	return contador;
    }
    
    public String pruebasString16()
    {
        return "stringMatch(\"xxcaazz\", \"xxbaaz\") ? 3\n" +
"stringMatch(\"abc\", \"abc\") ? 2\n" +
"stringMatch(\"abc\", \"axc\") ? 0";
    }
    
    public String[][] pruebas16()
    {
        String resulados[][] = {{"xxcaazz", "xxbaaz", "3"},
                            {"abc", "abc", "2"},
                            {"abc", "axc", "0"}};
        return resulados;
    }
}
