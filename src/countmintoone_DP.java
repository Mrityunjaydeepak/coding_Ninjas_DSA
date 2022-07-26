public class countmintoone_DP {
    public static int countMinStepsToOne(int n) {
        {
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 0;
            for(int i=2;i<=n;i++) {
                int ans = 1+dp[i-1];
                if(i%2 == 0) ans = Math.min(ans,1+dp[i/2]);
                if(i%3 == 0) ans = Math.min(ans,1+dp[i/3]);
                dp[i] = ans;
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(countMinStepsToOne(15));
    }
}
