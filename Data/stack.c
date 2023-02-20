#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
int a[SIZE];
int top=-1;
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
void display(){
    
    if(top>=0)
    {
        for(int i=top;i>=0; i--)
            printf("\n%d",a[i]);
    }
    else
        printf("\n The STACK is empty");
    printf("\n");
}
int main(){
    int choice=0,data;
    while (choice!=4)
    {
    printf(" 1:PUSH\n 2:POP\n 3:DISPLAY\n 4:EXIT\nEnter your choice: ");
    scanf("%d",&choice);
        switch (choice)
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