package leetcode_bilibili_zuochengyun.Class6;

/**
 * @Author 17
 * @Description TODO 找后继节点
 * @date 2022/7/16 11:34
 * @Version 1.0
 */
public class Test2 {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node parent;
        public Node(int data){
            this.value = data;
        }
    }

    public static Node getSuccessorNode(Node node){
        if(node == null){
            return  node;
        }
        if(node.right!=null){
            node = node.right;
            while(node.left!=null){
                node = node.left;
            }
            return node;
        }else{
            Node parent = node.parent;
            while (parent!=null && parent.left!=node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }
//    public static Node getLeftMost(Node node){
//        if(node == null){
//            return node;
//        }
//        while (node.left!=null){
//            node = node.left;
//        }
//        return node;
//    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.left.parent = head;
        head.right = new Node(7);
        head.right.parent =head;
        head.left.left = new Node(2);
        head.left.left.parent = head.left;
       // head.left.right = new Node(4);
        head.right.left = new Node(6);
        head.right.left.parent = head.right;
        head.right.right = new Node(8);
        head.right.right.parent = head.right;


        Node node = getSuccessorNode(head.right.right);
        System.out.println(node.value);

    }
}


