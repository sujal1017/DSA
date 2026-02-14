#include<stdio.h>
#include<stdlib.h>

struct node{
    struct node*prev;
    int data;
    struct node*next;
};

struct node*circular_doubly(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->next=temp;
    temp->prev=temp;
    temp->data=data;
    return temp;
}

int main()
{
    struct node*tail;
    int data=17;
    tail=circular_doubly(data);

    printf("%d",tail->data);
    return 0;
}