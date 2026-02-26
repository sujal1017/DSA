#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*link;
};


struct node*reverse(struct node*head)
{
    struct node*previous=NULL;
    struct node*nest=NULL;
    while(head!=NULL)
    {
    nest=head->link;
    head->link=previous;    
    previous=head;
    head=nest;
    }
    head=previous;
    return head;
}

int main()
{
    struct node*head=malloc(sizeof(struct node));
    head->data=12;
    head->link=NULL;

    struct node*second=malloc(sizeof(struct node));
    second->data=23;
    second->link=NULL;
    head->link=second;

    struct node*third=malloc(sizeof(struct node));
    third->data=34;
    third->link=NULL;
    second->link=third;

    struct node*forth=malloc(sizeof(struct node));
    forth->data=78;
    forth->link=NULL;
    third->link=forth;

    head=reverse(head);
    struct node*ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->link;
    }
    return 0;   
}