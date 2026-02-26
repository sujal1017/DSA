#include<stdio.h>
#include<stdlib.h>
int add_at_end();


struct node{
    int data;
    struct node*link;
};
int main()
{
    struct node*head=malloc(sizeof(struct node));
    head->data=45;
    head->link=NULL;

    struct node*current=malloc(sizeof(struct node));
    head->data=56;
    head->link=NULL;
    head->link=current;
    
    current=malloc(sizeof(struct node));
    current->data=12;
    current->link=NULL;
    head->link->link=current;
    

    add_at_end(head,67);
}

int add_at_end(struct node*head,int data)
{
    struct node*ptr,*temp;
    ptr=head;
    temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;

    while(ptr->link!=NULL)
    {
     ptr=ptr->link;
     printf("%d\n ",ptr->data);
    }
    ptr->link=temp;
}