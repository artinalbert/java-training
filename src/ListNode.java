public class ListNode
{
  String info;
  ListNode link;
  public ListNode()
  {
    info = " ";
    link = null;
  }
  public ListNode(String s)
  {
    info = s;
    link = null;
  }
  public ListNode(String s, ListNode lnk)
  {
    info = s;
    link = lnk;
  }
}
