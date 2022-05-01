public class Queue
{
   private QueueNode front;
   private QueueNode rear;
   private int size;
   public void insert(Object item)
   {
      if(isEmpty())
      {
         rear = new QueueNode(item);
         front = rear;
      }
      else  {
         rear.link = new QueueNode(item);
         rear = rear.link;
      }
      size++;
   }
   //************
   public Object remove()
   {
     QueueNode oldFront = front;
     Object item = peek();
     front = front.link;
     oldFront.link = null;
     size--;
     return item;
   }
   //*************
   public Object peek()
   {
      if(isEmpty())
         throw new NullPointerException();
      return front.info;
   }
   //************
   public boolean isEmpty()
   {
      return (size == 0);
   }
   //**********
   public int getSize()
   {
      return size;
   }
   //***********
   public void display()
   {
      System.out.println("The content of queue is:");
      QueueNode  p = front;
      while(p != null)
      {
         System.out.println(p.info);
         p = p.link;
      }
   }
}

