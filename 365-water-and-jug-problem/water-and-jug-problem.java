class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x + y < target) return false;
        if (target == 0) return true;
        return target % gcd(x, y) == 0;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}