package leetcode_bilibili_zuochengyun.Class6;

/**
 * @Author 17
 * @Description TODO 折纸凹凸痕迹
 * @date 2022/7/16 13:41
 * @Version 1.0
 */
public class PaperFolding {
    public static void printAllFolds(int N){

    }
    //i是节点的层数，n是总共层数，ao_tu==true '凹'
    public static void printProcess(int i,int n,boolean ao_tu){
        if(i>n){
            return;
        }
        printProcess(i+1,n,true);

    }

}
