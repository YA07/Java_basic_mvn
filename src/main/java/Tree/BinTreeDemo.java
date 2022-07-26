package Tree;

import java.util.Stack;

public class BinTreeDemo {
    public static void main(String[] args) {
        BinTree binTree = new BinTree();

        HeroNode root = new HeroNode(1);
        HeroNode node2 = new HeroNode(2);
        HeroNode node3 = new HeroNode(3);
        HeroNode node4 = new HeroNode(4);
        HeroNode node5 = new HeroNode(5);
        HeroNode node6 = new HeroNode(6);

        root.setLeft(node2);
        root.setRight(node5);
        node2.setLeft(node3);
        node2.setRight(node4);
        node5.setLeft(node6);
        binTree.setRoot(root);
//        binTree.pre();
//        System.out.println();
        binTree.middle();
        System.out.println();
        binTree.zhongxu();
//        binTree.end();
    }
}

class HeroNode{
    private int no;

    private HeroNode right;
    private HeroNode left;

    public HeroNode(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return no+" ";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    //前序遍历
    public void pre(){
        System.out.print(this);
        if(this.left!=null){
            this.left.pre();
        }
        if(this.right!=null) {
            this.right.pre();
        }
    }
    //中序遍历
    public void middle(){
        if(this.left!=null){
            this.left.middle();
        }
        System.out.print(this);
        if(this.right!=null) {
            this.right.middle();
        }
    }
    //后序遍历
    public void end(){
        if(this.left!=null){
            this.left.end();
        }

        if(this.right!=null) {
            this.right.end();
        }
        System.out.print(this);
    }
    //利用stack中序遍历
    public void zhongxu(){
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur =this;
        while (cur!=null||!stack.isEmpty()){
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            System.out.print(cur);
            cur=cur.right;
        }
    }
}

class BinTree{
    private HeroNode root;
    public void setRoot(HeroNode root) {
        this.root = root;
    }
    
    //前序遍历
    public void pre(){
        if(this.root != null) {
            this.root.pre();
        }else {
            System.out.println("树为空");
        }
    }
    //中序遍历
    public void middle(){
        if(this.root != null) {
            this.root.middle();
        }else {
            System.out.println("树为空");
        }
    }
    //后序遍历
    public void end(){
        if(this.root != null) {
            this.root.end();
        }else {
            System.out.println("树为空");
        }
    }

    //利用stack中序遍历
    public void zhongxu(){
        if(this.root != null) {
            this.root.zhongxu();
        }else {
            System.out.println("树为空");
        }
    }
}