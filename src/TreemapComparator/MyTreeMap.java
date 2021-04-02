package TreemapComparator;

public class MyTreeMap 
{
	Node root;
	MyComparator comp;
	MyTreeMap(MyComparator comp)
	{
		this.comp=comp;
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
	Engine get(Car key)
	{
		if(root==null)
			return null;
		else
		{
			Node p=root;
		while(true)
		{
			if(p.key.model.compareTo(key.model)==0 && p.key.price==key.price)
				return p.value;
			else if(comp.compare(p.key, key)>0 && p.left==null)
				return null;
			else if(comp.compare(p.key, key)>0 && p.left!=null)
				p=p.left;
			else if(comp.compare(p.key, key)<0 && p.right==null)
				return null;
			else
				p=p.right;
		}
			
		}
	}
	void add(Car key,Engine value)
	{
		if(root==null)
			root=new Node(key,value);
		else
		{
			Node p=root;
			while(true)
			{
				if(p.key<key && p.right==null)
				{
					p.right=new Node(key ,value);
					break;
				}
				else if(p.key<key && p.right!=null)
					p=p.right;
				else if(p.key>key && p.left==null)
				{
					p.left=new Node(key,value);
					break;
				}
				else
					p=p.left;
					
			}
		}
	}
	
}






























