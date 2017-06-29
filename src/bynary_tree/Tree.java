package bynary_tree;

/**
 * Created by Вадим on 28.06.2017.
 */
public class Tree {

    private Node root;

    public void insert(int value){
        Node nodeToInsert = new Node(value);

        if(root == null){
            root = nodeToInsert;
        } else {

            Node current = root;
            Node parent;

            while (true){
                parent = current;

                if(value < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = nodeToInsert;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current==null){
                        parent.right = nodeToInsert;
                        return;
                    }
                }
            }
        }

    }

    public Node find( int key){
        Node current = root;
        while (current.data!=key){
            if(key < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null){
                return null;
            }
        }
        return current;
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node != null){
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }

    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }

    }

}
