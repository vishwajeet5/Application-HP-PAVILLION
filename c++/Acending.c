#include<stdio.h>
int main ()
{
	int a[2],i,j,temp;
	printf("Enter the array element- ");
	/*scanf("%d",&a);
	printf("Enter the element:\n");
	*/for(i=0;i<2;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<2;i++)
	{
		for(j=i+1;j<2;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	printf("Array elements : ");
	for (i=0;i<2;i++)
	{
		printf("%d ",&a[i]);
	}
}