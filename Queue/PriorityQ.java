class Node{
	int data;
	Node next;
	int p;
	public Node(int x,int p){
		this.data=x;
		this.p=p;
		this.next=null;
	}
}
public class PriorityQ {
	private Node head;
	public void enqueue(int x,int p)
    {
        Node newnode=new  Node(x,p);
        if(head==null||p<head.p)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null &&temp.next.p<=p)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int dequeue()
    {
        if(head==null)
        {
            return -1;
        }
        int v=head.data;
        head=head.next;
        return v;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        
    }
    public static void main(String[] args)
    {
        PriorityQ ob=new PriorityQ();
        ob.enqueue(10,2);
        ob.enqueue(20,1);
        ob.enqueue(30,4);
        ob.enqueue(40,3);
        ob.dequeue();
        ob.display();
    }
	
}



