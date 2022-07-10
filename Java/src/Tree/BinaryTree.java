package Tree;

import java.util.Scanner;

class Node{
	  Node left,right;
	  int data;
	public Node(int data){
		  this.data=data;
	  }
	  
  }
   

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root= CreateTree();
        System.out.println(root);
		
	}
 static Node CreateTree() {
	Node root=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Element");
	int data = sc.nextInt();
	if(data==-1) {return null;}
	else {
		root=new Node(data);
		System.out.println("Enter the Left for"+" "+data);
		root.left=CreateTree();
		System.out.println("Enter the Right for"+" "+data);
		root.right=CreateTree();
		}
	return root;
}
}
