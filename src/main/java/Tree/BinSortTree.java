package Tree;

public class BinSortTree {
    public static void main(String[] args) {
        int array[] = {7,5,6,1,8,10,9};
        Tree t=new Tree();
        for(int i=0;i<array.length;i++){
            t.addNodes(new Node(array[i]));
        }
        t.zhongxu();
    }
}

class Node{
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return value+" ";
    }

    public void add(Node node){
        if(node==null){
            return;
        }
        if(node.value<this.value){
            if(this.left==null){
                this.left=node;
            }else{
                this.left.add(node);
            }
        }else{
            if(this.right==null){
                this.right=node;
            }else{
                this.right.add(node);
            }
        }
    }

    public void zhongxu(){
        if(this.left!=null){
            this.left.zhongxu();
        }
        System.out.print(this);
        if(this.right!=null){
            this.right.zhongxu();
        }
    }
}

class Tree{
    private Node root;

    public void addNodes(Node node){
        if(root==null){
            root=node;
        }else{
            root.add(node);
        }
    }

    public void zhongxu(){
        if(this.root!=null){
            this.root.zhongxu();
        }else{
            System.out.println("空树！");
        }
    }
}
