

public class ListNode    
{
    // fields to store the data being held in this list node (a student ID and mark)
    private int input;
    
    // TODO: Add a field to store a reference to the next node in the list after this one
    private ListNode next;

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        // set id and mark to default / empty values 
        input = 0;

        // TODO: set next node to null - no valid next node yet
        next = null;
    }

    /**
     * Alternative constructor. Set fields to given values.
     *
     * @param id The id for the student
     * @param mark The student's mark
     */
    public ListNode(int input)
    {
        // set id and mark to values provided
        this.input = input;

        // TODO: set next node to null - no valid next node yet
        this.next = null;
    }



    /**
     * Get the next node in the list after this one
     * 
     * @return A reference to the next node (or null if
     *         there is no next node)
     */
    public ListNode getNext()
    {
       // TODO: return your list node reference
    	return next;
    }

    /**
     * Set the next node in the list after this one
     * 
     * @param next A reference to a ListNode object which 
     *             represents the next node in the list after
     *             this one.
     */
    public void setNext(ListNode node)
    {
    	// TODO: store your list node reference
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
