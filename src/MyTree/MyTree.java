package MyTree;

public class MyTree 
{
	Node root=null;
	void add(int a)
	{
		if(root==null)
			root=new Node(a);
		else
			root=addInTree(root,a);
	}
	private Node addInTree(Node root, int a)
	{
		if(root.data<a && root.right==null)
			root.right=new Node(a);
		else if(root.data<a&& root.right!=null)
			root.right=addInTree(root.right, a);
		else if(root.data>a && root.left==null)
			root.left=new Node(a);
		else if(root.data>a && root.left!=null)
			root.right=addInTree(root.left, a);
		return root;
		
	}
	//or.
	void add1(int a)
	{
		if(root==null)
			root=new Node(a);
		else
		{
			Node p=root;
			while(true)
			{
				if(p.data<a && p.right==null)
				{
					p.right=new Node(a);
					break;
				}
				else if (p.data<a && p.right!=null) 
				{
					p=p.right;
				}
				else if (p.data>a && p.left==null) 
				{
					p.left=new Node(a);
					break;
				}
				else
					p=p.left;
			}
		}
	}
	void print()
	{
		if(root!=null)
		{
			printTree(root);
		}
	}
	void printTree(Node p)
	{
		if(p.right!=null)
			printTree(p.right);
		System.out.print(p.data+" ");
		if(p.left!=null)
			printTree(p.left);
	}
	boolean contains(int a)
	{
		if(root==null)
			return false;
		else
		{
			Node p=root;
			while(true)
			{
				if(p.data==a)
					return true;
				else if (p.data<a && p.right==null)
					return false;
				else if (p.data<a && p.right!=null)
					p=p.right;
				else if (p.data>a && p.left==null)
					return false;
				else
					p=p.left;
			}
		}
		
	}
}





























