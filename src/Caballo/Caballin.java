package Caballo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jazab
 */
public class Caballin {
    int [][] tablero=new int [8][8]; //damos de alta posiciones que tendra el tablero 
    //define recorrido
    int[][] recorrido = {{2, 1},{1, 2},{-1, 2},{-2, 1},{-2, -1},{-1, -2},{1, -2},{2, -1}};
    //guarda coordenadas donde inicia el caballo
    int x0, y0;
    int con=0;
    boolean chido;
       public Caballin(int x, int y){
        if ((x < 1) || (x > 8) || (y < 1) || (y > 8)) {
            System.out.println("Las coordenadas no son validas");
        }
        x0 = x;
        y0 = y;
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                tablero[i][j] = 0;
            }
        }
        tablero[x0][y0] = 1;//guarda inicio
        con++;
    }
        private void saltos(int x, int y, int i) {
        int ejex=0;
        int ejey=0;
        int a;
        
        a = 0; //movimeinots posibles
        do{
            a++;
            ejex += recorrido[a - 1][0];
            ejey += recorrido[a - 1][1];
            
            //coordenadas (nuevo movimiento dentro) 
            if((ejex >= 1) && (ejex <= 8) && (ejey >= 1) && (ejey <= 8) && (tablero[ejex][ejey] == 0)) {
                
                //movimiento en tablero. 2, pq 1 se esta en el inicio 
                tablero[ejex][ejey] = i;
               
                //valor de i (debe llegar a 64/
                if(i <8 * 8){
                    
                //el tablero debe estar incompleto(aún)
                    if (!chido){ 
                        tablero[ejex][ejey] = 0;
                    }
                     saltos(ejex, ejey, i + 1);
                }else {
                    
                    //ya se completó 
                    chido = true; 
               }
            }
        } while((a<8) && !chido);
    }
    void tableroImp() {
            for (int j = 1; j <= 9; j++) {
                for (int i = 1; i <= 9; i++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
     public void mov() {
        saltos(x0, y0, 2);
    }
}