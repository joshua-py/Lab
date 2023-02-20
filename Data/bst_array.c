#include<stdio.h>
#include<stdlib.h>
typedef struct nd {
    int data;
    struct nd *left,*right;
}node;

node * root=NULL;

node * createNode(int data){
    node * new=(node*)malloc(sizeof(node));
    new->data=data;
    new->left=new->right=NULL;
    return new;
}

void insertion(node ** Node,int data){
    if((*Node)==NULL)
        *Node=createNode(data);
    else if(data < (*Node)->data)
        insertion(&(*Node)->left,data);
    else if(data > (*Node)->data)
        insertion(&(*Node)->right,data);
}

node * minValueNode(node * Node){
    node * current =Node;
    while (current && current->left!=NULL)
        current=current->left;
    return current;    
}

node * delete(node * ptr,int data){
    if(ptr==NULL)
        return ptr;
    if(data<ptr->data)
        delete(ptr->left,data);
    else if (data>ptr->data)
        delete(ptr->right,data);
    else{
        if(ptr->left==NULL){
            node* temp=ptr->right;
            free(ptr);
            return temp;
        }

        else if(ptr->right==NULL){
            node* temp=ptr->left;
            free(ptr);
            return temp;
        }

        node * temp=minValueNode(ptr->right);
        ptr->data=temp->data;
        ptr->right=delete(ptr->right,temp->data);
    }
    return ptr;
}


void find(node * Node,int data){
    if(!Node)
        return;
    else if (data<Node->data)
        find(Node->left,data);
    else if (Node->data<data)
        find(Node->right,data);
    else    
        printf("%d is present : ",Node->data);
    return;
}
void inorder(node* Node){
    if(Node!=NULL){
        inorder(Node->left);
        printf("%d ",Node->data);
        inorder(Node->left);
    }
    return;
}

void preorder(node* Node){
    if(Node!=NULL){
        printf("%d ",Node->data);
        preorder(Node->left);
        preorder(Node->left);
    }
    return;
}

void postorder(node* Node){
    if(Node!=NULL){
        postorder(Node->left);
        postorder(Node->left);
        printf("%d ",Node->data);
    }
    return;
}