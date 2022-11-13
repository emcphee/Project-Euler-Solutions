
public class problem4 {
    public static void main(String[] args){
        int max = 0;
        for(int i = 1; i < 1000; i++){
            for(int j = 1; j < 1000; j++){
                int k = i * j;
                if(k > max && problem4.isPalindrome(k)) max = k;
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int n){
        String s = Integer.toString(n);
        int l = s.length() / 2;
        for(int i = 0; i < l; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
