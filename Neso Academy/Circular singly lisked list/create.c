#include<stdio.h>
#include<stdlib.h>

struct node{
    struct node*next;
    int data;
};

struct node*circular_singly(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->next=temp;
    return temp;
}

int main()
{
    int data=17;
    struct node*tail;
    tail=circular_singly(data);

    printf("%d",tail->data);
    return 0;
}