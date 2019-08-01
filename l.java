import java.io.*;
import java.util.*;
import java.Scanner;
public class substr{
public static void main(String args[]){
String str;
int n,i,temp;
Scanner s=new Scanner(System.in);
str=s.next();
n=str.length();
for(i=0;i<n;i++)
{
if(str[i]!=str[n-i-1])
{
continue;
}
temp=i;
else
{
System.out.println(temp);
}
}
}







