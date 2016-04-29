/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casojuegodado;

/**
 *
 * @author pcccasd
 */
public class Dado {
int lado;
    public Dado() {
    
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public int numAzar(){
    lado=(int) (Math.random() * (1-6+1) + 6);
       
    return lado ;}

}
