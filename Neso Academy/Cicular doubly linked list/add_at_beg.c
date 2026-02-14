#include<stdio.h>
#include<stdlib.h>
struct node{
    struct node*prev;
    int data;
    struct node*nest;
};
struct node*add_to_empty(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=temp;
    temp->data=data;
    temp->nest=temp;
    return temp;
}
struct node*add_at_beg(struct node*tail,int data)
{
    struct node*newp=add_to_empty(data);
    if(tail==NULL)
    {
        return newp;
    }
    else{
        struct node*temp=tail->nest;
        newp->prev=tail;
        newp->nest=tail;
        tail->prev=newp;
        tail->nest=newp;
        return tail;
    }
}
void print(struct node*tail)
{
    if(tail==NULL)
    {
        printf("No elements in the list\n");
    }
    else{
        struct node*temp=tail->nest;
        do{
            printf("%d\n",temp->data);
            temp=temp->nest;
        }while(temp!=tail->nest);
    }
    printf("\n");
}
int main()
{
    struct node*tail=NULL;
    tail=add_to_empty(23);
    tail=add_at_beg(tail,12);
    print(tail);
    return 0;
}
