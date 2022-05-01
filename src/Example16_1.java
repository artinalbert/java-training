import java.util.*;                                    //Line 1
public class Example16_1
{
	static Scanner console = new Scanner(System.in);
	private static ListNode head;   //reference to first node
	public static void main(String[] args) throws Exception
	{
	      buildTestList();
	      System.out.println("The content of list is : ");
	      traverse(head);
	}
	  //***********
	  public static void buildTestList() throws Exception
	  {
	     head = new ListNode();
	     head = null;
	     ListNode last  = new ListNode();
	     String str = new String();
	     System.out.print("Enter a name : ");
	     str = console.next();
	     while(!(str.trim().equals("stop")))
	     {
	        ListNode node  = new ListNode();
	        node.info = str;
	        node.link = null;
	        if(head == null)
	        {
	           head = node;
	           last = node;
	        }
	        else {
	           last.link = node;
	           last = node;
	        }   
	        System.out.print("Enter a name : ");
	        str = console.next();
	     } 
	  }
	  //**********
	  public static void traverse(ListNode next)
	  {
	     if(next != null)
	     {
	        System.out.println(next.info);
	        traverse(next.link);
	     }
	  }
}
