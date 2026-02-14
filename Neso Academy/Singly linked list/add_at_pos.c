#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*link;
};

int main()
{
  struct node*head=malloc(sizeof(struct node));
  head->data=45;
  head->link=NULL;

  add_at_end(head,95);
  add_at_end(head,15);
//   *ptr=head;

  int data=78, pos=3;

  add_at_pos(head,data,pos);
  struct node*ptr=head;

  while(ptr!=NULL)
  {
    printf("%d",ptr->data);
    ptr=ptr->link;
  }
  return 0;
}

int add_at_end(struct node*ptr,int data)
{
       
    struct node*temp=malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;

    ptr->link=temp;
    return temp;
}

void add_at_pos(struct node*head, int data,int pos)
{
    struct node*ptr=head;
    struct node *ptr2=malloc(sizeof(struct node));
    ptr2->data=90;
    ptr2->link=NULL;

    pos--;
    while(pos!=1)
    {
        ptr=ptr->link;
        pos--;

    }
    ptr2->link=ptr->link;
    ptr->link=ptr2;
}