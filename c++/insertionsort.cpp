//int insertionsort(int a[],int n)
#include<stdio.h>
int main ()
{
	int i,j,n,k,a[100],item;
	printf ("enter the element\n");
	scanf("%d",&n);
	printf ("enter %d number :\n",n);
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	for (i=0;i<n;i++)
	{
	    item=a[i];
		for (j=i-1;j>=0 && item<a[j];j--)
		a[j+1]=a[j];
		a[j+1]=item;
	}
	printf("order element");
	for(k=0;k<n;k++)
	printf("\t%d",a[k]);
	printf("\n");
}
