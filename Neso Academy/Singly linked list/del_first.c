#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *link;
};

// Function to delete the first node
struct node* del_first(struct node *head) {
    if (head == NULL) {
        return NULL;
    }
    struct node *temp = head;
    head = head->link;
    free(temp);
    return head;
}

int main() {
    // Create the linked list
    struct node *head = malloc(sizeof(struct node));
    head->data = 12;
    head->link = NULL;

    struct node *second = malloc(sizeof(struct node));
    second->data = 23;
    second->link = NULL;
    head->link = second;

    struct node *third = malloc(sizeof(struct node));
    third->data = 34;
    third->link = NULL;
    second->link = third;

    // Delete the first node
    head = del_first(head);

    // Print the linked list
    struct node *ptr = head;
    while (ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");

    return 0;
}

