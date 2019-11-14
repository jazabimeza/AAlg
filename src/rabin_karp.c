
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define d 256

void main(){
	char ejemplo[] = "abiestaenojadaporquepablolehizoalgo"; 
    char patron[] = "e"; 
    int num = 15; // num primo
    search(patron, ejemplo, num); 
    return 0; 
}
void search(char patron[], char ejemplo[], int num) 
{ 
    int M= strlen(patron); 
    int N= strlen(ejemplo); 
    int i, j; 
    int p,t= 0;   
    int h= 1; 
    int con=0;
  
    for (i = 0; i < M - 1; i++) 
        h = (h * d) % num; 
  
    // Calcula el valor del hash 
    
    for (i = 0; i < M; i++) { 
        p = (d*p +patron[i]) %num; 
        t = (d*t +ejemplo[i]) %num; 
    } 
  
    //Mueve a patron 
    for (i = 0; i <= N - M; i++) { 
  
        if (p == t) { 
            for (j = 0; j < M; j++) { 
                if (ejemplo[i + j] != patron[j]) 
                    break; 
            } 

            if (j == M) 
                printf("Patron encontrado en la posicion: %d \n", i); 
                con++;
        } 
  
        if (i < N - M) { 
            t = (d *(t-ejemplo[i]*h) + ejemplo[i+M]) %num; 
  
            // Ponemos un valor negativo de t y convertirlo 
            if (t < 0) 
                t = (t +num); 
        } 
    }
     printf("Se han encontrado: %d \n", con);
	 
} 
