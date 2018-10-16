package cuboobjetos;

import java.util.Scanner;

public class Main {


    static Cubo cubo;
    static double str;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        pedir ();
        imprimir ();
        scanner.nextLine();
    }
    private static void imprimir(){

        int  opt =get_menu();

        while(opt != 5){
            str = calculate(opt ,cubo);
            System.out.println("El valor es " +str+ "\n");
            opt = get_menu ();
        }
        pedir ();
        imprimir ();
    }

    private static void pedir(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es el valor del lado? ");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("El valor debe de ser un entero");
            pedir ();
        }



    }


    public static double calculate( int opciones, Cubo cubo){

        double resultado = 0;
        switch (opciones){
            case 1: resultado =cubo.calcularPerimetro(true); break;
            case 2: resultado = cubo.calcularArea (); break;
            case 3: resultado = cubo.calcularVolumen(); break;
            case 4: resultado = cubo.calcularPerimetro(false); break;
            case 5: pedir();break;
            case 6: System.exit (0);break;

        }
        return resultado;
    }

    public static int get_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("¿Qué quiere calcular? ");
        System.out.print ("1: Perímetro del cuadrado \n");
        System.out.print ("2: Calcular el área\n");
        System.out.print ("3: Calcular el volúmen\n");
        System.out.print ("4: Calcular el perímetro del cubo\n");
        System.out.print ("5: Reiniciar \n");
        System.out.print ("6: Salir del programa \n");

        int opt  = Integer.parseInt( scanner.nextLine());
        return opt;
    }


}