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

struct node*add_at_end(struct node*head, int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->nest=NULL;
    struct node*tp;
    tp=head;
    while(tp->nest!=NULL)
    {
        tp=tp->nest;
    }
    tp->nest=temp;
    temp->prev=tp;
    return head;

}

struct node*del_first(struct node*head)
{
    struct node*temp=head;
    head=head->nest;
    free(temp);
    temp=NULL;
    head->prev=NULL;
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

struct node*del_inter(struct node*head,int position)
{
    struct node*temp=head;
    struct node*temp2=NULL;
    if(position==1)
    {
        head=del_first(head);
        return head;
    }

    while(position>1)
    {
        temp=temp->nest;
        position--;
    }
    if(temp->nest==NULL)
    {
        head=del_last(head);
    }
    else{
        temp2=temp->prev;
        temp2->nest=temp->nest;
        temp->nest->prev=temp2;
        free(temp);
        temp=NULL;

    }
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
    head=add_to_empty(head,12);
    head=add_at_end(head,45);
    head=add_at_end(head,67);
    head=add_at_end(head,89);
    printf("Beforn Deletion \n");
    print(head);

    head=del_inter(head,3);
    printf("After Deletion\n");
    print(head);
    return 0;
}