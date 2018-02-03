/**
 * 
 */

/**
 * @author TechLord
 *
 */
public class Stack {

	private List stack;
	
	public Stack() 
	{
		stack = new List();
	}
	
	
	
	public void push(int in) 
	{
		stack.addToList(in);
	}
	
	public int pop() throws EmptyStack
	{
		ListNode node = stack.deleteNode();
		return node.getData();
	}
	
	public void isStackEmpty() 
	{
		stack.isListEmpty();
	}
	

}
