public class SearchTree
{
  private TreeNode root;
  //insert item into binary tree
  public boolean insert(Object item)
  {
    if(isEmpty())
    {
       root = new TreeNode(item);
       return true;
    }
    else
       return root.insertNode(item);
  }
  //**********
  public boolean isEmpty()
  {
     return (root == null);
  }
  //***************
  public boolean search(Object target)
  {
     return search(root, target);
  }
  //***********
  private boolean search(TreeNode root, Object target)
  {
     if(isEmpty())
        return false;
     else if(target.toString().compareTo(root.info.toString()) < 0)
        //target key < root key
        if(root.left == null)
            return false; //left subtree empty
        else
            return search(root.left, target);
        //target key > root key
        else if(root.right == null)
            return false;
        else //search right
            return search(root.right, target);

  }
  //******
  public void  display()
  {
     display(root);
  }
  //*************
  private void display(TreeNode root)
  {
     if (!isEmpty())
     {
        //display left subtree
        if(root.left != null)
             display(root.left);
         //display root key
         System.out.println((root.info).toString());
         //display right suntree
         if(root.right != null)
            display(root.right);
      }
  }
}

