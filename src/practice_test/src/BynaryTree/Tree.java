package practice_test.src.BynaryTree;

import java.util.Stack;

/**
 * Created by Вадим on 27.03.2017.
 */
public class Tree {

    Node root;

    void insert(String value){
        if(root==null){
            root=new Node(value);
        } else {
            insertTo(root,value);
        }

    }

    private void insertTo(Node node, String value) {
        if(node.value .compareTo(value)==-1){
            if(node.left!=null){
                insertTo(node.left,value);
            } else {
                node.left = new Node(value);
            }
        } else {
                if(node.right!=null){
                    insertTo(node.right,value);
                } else {
                    node.right = new Node(value);
                }
        }
    }

    public void print(){
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) { return; }
        postOrder(node.left);
        postOrder(node.right);
        System.out.printf("%s ", node.value); }



    void getAll(){
        Node current =root;
        Stack<Node> stack = new Stack<>();
        stack.push(current);
        boolean left = true;
        while (!stack.empty()||current!=null){
            if(left){
                while (current.left!=null){
                    stack.push(current.left);
                    current = current.left;
                }
            }
            System.out.println(current.value);


            if (current.right!=null){
                stack.push(root.right);
                current = current.right;
                left = true;
            } else {
                current = stack.pop();
                left = false;
            }
        }
        //System.out.println(stack);

    }
}
