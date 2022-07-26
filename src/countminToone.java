public class countminToone {
    public static int countminToone(int n){
        if(n==1){
            return 0;

        }
        int reducebyone = n-1;
        int reducebytwo= Integer.MAX_VALUE;
        int reducebythree = Integer.MAX_VALUE;
        if(n%2==0){
            reducebytwo= 1+countminToone(n/2);
        }
        if(n%3==0){
            reducebythree = 1+ countminToone(n/3);

        }
        else {
            reducebyone = 1+ countminToone(n-1);
        }
        return Math.min(reducebyone, Math.min(reducebythree, reducebytwo));
    }
    public static void main(String[] args) {
        System.out.println(countminToone(15));
    }

}
