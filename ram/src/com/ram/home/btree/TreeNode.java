package com.ram.home.btree;

//2-3-4 node
public class TreeNode {

	private static final int ORDER = 10;//4;

	private int numItems;
	private TreeNode parent;
	private TreeNode[] childArray = new TreeNode[ORDER];
	private DataItem[] itemArray = new DataItem[ORDER-1];

	// -------------------------------------------------------------
	// connect child to this node
	public void connectChild(int childNum, TreeNode child)
	{
		childArray[childNum] = child;
		if(child != null)
			child.parent = this;
	}
	// -------------------------------------------------------------

	// disconnect child from this node, return it
	public TreeNode disconnectChild(int childNum)
	{
		TreeNode tempNode = childArray[childNum];
		childArray[childNum] = null;
		return tempNode;
	}

	// -------------------------------------------------------------
	public TreeNode getChild(int childNum)
	{ return childArray[childNum]; }
	// -------------------------------------------------------------
	public TreeNode getParent()
	{ return parent; }
	// -------------------------------------------------------------

	public boolean isLeaf()
	{ return (childArray[0]==null) ? true : false; }
	// -------------------------------------------------------------
	public int getNumItems()
	{ return numItems; }
	// -------------------------------------------------------------
	public DataItem getItem(int index) // get DataItem at index
	{ return itemArray[index]; }
	// -------------------------------------------------------------
	public boolean isFull()
	{ return (numItems==ORDER-1) ? true : false; }
	// -------------------------------------------------------------

	public int findItem(long key) // return index of
	{ // item (within node)
		for(int j=0; j<ORDER-1; j++) // if found,
		{ // otherwise,
			if(itemArray[j] == null) // return -1
				break;
			else if(itemArray[j].getData() == key)
				return j;
		}
		return -1;
	} // end findItem

	//-------------------------------------------------------------
	public int insertItem(DataItem newItem)
	{
		//assumes node is not full
		numItems++; // will add new item
		long newKey = newItem.getData(); // key of new item
		for(int j=ORDER-2; j>=0; j--) // start on right,
		{ // examine items
			if(itemArray[j] == null) // if item null,
				continue; // go left one cell
			else // not null,
			{ // get its key
				long itsKey = itemArray[j].getData();
				if(newKey < itsKey) // if itÕs bigger
					itemArray[j+1] = itemArray[j]; // shift it right
				else
				{
					itemArray[j+1] = newItem; // insert new item
					return j+1; // return index to
				} // new item
			} // end else (not null)
		} // end for // shifted all items,
		itemArray[0] = newItem; // insert new item
		return 0;
	} // end insertItem()

	// -------------------------------------------------------------
	public DataItem removeItem() // remove largest item
	{
		// assumes node not empty
		DataItem temp = itemArray[numItems-1]; // save item
		itemArray[numItems-1] = null; // disconnect it
		numItems--; // one less item
		return temp; // return item
	}
	// -------------------------------------------------------------
	public void displayNode() // format Ò/24/56/74/Ó
	{
		for(int j=0; j<numItems; j++)
			itemArray[j].display(); // Ò/56Ó
		System.out.println("/"); // final Ò/Ó
	}
	// -------------------------------------------------------------
} // end class Node


