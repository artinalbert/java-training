public class TreeNode
{
   Object info;
   TreeNode left;
   TreeNode right;
   public TreeNode (){}
   public TreeNode (Object ob)
   {
      info = ob;
      left = null;
      right = null;
   }
   //************
   public boolean insertNode(Object item)
   {
      if(item.toString().compareTo(info.toString()) == 0)
         return false;
      else if(item.toString().compareTo(info.toString()) < 0)
         //target key < root key
         if(left == null)
         {
            left = new TreeNode(item);
            return true;
         }
         else{
            return left.insertNode(item);
         }
         //target key > root key
      else if(right == null)
      {
         right = new TreeNode(item);
         return true;
      }
      else   //insert in right subtree
         return right.insertNode(item);
   }//end of insertNode
}

            
