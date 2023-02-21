#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct nd
{
    char Name[10];
    int Number,Marks;
    struct nd * next;
}node;
node * head=NULL;

void insert(node ** head){
    char Name[10];
    int Number,Marks;
    node * new = malloc(sizeof(node));
    printf(" Enter the name: ");
    scanf("%s",Name);
    
    printf(" Enter Number: ");
    scanf("%d",&Number);
    
    printf(" Enter Marks: ");
    scanf("%d",&Marks);
    strcpy(new->Name,Name);
    new->Number=Number;
    new->Marks=Marks;

    if(!(*head)){
        (*head) = new;
        return ;
    }
    new->next = *head;
    *head = new;
}
void delete( )
{
    if(head==NULL){
        printf("Empty");
        return;
    }

    node *prev, *cur;
    char key[10];
   
    printf("Enter name to be deleted: ");
    scanf("%s",key);
   
    while (head != NULL && strcmp(head->Name,key)==0)
    {
        // Get reference of head node
        prev = head;

        // Adjust head node link
        head = head->next;

        // Delete prev since it contains reference to head node
        free(prev);
        printf("Deleted %s succesfully",key);
        // No need to delete further
        return;
    }

    if(!head){
        printf("Name not found\n");
    }
    prev = NULL;
    cur  = head;

    // /* For each node in the list */
    while (cur != NULL)
    {
        // Current node contains key
        if (strcmp(cur->Name,key)==0)
        {
            // Adjust links for previous node
            if (prev != NULL) 
                prev->next = cur->next;

            // Delete current node
            free(cur);
            printf("Deleted %s succesfully",key);

            // No need to delete further
            return;
        } 

        prev = cur;
        cur = cur->next;
    }
    if(head->next==NULL || cur==NULL){
        printf("Name not found: ");
    }
}
void display(){
    node * temp=head;
    if(!temp){
        printf("Empty database: ");
        return;
    }
    while (temp)
    {
        printf("Name: %s\tNumber: %d\tMark: %d\n",temp->Name,temp->Number,temp->Marks);
        temp=temp->next;
    }
    
    
}
int main(){
    int choice=0;
    while (choice!=4)
    {
        printf("\n 1:Insert\n 2:Delete\n 3:Display\n 4:Exit\nEnter your choice: ");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            insert(&head);
            break;
        case 2: 
            delete();
            break;
        case 3:
            display();
            break;
        default:
            break;
        }
    }
    
    
    return 0;
}