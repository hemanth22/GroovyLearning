import java.util.Scanner;
import java.util.logging.Logger;
class Add
{
public static void main(String[] arg)
{
int a;
int b;
int c;
Scanner sc=new Scanner(System.in);
logger.log("Enter first number");
a=sc.nextInt();
logger.log("Enter second number");
b=sc.nextInt();
c=addition(a,b);
System.out.println(" Addition of two numbers is : "+c);
}
static int addition(int x,int y)
{
	return x+y;
}
}
