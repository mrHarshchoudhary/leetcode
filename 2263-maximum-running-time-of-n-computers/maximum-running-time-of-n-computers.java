class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long low = 0;
        long high = 0;

        // high = total sum of all battery energy
        for (int b : batteries) {
            high += b;
        }

        // Binary Search on answer (time)
        while (low < high) {
            long mid = (low + high + 1) / 2;

            if (canRun(mid, n, batteries))
                low = mid;      // try higher time
            else
                high = mid - 1; // reduce time
        }

        return low;
    }

    // Check if all n computers can run for 't' time
    private boolean canRun(long t, int n, int[] batteries) {
        long total = 0;

        for (int b : batteries) {
            total += Math.min(b, t); 
        }

        // Enough energy to run n computers for time t?
        return total >= (long) n * t;
    }
}
