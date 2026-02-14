#include<stdio.h>
#include<stdlib.h>

struct node{
    struct node*nest;
    int data;
};

struct node*add_to_empty(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->nest=temp;
    temp->data=data;
    return temp;
}

struct node*add_at_beg(struct node*tail,int data)
{
    struct node*newp=malloc(sizeof(struct node));
    newp->data=data;
    newp->nest=tail->nest;
    tail->nest=newp;
    return tail;
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
   
    tail=add_to_empty(45);
    tail=add_at_beg(tail,34);
    tail=add_at_end(tail,78);
    tail=add_at_end(tail,90);
    print(tail);
    return 0;
}