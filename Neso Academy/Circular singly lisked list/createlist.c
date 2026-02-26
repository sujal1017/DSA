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
    int i,n,data;
    printf("Enter the number of nodes in the linked list:");
    scanf("%d",&n);
    if(n==0)
    {
        return tail;
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

int main()
{
    struct node*tail=NULL;
    tail=create_list(tail);
    print(tail);
    return 0;
}