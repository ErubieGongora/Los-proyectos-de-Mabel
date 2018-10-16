
package javaapplication7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
       
        int numeros;
        String resultado ="";
        
            System.out.print("¿Cuál es el número? ");
            numeros=entrada.nextInt();
        
            resultado = resultado  + Romanos(numeros)+"\n";
        
        System.out.print("El número es: "+resultado);  
    } 
    //Método
    
    public static String Romanos(int numero){
        
         int i;
         int milesima,centecima,decima,unidad;
         String letra="";
         
        milesima=(numero/1000);
        i=numero%1000;
        centecima=i/100;
        i=numero%100;
        decima=i/10;
        unidad=numero%10;
        
        
        switch(milesima){
            case 1:
                letra = letra +"M";
                break;
                 }
        switch(centecima){
            case 1:
                letra = letra +"C";
                break;
            case 2:
                letra = letra +"CC";
                break;
            case 3:
                letra = letra +"CCC";
                break;
            case 4:
                letra = letra +"CD";
                break;
            case 5:
                letra = letra +"D";
                break;
            case 6:
                letra = letra +"DC";
                break;
            case 7:
                letra = letra +"DCC";
                break;
            case 8:
                letra = letra +"DCCC";
                break;
            case 9:
                letra = letra+"CM";
                break;
        }
        switch(decima){
            case 1:
                letra = letra +"X";
                break;
            case 2:
                letra = letra +"XX";
                break;
            case 3:
                letra = letra +"XXX";
                break;
            case 4:
                letra = letra +"XL";
                break;
            case 5:
                letra = letra +"L";
                break;
            case 6:
                letra = letra +"LX";
                break;
            case 7:
                letra = letra+"LXX";
                break;
            case 8:
                letra = letra +"LXXX";
            case 9:
                letra = letra +"XC";
                break;
                }
        switch(unidad){
            case 1:
                letra= letra +"I";
                break;
            case 2:
                letra = letra +"II";
                break;
            case 3:
                letra = letra +"III";
                break;
            case 4:
                letra = letra +"IV";
                break;
            case 5:
                letra = letra +"V";
                break;
            case 6:
                letra = letra +"VI";
                break;
            case 7:
                letra = letra +"VII";
                break;
            case 8:
                letra = letra +"VIII";
                break;
            case 9:
                letra = letra +"IX";
                break;

        }
        return letra;
    }
    }
    

