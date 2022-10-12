/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mastermind;
import java.util.*;

class pickRand {
     public static String get (String[] array) {
         Random generator = new Random();
        int intRandomNum = generator.nextInt(array.length); 
        return array[intRandomNum];
     }    
}

public class MasterMind {
    @SuppressWarnings("unchecked")
	public static void main (String[] args)
	{
        Object strColor1, strColor2, strColor3, strColor4, strColor5, strColor6; 
        String strUserColor1, strUserColor2, strUserColor3, strUserColor4, strUserColor5, strUserColor6; 
        int intTurns = 15; //max number of turns
        String[] colors = {"rojo", "blanco", "negro", "azul", "amarillo", "verde", "naranja", "morado", "rosa", "cafe"}; 
        
		strColor1 = pickRand.get(colors); 
        strColor2 = pickRand.get(colors);
        strColor3 = pickRand.get(colors); 
        strColor4 = pickRand.get(colors); 
        strColor5 = pickRand.get(colors);
        strColor6 = pickRand.get(colors);
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("Practica 6 POO");
        System.out.println ("\tJava MasterMind\n");
        System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
		System.out.println ("\nElige 6 colores (Formato: Color Color Color Color Color Color)");
        strUserColor1 = scan.next();
        strUserColor2 = scan.next();
        strUserColor3 = scan.next();
        strUserColor4 = scan.next();
        strUserColor5 = scan.next();
        strUserColor6 = scan.next();
        System.out.println ("User Choices:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);

        do
        {
            
            if (strUserColor1.equalsIgnoreCase((String)strColor1) && strUserColor2.equalsIgnoreCase((String)strColor2) && strUserColor3.equalsIgnoreCase((String)strColor3) && strUserColor4.equalsIgnoreCase((String)strColor4) && strUserColor5.equalsIgnoreCase((String)strColor5) && strUserColor6.equalsIgnoreCase((String)strColor6))
            {
                    System.out.println ("\n¡Felicidades! ¡Adivinaste todos los colores! :)");
                    intTurns = 12;
            }            
            
            else if (strUserColor1.equalsIgnoreCase((String)strColor1) || strUserColor2.equalsIgnoreCase((String)strColor2) || strUserColor3.equalsIgnoreCase((String)strColor3) || strUserColor4.equalsIgnoreCase((String)strColor4) || strUserColor5.equalsIgnoreCase((String)strColor5) || strUserColor6.equalsIgnoreCase((String)strColor6))
            {
                if (strUserColor1.equalsIgnoreCase((String)strColor1))
                {                    
                } else {
                    System.out.println ("Has seleccionado:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
                    System.out.println("El espacio 1 es erroneo. Vuelve a intentarlo.");
                    System.out.println("\tTurnos restantes: " +intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    strUserColor1 = scan.next();
                    intTurns--;
                }
                if (strUserColor2.equalsIgnoreCase((String)strColor2))
                {
                } else { 
                    System.out.println ("Has seleccionado:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
                    System.out.println("El espacio 2 es erroneo. Vuelve a intentarlo.");
                    System.out.println("\tTurnos restantes: " +intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    strUserColor2 = scan.next();

                    intTurns--;
                }
                if (strUserColor3.equalsIgnoreCase((String)strColor3))
                {
                } else {
                    System.out.println ("Has seleccionado:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
                    System.out.println("El espacio 3 es erroneo. Vuelve a intentarlo.");
                    System.out.println("\tTurnos restantes: " +intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    strUserColor3 = scan.next();

                    intTurns--;
                }
                if (strUserColor4.equalsIgnoreCase((String)strColor4))
                {
                } else {
                    System.out.println ("Has seleccionado:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
                    System.out.println("El espacio 4 es erroneo. Vuelve a intentarlo.");
                    System.out.println("\tTurnos restantes: " +intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    strUserColor4 = scan.next();

                    intTurns--;
                }
                if (strUserColor5.equalsIgnoreCase((String)strColor5))
                {
                } else {
                    System.out.println ("Has seleccionado:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
                    System.out.println("El espacio 5 es erroneo. Vuelve a intentarlo.");
                    System.out.println("\tTurnos restantes: " +intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    strUserColor5 = scan.next();

                    intTurns--;
                }
                if (strUserColor6.equalsIgnoreCase((String)strColor6))
                {
                } else {
                    System.out.println ("Has seleccionado:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
                    System.out.println("El espacio 6 es erroneo. Vuelve a intentarlo.");
                    System.out.println("\tTurnos restantes: " +intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    strUserColor6 = scan.next();

                    intTurns--;
                }
            }
            
            else
            {
                   
                    System.out.println ("Lamentablemente, no acertaste ningun color.");
                    System.out.println ("\tTurnos restantes: "+intTurns);
                    System.out.println ("Colores disponibles: Rojo, Blanco, Negro, Azul, Amarillo, Verde, Naranja, Morado, Rosa, Cafe");
                    System.out.println ("\nElige 6 colores (Formato: Color Color Color Color Color Color)");
                    strUserColor1 = scan.next();
                    strUserColor2 = scan.next();
                    strUserColor3 = scan.next();
                    strUserColor4 = scan.next();
                    strUserColor5 = scan.next();
                    strUserColor6 = scan.next();
                    intTurns--;
             }
        }        
        while (intTurns > 0); 
        if (intTurns == 0) 
        {
            System.out.println("\tLo siento. Has fallado. :(");
        }
        System.out.println ("Tus selecciones finales:" + strUserColor1 + " " + strUserColor2 + " " + strUserColor3 + " " + strUserColor4 + " " + strUserColor5 + " " + strUserColor6);
        System.out.println ("Respuesta correcta: " + strColor1 + " " + strColor2 + " " + strColor3 + " " + strColor4 + " " + strColor5 + " " + strColor6); 
    }
}
