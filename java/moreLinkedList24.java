import java.util.*;

public class moreLinkedList24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int[] arr = {1, 2, 2, 3, 3, 4};
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        Arrays.sort(arr);
        Arrays.toString(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
        System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}


/*import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
      if(head == null || head.next  == null){
          return head;
      }
      else{
          Node current = head;
          while (current.next != null){
              if(current.data == current.next.data){
                  current.next = current.next.next;
              }else{
                  current = current.next;
              }
          }
          return head;
      }

    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    } */