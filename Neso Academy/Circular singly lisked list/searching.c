#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*nest;
};
struct node*add_to_empty(int data)
{
    struct node*temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->nest=temp;
    return temp;
}
struct node*add_at_end(struct node* tail,int data)
{
    struct node*newp=malloc(sizeof(struct node));
    newp->data=data;
    newp->nest=newp;
    newp->nest=tail->nest;
    tail->nest=newp;
    tail=tail->nest;
    return tail;
}
struct node*searching(struct node*tail,int element)
{
    struct node*temp;
    int index=0;
    if(tail==NULL)
    {
        return -2;
    }
    temp=tail->nest;
    do{
        if(temp->data==element)
        {
            return index;
        }
        temp=temp->nest;
        index++;
    }while(temp!=tail->nest);
    return -1;
}
int main()
{
    struct node*tail=NULL;
    int element;
    tail=add_to_empty(45);
    tail=add_at_end(tail,23);
    tail=add_at_end(tail,43);
    tail=add_at_end(tail,37);
    tail=add_at_end(tail,79);
    printf("Enter the element :");
    scanf("%d",&element);
    int index=searching(tail,element);
    if(index==-1)
        printf("Element not found\n");
    else if(index==-2)
        printf("Linked list is empty\n");
    else
        printf("Element %d is at index %d",element,index);
    return 0;
}