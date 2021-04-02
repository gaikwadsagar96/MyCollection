package mytreemap;

public class MyTreeMap 
{
	Node root=null; 
	void add(int key,String value)
	{
		if(root==null)
			root=new Node(key,value);
		else
		{
			Node p=root;
			while(true)
			{
				if(p.key<key && p.Right==null)
				{
					p.Right=new Node(key, value);
					break;
				}
				else if(p.key<key && p.Right!=null)
					p=p.Right;
				else if(p.key>key && p.left==null)
				{
					p.left=new Node(key, value);
					break;
				}
				else
					p=p.left;
			}
		}	
	}
	
	void  print()
	{
		if(root!=null)
		{
			printTree(root);
		}
	}
	void printTree(Node p)
	{
		if(p.left!=null)
			printTree(p.left);
		System.out.println(p.key+ " "+p.value);
		if(p.Right!=null)
			printTree(p.Right);
	}
	String get(int key)
	{
		if(root==null)
			return null;
		else
		{
			Node p=root;
			while(true)
			{
				if(p.key==key)
					return p.value;
				else if(key>p.key && p.Right==null)
					return null;
				else if(key>p.key && p.Right!=null)
					p=p.Right;
				else if(key>p.key && p.Right==null)
					return null;
				else if(key<p.key && p.left==null)
					return null;
				else
					p=p.left;
			}
		}
	}
}
