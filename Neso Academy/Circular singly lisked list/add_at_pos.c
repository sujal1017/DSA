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

struct node*add_at_end(struct node*tail,int data)
{
    struct node*newp=malloc(sizeof(struct node));
    newp->data=data;
    newp->nest=NULL;

    newp->nest=tail->nest;
    tail->nest=newp;
    tail=tail->nest;
    return tail;
}

struct node*add_at_pos(struct node*tail,int data,int pos)
{
    struct node*p=tail->nest;
    struct node*newp=malloc(sizeof(struct node));
    newp->data=data;
    newp->nest=NULL;

    while(pos>1)
    {
        p=p->nest;
        pos--;
    }
    newp->nest=p->nest;
    p->nest=newp;
    if(p==tail)
    {
        tail=tail->nest;
    }
    return tail;
}

void print(struct node*tail)
{
    struct node*p=tail->nest;
    do{
        printf("%d\n",p->data);
        p=p->nest;
    }while(p!=tail->nest);
}

int main()
{
    struct node*tail;
    tail=add_to_empty(12);
    tail=add_at_end(tail,23);
    tail=add_at_end(tail,34);
    tail=add_at_end(tail,45);
    tail=add_at_end(tail,56);
    printf("Before adding the add_at_pos function :\n");
    print(tail);
    
    tail=add_at_pos(tail,90,3);
    printf("After adding the add_at_pos function :\n");
    print(tail);
    
    return 0;
}