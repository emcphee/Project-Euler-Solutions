import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args){
        ArrayList<Integer> fibbo = new ArrayList<Integer>();
        fibbo.add(0);fibbo.add(1);
        int next = 1;
        while(next <= 4000000){
            fibbo.add(next);
            int len = fibbo.size();
            next = fibbo.get(len - 1) + fibbo.get(len - 2);
        }
        int sum = 0;
        for(int i = 0; i < fibbo.size(); i++){
            int v = fibbo.get(i);
            if(v % 2 == 0){
                sum += v;
            }
        }
        System.out.println(sum);
    }
}
