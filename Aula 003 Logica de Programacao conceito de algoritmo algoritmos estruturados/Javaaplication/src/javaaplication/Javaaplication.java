package javaaplication;
/* fggfy
/* ftyuyterer
/** kyhgdff
 * rtgyj
 * @author ana.souza26
 * asdfggh
*/
public class Javaaplication {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)  {
      System.out.println("Hello Word"); // imprimir frase - hello world
    
    String str1 = "Ola mundo" ;
    String str2 = "Ola mundo \n";
    int a = 6; 
    int b = 7;
    int[] ListNum = {1, 2, 3, 4, 6, 8, 10};
    int resp = 11;
  
    System.out.print(str1);
    System.out.println(str2);
    System.out.print(str2 + str1);
    System.out.printf("Soma de variaveis a e b = %d \n", (a +b));
    if(ListNum[0] + ListNum[6] == resp) {
        System.out.printf ("primeiro numero eh %d " , ListNum[6]);
        System.out.printf("segundo numero eh %d ",ListNum[0]);
        System.out.printf("A resposta eh %d ",resp);
    }
    else {
        System.out.print("resposta incorreta");
    }
    }
    
    
      
    
}
