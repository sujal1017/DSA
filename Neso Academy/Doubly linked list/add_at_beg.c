#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*prev;
    struct node*nest;
};


struct node*addToEmpty(struct node*head,int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->prev=NULL;
    temp->nest=NULL;
    head=temp;
    return head;
}

struct node*add_at_beg(struct node*head, int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->nest=NULL;
    temp->nest=head;
    head->prev=temp;
    head=temp;
    return head;
}

int main()
{
    struct node*head=NULL;
    struct node*ptr;
    head=addToEmpty(head,12);
    head=add_at_beg(head,45);
    ptr=head;
    while (ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->nest;
    }
    return 0;    
}
    