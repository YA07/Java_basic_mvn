package leetcode_bilibili_zuochengyun.class7;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/18 11:45
 * @Version 1.0
 */
public class Graph {
    public HashMap<Integer,Node> nodes;
    public HashSet<Edge> edge;

    public Graph(){
        nodes = new HashMap<Integer, Node>();
        edge = new HashSet<Edge>();
    }
}
