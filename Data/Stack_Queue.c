#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
int a[SIZE];
int top=-1;
int front=-1,rear=-1;
void clear_array(){
    for(int i=0;i<SIZE;i++){
        a[i]='\0';
    }
}
void push(int data){
    if(top==SIZE-1)
        printf("\nStack Full\n");
    else{
        a[++top]=data;
    }
}
void pop(){
    if(top==-1)
        printf("\nStack empty\n");
    else{
        printf("Popped element is %d\n",a[top--]);
    }
}
void stack_display(){
    
    if(top>=0)
    {
        for(int i=top;i>=0; i--)
            printf("\n%d",a[i]);
    }
    else
        printf("\n The STACK is empty");
    printf("\n");
}

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

void queue_display() {
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
    int outer_choice=0,inner_choice=0,data;
    while (outer_choice!=3){
    printf("\n 1:Stack\n 2:Queue\n 3:Exit\nEnter your choice: ");
    scanf("%d",&outer_choice);
        if(outer_choice==1){
            clear_array();
            while (inner_choice!=4)
            {
            printf(" 1:PUSH\n 2:POP\n 3:DISPLAY\n 4:EXIT\nEnter your choice: ");
            scanf("%d",&inner_choice);
                switch (inner_choice)
                {
                case 1:
                    printf("Enter your element: ");
                    scanf("%d",&data);
                    push(data);
                    break;
                case 2:
                    pop();
                    break;
                
                case 3:
                    stack_display();
                    break;
                
                case 4:
                    printf("Exiting..");
                    outer_choice=4;
                    break;
                default:
                    break;
                }
            }
        }
        else if(outer_choice==2){
            clear_array();
            inner_choice=0;
            while (inner_choice!=4)
            {
            printf(" 1:ENQUEUE\n 2:DEQUEUE\n 3:DISPLAY\n 4:EXIT\nEnter your choice: ");
            scanf("%d",&inner_choice);
                switch (inner_choice)
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
                    queue_display();
                    break;
                
                case 4:
                    printf("Exiting..");
                    outer_choice=4;
                    break ;
                default:
                    break;
                }
            }
        }
        else
            printf("Enter valid choice: ");
    }
    
        
}

