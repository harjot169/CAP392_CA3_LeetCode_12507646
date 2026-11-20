class Solution {
    public double myPow(double x, int n) {
        double ans = 1;

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        for (long i = 1; i <= power; i++) {
            ans = ans * x;
        }

        return ans;
    }
}
