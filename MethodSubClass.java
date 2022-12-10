// greater value and smaller values or not 
import java.util.Scanner;
class Greater
{
	int m1(int x, int y)//method>> return type >>non_return and(void) return type(not declare void, declare like int ,flaot boolean etc..)
	{
		if (x>y)// for selection statements use if else condition for selecting 
		{
			System.out.println("in subclass method (1)");
			return x;
		}
		else
		{
			System.out.println("in subclass method (1)");
			return y;
		}

	}
}
class Smaller
	{ 
	int m2(int x, int y)
		{
		if (x<y)
		{
			System.out.println("in subclass method (2)(a)");
			return x;
			
		}
		else
			{
				System.out.println("in subclass method (2)(b)");
				return y;
			}
		}
}
class  GreatSmall
{
	public static void main(String[] args) 
	{
		System.out.println("main method step-1");
		Scanner sc =new Scanner(System.in);
		//crate class from javalib. and input from system
		System.out.println("Enter value x");// user input
		int x = sc.nextInt();//method belongs to object.
		System.out.println("Enter vlue y");
		int y =sc.nextInt();
		/*here we declare subclass craeate but if the values equals, so choose selection statements.
		Greater gr = new Greater();//create a class for subclass-1
		int h=gr.m1(x,y);//for method belongs subclass-1
		System.out.println("greater:"+h);
		Smaller sm =new Smaller();
		int l=sm.m2(x,y);
		System.out.println("smaller:"+l); here out only for greater and less value print only*/
		/*if (x>=0 && y>=0)// now i want check the values greater than 0 values.So i select here use selection(if ,if else..) statements.
		{*/
			if (x==y)
			{
				System.out.println("x and y values are same step-3(same)");
			}
			else
			{
				System.out.println("choose user choice");
				System.out.println("select here x1 or y1");//user input
				System.out.println("enter choice step-2");// already class created for javalib.
				int choice =sc.nextInt();
				//choice input store here by object declared here.
				switch (choice)//switch case used for multiple options choose one.
				{
				case 1: Greater gr = new Greater();// create class  for subclass-1
				int h = gr.m1(x,y);//the x or y value store, in systax declared with object from class i.e declare with method type 
				System.out.println("Greater value step-3(g):"+h);
				break;

				case 2: Smaller sl =new Smaller();//create a class for subclass-2
				int l=sl.m2(x,y);//it is already int so, which declared from method.
				System.out.println("smaller value step-3(s):"+l);
				break;// break is sued for stop here.

				default:
					System.out.println("invalid choice or out of choice you select step-3(invalid(default))");
				}// switch case end here.
			}
			
		}
	/*else// for values negative or any lessthanZero(<0) values Don't Declare
			{
				System.out.println("invalid or enter correct number greater than Zero ");

			}*/


	}(check for braces for which range values we want.)
