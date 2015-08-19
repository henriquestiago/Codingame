#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    int road; // the length of the road before the gap.
    scanf("%d", &road);
    int gap; // the length of the gap.
    scanf("%d", &gap);
    int platform; // the length of the landing platform.
    scanf("%d", &platform);

    // game loop
    while (1) {
        int speed; // the motorbike's speed.
        scanf("%d", &speed);
        int coordX; // the position on the road of the motorbike.
        scanf("%d", &coordX);

        // Write an action using printf(). DON'T FORGET THE TRAILING \n
        // To debug: fprintf(stderr, "Debug messages...\n");
       
       // Se a posição da mota for superior à dimensão da estrada
       // significa que já saltou e que tem de parar na plataforma.
       if(coordX <= road-1){
           // Aumentar velocidade
           if(speed < gap+1) printf("SPEED\n");
           // Salto
           else if(speed == (gap+1) && coordX == road-1) printf("JUMP\n");
           // Reduzir velocidade
           else if(speed > gap+1) printf("SLOW\n");
           // Esperar pela posição salto
           else printf("WAIT\n");
       }
       // Reduzir velocidade para parar mota
       else printf("SLOW\n");
       
       
        //printf("SPEED\n"); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
    }

    return 0;
}
