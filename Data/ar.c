#include<stdio.h>
#include<stdlib.h>
int tree[100];
int largerst =0;
int size =1;

void buildtree(int i,int item)
{
	int c,n;
	if(tree[i]==0)
	{
		tree[i] = item;
	}
	printf("does %d has left sub tree enter (1/0)",item);
	scanf("%d",&c);
	if(c==1)
	{
		printf("\nEnter the element\n ");
		scanf("%d",&n);		
		buildtree(2*i,n);
	}
	printf("doed %d has right sub tree enter (1/0)",item);
	scanf("%d",&c);
	if(c==1)
	{
		printf("\nEnter the element\n ");
		scanf("%d",&n);		
		buildtree((2*i)+1,n);
	}
}

void insert(int item)
{
	int i,choice;
	int flag;
	int parent;
	int child;
	printf("\n Enter the parent  :  ");
	scanf("%d",&parent);
	for(i=1;i<=100;i++)
	{	if(tree[i] == parent)
		{
			if(tree[i*2]!=0&&tree[(i*2)+1] !=0)
		    	printf("\n Both the parents have children\n");
			else{
                while (flag)
                {
                    printf("Left or Right child (1/0");
                    scanf("%d",&choice);
                    if(choice){
                        if(tree[i*2]==0){
                            tree[i*2]=item;
                            flag=0;
                        }
                        else   
                            printf("Left node is not empty");
                    }
                    else{
                        if(tree[(i*2)+1]==0){
                            tree[(i*2)+1]=item;
                            flag=0;
                        }
                        else   
                            printf("Right node is not empty");
                    }
                    if(size<i*2)
                        size=size*2+1;
                }
                
            }
        }
    }
	
}


void delete(int item)
{
	int flag = 0;
	int i;
	for(i=1;i<=100&&flag !=1;i++)
	{
		if(tree[i] == item)
		{
			if(tree[i*2] == 0 && tree[(i*2)+1] == 0 )
			{
				tree[i] = 0;
				printf("\n Node %d has been deleted successfully\n",item);
			}
			else{
	    		printf("\n Element is not a leaf node\n");
		    	flag =1;
            }

		}
	}
	if(flag == 0)
	{
		printf("\n item not found \n");
	}
	return;
}

void inorder(int x)
{
	int parent = x;
	if(tree[1] == 0)
	printf("Tree is empty");
	else if(tree[parent]!=0)
	{
		inorder(parent*2);
		printf("%d\t",tree[parent]);
		inorder((parent*2)+1);
	}
}

void preorder(int x)
{
	int parent = x;
	if(tree[1] == 0)
	printf("Tree is empty");
	else if(tree[parent]!=0)
	{
		printf("%d\t",tree[parent]);
		preorder(parent*2);
		preorder((parent*2)+1);
	}
}
void postorder(int x)
{
	int parent = x;
	if(tree[1] == 0)
	printf("Tree is empty");
	else if(tree[parent]!=0)
	{
		postorder(parent*2);
		postorder((parent*2)+1);
		printf("%d\t",tree[parent]);
	}
}

int main()
{
	int n,v,num,j;
	printf("\tBUILD TREE \nEnter the root  -  ");
	scanf("%d",&j);
	buildtree(1,j);
	do
	
	{
	printf("\n1.INSERTION \n2.INORDER TRAVERSAL\n3.PREORDER TRAVERSAL\n4.POSTOREDER TRAVERSAL\n5.DELETION\n6.EXIT\n");
	scanf("%d",&n);
	switch(n)
	{
		case 1:
			printf("\nEnter the element to insert\n");
			scanf("%d",&num);
			insert(num);
			break;
		case 2:
			inorder(1);
			break;
		case 3:
			preorder(1);
			break;
		case 4:
			postorder(1);
			break;
		case 5:
			printf("\nEneter the element to delete\n");
			scanf("%d",&n);
			delete(n);
			break;
		case 6:
			printf("Programming aborting ........\n\n");
			break;
		
	};
	}while(n!= 6);
	return 0;
	
}