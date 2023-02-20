#include<stdio.h>
void linear(int array[],int size,int num){
    int i;
    for (  i = 0; i < size; i++)
    {
        if(array[i]==num)
            printf("%d found at %d",num,i);
    }
    if(i==size)
        printf("%d is not in the array: ",num);
    }

int main(){
    int size,search_no;
    printf("Enter size of the array: ");
    scanf("%d",&size);
    int array[size];
    for(int i=0;i<size;i++){
        printf("Enter %d th element: ",i);
        scanf("%d",&array[i]);
    }
    printf("Enter number to be searched for: ");
    scanf("%d",&search_no);
    linear(array,size,search_no);
}