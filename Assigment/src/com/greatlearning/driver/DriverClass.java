package com.greatlearning.driver;

import com.greatlearning.main.Node;

public class DriverClass {
	
	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
    
    static void flattenBTToSkewed(Node root, int order) {
    	
    	if(root == null)
        {
            return;
        }
    	
    	if(order > 0)
        {
            flattenBTToSkewed(root.right, order);
        }
        else
        {
            flattenBTToSkewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
        
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        if (order > 0)
        {
            flattenBTToSkewed(leftNode, order);
        }
        else
        {
            flattenBTToSkewed(rightNode, order);
        }
    }
    
    static void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
    
    
    public static void main (String[] args) {
		
		DriverClass.node = new Node(50);
		DriverClass.node.left = new Node(30);
		DriverClass.node.right = new Node(60);
		DriverClass.node.left.left = new Node(10);
		DriverClass.node.right.left= new Node(55);
		
		int order = 0;
        flattenBTToSkewed(node, order);
        traverseRightSkewed(headNode);
	}


}
