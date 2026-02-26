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
struct node*add_at_end(struct node*tail,int data)
{
    struct node*newp=malloc(sizeof(struct node));
    newp->data=data;
    newp->nest=NULL;
    newp->nest=tail->nest;
    tail->nest=newp;
    tail=tail->nest;
    return tail;
}
struct node*create_list(struct node*tail)
{
    int n,i,data;
    printf("Enter the number of element in the linked list:");
    scanf("%d",&n);
    if(n==0)
    {
        printf("The linked list is empty\n");
    }
    printf("Enter the element 1:");
    scanf("%d",&data);
    tail=add_to_empty(data);
    for(i=1;i<n;i++)
    {
        printf("Enter the element %d:",i+1);
        scanf("%d",&data);
        tail=add_at_end(tail,data);
    }
    return tail;
}
void print(struct node*tail)
{
    if(tail==NULL)
    {
        printf("No node in the list\n");
    }
    else{
        struct node*p=tail->nest;
        do{
            printf("%d\n",p->data);
            p=p->nest;
        }while(p!=tail->nest);
    }
    printf("\n");
}
struct node*del_last(struct node*tail)
{
    if(tail==NULL)
        return tail;
    struct node*temp=tail->nest;
    if(tail->nest==tail)
    {
        free(tail);
        tail=NULL;
        return tail;
    }
    while(temp->nest!=tail)
    {
        temp=temp->nest;
    }
    temp->nest=tail->nest;
    free(tail);
    tail=NULL;
    return tail;
}
int main()
{
    struct node*tail=NULL;
    tail=create_list(tail);
    printf("Before deletion:\n");
    print(tail);
    tail=del_last(tail);
    printf("After deletion\n");
    print(tail);
    return 0;
}