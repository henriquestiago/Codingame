#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
int main()
{
    int lightX; // the X position of the light of power
    int lightY; // the Y position of the light of power
    int initialTX; // Thor's starting X position
    int initialTY; // Thor's starting Y position
    scanf("%d%d%d%d", &lightX, &lightY, &initialTX, &initialTY);

    // game loop
    while (1) {
        int remainingTurns;
        scanf("%d", &remainingTurns);

        // Write an action using printf(). DON'T FORGET THE TRAILING \n
        // To debug: fprintf(stderr, "Debug messages...\n");
        //int thorX = initialTX;
        //int thorY = initialTY;
        //char directionX;
        //char directionY;
        char direction="";
            
        if(initialTY > lightY){
           initialTY--;    
           direction = "N";
        }else if(initialTY < lightY){
           initialTY++;
           direction = "S";  
        }if(initialTX > lightX){
            initialTX--;
            direction += "W";
        }else if(initialTX < lightX){
            initialTX++;
            direction += "E"; 
        }
    
        //printf("Thor's position = (%d,%d);\n",thorX,thorY);
        //printf("Thor's direction = (%s%s);\n",directionX,directionY);
        //printf("SE\n"); // A single line providing the move to be made: N NE E SE S SW W or NW
        printf("%c\n",direction);
        //printf("%c\n",directionX);
        //printf("N\n");
    }

    return 0;
}
