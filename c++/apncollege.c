/*//operator
#include<stdio.h>
int main(){
    printf("%d", 5+2 / 2 * 3);
    return 0;
}*/

/*//divisible by 2
#include<stdio.h>
int main(){
    int a , c;
    printf("Enter the no.");
    scanf("%d",&a);
    c = a % 2;
    
     printf("The no. is divisible by 2 if the value comes 1 \n otherwise not divisible \n The value is .......%d......", c == 0);
}*/

/*//if else
#include <stdio.h>
int main()
{
    int age ;
    printf ("Enter your age = ");
    scanf("%d", &age);
if (age<18)
{
    printf("you are not adult");
}
    else
    {
        printf("you are adult");
    }
}*/


/*//ternary operator
#include <stdio.h>
int main()
{
    int age ;
    printf ("Enter your age = ");
    scanf("%d", &age);

    //sytex of ternary operator
    age > 18 ? printf("you are adult") : printf("you are not adult");

} */

/*//switch
#include<stdio.h>
int main (){
    int day;
        printf("enter the day no.(1-7)\n");
        scanf("%d", &day);
    switch (day){
    case 1 : printf("monday ");
            break;
    case 2 :printf("tuesday");
            break;
    case 3 :printf ("wednesday");
            break;
    case 4 :printf("thursday");
            break;
    case 5 :printf("friday");
            break;
    case 6 :printf("saturday");
            break;
    case 7 :printf("sunday");
            break;
}}*/

/*//for loop
#include<stdio.h>
int main(){
    for (int i = 1 ; i <= 5 ; i= i + 1){
    printf("hii\n");
    }}
    */

//for loop
/*#include<stdio.h>
int main(){
    for(int i=0; i<=10 ;i = i +1)
    {
        printf("%d \n",i);
    }
}*/

/*//function calling
#include<stdio.h>
void printhello(); // decleration prototype

int main(){
   printhello();
   return 0;
}    

void printhello (){
     printf("hello");
}*/