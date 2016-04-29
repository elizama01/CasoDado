/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casojuegodado;

import java.util.Scanner;

/**
 *el juego consiste en lanzar 2 
 * dados y calcular la suma de ambos, si el resultado 
 * es 7 ganaste!!! sino has perdido!!!...

- implemente una lcase que 
* permita probar su juego de dados 
* y le permita jugar al usuario las veces que desee.
 * @author pcccasd
 */
public class Juego {
int ganador;
int terminar ;
Dado n1=new Dado();
Dado n2=new Dado();
int player1=1; 
int player2=2; 
int opc;
int opc1;
int turno;
int numjuego;
Persona p1= new Persona();
Persona p2= new Persona();
    public Juego() {
   terminar=0;
    ganador=7;
   numjuego=1;
    }

    public boolean lanzarDado(Dado n1,Dado n2){
      
        if (n1.getLado()+n2.getLado()==ganador) {
              
            return true ; 
           
        } 
    return false;
    }
    public void jugar(){ Scanner entrada=new Scanner(System.in);
        try {
            
            do {                
                
            
        System.out.println("Ingrese nombre del player 1 ");
        String  nombre=entrada.next();
        p1.setNombre(nombre);
        p1.setPlayer(player1);
        System.out.println("Ingrese nombre del player 2 ");
        String nombre2=entrada.next();
          p2.setNombre(nombre2);
        p2.setPlayer(player2);
         
        if (p1.getNombre().equalsIgnoreCase(p2.getNombre())) {
                System.out.println("Se ingresaron nombres iguales");
             }
            } while (p1.getNombre().equalsIgnoreCase(p2.getNombre()));
            do {                
                
            
            System.out.println("Ingrese la cantidad de turno para el juego max 20");
      
         turno=entrada.nextInt();
      
            } while (turno<1||turno>20);
        
        
       
        do {
             do {
                 System.out.println("Juego"+ numjuego );
                 System.out.println("elija 1 para Lanzar dados de "+p1.getNombre());
               opc= entrada.nextInt();
                  if (opc==1){
                  if (lanzarDado(n1, n2)==true){
                      System.out.println("Usted a ganado jugador "+p1.getNombre()+" el numero ganador es "+ ganador);
                  terminar=turno;
                  }else{
                      System.out.println("mala suerte usted no a ganado");
                }
                  }
                  } while (opc>1 || opc<1);
                  
              do {                 
                 
        
             System.out.println("elija 2 para Lanzar dados de "+p2.getNombre());
              opc1= entrada.nextInt();
                  if (opc1==2){
                 
                      if (lanzarDado(n1, n2)==true){
                      System.out.println("Usted a ganado jugador "+p2.getNombre()+" el numero ganador es "+ ganador );
                     terminar=turno;
                  }else{
                      System.out.println("mala suerte usted no a ganado");
                  }
              
                  }
                      } while (opc1>2||opc1<2);
                  
              terminar++;
            numjuego++;
            
        } while (terminar<turno);
            if (terminar==turno) {
                System.out.println("Juego finalizado");
            }
         } catch (java.util.InputMismatchException e) {
             System.out.println("Error No se ingreso el Numero deseado");
        }
    }
}
