#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
int a[SIZE];
int front=-1,rear=-1;

void enqueue(int value) {
  if (rear == SIZE - 1)
    printf("\nQueue is Full!!");
  else {
    if (front == -1)
      front = 0;
    rear++;
    a[rear] = value;
  }
}

void dequeue() {
  if (front == -1)
    printf("\nQueue is Empty!!");
  else {
    printf("\nDeleted : %d\n", a[front]);
    front++;
    if (front > rear)
      front = rear = -1;
  }
}

void display() {
  if (rear == -1)
    printf("\nQueue is Empty!!!");
  else {
    int i;
    printf("\nQueue elements are:\n");
    for (i = front; i <= rear; i++)
      printf("%d  ", a[i]);
  }
  printf("\n");
}
int main(){
    int choice=0,data;
    while (choice!=4)
    {
    printf(" 1:ENQUEUE\n 2:DEQUEUE\n 3:DISPLAY\n 4:EXIT\nEnter your choice: ");
    scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            printf("Enter your element: ");
            scanf("%d",&data);
            enqueue(data);
            break;
        case 2:
            dequeue();
            break;
        
        case 3:
            display();
            break;
        
        case 4:
            printf("Exiting..");
            exit(0);
            break;
        default:
            break;
        }
    }
}
