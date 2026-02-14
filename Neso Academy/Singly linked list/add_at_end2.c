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
    head->data=56;
    head->link=NULL;

    struct node *ptr=head;
    ptr=add_at_end(ptr,98);
    ptr=add_at_end(ptr,49);
    ptr=add_at_end(ptr,23);
    
    ptr=head;
    while(ptr!= NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->link;
    }
    return 0;    
}

int add_at_end(struct node*ptr,int data)
{
       
    struct node*temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;

    ptr->link=temp;
    return temp;
}