// #include<stdio.h>
// #include<stdlib.h>

// struct node{
//     struct node*prev;
//     int data;
//     struct node*nest;
// };

// struct node*add_to_empty(struct node*head,int data)
// {
//     struct node*temp=malloc(sizeof(struct node));
//     temp->prev=NULL;
//     temp->data=data;
//     temp->nest=NULL;
//     head=temp;
//     return head;
// }

// struct node*add_at_end(struct node*head,int data)
// {
//     struct node*temp=malloc(sizeof(struct node));
//     struct node*tp;
//     temp->prev=NULL;
//     temp->data=data;
//     temp->nest=NULL;
//     tp=head;
//     while(tp->nest!=NULL)
//     {
//         tp=tp->nest;
//     }
//     tp->nest=temp;
//     temp->prev=tp;
//     return head;

// }

   
// struct node*reverse(struct node*head)
// {
//     struct node*temp=head;
//     struct node*temp2=temp->nest;
    
//     temp->nest=NULL;
//     temp->prev=temp2;
//     while(temp2!=NULL)
//     {
//     temp2->prev=temp2->nest;
//     temp2->nest=temp;
//     temp=temp2;
//     temp2=temp2->prev;
//     }
//     head=temp;
//     return head;
// } 

// void print(struct node*head)
// {
//     struct node*ptr=head;
//     while(ptr!=NULL)
//     {
//         printf("%d",ptr->data);
//         ptr=ptr->nest;
//     }
//     printf("\n");
// }

// int main()
// {
//     struct node*head=NULL;
//     head=add_to_empty(head,12);
//     head=add_to_empty(head,23);
//     head=add_to_empty(head,56);
//     printf("Before reversing the list \n");
//     print(head);
//     printf("After reversing the list \n");
//     head=reverse(head);
//     print(head);
//     return 0;
// }

#include<stdio.h>
#include<stdlib.h>

struct node {
    struct node *prev;
    int data;
    struct node *next;
};

struct node* add_to_empty(struct node* head, int data) {
    struct node* temp = malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;
    head = temp;
    return head;
}

struct node* add_at_end(struct node* head, int data) {
    struct node* temp = malloc(sizeof(struct node));
    struct node* tp;
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;
    tp = head;
    while (tp->next != NULL) {
        tp = tp->next;
    }
    tp->next = temp;
    temp->prev = tp;
    return head;
}

struct node* reverse(struct node* head) {
    struct node* temp = NULL;
    struct node* temp2 = head;
    while (temp2 != NULL) {
        temp = temp2->prev;
        temp2->prev = temp2->next;
        temp2->next = temp;
        temp2 = temp2->prev;
    }
    if (temp != NULL) {
        head = temp->prev;
    }
    return head;
}

void print(struct node* head) {
    struct node* ptr = head;
    while (ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

int main() {
    struct node* head = NULL;
    head = add_to_empty(head, 12);
    head = add_at_end(head, 23);
    head = add_at_end(head, 56);
    printf("Before reversing the list\n");
    print(head);
    printf("After reversing the list\n");
    head = reverse(head);
    print(head);
    return 0;
}
