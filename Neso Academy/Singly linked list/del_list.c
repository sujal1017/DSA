#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*link;
};

struct node*del_list(struct node*head)
{
    struct node*temp=head;
    while(temp!=NULL)
    {
        temp=temp->link;
        free(head);
        head=temp;
    }
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
    
    head=del_list(head);
    if(head==NULL)
    printf("Linked list is deleted successfully\n");
    return 0;
}
