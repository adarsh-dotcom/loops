import java.util.*;
class While2
{
public static void main(String args[])
{
int p, n, x;
int s = 0;



Scanner sc = new Scanner(System.in);
System.out.println("Enter a armstrong no");

n = sc.nextInt();


x = n;

while (n>0)
{
p = n%10;
s = s + (p*p*p);
n = n/10;
}

if(x==s)
{
System.out.println("no is armstrong");
}
else
{
System.out.println("no is not armstrong");

}
sc.close();

}
}