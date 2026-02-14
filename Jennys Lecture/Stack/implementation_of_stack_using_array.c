#include<stdio.h>
#include<stdlib.h>
#define N 5;
int stack[N];
int top=-1;

void push()
{
    int x;
    printf("Enter the value :");
    scanf("%d",&x);
    if(top==N-1)
    {
        printf("Overflow");
    }
    else{
        top++
    }
}
int main()
{
    int ch;
    do{
        printf("Enter your choice\n 1 Push\n 2 Pop\n 3 Display\n 4 Peek");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:Push();
            break;
            case 2:Pop();
            break;
            case 3:Display();
            break;
            case 4:Peek();
            break;
            default:printf("Invalid value\n");
        }
    }while(ch!=0);
}
