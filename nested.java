import java.util.*;
class nested
{
public static void main (String args[])
{
int a;
Scanner sc = new  Scanner(System.in);
System.out.println(" Enter any number");
a = sc.nextInt();

if (a>0)
{
if (a%2 == 0)


{
System.out.println("No is even and positive");
}
else
{
System.out.println("No odd and positive");
}
}
else
{
if (a%2 == 0)
{
System.out.println(" No even and negitive");
}
else
{
System.out.println(" No odd and negitive");
}
}
}
}
