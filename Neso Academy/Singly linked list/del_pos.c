#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*link;
};

struct node*del_pos(struct node*head,int position)
{
    struct node*previous=head;
    struct node*current=head;
    if(head==NULL)
    printf("List is empty\n");
    else if(position==1)
    {
        head=current->link;
        free(current);
        current=NULL;
    }

    else{
            while(position!=1)
            {
                previous=current;
                current=current->link;
                position--;

            }
            previous->link=current->link;
            free(current);
            current=NULL;
    }
}

int main()
{
    struct node*head=malloc(sizeof(struct node));
    head->data=12;
    head->link=NULL;

    struct node*second=malloc(sizeof(struct node));
    second->data=24;
    second->link=NULL;
    head->link=second;

    
    struct node*third=malloc(sizeof(struct node));
    third->data=42;
    third->link=NULL;
    second->link=third;


    int position=2;
    del_pos(head,position);
    struct node*ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->link;
    }
    return 0;
}    