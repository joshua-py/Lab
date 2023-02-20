#include<stdio.h>
#include<stdlib.h>  
#include<string.h>
#define MAX 100

char stack[MAX];
char infix[MAX],postfix[MAX];
int top=-1;
int isEmpty() {
   if(top == -1)
      return 1;
   else
      return 0;
}
char pop() 
{
   char key;
   if(isEmpty()) {
      key = stack[top];
      top = top-1;   
      return key;
   } 
   else {
      printf("No data found, Stack is already empty.\n");
   }
}
void push(char key) {
   if(top!=MAX-1) {
      top = top+1;   
      stack[top] = key;
   } else {
      printf("Stack is already full.\n");
   }
}
int precedence(char symbol){
    switch (symbol)
    {
    case '+':
    case '-':
            return 1;break;
    case '*':
    case '/':
        return 2;break;
    case '^':
        return 3;break;
    default:
        return 0;
    }

}
void infixtopostfix(){
    char symbol,next;
    int j=0;
    for(int i=0;i<strlen(infix);i++){
        symbol=infix[i];
        switch(symbol){
            case '(':
                push(symbol);
                break;
            case ')':
                while((next=pop())!='(')
                    postfix[j++] = next;
                break;                        
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                while (!isEmpty() && precedence(stack[top])>=precedence(symbol))
                    postfix[j++]=pop();
                push(symbol);break;
            default:
                postfix[j++]=symbol;

        }
    
        
    }    
    while (!isEmpty())
        postfix[j++]=pop();
    postfix[j]='\0';
}
int main(){
    char str[MAX];
    printf("Enter your expression: ");
    scanf(" %s",str);
    infixtopostfix();
    for(int i=0;i<6;i++)
        printf("%c",postfix[i]);
        printf("sdfaaaaaaaaaaaaaaaaaaaaaa\n\n\n");
    return 0;
}