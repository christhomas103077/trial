import java.util.Scanner; 
public class Binary_Search { 
int arr[]=new int[10]; 
//Binary search 
void b_search(int i , int j,int num) 
{ 
if(i > j) //possible positions of array checked, 
element not found 
{ 
System.out.println("ELEMENT NOT PRESENT IN ARRAY\n"); 
return; 
} 
int mid = (i+j)/2; 
if(num==arr[mid]) //element found as middle element of 
array 
{ System.out.print("ELEMENT PRESENT IN ARRAY AT POSITION "+ 
(mid+1)); 
return; } 
else if(num < arr[mid]) //element to be searched lesser than 
middle element of array 
{ b_search(i,mid-1,num); } 
else if(num > arr[(i+j)/2]) //element to be searched greater than 
middle element of array 
{ b_search(mid+1,j,num); } } 
public void create(int n) { 
Scanner in=new Scanner(System.in); 
System.out.print("Enter elements:\n"); 
for(int i=0;i<n;i++) 
arr[i]=in.nextInt(); 
} 
public void display(int n) { 
for(int i=0;i<n;i++) 
System.out.print(arr[i]+"\t"); 
} 
public static void main(String[] args) {int n,num; 
Scanner in=new Scanner(System.in); 
Binary_Search obj=new Binary_Search(); 
System.out.print("Enter limit: "); 
n=in.nextInt(); 
obj.create(n); 
System.out.print("Enter element to be searched in array: "); 
num=in.nextInt(); 
obj.b_search(0,n-1,num); 
}}
