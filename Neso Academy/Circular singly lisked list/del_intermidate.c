#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *nest;
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
    newp->nest=newp;
    newp->nest=tail->nest;
    tail->nest=newp;
    tail=tail->nest;
    return tail;
}
struct node*create_list(struct node*tail)
{
    int i,n,data;
    printf("Enter the no of nodes:");
    scanf("%d",&n);
    if(n==0)
    {
        printf("Node is empty\n");
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
        printf("NO node in the list\n");
    }
    else{
        struct node*p=tail->nest;
        do{
            printf("%d\n",p->data);
            p=p->nest;
        }while(p!=tail->nest);
        printf("\n");
    }
}
struct node*del_intermidate(struct node*tail,int pos)
{
    if(tail==NULL)
    {
        return tail;
    }
    struct node*temp=tail->nest;
    if(tail->nest==tail)
    {
        free(tail);
        tail=NULL;
        return tail;
    }
    while(pos>2)
    {
        temp=temp->nest;
        pos--;
    }
    struct node*temp2=temp->nest;
    temp->nest=temp2->nest;
    if(temp2==tail)
    {
        tail=temp;
    }
    free(temp2);
    temp2=NULL;
    return tail;
}
int main()
{
    struct node*tail=NULL;
    tail=create_list(tail);
    printf("Before deletion of the data\n");
    print(tail);
    tail=del_intermidate(tail,4);
    printf("After deletion of the data\n");
    print(tail);
    return 0;
}