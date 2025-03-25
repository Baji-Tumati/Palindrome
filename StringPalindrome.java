package Interview;
import java.util.Scanner;
public class StringPalindrome 
{
    public static void main(String[] args) 
    {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter String:");
	  String str=s.next();
	  boolean b=true;
	  for(int i=0;i<str.length()/2;i++)
	  {
		  if(str.charAt(i)!=str.charAt(str.length()-i-1))
		  {
			  b=false;
			  break;
		  }
	  }
	  if(b)
	  {
		  System.out.println(str+" Is Palindrome");
	  }
	  else
	  {
		  System.out.println(str+" Is Not a Palindrome");
	  }
	}
}
