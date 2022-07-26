import leetcode_bilibili_zuochengyun.Class6.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestDemo {
    public static class TreeNode{
        public int value;
        public TreeNode right;
        public TreeNode left;

        public TreeNode(int value){
            this.value = value;
        }
    }
    LinkedList<TreeNode> res = new LinkedList<>();
    public void inOrderRecur(TreeNode node, LinkedList<TreeNode> list) {
        if (node == null)
            return;
        inOrderRecur(node.left, list);
        list.add(node);
        inOrderRecur(node.right, list);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        //TreeNode node;

        inOrderRecur(pRootOfTree, res);
        TreeNode pre = null;
        pre = res.getFirst();
        return pre;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right = new TreeNode(7);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(4);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(8);

        TreeNode node = null;

        TestDemo testDemo = new TestDemo();
        node = testDemo.Convert(head);
        System.out.println(testDemo.res.size());
        for(int i=0;i<testDemo.res.size();i++){
            System.out.print(testDemo.res.get(i).value)  ;
        }
    }
}




