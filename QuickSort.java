import java.util.*; 
import java.util.Scanner; 
public class QuickSort { 
public void sort(int beg,int end,String arr[]) 
{ 
if (beg == end || beg == end+1) 
return; 
String pivot,temp; 
int i,j; 
pivot=arr[beg]; 
i=beg+1; 
j=end; 
while(i<j) 
{ 
while(pivot.compareTo(arr[i])>0 && i < end) 
i++; 
while(pivot.compareTo(arr[i])<0 && j > beg) 
j--; 
if(i<j) 
{ temp=arr[i]; 
arr[i]=arr[j]; 
arr[j]=temp; } } 
if(arr[i].compareTo(pivot)<0) 
{ 
temp = arr[beg]; 
arr[beg] = arr[j]; 
arr[j] = temp; 
} 
sort(beg,j-1,arr); 
sort(j+1,end,arr); 
} 
public static void main(String[] args) { 
int i,n; 
String arr[]=new String[10]; 
QuickSort obj=new QuickSort(); 
Scanner in=new Scanner(System.in); System.out.println("Enter limit:"); 
n=in.nextInt(); 
System.out.println("Enter elements:"); 
for(i=0;i<n;i++) 
arr[i]=in.next(); 
obj.sort(0,n-1,arr); 
System.out.println("Sorted Array:"); 
for(i=0;i<n;i++) 
System.out.print(arr[i]+" "); 
} }
