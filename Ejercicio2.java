
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
public class Ejercicio2 {
public static void main (String [] args) {

int num1;
double suma1;
double suma2;

Scanner sc= new Scanner(System.in);

System.out.println("Introduce un numero");
num1=sc.nextInt();

if(num1<=200){
    System.out.println("No se aplica descuento, por lo que cuesta " +num1 );
}

if((num1>200)&&(num1<=1000)){
    System.out.println("Se aplica un descuento del 5%");
    suma1=num1*0.05;
    System.out.println("El precio con descuento del 5% es " +suma1 );
}

if(num1>1000){
    System.out.println("Se aplica descuento del 10%");
    suma2=num1*0.10;
    System.out.println("El precio con descuento del 10% es " +suma2 );
}

}

}
