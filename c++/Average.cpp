#include<stdio.h>
	int main()
	{int a[10],i,sum;
	float avg;
	printf ("enter 10 numbers\n");
	for (i=0;i<=9;i++)
	scanf("%d",&a[i]);
	for (i=0;i<=9;i++)
	sum=sum+a[i];
	avg=sum/10;
	printf ("average value is %f",avg);
	}
