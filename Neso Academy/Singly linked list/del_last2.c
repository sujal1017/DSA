#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node *link;
};

struct node* del_last(struct node *head) {
    if (head == NULL) {
        printf("List is already empty!\n");
        return NULL;
    }
    if (head->link == NULL) {
        free(head);
        return NULL;
    }
    struct node *temp = head;
    while(temp->link->link!=NULL)
    {
        temp=temp->link;
    }
    free(temp->link);
    temp->link=NULL;
    return head;
                                
}

int main() {
    struct node *head = malloc(sizeof(struct node));
    head->data = 12;
    head->link = NULL;

    struct node *second = malloc(sizeof(struct node));
    second->data = 67;
    second->link = NULL;
    head->link = second;

    struct node *third = malloc(sizeof(struct node));
    third->data = 45;
    third->link = NULL;
    second->link = third;

    head = del_last(head);
    struct node *ptr = head;
    while (ptr != NULL) {
        printf("%d\n", ptr->data);
        ptr = ptr->link;
    }
    return 0;
}
