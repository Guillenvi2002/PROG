
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
public class Ejercicio1 {
public static void main (String [] args) {

int num1;
int num2;
int suma;

Scanner sc= new Scanner(System.in);

System.out.println("Introduce un numero");
num1=sc.nextInt();

System.out.println("Introduce otro numero");
num2=sc.nextInt();

if((num1%2==0) && (num2%2==0)){
    if(num1<=50){
        if((num2>=100)&& (num2<=500)){
          suma=num1+num2;
          System.out.println("El resultado es " +suma );
        }else{
           System.out.println("Error"); 
        }
    }else{
     System.out.println("Error");   
    }
}else{
    System.out.println("Error");
}



}

}
