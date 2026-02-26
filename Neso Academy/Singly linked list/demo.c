#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*link;
};
int main()
{
    struct node* head=malloc(sizeof(struct node));
    head->data=45;
    head->link=NULL;

    addend(head,52);
    addend(head,56);

    int data=23;
    int position=2;

    addpos(head,data,position);
    struct node*ptr=head;

    while(ptr != NULL)
    {
        printf("data\n%d",ptr->data);
        ptr=ptr->link;
    }
}

int addpos(struct node*head,int data, int position)
{
    struct node*ptr=head;
    struct node*ptr2=malloc(sizeof(struct node));
    ptr2->data=data;
    ptr2->link=NULL;
    position--;
    while(position!=1)
    {
        ptr=ptr->link;
        position--;
    }
    ptr2->link=ptr->link;
    ptr->link=ptr2;
}
int addend(struct node*head,int data)
{
    struct node *ptr, *temp;
    ptr=head;
    temp=malloc(sizeof(struct node));

    temp->data=data;
    temp->link=NULL;

    while(ptr->link!=NULL)
    {
        ptr=ptr->link;
    }
    ptr->link=temp;

}