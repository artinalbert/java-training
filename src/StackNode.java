public class StackNode
{
   Object info;
   StackNode link;
   public StackNode(){}
   public StackNode(Object ob)
   {
      info = ob;
      link = null;
   }
   public StackNode(Object ob, StackNode lnk)
   {
      info = ob;
      link = lnk;
   }
}

