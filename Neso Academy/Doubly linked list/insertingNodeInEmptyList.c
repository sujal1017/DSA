#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*nest;
    struct node*prev;
};

struct node*addToEmpty(struct node*head, int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->nest=NULL;
    temp->data=data;
    head=temp;
    return head;
}

int main()
{
    struct node*head=NULL;
    head=addToEmpty(head,12);
    printf("%d",head->data);
    return 0;
}