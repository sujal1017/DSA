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
    temp->nest=NULL;
    temp->data=data;
    head=temp;
    return head;
}

struct node*add_at_end(struct node*head,int data)
{
    struct node*tp;
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->nest=NULL;
    temp->data=data;
    tp=head;
    while(tp->nest!=NULL)
    {
        tp=tp->nest;
    }
    tp->nest=temp;
    temp->prev=tp;
    return head;
}

struct node*del_last(struct node*head)
{
    struct node*temp=head;
    struct node*temp2;
    while(temp->nest!=NULL)
    {
        temp=temp->nest;
    }
    temp2=temp->prev;
    temp2->nest=NULL;
    free(temp);
    temp=NULL;
    return head;
}

void print(struct node*head)
{
    struct node*ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->nest;
    }
    printf("\n");
}

int main()
{
    struct node*head=NULL;
    struct node*ptr;
    head=add_to_empty(head,12);
    head=add_at_end(head,23);
    head=add_at_end(head,33);
    head=add_at_end(head,43);

    printf("Before Deletion :\n");
    print(head);

    head=del_last(head);
    printf("After Deletion :\n");
    print(head);
    return 0;
}