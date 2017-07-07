package linkedlist;
//here we are implementing the linked list using an array

public class TestLinkedList {

	public static void main(String []args){
	
		int[] data = { 20,30,55,10,90,64 };//creating an array of size and we are initializing them

		Object[][] linkedList = new Object[1][2];//we created an object for class 

		createLinkedList(data,linkedList);//creating a linked list and printing the linked list
	printLinkedList(linkedList);
	 
	}
	 
	public static void createLinkedList(int []data,Object[][] linkedList)
	{

		Object node[][] = null;//taking the object node has null
	
		Object newnode[][] = null;//here taking new node also has null
	node=new Object[1][2];//creating a node with new object and initializing an array
	linkedList[0][1]=node;//now we are assigning the nodes in linked list with size of an array
	
	for(int i=0;i<data.length;i++)//by using for loop we are implementing linked list
	{
	node[0][0]=new Integer(data[i]);//creating an object by this if the one head which points to the 
	newnode=new Object[1][2];//first node of the list
	node[0][1]=newnode;
	node=newnode;
	 
	}
	node =null;
	newnode = null;
	    }
	 
	 
	public static void printLinkedList(Object[][] linkedList)
	{
	 
	Object node[][] = null;
	node=linkedList;//we first insert the node  then insert the last node in linked list
	node =(Object [][]) node[0][1];
	
	while(node[0][1]!= null)//we are using while loop that is node not equal to the null
	{
	System.out.print("  "+node[0][0]+" --->" );//then it prints this
	node=(Object [][]) node[0][1];//same here it is as well by placing a new node
	 
	}
	System.out.print("null" );//in last it prints null that the node is empty
	 
	}
}
