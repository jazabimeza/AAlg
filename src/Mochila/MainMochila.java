package Mochila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jazab
 */
public class MainMochila{
    public static void main(String[] args) {
    int beneficio[] = new int[]{30,60,90};
    
    int peso[] = new int[]{5,15,30};
  
    Mochila m= new Mochila();
    
        m.MochilaM(35,beneficio,beneficio.length,peso);
    }
}
