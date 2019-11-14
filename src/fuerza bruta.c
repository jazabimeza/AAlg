#include<conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define esp 100

int main(){
	char* cadena[esp];
	char* patron[esp];
	
	//nota: no se puede usar espacios por el scanf
	
printf("Ingrese la cadena:");
scanf("%s",&cadena);
printf("Ingrese patron a encontrar:");
scanf("%s",&patron);

	fb(cadena,patron);
}

void fb(char* cadena[esp],char* patron[esp]){

int band=0;
int contador=0;
int l,i,m,n;
int flag=0;
int j=0;
		
	n=strlen(cadena);
    m=strlen(patron); 
    //Recorrido que hara sobre la cadena para encontrar el patron
     for(i=0;i<=n-m;i++){
       int  l=i; 
	   	
        while(cadena[l]==patron[j] &&  j<=m) {
            l++; j++; }
            if(j>m-1){				
            //Determinara la posicion
    		printf("El patron a buscar se ha encontrado en : ", i+1);
    		contador++;	
		    flag=1;	
			}		
			else	
			flag=0;					
	 }
	  printf("\n Se ha encontrado ", contador);
}	 
