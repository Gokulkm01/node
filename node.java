import java.util.*;
class node
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String h=sc.next();
String j[]=h.split("/ \");
int sum=0;
for(int i=0;i<j.length;i++)
{
for(int k=0;k<j[i].length();k++)
{
int t[k]=Integer.parseInt(String.valueOf(j[i].charAt(k)));
}
Arrays.sort(t);
sum=sum+t[t.length-1];
}
System.out.println(sum);
}
}
