import java.util.*;
class While6
{
public static void main(String args[])
{

int n = 1234, r = 0, d;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");

n = sc.nextInt();

while(n != 0)
{

d = n % 10;
r = r * 10 + d;
n /= 10;

}

System.out.println("Reversed number:" +r);

sc.close();

}
}