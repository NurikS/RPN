

public class ListNode    
{
    private int input;
    
    private ListNode next;

    
    public ListNode()
    {
        input = 0;

        next = null;
    }

    public ListNode(int input)
    {
        this.input = input;

        this.next = null;
    }




    public ListNode getNext()
    {
    	return next;
    }

    public void setNext(ListNode node)
    {
    	next = node;
    }
    
    public void setInput(int input) 
    {
    	this.input = input;
    }
    
    public int getData()
    {
    	return input;
    }

}
