
package morsetexto;

import java.util.Scanner;


public class MorseTexto {

    public static void main(String[] args) {
        
        String respuesta;
          do{
        Scanner entrada= new Scanner(System.in);
        
          //Letras en clave morse
        String espacio=" ",cA=".-",cB="-...",cC="-.-.",cD="-..",cE=".",cF="..-.",cG="--.",cH="....", cI="..", cJ=".---",cK="-.-",
        cL=".-..",cM="--",cN="-.",cO="---",cP=".--.",cQ="--.-", cR=".-.", cS="...",cT="-",cU="..-",cV="...-",cW=".--",cX="-..-",
        cY="-.--",cZ="--..",c1=".----",c2="..---",c3="...--",c4="....-",c5=".....",c6="-....",c7="--...",c8="---..",c9="----.",c0="-----";
        
        String mensaje, morse, resultadoMorse="";//
        int longitud;
             
        //Lectura de datos
        
        System.out.println("¿Qué desea convertir? (morse/texto): ");
        mensaje=entrada.nextLine();
        
        
        //Texto a morse
        
        if (mensaje.equalsIgnoreCase("texto")){
            System.out.println("¿Cuál es el texto? ");
            mensaje=entrada.nextLine();
            
            //Calcular el tamaño de una cadena

            longitud=mensaje.length();
            
            //Se lee caracter por caracter
           for (int i=0; i<longitud; i++){
               String caracter="";
               caracter=mensaje.charAt(i)+"";
               
            if(caracter.equalsIgnoreCase(espacio)){
                    resultadoMorse=resultadoMorse.concat("  "); 
               } 
            if(caracter.equalsIgnoreCase("a")){
                 resultadoMorse=resultadoMorse.concat(cA+" ");   
               } 
            if(caracter.equalsIgnoreCase("b")){
                 resultadoMorse=resultadoMorse.concat(cB+" ");   
               }
            if(caracter.equalsIgnoreCase("c")){
                 resultadoMorse=resultadoMorse.concat(cC+" ");   
               }
            if(caracter.equalsIgnoreCase("d")){
                 resultadoMorse=resultadoMorse.concat(cD+" ");   
               }
            if(caracter.equalsIgnoreCase("e")){
                 resultadoMorse=resultadoMorse.concat(cE+" ");   
               }
            if(caracter.equalsIgnoreCase("f")){
                 resultadoMorse=resultadoMorse.concat(cF+" ");   
               }
            if(caracter.equalsIgnoreCase("g")){
                 resultadoMorse=resultadoMorse.concat(cG+" ");   
               }
            if(caracter.equalsIgnoreCase("h")){
                 resultadoMorse=resultadoMorse.concat(cH+" ");   
               }
            if(caracter.equalsIgnoreCase("i")){
                 resultadoMorse=resultadoMorse.concat(cI+" ");   
               }
            if(caracter.equalsIgnoreCase("j")){
                 resultadoMorse=resultadoMorse.concat(cJ+" ");   
               }
            if(caracter.equalsIgnoreCase("k")){
                 resultadoMorse=resultadoMorse.concat(cK+" ");   
               }
            if(caracter.equalsIgnoreCase("l")){
                 resultadoMorse=resultadoMorse.concat(cL+" ");   
               }
            if(caracter.equalsIgnoreCase("m")){
                 resultadoMorse=resultadoMorse.concat(cM+" ");   
               }
            if(caracter.equalsIgnoreCase("n")){
                 resultadoMorse=resultadoMorse.concat(cN+" ");   
               }
            if(caracter.equalsIgnoreCase("o")){
                 resultadoMorse=resultadoMorse.concat(cO+" ");   
               }
            if(caracter.equalsIgnoreCase("p")){
                 resultadoMorse=resultadoMorse.concat(cP+" ");   
               }
            if(caracter.equalsIgnoreCase("q")){
                 resultadoMorse=resultadoMorse.concat(cQ+" ");   
               }
            if(caracter.equalsIgnoreCase("r")){
                 resultadoMorse=resultadoMorse.concat(cR+" ");   
               }
            if(caracter.equalsIgnoreCase("s")){
                 resultadoMorse=resultadoMorse.concat(cS+" ");   
               }
            if(caracter.equalsIgnoreCase("t")){
                 resultadoMorse=resultadoMorse.concat(cT+" ");   
               }
            if(caracter.equalsIgnoreCase("u")){
                 resultadoMorse=resultadoMorse.concat(cU+" ");   
               }
            if(caracter.equalsIgnoreCase("v")){
                 resultadoMorse=resultadoMorse.concat(cV+" ");   
               }
            if(caracter.equalsIgnoreCase("w")){
                 resultadoMorse=resultadoMorse.concat(cW+" ");   
               }
            if(caracter.equalsIgnoreCase("x")){
                 resultadoMorse=resultadoMorse.concat(cX+" ");   
               }
            if(caracter.equalsIgnoreCase("y")){
                 resultadoMorse=resultadoMorse.concat(cY+" ");   
               }
            if(caracter.equalsIgnoreCase("z")){
                 resultadoMorse=resultadoMorse.concat(cZ+" ");   
               }
            if(caracter.equalsIgnoreCase("1")){
                 resultadoMorse=resultadoMorse.concat(c1+" ");   
               }
            if(caracter.equalsIgnoreCase("2")){
                 resultadoMorse=resultadoMorse.concat(c2+" ");   
               }
            if(caracter.equalsIgnoreCase("3")){
                 resultadoMorse=resultadoMorse.concat(c3+" ");   
               }
            if(caracter.equalsIgnoreCase("4")){
                 resultadoMorse=resultadoMorse.concat(c4+" ");   
               }
            if(caracter.equalsIgnoreCase("5")){
                 resultadoMorse=resultadoMorse.concat(c5+" ");   
               }
            if(caracter.equalsIgnoreCase("6")){
                 resultadoMorse=resultadoMorse.concat(c6+" ");   
               }
            if(caracter.equalsIgnoreCase("7")){
                 resultadoMorse=resultadoMorse.concat(c7+" ");   
               }
            if(caracter.equalsIgnoreCase("8")){
                 resultadoMorse=resultadoMorse.concat(c8+" ");   
               }
            if(caracter.equalsIgnoreCase("9")){
                 resultadoMorse=resultadoMorse.concat(c9+" ");   
               }
            if(caracter.equalsIgnoreCase("0")){
                 resultadoMorse=resultadoMorse.concat(c0+" ");   
               }
           }
           System.out.println("El texto convertido a morse es: ");
           System.out.println(resultadoMorse);
        }
         //Morse-texto
        
        else{
        int longitudMorse, i=0;
        
        System.out.println("¿Cuál es tu oración en morse? ");
        morse=entrada.nextLine();
      
        //Divide por un espacio
        String [ ] letra = morse.split("\\ ");
        while(i < letra.length){
            if(letra[i].equals(cA)){
                 resultadoMorse=resultadoMorse.concat("A");   
               }
            if(letra[i].equals(cB)){
                 resultadoMorse=resultadoMorse.concat("B");   
               }
            if(letra[i].equals(cC)){
                 resultadoMorse=resultadoMorse.concat("C");   
               }
            if(letra[i].equals(cD)){
                 resultadoMorse=resultadoMorse.concat("D");   
               }
            if(letra[i].equals(cE)){
                 resultadoMorse=resultadoMorse.concat("E");   
               }
            if(letra[i].equals(cF)){
                 resultadoMorse=resultadoMorse.concat("F");   
               }
            if(letra[i].equals(cG)){
                 resultadoMorse=resultadoMorse.concat("G");   
               }
            if(letra[i].equals(cH)){
                 resultadoMorse=resultadoMorse.concat("H");   
               }
            if(letra[i].equals(cI)){
                 resultadoMorse=resultadoMorse.concat("I");   
               }
            if(letra[i].equals(cJ)){
                 resultadoMorse=resultadoMorse.concat("J");   
               }
            if(letra[i].equals(cK)){
                 resultadoMorse=resultadoMorse.concat("K");   
               }
            if(letra[i].equals(cL)){
                 resultadoMorse=resultadoMorse.concat("L");   
               }
            if(letra[i].equals(cM)){
                 resultadoMorse=resultadoMorse.concat("M");   
               }
            if(letra[i].equals(cN)){
                 resultadoMorse=resultadoMorse.concat("N");   
               }
            if(letra[i].equals(cO)){
                 resultadoMorse=resultadoMorse.concat("O");   
               }
            if(letra[i].equals(cP)){
                 resultadoMorse=resultadoMorse.concat("P");   
               }
            if(letra[i].equals(cQ)){
                 resultadoMorse=resultadoMorse.concat("Q");   
               }
            if(letra[i].equals(cR)){
                 resultadoMorse=resultadoMorse.concat("R");   
               }
            if(letra[i].equals(cS)){
                 resultadoMorse=resultadoMorse.concat("S");   
               }
            if(letra[i].equals(cT)){
                 resultadoMorse=resultadoMorse.concat("T");   
               }
            if(letra[i].equals(cU)){
                 resultadoMorse=resultadoMorse.concat("U");   
               }
            if(letra[i].equals(cV)){
                 resultadoMorse=resultadoMorse.concat("V");   
               }
            if(letra[i].equals(cW)){
                 resultadoMorse=resultadoMorse.concat("W");   
               }
            if(letra[i].equals(cX)){
                 resultadoMorse=resultadoMorse.concat("X");   
               }
            if(letra[i].equals(cY)){
                 resultadoMorse=resultadoMorse.concat("Y");   
               }
            if(letra[i].equals(cZ)){
                 resultadoMorse=resultadoMorse.concat("Z");   
               }
            if(letra[i].equals(c1)){
                 resultadoMorse=resultadoMorse.concat("1");   
               }
            if(letra[i].equals(c2)){
                 resultadoMorse=resultadoMorse.concat("2");   
               }
            if(letra[i].equals(c3)){
                 resultadoMorse=resultadoMorse.concat("3");   
               }
            if(letra[i].equals(c4)){
                 resultadoMorse=resultadoMorse.concat("4");   
               }
            if(letra[i].equals(c5)){
                 resultadoMorse=resultadoMorse.concat("5");   
               }
            if(letra[i].equals(c6)){
                 resultadoMorse=resultadoMorse.concat("6");   
               }
            if(letra[i].equals(c7)){
                 resultadoMorse=resultadoMorse.concat("7");   
               }
            if(letra[i].equals(c8)){
                 resultadoMorse=resultadoMorse.concat("8");   
               }
            if(letra[i].equals(c9)){
                 resultadoMorse=resultadoMorse.concat("9");   
               }
            if(letra[i].equals(c0)){
                 resultadoMorse=resultadoMorse.concat("0");   
               }
              i++;
             resultadoMorse=resultadoMorse.concat(" ");
        }
        longitudMorse=resultadoMorse.length();
        String cadena, cadena2="";
        
        int b=0;
        
        for(int j=0; j<longitudMorse; j++){
            cadena=resultadoMorse.charAt(j)+"";
            
            if (resultadoMorse.charAt(j)!=' '){//Si el caracter es distinto a un espacio
                cadena2=cadena2+resultadoMorse.charAt(j);//cadena nueva
                b=0;
            }
            else   {
                b=b+1;
                if (b==3)//Si los espacios en blanco es igual a tres
                {
                    cadena2=cadena2+" ";//Agrega un espacio en blanco para separar las palabras      
                }
            }     
        }
        System.out.println("De morse a texto es :");
        System.out.println(cadena2);      
        }
        
        System.out.print("¿Te gustaria volver a traducir? (S/N)");
        respuesta=entrada.next();
        
    }while("S".equals(respuesta));
        
    
    }
        
           
        
    
    }
        
                
    
    
  