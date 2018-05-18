import java.util.*;
class Node
{
	Node left;Node right;
	int data;

	Node(int item)
	{
		data=item;
		left=null;
		right=null;
	}
}
class BalancedBinaryTree
{
   static Node root;

   static void bsttoarray(Vector<Integer> bst,Node root)
   {
   	if(root==null)
   	{
   		return;
   	}
      bsttoarray(bst,root.left);
      bst.add(root.data);
      bsttoarray(bst,root.right);

   }

   public static void printArray(Vector<Integer> vt)
   {

   	 int i=0;
   	 for(i=0;i<vt.size();i++)
   	 {
   	 	System.out.print((int)vt.elementAt(i));
   	 }
        System.out.println();
   }

   public static Node balanceTree(Vector<Integer> vt,int low,int high)
   {
    	if(low>high)
           return null;  	

      int mid=(low+high)/2;
      Node root=new Node((int)vt.elementAt(mid));
      root.left=balanceTree(vt,low,mid-1);
      root.right=balanceTree(vt,mid+1,high);
   	
   return  root;

   }


   public static void preorder(Node root)
   {
   	 if (root==null)
   	 	return;
   	 System.out.print(root.data+" ");
   	 preorder(root.left);
   	 preorder(root.right);
   }

   public static void main(String[] args)
   {
      BalancedBinaryTree bt=new BalancedBinaryTree();
      bt.root=new Node(10);
      bt.root.left=new Node(8);
      bt.root.left.left=new Node(7);
      bt.root.left.left.left=new Node(6);
      bt.root.left.left.left.left=new Node(5);
      Vector<Integer> vt=new Vector<Integer>();
      bt.bsttoarray(vt,root);
      root=bt.balanceTree(vt,0,vt.size()-1);
      System.out.print("The PreOrder traversal of Balanced Tree:");bt.preorder(root);

   }

}