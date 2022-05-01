import java.util.*;
public class StringInverse
{
   static Scanner console = new Scanner(System.in);
   public void readStringStack(StackList s) throws Exception
   {
      System.out.print("Enter a string or * to end : ");
      String next = console.next();
      while(!next.trim().equals("*"))
      {
         s.push(next);
         System.out.print("Enter a string or * to end : ");
         next = console.next();
      }
   }
   //****
   public void showStringStack() throws Exception
   {
      StackList s = new StackList();
      readStringStack(s);
      //pop each string and display it
      System.out.println("Strings in reverse order : ");
      while(!s.isEmpty())
      {
         String next = (String) s.pop();
         System.out.println(next);
      }
   }
}

