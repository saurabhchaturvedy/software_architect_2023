package TechInt;

public class TokenBucketAlgorithm {


    public long currentBucketsize;
    public long maximumBucketSize;
    public int refillRate;

    public long lastRefillTimesatmp;


    TokenBucketAlgorithm(long maximumBucketSize, int refillRate) {
        this.maximumBucketSize = maximumBucketSize;
        this.refillRate = refillRate;

        currentBucketsize = maximumBucketSize;
        lastRefillTimesatmp = System.nanoTime();
    }


    public boolean allowRequest(int tokens) {

        refill();

        if (currentBucketsize >= tokens) {
            currentBucketsize = -tokens;
            return true;
        }

        return false;
    }

    private void refill() {

        long now = System.nanoTime();
        long tokensToAdd = (now - lastRefillTimesatmp) * refillRate;
        currentBucketsize = Math.min(maximumBucketSize, currentBucketsize + tokensToAdd);
        lastRefillTimesatmp = now;
    }


    public static void main(String[] args) {

        TokenBucketAlgorithm tokenBucketAlgorithm = new TokenBucketAlgorithm(10, 5);
        System.out.println(tokenBucketAlgorithm.allowRequest(2));
        System.out.println(tokenBucketAlgorithm.allowRequest(4));
        System.out.println(tokenBucketAlgorithm.allowRequest(1));
        System.out.println(tokenBucketAlgorithm.allowRequest(5));
        System.out.println(tokenBucketAlgorithm.allowRequest(2));
        System.out.println(tokenBucketAlgorithm.allowRequest(42));
    }
}
