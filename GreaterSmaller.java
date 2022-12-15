// find greatest value in the two integer(user input at run time) and if the any given no. is negative return -1, if zero -2 and if positive return greater value in it.
import java.util.Scanner;
class Great
{
	int getGreater(int x,int y)
	{
		if (x<0 || y<0)// OR used any condition is ture it will return the value.
		{
			return -1;
		}
		else if(x==0 || y==0)
		{
			return -2;
		}
		else if (x>y)
		{
			return x;
		}
		else 
		{
			return y;
		}
	}
}
class Peak 
{
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("enter x value");
		int x =ob.nextInt();
		System.out.println("enter y value");
		int y =ob.nextInt();
		Great gr = new Great();
		int z =gr.getGreater(x,y);// method call
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
		System.out.println("z value is RETURN TYPE"+z);

	}
}
//find smallest  value in the two integer(user input at run time) and if the any given no. is negative return -1, if zero -2 and if positive return smaller value in it.
import java.util.Scanner;
class Small
{
	int getSmaller(int x,int y)
	{
		if (x<0 || y<0)
		{
			return -1;
		}
		else if(x==0 || y==0)
		{
			return -2;
		}
		else if (x<y)
		{
			return x ;
		}
		else 
		{
			return y;
		}
	}
}
class Peak1 
{
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("enter x value");
		int x =ob.nextInt();
		System.out.println("enter y value");
		int y =ob.nextInt();
		Small gr = new Small();
		int z =gr.getSmaller(x,y);
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
		System.out.println("z value is RETURN TYPE" +z);

	}
}
// By using the MATH LANGUAGE LIBRARY used.
import java.util.Scanner;
import java.lang.Math.*;
class Greatest
	{
    int k;
    int getGreatest(int m, int n)
		{
        if(m<0 || n<0){
            return k=-1;
        }
        else if(m==0 || n==0){
            return k=-2;
        }
        else
		{
            return k=Math.min(m,n);
        }
    }
}
public class GretestK
	{
    public static void main(String args[])
		{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number m:");
        int m=s.nextInt();
        System.out.println("Enter the number n:");
        int n=s.nextInt();
        Greatest gt=new Greatest();
        int v=gt.getGreatest(m,n);
        System.out.println("return type values is "+v);
        }
    }
 
