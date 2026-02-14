#include<stdio.h>

void pattern (int r, int c)
{
    for (int i = 0; i<r; i++)
    {
        for (int j =0 ; j<=i; j++)
        {
            printf("* ");
        }
        printf("\n");
        
    }
    
}

int main()
{
    int r,c;
    printf("Enter the no rows and cols");
    scanf("%d %d" ,&r,&c);
    pattern(r,c);
}


// prints 

// * 
// * * 
// * * * 
// * * * *
// * * * * *