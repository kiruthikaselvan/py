import java.io.*;
import java.util.*;
import java.Scanner;
public class substr{
public static void main(String args[]){
String str;
int co=0,1;
char a,b;
Scanner s=new Scanner(System.in);
str=s.nextline();
n=str.length();
for(i=0;i<n;i++)
{
a=str.charAt(i);
for(int j=i+1;j<n;j++)
{
  b=s.charAt(j);
  if(a==b)
  {
    co=co+1;
  }
}
}
System.out.println(co);
}
}






