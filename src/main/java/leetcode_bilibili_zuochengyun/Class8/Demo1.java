package leetcode_bilibili_zuochengyun.Class8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author 17
 * @Description TODO 一些项目要占用会议室，会议室不能同时占用两个项目，
 *                     给你一个项目开始时间和结束时间（给一个数组，里面是一个个具体的项目），
 *                     你来安排会议室的使用，要求使用次数最多
 * @date 2022/7/26 15:09
 * @Version 1.0
 */
public class Demo1 {
    public static class Program{
        public int start;
        public int end;

        public Program(int s,int e){
            this.end = e;
            this.start = s;
        }
    }

    public static  class ProgramComparator implements Comparator<Program> {
        @Override
        public int compare(Program o1, Program o2) {
            return o1.end-o2.end;
        }
    }

    public static int bestWay(Program[] programs,int timePoint){
        Arrays.sort(programs,new ProgramComparator());
        int result = 0;
        for(int i=0;i<programs.length;i++){
            if(timePoint<=programs[i].start){
                result++;
                timePoint = programs[i].end;
            }
        }
        return result;
    }
}
