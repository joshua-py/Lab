#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *left,*right;
};
struct node* root = NULL;
struct node* createnode( int data){
    struct node* temp=(struct node*)malloc(sizeof(struct node));
    temp->data=data;
    temp->left=temp->right=NULL;
    return temp;
}
void insert(struct node ** Node,int data){
    if((*Node)==NULL)
        *Node=createnode(data);
    else if(data < (*Node)->data)
        insert(&(*Node)->left,data);
    else if(data > (*Node)->data)
        insert(&(*Node)->right,data);
}
void inorder(struct node* Node){
    if(Node!=NULL){
        inorder(Node->left);
        printf("%d ",Node->data);
        inorder(Node->left);
    }
    return;
}
int main()
{
    int data,c;
    while(1)
    {
        printf("choose\n");
        printf("1)insert\n");
        printf("2)traverse\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1:
                while(1){
                    printf("enter your data");
                    scanf("%d",&data);
                    insert(&root,data);
                    printf("continue insertion?\n(0/1)");
                    scanf("%d",&c);
                }
                if(!c)
                {
                    break;
                }
                break;
            case 2:
                printf("inorder traversal\n");
                inorder(root);
                printf("\n");
            default:
                printf("enter a vaild option");
                break;
        }
    }
    return 0;
}