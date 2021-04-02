package TreeMapcomparable;

public class MyTreeMapComparable 
{
	Node root=null;
	void add(Student key,String value)
	{
		if(root==null)
			root=new Node(key, value);
		else
		{
			Node p=root;
			while(true)
			{
				if(p.key.compareTo(key)<0 && p.left!=null)
				{
					p.left=new Node(key, value);
					break;
				}
				else if(p.key.compareTo(key)>0 && p.left!=null)
					p=p.left;
				else if(p.key.compareTo(key)<0 && p.right==null)
				{
					p.right=new Node(key, value);
					break;
				}
				else
					p=p.right;
			}
		}
	}
	void print()
	{
		if(root!=null)
			printTree(root);
	}
	private void printTree(Node p) 
	{
		if(p.left!=null)
			printTree(p.left);
		System.out.println(p.key+ " "+p.value);
		if(p.right!=null)
			printTree(p.right);
	}
}



























