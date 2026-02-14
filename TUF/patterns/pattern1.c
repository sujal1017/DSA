#include<stdio.h>

void pattern1(int r, int c)
{
    for (int i = 0; i<r; i++)
    {
        for (int j =0 ; j<c; j++)
        {
            printf("* ");
        }
        printf("\n");
        
    }
    
}
// pattern1 prints 
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *

void pattern2( int r, int c)
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
// pattern2 prints 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
void pattern3 (int r, int c)
{
    for(int i =1; i<=r;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
}
// pattern3 peints 
// 1
// 12
// 123
// 1234

void pattern4 (int r, int c)
{
    for(int i =1; i<=r;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
}
// pattern4 prints 
// 1
// 22
// 333
// 4444
// 55555


void pattern5 (int r, int c)
{
    for(int i=1;i<=r;i++)
    {
        for(int j=0;j<=r-i+1;j++)
        {
            printf("*");
        }
        printf("\n");
    }
}
// pattern5 prints 
// ******
// *****
// ****
// ***
// **
// *

void pattern6 (int r,int c)
{
    for (int i=0;i<r;i++)
    {
        //Space
        for(int j=0;j<r-i-1;j++){
            printf(" ");
        }

        //Star
        for(int j =0;j<2*i+1;j++)
        {
            printf("*");
        }

        //Space
        for(int j=0;j<r-i-1;j++)
        {
            printf(" ");
        }
        printf("\n");
    }
    printf("\n");
}
// pattern6 peints 

//     *    
//    ***
//   *****
//  *******
// *********


int main()
{
    int r,c;
    printf("Enter the no rows and cols");
    scanf("%d %d" ,&r,&c);
    pattern6(r,c);
}