#include<stdio.h>
#include<stdlib.h>

main(){
	
	//Declara��o de uma vari�vel
	int valor = 14;
	//Declara��o de um ponteoiro
	int *ponteiro;
	//Inicializando o ponteiro
	ponteiro = &valor;
	
	printf("Endereco de Valor %d\n", &valor);
	printf("Valor da Variavel Valor %d\n", valor);
	printf("Endereco de Ponteiro %d\n", &ponteiro);
	printf("Valor da Variavel Ponteiro %d\n", ponteiro);
	printf("Valor da Variavel Valor pelo Ponteiro %d\n", *ponteiro);
	
	printf("Quantidade de posicoes %d\n", (int *) malloc(sizeof(int)));
}
