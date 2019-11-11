#include<stdio.h>
 
int ar[10][10],completo[10],n,costo=0;
 
void sacarS(){
	int i,j;
 
	printf("Numero de ubicaciones: ");
	scanf("%d",&n);
 
	for(i=0;i<n;i++){
		printf("\nElementos de fila: %d\n",i+1);
 
		for( j=0;j<n;j++)
			scanf("%d",&ar[i][j]);
 
		completo[i]=0;
	}
 
	printf("\n\nLista :");
 
	for( i=0;i<n;i++){
		printf("\n");
 
		for(j=0;j<n;j++)
			printf("\t%d",ar[i][j]);
	}
}
 
void min_costo(int ciudad){
	int i,nciudad;
 
	completo[ciudad]=1;
 
	printf("%d->",ciudad+1);
	nciudad=least(ciudad);
 
	if(nciudad==99){
		nciudad=0;
		printf("%d",nciudad+1);
		costo+=ar[ciudad][nciudad];
 
		return;
	}
 
	min_costo(nciudad);
}
 
int least(int c){
	int i,nc=99;
	int min=99,kmin;
 
	for(i=0;i < n;i++)
	{
		if((ar[c][i]!=0)&&(completo[i]==0))
			if(ar[c][i]+ar[i][c] < min)
			{
				min=ar[i][0]+ar[c][i];
				kmin=ar[c][i];
				nc=i;
			}
	}
 
	if(min!=99)
		costo=kmin+1;

	return nc;
}
 
int main(){
	sacarS(); 
	printf("\n\nCamino:\n");
	min_costo(0); 
	printf("\n\nCosto minimo %d\n ",costo);
 
	return 0;
}
