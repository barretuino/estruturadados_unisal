#include<stdio.h>
#include<stdlib.h>

/**
	Exemplo de Uso de Ponteiros
**/
main(){
	//Declaração de uma variável
	float valorDolar = 5.40;
	//Declaração de um ponteiro
	float *ponteiro = &valorDolar;
	
	float **ponteiroIndireto = &ponteiro;
	
	printf("Endereco de valorDolar %i\n", &valorDolar);
	printf("Endereco de ponteiro %i \n", &ponteiro);
	printf("Conteudo de valorDolar %.2f \n", valorDolar);
	printf("Conteudo de ponteiro %i \n", ponteiro);
	printf("Valor contido no endereco que o ponteiro aponta %.2f \n", *ponteiro);	
	printf("Endereco de ponteiroIndireto %i \n", &ponteiroIndireto);
	printf("valor contido no endereco do endereco que ponteiroIndireto aponta %.2f \n", **ponteiroIndireto);

}
