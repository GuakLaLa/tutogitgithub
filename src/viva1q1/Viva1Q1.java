/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1q1;
import java.util.Scanner;

/**
 *
 * @author Tan Zhi Wei
 */
public class Viva1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner g = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = g.nextInt();
        
//        //print triangle
//        for(int i = 1; i <= num; i++){
//            //print space
//            for(int j = 1 ; j <= num - i; j--){
//                System.out.print(" ");
//            }
//            //print descending order
//            for(int j = i; j > 1; j--){
//                System.out.printf("%3d",num);
//            }
//            //print ascending order
//            for(int j = 1; j <= num; j++){
//                System.out.printf("%3d",j);
//            }
//            System.out.println(" ");
//        }
        
        //print triangle align left
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
            System.out.printf("%3d",j);
            }
            System.out.println("");
        }
    
    
    
    }
    
    
    //this is for testing
    //testingagain
}
