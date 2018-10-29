/*Author: Hussein Sahib
Date: 4/12/2017
description: This program take a number as an input then prints a shape.*/
import java.util.Scanner;
public class Assignment1a
{ 
     public static void main(String[] args)//main function
     {
         int num = number();  //take input
         printHeader(num);//prints the top line of the box
         printTop(num);//prints the top half of the box
         printBot( num); //prints the bottom half of the box
         printHeader(num);//prints the last line of the box
       
      }
      public static void printHeader(int num){//prints the header of the box
         System.out.print("#");
         for(int cnt = 0; cnt < (num *4)+4;cnt++){//for loop that prints the corret number of "=" according to the input
             System.out.print("=");
          }
         System.out.println("#");
      }
      public static void printTop(int num){//prints the top half of the for loop
         for (int i = 0; i < num;i++){//main for loop
            int curr = (num*2)-((4*(i))/2) ;
            System.out.print("|"); 
            for(int j = 0; j<curr;j++){//for loop for spaces
         	   System.out.print(" ");
            }
            System.out.print("<>");
            for(int k = 0; k< 4*i; k++){//for loops for "."
         	   System.out.print(".");
            }
            System.out.print("<>");
            for(int r = 0; r<curr ;r++){//for loop for spaces
         	   System.out.print(" ");
            }
            System.out.println("|"); 
         }
      }
      public static void printBot(int num){//prints the lower half of the box
         for (int i = num-1; i >= 0;i--){
            int curr = (num*2)-((4*i)/2) ;
            System.out.print("|"); 
            for(int j = 0; j<curr;j++){//for loop for spaces
         	   System.out.print(" ");
            }
            System.out.print("<>");
            for(int k = 0; k< 4*(i); k++){//for loops for "."
         	   System.out.print(".");
            }
             System.out.print("<>");
             for(int r = 0; r<curr ;r++){//for loop for spaces
         	   System.out.print(" ");
             }
             System.out.println("|");
         }
      }
       public static int number(){//takes the input
         Scanner ip = new Scanner(System.in);//intializing ip
         System.out.print("Enter a number: ");
         int input = ip.nextInt();//taking input
         return input;
       }  
 }
 //End of program