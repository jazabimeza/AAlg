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
public class Mochila {
    private int ValorMay(int x, int y){
  
        if(x > y){
            return x;
        }else{
            return y;
        }
    }
    
    public void MochilaM(int capacidad, int beneficio[],int n, int peso[]){
        
        int Matriz[][] = new int[n+1][capacidad++];
  
        for(int monito=0;monito<=n;monito++){
            System.out.print(",");
            for(int p=0;p<=capacidad;p++){
                if(monito==0 || p==0){              
                    }else if(peso[monito-1]<=p){
                     Matriz[monito][p] = ValorMay(beneficio[monito-1]
                                        +Matriz[monito-1][p-peso[monito-1]]
                                        ,Matriz[monito-1][p]);
                }else{
                    Matriz[monito][p] = Matriz[monito-1][p];
                }
               System.out.print(Matriz[monito][p]);
               if(p!=Matriz[monito].length-capacidad){
               }
               System.out.print("\t");
            }
            System.out.println(",");
        }
    
    System.out.println("beneficio total: " +Matriz[n][capacidad]);
    
    if(n!=0){
        if(Matriz[n][capacidad]!=Matriz[n-1][capacidad]){
            System.out.println("articulo: "+n+", valor = "+beneficio[n-1]+", peso = "+peso[n-1]);
        }
        n--;
        }
    }
}
