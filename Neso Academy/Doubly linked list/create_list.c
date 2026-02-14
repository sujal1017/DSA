#include <stdio.h>
#include <stdlib.h>

struct node {
    struct node *prev;
    int data;
    struct node *next; // Corrected typo
};

struct node *add_to_empty(struct node *head, int data) {
    struct node *temp = malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;
    head = temp;
    return head;
}

struct node *add_at_end(struct node *head, int data) {
    struct node *temp, *tp;
    temp = malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;
    if (head == NULL) {
        head = temp;
    } else {
        tp = head;
        while (tp->next != NULL) {
            tp = tp->next;
        }
        tp->next = temp;
        temp->prev = tp;
    }
    return head;
}

struct node *create_list(struct node *head) {
    int data, n, i;
    printf("Enter the number of nodes\n");
    scanf("%d", &n);
    if (n == 0)
        return head;
    printf("Enter the element for node 1\n");
    scanf("%d", &data);
    head = add_to_empty(head, data);
    for (i = 1; i < n; i++) {
        printf("Enter the element for node %d\n", i + 1);
        scanf("%d", &data);
        head = add_at_end(head, data);
    }
    return head;
}

int main() {
    struct node *head = NULL, *ptr;
    head = create_list(head);

    ptr = head;
    while (ptr != NULL) { // Corrected the loop condition
        printf("%d\n", ptr->data);
        ptr = ptr->next;
    }
    return 0;
}
