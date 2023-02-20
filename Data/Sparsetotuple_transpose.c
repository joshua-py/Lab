#include<stdio.h>
#include<stdlib.h>
int main(){
    int r,c,i,j,k=1;
    printf("Enter number of rows and coloumns: ");
    scanf("%d%d",&r,&c);
    int a[r][c];
    int tuple[20][3];
    for (i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
                printf("Enter element for [%d][%d] :",i,j);
                scanf("%d",&a[i][j]);
        }
        
    }
    printf("The Sparse Matrix\n");
    for (i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
                printf(" %d",a[i][j]);
        }
        printf("\n");
    }
    for (i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
                if(a[i][j]!=0){
                    tuple[k][0]=i;
                    tuple[k][1]=j;
                    tuple[k][2]=a[i][j];
                    k++;
                }
        }
    }
     tuple[0][0]=r;
    tuple[0][1]=c;
    tuple[0][2]=k-1;
    printf("The Tuple Matrix \n");
    for (i = 0; i <=tuple[0][2]; i++)
    {
        for ( j = 0; j < 3; j++)
        {
                printf(" %d",tuple[i][j]);
        }
        printf("\n");
    }
   
    return 0;

}