package shams;
import java.io.*;
import java.util.scanner;

class Encapsulate
 {
	private String studentname;
	private int studentrollno;
	private int studentage;
	
	public String getname()
	{ 
		return studentname;
	}
	public void setname(String studentname)
	{ 
		this.studentname=studentname;
	}
	public int getrollno()
	{ 
		return studentrollno;
	}
	public void setrollno(int studentrollno)
	{ 
		this.studentrollno=studentrollno;
		}
	public int getage()
	{ 
		return studentage;
	}
	public void setage(int studentage)
	{ 
		this.studentage=studentage;
		}
	public class Testencapsulation
	{
		public static void main(String args[])
		{
			Encapsulate ob= new Encapsulate();
			ob.setname("Sharma");
			ob.setrollno(46);
			ob.setage(22);
			
			System.out.println("My name is"+ ob.getname()+"my roll no is"+ ob.getrollno() +"My age is"+ ob.getage());
		}
	}
 }