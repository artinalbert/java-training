public class StackList
{
  private StackNode top;
  public void push(Object item)
  {
    top = new StackNode(item, top);
  }
  //*******
  public Object pop()
  {
    StackNode oldTop = top;
    Object item = peek();
    top = top.link;
    oldTop.link = null;
    return item;
  }
  //*********
  public Object peek()
  {
     if(isEmpty())
         throw new NullPointerException();
     return top.info;
  }
  //********
  public boolean isEmpty()
  {
      return(top == null);
  }
}


