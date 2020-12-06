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
public class Ejercicio3 {
public static void main (String [] args) {

int num1;
int letra;

Scanner sc= new Scanner(System.in);

System.out.println("Introduce su DNI");
num1=sc.nextInt();

letra=num1%23;

switch(letra){
    case(0):
    System.out.println("Su letra es una T");
    break;
    case(1):
    System.out.println("Su letra es una R");
    break;
    case(2):
    System.out.println("Su letra es una W");
    break;
    case(3):
    System.out.println("Su letra es una A");
    break;
    case(4):
    System.out.println("Su letra es una G");
    break;
    case(5):
    System.out.println("Su letra es una M");
    break;
    case(6):
    System.out.println("Su letra es una Y");
    break;
    case(7):
    System.out.println("Su letra es una F");
    break;
    case(8):
    System.out.println("Su letra es una P");
    break;
    case(9):
    System.out.println("Su letra es una D");
    break;
    case(10):
    System.out.println("Su letra es una X");
    break;
    case(11):
    System.out.println("Su letra es una B");
    break;
    case(12):
    System.out.println("Su letra es una N");
    break;
    case(13):
    System.out.println("Su letra es una J");
    break;
    case(14):
    System.out.println("Su letra es una Z");
    break;
    case(15):
    System.out.println("Su letra es una S");
    break;
    case(16):
    System.out.println("Su letra es una Q");
    break;
    case(17):
    System.out.println("Su letra es una V");
    break;
    case(18):
    System.out.println("Su letra es una H");
    break;
    case(19):
    System.out.println("Su letra es una L");
    break;
    case(20):
    System.out.println("Su letra es una C");
    break;
    case(21):
    System.out.println("Su letra es una K");
    break;
    case(22):
    System.out.println("Su letra es una E");
    break;
}

}

}

