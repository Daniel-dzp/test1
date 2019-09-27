/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

/**
 *
 * @author dzp
 */
public class Funciones{
    
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
