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

struct node*add_before_pos(struct node*head,int data, int position)
{
    struct node*newp=NULL;
    struct node*temp=head;
    struct node*temp2=NULL;
    newp=add_to_empty(head,data);

    int pos=position;
    while(pos>2)
    {
        temp=temp->nest;
        pos--;
    }
    if(position==1)
    {
        head=add_at_beg(head,data);
    }
    else{
        temp2=temp->nest;
        temp->nest=newp;
        temp2->prev=newp;
        newp->nest=temp2;
        newp->prev=temp;
    }
    return head;
}

int main()
{
    struct node*head=NULL,*ptr;
    int position=3;
    head=add_to_empty(head,12);
    head=add_at_beg(head,23);
    head=add_at_end(head,34);
    head=add_before_pos(head,79,position);
    ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->nest;
    }
    return 0;
}