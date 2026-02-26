#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*link;
};

int main()
{
    
    struct node * head=malloc(sizeof(struct node));
    head->data=23;
    head->link=NULL;

    struct node*current=malloc(sizeof(struct node));
    current->data=34;
    current->link=NULL;
    head->link=current;

    count_of_nodes(head);

}

int count_of_nodes(struct node*head){
    int count=0;
    if(head==0)
    {
        printf("linked list is empty");
    }
    struct node*ptr=NULL;
    ptr=head;
    while(ptr!=NULL){
        count++;
        ptr=ptr->link;
    }
    printf("%d",count);

}