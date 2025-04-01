#include <stdio.h>
#include <stdlib.h>

int soma(int a, int b){
	return a + b;
}
void imprimir(char texto[]){
	printf("%s\n", texto);
}

main(){
	int a, b;
	int *pontA;
	
	pontA = &a;
	
	printf("Informar o valor de a ");
	scanf("%i", &a);
	printf("Informar o valor de b ");
	scanf("%i", &b);
	
	imprimir("Resultado da soma " + soma(a,b));
}
