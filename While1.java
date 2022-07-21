import java.util.*;
class While1
{
public static void main(String args[])
{
int n = 1234;
int s = 0,p;

while (n>0)
{
p = n%10;
s = s+p;
n = n/10;
}

System.out.println("Sum of digit =" +s);
}
}