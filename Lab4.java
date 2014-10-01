/*
 * dobbelsteen gooien  
 */

package lab.pkg4;

import java.util.Scanner;

/**
 *
 * @author Lorenzo rozenblad
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Invoer gebruiker
        System.out.print("Welk karakter moet ik gebruiken voor het oog? ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
    
    // Random nummers tot en met 6 genereren
       int worpen = 0;
           
    
    // blijven afdrukken tot random getal 6 is.
        while (worpen != 6){
    	worpen =(int)(Math.random() * 6)+1;
    
    // Printen van dobbelsteen
      //1
      if (worpen == 1){
        System.out.print(("\n\n\n")+("  ")+("  ")+("\n")+("  "+ch)+("  ")+("\n")+("  ")+("  "));
        System.out.println("\n\n-------");
        }
        
      //2
      else if (worpen == 2 ){
        System.out.println(("\n"+ch)+("  ")+("  ")+("\n")+("  ")+("  ")+("\n")+("  ")+("  "+ch));
        System.out.println("\n-------");   
        }
        
        //3
      else if (worpen == 3){
        System.out.println(("\n"+ch)+("  ")+("  ")+("\n")+("  "+ch)+("  ")+("\n")+("  ")+("  "+ch));
        System.out.println("\n-------");
      }
        //4
      else if (worpen == 4){
        System.out.println(("\n"+ch)+("  ")+("  "+ch)+("\n")+("  ")+("  ")+("\n"+ch)+("  ")+("  "+ch));
        System.out.println("\n-------");
      }
        //5
      else if(worpen == 5){
        System.out.println(("\n"+ch)+("  ")+("  "+ch)+("\n")+("  "+ch)+("  ")+("\n"+ch)+("  ")+("  "+ch));
        System.out.println("\n-------");
      }
        //6
      else if (worpen == 6){
        System.out.println(("\n"+ch)+("  ")+("  "+ch)+("\n"+ch)+("  ")+("  "+ch)+("\n"+ch)+("  ")+("  "+ch));
        System.out.println("\n-------");
      }
      }
    }
}

