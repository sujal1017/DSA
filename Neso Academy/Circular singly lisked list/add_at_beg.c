#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*nest;
};

struct node*add_to_empty(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->nest=temp;
    return temp;
}

struct node*add_at_beg(struct node*tail, int data)
{
    struct node*newp=malloc(sizeof(struct node));
    newp->data=data;
    newp->nest=tail->nest;
    tail->nest=newp;
    return tail;
}

void print(struct node*tail)
{
    struct node*p=tail->nest;
    do{
        printf("%d\n",p->data);
        p=p->nest;
    }   
    while(p!=tail->nest);
}

int main()
{
    struct node*tail;
    tail=add_to_empty(45);
    tail=add_at_beg(tail,23);
    
    print(tail);
    return 0;
}