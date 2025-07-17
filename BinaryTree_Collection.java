import java.util.*;
class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree_Collection {
	Node1 root;
	void insert(int v) {
		root=insertVal(root,v);
	}
	Node1 insertVal(Node1 root,int v) {
		if(root==null) {
			return new Node1(v);
		}
		if(v<root.data) {
			root.left=insertVal(root.left,v);
		}
		else if(v>root.data) {
			root.right=insertVal(root.right,v);
		}
		return root;
	}
	
	void inorder() {
		Stack<Node1> x=new Stack<>();
		Node1 temp=root;
		while(temp!=null || !x.isEmpty()) {
			while(temp!=null) {
				x.push(temp);
				temp=temp.left;
				
			}
			temp=x.pop();
			System.out.print(temp.data+" ");
			temp=temp.right;
		}
	}
	void preOrder() {
		if(root==null) return;
		Stack<Node1> x=new Stack<>();
		x.push(root);
		while(!x.isEmpty()) {
			Node1 temp=x.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) {
				x.push(temp.right);
			}
			if(temp.left!=null) {
				x.push(temp.left);
				
			}
		}
		
	}
	void postOrder() {
		Stack<Node1> x=new Stack<>();
		Stack<Node1> y=new Stack<>();
		if(root==null) return;
		x.push(root);
		while(!x.isEmpty()) {
			Node1 temp=x.pop();
			y.push(temp);
			if(temp.left!=null) {
				x.push(temp.left);
			}
			if(temp.right!=null) {
				x.push(temp.right);
			}
		}
		while(!y.isEmpty()) {
			System.out.print(y.pop().data+" ");
		}
	}
	
	public static void main(String[] args) {
		BinaryTree_Collection obj=new BinaryTree_Collection();
		obj.insert(5);
		obj.insert(3);
		obj.insert(1);
		obj.insert(4);
		obj.insert(6);
		System.out.print("Inorder : ");
		obj.inorder();
		
		System.out.print("\npreorder : ");
		obj.preOrder();
		System.out.print("\npostorder : ");
		obj.postOrder();
	}
}
