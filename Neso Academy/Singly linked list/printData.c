#include<stdio.h>
#include<stdlib.h>


int printdata();


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

    current=malloc(sizeof(struct node));
    current->data=45;
    current->link=NULL;
    head->link->link=current;

    printdata(head);
}

int printdata(struct node*head)
{
    if(head==NULL)
    {
        printf("Head id empty\n");
    }
    struct node*ptr=NULL;
    ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->link;
    }

}
