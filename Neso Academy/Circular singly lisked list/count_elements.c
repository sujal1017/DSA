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
struct node*count_elements(struct node*tail)
{
    struct node*temp=temp->nest;
    int count=1;
    while(temp!=tail)
    {
        temp=temp->nest;
        count++;
    }
    printf("There are %d elements in the list\n",count);
}
int main()
{
    struct node*tail=NULL;
    tail=add_to_empty(12);
    tail=add_at_end(tail,23);
    tail=add_at_end(tail,43);
    tail=add_at_end(tail,37);
    tail=add_at_end(tail,79);
    count_elements(tail);
    return 0;
}