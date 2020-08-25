public class sum {
public static void main (String args[])
{
sum.add(20);
System.out.println(sum.fact(0));

int [] numbers = {9,-2,5,4,-10,34,45,3,4};
System.out.println("min " + sum.FindMin(numbers));
System.out.println("max " + sum.FindMax(numbers));
System.out.println("average " + sum.avg(numbers));
}
   public static void add(int n)
   {
   int sum = 0;
   for(int i= 0 ; i<=n ;i++)
   {
   sum = sum + n;
   }
   System.out.println(sum);
   }
   
   public static int fact(int n )
   {
   if(n==0)
   return 1;
   else
   return fact(n-1)*n;
   }
   
   
   public static int FindMin(int [] arr)
   {
   int min = arr[0];
   for(int i = 0; i < arr.length ; i++)
   {
   if(arr[i] < min)
   {
   min = arr[i];
   }
   }
   return min;
   }
   
   public static int FindMax(int [] arr)
   {
   int max = arr[0];
   for(int i = 0; i < arr.length ; i++)
   {
   if(arr[i] > max)
   {
   max = arr[i];
   }
   }
   return max;
   }
   
   public static double avg(int [] n)
   {
   int sum = 0;
   for(int i = 0 ; i < n.length ; i++)
   {
   sum = sum + n[i];
   }
   return sum/n.length;
   }
}

//Write a function that computes the factorial value
//Definition: n! = n*(n-1)! , where 0! = 1
//1! = 1
//2! = 2 * 1! = 2 * 1
//3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
//4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
//Hint: use the recursive method that was used to calculate Fibonnaci number


//public static int fac(int n) {
//if (n==0) {
   // return 1;}
//else if (n==1){
   // return 1;}
//return (n*fac(n-1));