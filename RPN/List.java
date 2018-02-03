

public class List 
{
    private ListNode head; // used to hold a reference to an instance of a ListNode object
    // which will be the first item in the list, i.e. at the 'head'
    // of the list

    /**
     * Default constructor. Initialise fields to default values.
     */
    public List()
    {
        // set the list to be empty, i.e. not referring to anything valid yet
        head = null;
    }

    /**
     * Get the list node which is at the 'head' of the list
     * 
     * @return A reference to a ListNode object which represents the node at the
     *         head of the list (or null if the list is empty, i.e. no 'head' has
     *         been set yet).    
     */
    public ListNode getHead()
    {
        return head;
    }

    /**
     * Set the 'head' of the list to the given node
     * 
     * @param  newHead A reference to a ListNode object which will be
     *                 the head of the list. 
     *                 
     * NOTE: if a list already exists, the existing listing will be 
     * lost since the head is being assigned to something new.
     */
    public void setHead(ListNode newHead)
    {
        head = newHead;
    }

    /**
     * Add a new node to the start of the list which will contain
     * the data provided (a student ID and mark).
     * 
     * @param id The id of the student to be placed in this list node
     * @param mark The student's mark 
     */
    public void addToList(int input)
    {
        // TODO: add code here to add a new node to the list
        // See the Lecture slides for an example
    	ListNode newNode;
    	newNode = new ListNode(input);
    	newNode.setNext(head);
    	head = newNode;
    }

    // ########
    // TODO: ADD OTHER METHODS HERE, E.G. TO PRINT THE CONTENTS OF THE
    // LIST AND TO FIND STUDENTS IN THE LIST
    public void printList()
    {
    	ListNode nextNode = null;
    	nextNode = head;
    	while(nextNode!=null)
    	{
    		System.out.print(nextNode.getNext());
    		nextNode = nextNode.getNext();
    	}
    	
    }
    
    public ListNode deleteNode() throws EmptyStack
    {
    	ListNode deletedNode = head;
    	if (head!=null) 
    	{
    		head = head.getNext();
    	}
    	else 
    	{
    		
    		System.out.println("Stack is empty");
    		throw new EmptyStack();
    	}
    	
    	return deletedNode;
    }
    
    public boolean isListEmpty() 
    {
    	if(head==null) 
    	{
    		System.out.println("List is Empty");
    		return true;
    	}
    	else 
    	{
    		System.out.println("List is NOT empty");
    		return false;
    	}
    }
    /*
    public int Find(String id)
    {
    	ListNode nextNode = null;
    	ListNode foundNode = null;;
    	nextNode = head;
    	while((nextNode!=null)&&(foundNode==null)) 
    	{
    		if (nextNode.getID().equals(id)) 
    		{
    			foundNode = nextNode;
    			return foundNode.getMark();
    		}
    		else 
    		{
    			nextNode = nextNode.getNext();
    		}
    	}
    	
    	return -1;
    	
    }*/
    // ########
}
