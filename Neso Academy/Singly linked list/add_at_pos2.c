#include<stdio.h>
// int add_at_pos
int main()
{
    int arr[]={1,2,3,4,5,6,7,8,9,1};
    int pos=5,data=69,i;
    int size=sizeof(arr)/sizeof(arr[0]);
    int arr2[size+1];
    add_at_pos(arr,arr2,size,data,pos);
    for(i=0;i<size+1;i++)
    printf("%d\n",arr2[i]);
}

int add_at_pos(int arr[], int arr2[], int n, int data, int pos)
{
    int index=pos-1,i;
    for(i=0;i<=index-1;i++)
    arr2[i]=arr[i];

    arr2[index]=data;
    int j;


    for(i=index+1,j=index;i<=n+1,j<=n;i++,j++)     //same same
    // for(i=5,j=4;i<=n+1,j<=n;i++,j++)
    arr2[i]=arr[j];

}