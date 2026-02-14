#include<stdio.h>
#include<stdlib.h>
//int addend();
struct node {
    int data;
    struct node*link;
};

int main()
{ int *head;
   int addend(struct node *head,int data);
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
/*#include<stdio.h>
int main()
{
    printf("hello");
}*/