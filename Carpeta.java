/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerojava;

import java.util.Scanner;
/**
 *
 * @author nicoalfaro__
 */
public class PrimeroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*  C A R P E T A
        
        <<< V A R I A B L E S >>>
        
        < Type > < Nombre_Variable >
        
        --> < Type >
        
        -> byte (-128 a 127)
        
        -> short (-32768 a 32767)
        
        -> int (-214748648 a 2147483640)(32bits)
        
        -> long (-9223372036854775808 a 9223372036854775807)(64bits)
        
        -> float (32bits, con decimales)
        
        -> double(64bits, con decimales)
        
        -> boolean (verdadero o falso)
        
        -> char ('\u0000' a '\uffff')(16bits) (un caracter entre comillas simples)
        
        -> String (cadena de caracteres entre comillas dobles)
        
        --> .equals(<comparar>) permite comparar una cadena con <comparar>
        --> .length (Da la cantidad de elementos del string o arreglo o matris en det fila)
        
        <<< I N P U T   A N D   O U T P U T >>>
        
        System.out.println("< mensaje >")   (Hace salto de linea)
        System.out.print("< mensaje >")     (No hace salto de linea)
        
        Scanner readln = new Scanner(System.in);    (Lee elementos en una variable mediante el "readln")
        ej. nombre = readln.next() --> almacena lo ingresado en string
        -> Para entero seria
            numero = readln.nextInt()
            char letra = leer.next().charAt(0);  --> Leer un caracter
        
        <<< C O N D I C I O N A L E S >>>
        
        if(<condicion>){
        //Instrucciones
        }
        else if(<condicion>){
        //Instrucciones
        }
        else{
        //Instrucciones
        }
        
        switch(<variable>){
        
            case 1:
                //Instrucciones
                break;
            case 2:
                //Instrucciones
                break;        
            ...
        
            case N:
                //Instrucciones
                break;
            default:
                //Instrucciones
                break;
        }
        
        -> <CONECTORES>
        - &&(and)
        - ||(or)
        
        <<< E S T R U C T U R A S   D E   R E P E T I C I O N >>>
        
        do{
            //Instrucciones
        }while(<condicion>);
        
        -> Evalua la condicion al final
        
        while(<condicion>){
            //Instrucciones
        }
        
        -> Evalua la condicion al principio
        
        for(<type> <indice> = valor_inicial; <indice> + <condicion>; (<indice> ++ o <indice> --){
            //Instrucciones
        }
        
        -> ++ incrementa
        -> -- decrementa
        
        --> En las estucturas de repeticion se puede usar el comando "break;" para que finalicen
        
        <<< A R R A Y   Y   M A T R I C E S >>>
        
        < A R R A Y >
        
        <type>[] <Nomber_Array>;        --> crear la variable de tipo array
        <Nombre_Array> = new <type>[];  --> Delimitar el tamaño del array
        
        < M A T R I S >
        <type>[][] <Nomber_Array>;        --> crear la variable de la matris
        <Nombre_Array> = new <type>[][];  --> Delimitar el tamaño de la matris
        
        < R E C O R R E R   A R R A Y >
        
        for(<type> <elemento> : <Nombre_Array>){
        }
        -> <elemento> es la variable contenedora de una de las posiciones del array
        
        <<< F U N C I O N E S >>>
        
        <public> <static> <type> <Nombre_Funcion>(<tipo><Nombre_Parametro>){
            // Declaracion de Variables
            // Instrucciones
            return <variable>;
        } 
        
        type incluye void que no retorna valor
        
        <<< C L A S E S >>>
        
        -> java.util clase mas utilizada
        
        */   
        Scanner readln = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = readln.nextLine();
        System.out.println("Bienvenido " + nombre); 
        System.out.println("y...");
        System.out.println("Se termino...");
    }
    
}
