package stackop;
public class link {
static class node
{
	int info;
	node next;
	
	public node(int info)
	{
		this.info=info;
		next=null;
	}
}

static class Stack{
	public static node head;
	public static boolean isEmpty()
	{
		return head==null;
	}
	public static void push(int info)
	{
		node newnode=new node(info);
		if(isEmpty())
		{
			head=newnode;
		}
		else {
		newnode.next=head;
		head=newnode;
		return;
		}
		}
	public static int pop()
	{
		if(isEmpty())
		{
			return -1;
		}
		int top=head.info;
		head=head.next;
		return top;
		
	}
	public static int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		return head.info;
		
	}
}

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}

}
