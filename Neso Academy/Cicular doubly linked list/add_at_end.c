#include<stdio.h>
#include<stdlib.h>
struct node{
    struct node*prev;
    int data;
    struct node*nest;
};
struct node*add_to_empty(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=temp;
    temp->data=data;
    temp->nest=temp;
    return temp;
}
struct node*add_at_end(struct node*tail,int data)
{
    struct node*newp=add_to_empty(data);
     if(tail==NULL)
    {
        return newp;
    }
    else{
        struct node*temp=tail->nest;
        newp->prev=tail;
        newp->nest=temp;
        tail->nest=newp;
        temp->prev=newp;
        tail=newp;
        return tail;
    }

}
void print(struct node*tail)
{
    if(tail==NULL)
    {
        printf("Node is empty\n");
    }
    struct node*temp=tail->nest;
          do{
            printf("%d\n",temp->data);
            temp=temp->nest;
        }while(temp!=tail->nest);
    printf("\n");
}
int main()
{
    struct node*tail=NULL;
    tail=add_to_empty(12);
    tail=add_at_end(tail,23);
    tail=add_at_end(tail,45);
    print(tail);
    return 0;
}