#include<stdio.h>
#include<stdlib.h>

struct node{
    struct node*prev;
    int data;
    struct node*nest;
};



struct node*add_to_empty(struct node*head,int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->nest=NULL;
    head=temp;
    return head;
}

struct node*add_at_beg(struct node*head,int data)
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

struct node*add_at_end(struct node*head,int data)
{
    struct node*temp,*tp;
    temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->nest=NULL;
    tp=head;
    while(tp->nest!=NULL)
    {
        tp=tp->nest;
    }
    tp->nest=temp;
    temp->prev=tp;
    return head;
}

int main()
{
    struct node*head=NULL;
    struct node*ptr;
    head=add_to_empty(head,12);
    head=add_at_beg(head,23);
    head=add_at_end(head,34);

    ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->nest;
    }
    return 0;
}