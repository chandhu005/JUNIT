package Treesss;

public class Tree {
	static class Node{
		int  data;
		Node left;
		Node right;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	 static class  BinaryTree{
		 static int index=-1;
		 public static Node BuildTree(int nodes[]) {
			 index++;
			 if(nodes[index]==-1) {
				 return null;
			 }
			  Node nn=new Node(nodes[index]);
				 nn.left=BuildTree(nodes);
				 nn.right=BuildTree(nodes);
				 return nn;
		 }
	 }
	public static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tnode = new Tree();
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	BinaryTree tree=new BinaryTree();
	Node root=tree.BuildTree(nodes);
	System.out.println(root.data);
	

	}

}
