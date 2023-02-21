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
node *delete(node *root, int data)
{
    if (root == NULL) // if empty node, then return it;
        return root;
    else if (data < root->data)                  // if data less than current data
        root->left = delete(root->left, data);   // then search for it in left sub-tree
    else if (data > root->data)                  // else if data is greater than current data
        root->right = delete(root->right, data); // then search for it in right sub-tree

    else // once it reaches here, it means the current node is the node to be deleted
    {
        // case 1: Leaf node, No child
        if (root->left == NULL && root->right == NULL)
        {
            free(root);  // delete it
            root = NULL; // and set current value to null
        }
        // Case 2: Only one child
        else if (root->left == NULL || root->right==NULL) // only one child
        {
            node *temp = root; // current node
            if (root->left) // if left child
                root = root->left; // change link to that of left child
            else // else if right child
                root = root->right; // change link to that of right child
            free(temp);// and delete the current node
        }
        // Case 3: Both children
        else
        {
            node *temp = minValueNode(root->right);  // find minimum of right node (can also be replaced with FindMaximum(root->left))
            root->data = temp->data;                       // and set current node equal to that value
            root->right = delete(root->right, temp->data); // and delete that node
        }
    }
    return root;
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
    if(!Node)
        return;
    if(Node!=NULL){
        inorder(Node->left);
        printf("%d ",Node->data);
        inorder(Node->right);
    }
}

void preorder(node* Node){
    if(Node!=NULL){
        printf("%d ",Node->data);
        preorder(Node->left);
        preorder(Node->right);
    }
    return;
}

void postorder(node* Node){
    if(Node!=NULL){
        postorder(Node->left);
        postorder(Node->right);
        printf("%d ",Node->data);
    }
    return;
}

int main()
{
    int ch, data, queryData;
    do
    {
        printf("\n\n1.Insert\n2.Search\n3.Delete\n4.Display (Inorder)\n");
        printf("Enter choice: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter value to be inserted\n");
            scanf("%d", &data);
            insertion(&root, data);
            break;
        case 2:
            printf("\nEnter value to be searched\n");
            scanf("%d", &queryData);
            find(root,queryData);
            break;
        case 3:
            printf("\nEnter value to be deleted\n");
            scanf("%d", &queryData);
            root = delete(root, queryData);
            printf("\nElement deleted successfully (if it exists)");
            break;
        case 4:
            printf("\nBinary Search Tree Inorder\n");
            preorder(root);
        }
    } while (ch < 5);
}
