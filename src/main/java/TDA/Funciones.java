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
}
