import java.util.*;
class While4
{
public static void main(String args[])
{
int n   ;
int s = 0,p,x;



Scanner sc = new Scanner(System.in);
System.out.println("Enter a Palindrom no");

n = sc.nextInt();


x = n;

while (n>0)
{
p = n%10;
s = s*10+p;
n = n/10;
}

if(x==s)
{
System.out.println("no is palindrom");
}
else
{
System.out.println("no is not palindrom");

}
sc.close();
}
}
