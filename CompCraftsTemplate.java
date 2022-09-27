/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compcraftstemplate;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CompCraftsTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String repeat = "y";
        
        while(repeat.equalsIgnoreCase("y")){
        System.out.println("What do you want to display? ");
        System.out.println("A. Right Triangle");
        System.out.println("B. Inverted Right Triangle");
        System.out.println("C. Rectangle with alternating rows");
        System.out.println("D. Rectangle with borders");
        System.out.println("E. Rectangle with alternating rows and columns");
        System.out.println("Enter the letter of your choice: ");
        
        String choice = sc.nextLine();
        
        //Right triangle 
        if(choice.equalsIgnoreCase("a")){
            System.out.println("Enter number of rows: ");
             int rows = sc.nextInt();
             
             for(int i=0;i<=rows;i++){
                 for(int j=0; j<i; j++){
                    System.out.print("*");
                 }
                 System.out.print("\n");
             }
            //put answer here
        }
        
        //inverted right triangle
        else if(choice.equalsIgnoreCase("b")){
            
             System.out.println("Enter number of rows: ");
             int rows = sc.nextInt();
            for(int i=rows;i>0;i--){
                 for(int j=i; j>0; j--){
                    System.out.print("*");
                 }
                 System.out.print("\n");
             }
            //put answer here
        
        }
        
        
        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("c")){
         System.out.println("Enter number of rows: ");
             int rows = sc.nextInt();
             System.out.println("Enter number of c: ");
             int columns = sc.nextInt();
            //put answer here
            
            for(int i=0;i<=rows;i++){
                 for(int j=0; j<columns; j++){
                     //if row ia odd
                    System.out.print("*");
                    //if row is even
                   System.out.print("-");
                 }
                 System.out.print("\n");
             }
            
        }
        
        
        //rectangle with border
        else if(choice.equalsIgnoreCase("d")){
        
            //put answer here
            
        }
        
        
        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("e")){ 
        
            //put answer here
            
        }
        
        else{
            System.out.println("Choose a letter from A-E");
        }
        
        System.out.println("Again? [Y/N]: ");
        repeat = sc.nextLine();
    }
        
        
        
        
        
        
    }
    
}
