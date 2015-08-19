#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    int max=0;
    int nMountain;
    // game loop
    while (1) {
        int spaceX;
        int spaceY;
        scanf("%d%d", &spaceX, &spaceY);
        for (int i = 0; i < 8; i++) {
            int mountainH; // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
            scanf("%d", &mountainH);
            if(mountainH > max){
                max = mountainH;
                nMountain = i;
            }
        }

        // Write an action using printf(). DON'T FORGET THE TRAILING \n
        // To debug: fprintf(stderr, "Debug messages...\n");
    
         if(spaceX == nMountain){
                printf("FIRE\n");
                max = 0;
                nMountain = 0;
         }else 
                printf("HOLD\n");
        
        
    
       //printf("HOLD\n"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
    }

    return 0;
}
