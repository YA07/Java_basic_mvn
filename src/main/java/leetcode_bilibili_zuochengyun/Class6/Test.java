package leetcode_bilibili_zuochengyun.Class6;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/14 10:06
 * @Version 1.0
 */
public class Test {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int value){
            this.value = value;
        }
    }

    //树形DP 判断平衡二叉树
    public static class ReturnOject{
        public int height;
        public boolean isBalanced;

        public ReturnOject(int height,boolean isBalanced){
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public static ReturnOject process(Node x){
        if(x == null){
            return new ReturnOject(0,true);
        }
        ReturnOject left = process(x.left);
        ReturnOject right = process(x.right);
        int height = Math.max(left.height,right.height)+1;
        boolean isBalanced = ((left.isBalanced && right.isBalanced) && Math.abs(left.height-right.height)<2);
        return new ReturnOject(height,isBalanced);
    }


    //判断搜索二叉树
    public static class ReturnData_isBTS{
        public int min;
        public int max;
        public boolean isBST;

        public ReturnData_isBTS(int min,int max,boolean isBST){
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    public static ReturnData_isBTS process_isBTS(Node x){
        if(x==null){
            return null;
        }
        ReturnData_isBTS left = process_isBTS(x.left);
        ReturnData_isBTS right = process_isBTS(x.right);

        int min = x.value;
        int max = x.value;

        if(x.left!=null){
            min = Math.min(left.min,min);
            max = Math.max(left.max,max);
        }
        if(x.right!=null){
            min = Math.min(right.min,min);
            max = Math.max(right.max,max);
        }

        boolean isBST = false;
        if(left==null || (left.isBST && left.max<=x.value)){
            isBST = true;
        }else {
            isBST = false;
        }
        if(right==null || (right.isBST && right.min>=x.value)){
            isBST = true;
        }else {
            isBST = false;
        }

//        boolean isBST = true;
//        if(left!=null && (left.isBST==false || left.max>=x.value)){
//            isBST = false;
//        }
//        if(right!=null && (right.isBST==false || right.max<=x.value)){
//            isBST = false;
//        }
        return new ReturnData_isBTS(min,max,isBST);
    }

    //判断满二叉树
    public static class ReturnData_FBT{
        int height;
        int nodeNums;

        public ReturnData_FBT(int height,int nodeNums){
            this.height = height;
            this.nodeNums = nodeNums;
        }
    }
    public static ReturnData_FBT process_FBT(Node x){
        if(x==null)
            return new ReturnData_FBT(0,0);

        ReturnData_FBT leftData = process_FBT(x.left);
        ReturnData_FBT righData = process_FBT(x.right);

        int height = Math.max(leftData.height,righData.height)+1;
        int nodeNums = leftData.nodeNums+righData.nodeNums+1;
        return new ReturnData_FBT(height,nodeNums);
    }

    public static boolean isF(Node head){
        if(head == null)
            return true;
        ReturnData_FBT re = process_FBT(head);
        return  re.nodeNums == (1<<re.height-1);
    }

    //最低公共祖先 o1,o2在head为头的树里
    public static Node function(Node head,Node o1,Node o2){
        HashMap<Node,Node> fatherMap = new HashMap<>();
        fatherMap.put(head,head);
        process(head,fatherMap);

        HashSet<Node> set1 = new HashSet<>();
        Node cur = o1;
        while (cur!=fatherMap.get(cur)){
            set1.add(cur);
            cur = fatherMap.get(cur);
        }
        set1.add(head);

        Node cur2 = o2;
        while ((cur2!=fatherMap.get(cur2))){
            if(set1.contains(cur2))
                return cur2;
            else{
                cur2 = fatherMap.get(cur2);
            }
        }
        return head;

    }

    public static void process(Node head,HashMap<Node,Node> fatherMap){
        if(head == null)
            return;
        fatherMap.put(head.left,head);
        fatherMap.put(head.right,head);

        process(head.left,fatherMap);
        process(head.right,fatherMap);


    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(7);
        head.left.left = new Node(2);
        head.left.right = new Node(4);
        head.right.left = new Node(6);
        head.right.right = new Node(8);

        boolean a = process(head).isBalanced;
        System.out.println(a);

        boolean b = process_isBTS(head).isBST;
        System.out.println(b);

        boolean c = isF(head);
        System.out.println(c);

        Node d = function(head,head.left.left,head.right.right);
        System.out.println(d.value);
    }
}
