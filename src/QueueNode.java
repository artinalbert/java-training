public class QueueNode
{
  Object info;
  QueueNode link;
  public QueueNode(){}
  public QueueNode(Object ob)
  {
     info = ob;
     link = null;
  }
  public QueueNode(Object ob, QueueNode lnk)
  {
     info = ob;
     link = lnk;
  }
}


