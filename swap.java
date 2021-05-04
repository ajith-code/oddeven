import java.io.*;
import java.util.Scanner;
class swap{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int b,a;
System.out.println("enter your a value");
a=c.nextInt();
System.out.println("enter your b value");
b=c.nextInt();
budget wer=new budget();
wer.general(a,b);
}
}
class budget{
void general(int d,int e)
{
d=d+e;
e=d-e;
d=d-e;
System.out.println("value of a is "+ d +"\nvalue of b is "+ e);

}
}