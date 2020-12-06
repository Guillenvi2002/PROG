import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadmin
 */
public class Ejercicio5 {
public static void main (String [] args) {

int num1;

Scanner sc= new Scanner(System.in);

System.out.println("Introduce un año");
num1=sc.nextInt();

if((num1%4==0)&&(num1%100 !=0)||(num1%400==0)){
    System.out.println("Es bisiesto");
}else{
   System.out.println("No es un año bisiesto"); 
}

}

}

