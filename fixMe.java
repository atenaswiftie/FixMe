package myapplication;

import java.awt.*;
public class MyApplication {
static final String startStr="\n****start of the program****";
final String endStr="\n****end of the program****";
public static void  main(String []arg){
		printMessage(startStr);
		Square s=new Square(100);
		System.out.println(s.computePerimeter());
		System.out.println(s.computeSurface());
		Point p1=new Point(10,10);
		Point p2=new Point(10,10);
		ColorPoint cp1=new ColorPoint(1,1);
		
		
		p1=cp1;
	MyApplication myA=new MyApplication();
		
		myA.printMessage(myA.endStr);
}//main Method
private static void printMessage(String str)
{
	System.out.println(str);
}
////////////////////////////////
 class Square {
	public Square(int init_x){x=init_x;}
	public int computeSurface(){return x**x;}
	public int computePerimeter(){return 4*x;}
	private int x;
}//square
}//myApplication
class Point{
	public Point(int init_x,int init_y){
		x=init_x;
		y=init_y;
	}
	public void move(int init_x,int init_y){
		x+=init_x;
		y+=init_y;
	}
	protected int x,y;
}//point
class ColorPoint extends Point{
	public ColorPoint(int init_x,int init_y){
		super(init_x,init_y);
		color=Color.Blue;
	}
	Color color;
}//ColorPoint
