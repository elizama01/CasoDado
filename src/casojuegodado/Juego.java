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

    public int getGanador() {
        return ganador;
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }

    public int getTerminar() {
        return terminar;
    }

    public void setTerminar(int terminar) {
        this.terminar = terminar;
    }

    public Dado getN1() {
        return n1;
    }

    public void setN1(Dado n1) {
        this.n1 = n1;
    }

    public Dado getN2() {
        return n2;
    }

    public void setN2(Dado n2) {
        this.n2 = n2;
    }

    public int getPlayer1() {
        return player1;
    }

    public void setPlayer1(int player1) {
        this.player1 = player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void setPlayer2(int player2) {
        this.player2 = player2;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public int getOpc1() {
        return opc1;
    }

    public void setOpc1(int opc1) {
        this.opc1 = opc1;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getNumjuego() {
        return numjuego;
    }

    public void setNumjuego(int numjuego) {
        this.numjuego = numjuego;
    }

    public Persona getP1() {
        return p1;
    }

    public void setP1(Persona p1) {
        this.p1 = p1;
    }

    public Persona getP2() {
        return p2;
    }

    public void setP2(Persona p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Juego{" + "ganador=" + ganador + ", terminar=" + terminar + ", n1=" + n1 + ", n2=" + n2 + ", player1=" + player1 + ", player2=" + player2 + ", opc=" + opc + ", opc1=" + opc1 + ", turno=" + turno + ", numjuego=" + numjuego + ", p1=" + p1 + ", p2=" + p2 + '}';
    }
}
