#include <stdio.h>

#include <stdlib.h>

#define SIZE 30
void enqueue(int, int);
void dequeue();
void display();
int front = -1;
int rear = -1;
struct p_queue {
    int element;
    int priority;
}
queue[SIZE];
void main() {
    int el;
    int prio;
    int choice;
    do {
        printf("• Enqueue[1]\n• Dequeue[2]\n• Display[3]\n• Exit[Any other number]\nEnter the choice: ");
        scanf("%d", & choice);
        switch (choice) {
        case (1):
            printf("Enter the number and priority to add to queue: ");
            scanf("%d%d", & el, & prio);
            enqueue(el, prio);
            break;
        case (2):
            dequeue();
            break;
        case (3):
            display();
            printf("\n");
            break;
        default:
            exit(0);
        }
    } while (1);
}
void enqueue(int el, int prio) {
    if (front=rear+1||rear == SIZE - 1) {
        printf("Queue is full\n");
    } else if (rear == -1 && front == -1) {
        rear = front = 0;
        queue[rear].element = el;
        queue[rear].priority = prio;
    } else {
        rear++;
        queue[rear].element = el;
        queue[rear].priority = prio;
    }
}
void dequeue() {
    if (front == -1 && rear == -1) {
        printf("Queue is empty\n");
    } else if (front == rear) {
        printf("Item is %d\n", queue[front].element);
        front = rear = -1;
    } else {
        int largest_index = 0;
        int largest = queue[front].priority;
        for (int i = front + 1; i <= rear; i++) {
            if (queue[i].priority > largest)
                largest = queue[i].priority;
            largest_index = i;
        }
        printf("Poped item is %d\n", queue[largest_index].element);
        for (int i = largest_index; i > front; i--) {
            queue[i].element = queue[i - 1].element;
            queue[i].priority = queue[i - 1].priority;
        }
        front++;
    }
}
void display() {
    for (int i = front; i <= rear; i++)
        printf("%d ", queue[i].element);
}