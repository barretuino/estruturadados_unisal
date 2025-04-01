/*
	Disciplina de Estrutura de Dados
	Professor Paulo Barreto
	Pilhas
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct no{
	int valor;
	struct no* prox;
}no;

typedef no pilha;

/*
Nesta Pilha, est� adicionando no final. Ou seja, 
l� no �ltimo quando aponta pra NULL.
Como � uma Pilha, temos que retirar da� tamb�m.
*/
void empilhar(pilha** p, int numero){

	pilha* novo = (pilha*)malloc(sizeof(pilha));

	if(*p == NULL){ // A Pilha est� vazia, � o primeiro elemento que vamos inserir nela.
		*p = novo;
		(*p)->valor = numero;
		(*p)->prox = NULL;

	}

	else{ // A Pilha n�o est� vazia. Inserimos no final.
	
	pilha* percorre;

	percorre = *p;

		
		while(percorre->prox != NULL ){

			percorre = percorre -> prox;
		}

	percorre -> prox = novo;
	novo -> valor = numero;
	novo -> prox = NULL;
	

	}
	

}

/*
Vamos ter que retirar do final, j� que o �ltimo 
que foi adicionando se encontra no final.
*/

void desempilhar(pilha** p){
	pilha* percorre;
	percorre = *p;
	
	if(*p == NULL) printf("A Pilha est� vazia\n");
	

	else{//A Pilha tem mais de um elemento, ent�o podemos desempilhar!
		
		if(percorre->prox == NULL) *p = NULL;
		else{

			while(percorre->prox->prox != NULL){
				percorre = percorre->prox;
			}

			percorre ->prox = NULL;

		}

	}
}

void imprimir(pilha* p){

	pilha* percorre;

	percorre = p;

	if(p == NULL) printf("A Pilha se encontra vazia!\n"); // Pilha Vazia
	else{
		while(percorre != NULL){
			
			printf("Elemento: %d \n", percorre->valor);

			percorre = percorre -> prox;

		}
	}
}

void esvaziarpilha(pilha **p){	
	pilha* aux;
	aux = *p;

	while(aux != NULL){
		*p = aux->prox;
		free(aux);
		aux = *p;
	}
}

int main(){

	
	pilha* p = NULL;

	int elemento, opcao = 1;

	while(opcao != 0){

	system("clear");

		printf("################### PILHA ####################\n");
	
		printf("\n");
		printf("0 - Sair\n");
		printf("1 - Empilhar\n");
		printf("2 - Desempilhar\n");
		printf("3 - Esvaziar Pilha\n");
		printf("4 - Imprimir\n");
		printf(".:");

		scanf("%d", &opcao);


		switch(opcao){

			case 1: // Empilhando

				printf("Qual elemento voc� deseja empilhar?\n");
					scanf("%d", &elemento);

				empilhar(&p, elemento);

				printf("Vamos imprimir agora ap�s ter empilhado\n");

				imprimir(p);

				getchar();
				getchar();


			break;


			case 2: // Desempilhando
				
				printf("Vamos desempilhar\n");

				desempilhar(&p);

				printf("\n");

				printf("Imprimindo agora ap�s desempilhar\n");
				imprimir(p);


				getchar();
				getchar();
			break;


			case 3: // Esvaziando a Pilha
				

				printf("Esvaziando a pilha\n");

				esvaziarpilha(&p);

				printf("Imprimindo ap�s ter esvaziado\n");

				imprimir(p);

				getchar();
				getchar();
			break;

			case 4: // Imprimindo
				
				printf("Imprimindo...\n");
				imprimir(p);

				getchar();
				getchar();

			break;
		}
	}
}
