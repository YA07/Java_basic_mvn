package leetcode_bilibili_zuochengyun.Class6;


import java.util.LinkedList;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/13 16:29
 * @Version 1.0
 */
public class Demo {
    //判断搜索二叉树
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public static int preValue = Integer.MIN_VALUE;

    public static boolean isBST(Node head){
        if(head == null)
            return true;
        Boolean isLeftBST = isBST(head.left);
        if(isLeftBST==false){
            return false;
        }

        if(head.value<=preValue)
            return false;
        else
            preValue = head.value;
        return isBST(head.right);
    }

    //判断完全二叉树
    public static boolean isCBT(Node head){
        if(head == null)
            return true;
        LinkedList<Node> queue = new LinkedList<>();
        boolean leaf = false;//是否遇到过左右两个孩子不双全的节点
        Node l = null;
        Node r = null;
        queue.add(head);

        while (!queue.isEmpty()){
            head = queue.poll();
            l = head.left;
            r = head.right;

            //如果遇到左右孩子不全的节点后又发现当前节点不是叶子节点
            if((leaf&&(l!=null||r!=null)) || (l==null&&r!=null)){
                return false;
            }

            if(l!=null){
                queue.add(l);
            }
            if(r!=null){
                queue.add(r);
            }
            if(l==null || r==null){
                leaf = true;
            }
        }
        return true;
    }

    //判断平衡二叉树
    public static boolean isBalanced(Node head){
        return  process(head).isBalanced;
    }

    public static class ReturnType{
        public boolean isBalanced;
        public int height;

        public ReturnType(boolean isB,int hei){
            isBalanced = isB;
            height = hei;
        }
    }

    public static ReturnType process(Node x){
        if(x==null){
            return new ReturnType(true,0);
        }

        ReturnType leftData = process(x.left);
        ReturnType rightData = process(x.right);

        int height = Math.max(leftData.height,rightData.height)+1;
        boolean isBalanced = leftData.isBalanced && rightData.isBalanced && Math.abs(leftData.height-rightData.height)<2;
        return new ReturnType(isBalanced,height);
    }

    public static void main(String[] args) {
        Node head = new Node(5);
       // head.left = new Node(3);
        head.right = new Node(7);
       // head.left.left = new Node(2);
      //  head.left.right = new Node(4);
        head.right.left = new Node(6);
        head.right.right = new Node(8);

        boolean a = isBST(head);
        System.out.println(a);

        boolean b = isCBT(head);
        System.out.println(b);

        boolean c = isBalanced(head);
        System.out.println(c);
    }
}
