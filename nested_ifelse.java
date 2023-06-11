public class nested_ifelse
{
public static void main(String args[])
{
int a=20,b=10,c=45;
if(a>=b)
{
if(a>=c)
{
System.out.print("maximum is:"+a);
}
else
{
System.out.print("Maximum is:"+c);
}
}
else
{
if(b>=c)
{
System.out.print("Maximum is:"+a);
}
else
{
System.out.print("maximum is:"+b);
}
}
}
}