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
public class Ejercicio4 {
public static void main (String [] args) {

int num1;

Scanner sc= new Scanner(System.in);

System.out.println("Introduce un numero");
num1=sc.nextInt();

if((num1>1)&&(num1<7)){
switch(num1){
    case(1):
    System.out.println("LUNES");
    break;
    case(2):
    System.out.println("MARTES");
    break;
    case(3):
    System.out.println("MIERCOLES");
    break;
    case(4):
    System.out.println("JUEVES");
    break;
    case(5):
    System.out.println("VIERNRES");
    break;
    case(6):
    System.out.println("SABADO");
    break;
    case(7):
    System.out.println("DOMINGO");
    break;
}

}else{
   System.out.println("Error, introduzca otro numero"); 
}

}

}

