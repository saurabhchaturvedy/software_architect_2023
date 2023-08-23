package TechInt;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompFuture {


    public static void main(String[] args) {

        CompletableFuture<String> source1 = CompletableFuture.supplyAsync(() -> fetchData("source 1"));
        CompletableFuture<String> source2 = CompletableFuture.supplyAsync(() -> fetchData("source 2"));

        CompletableFuture<String> combinedResult = source1.thenCombine(source2, (s1, s2) -> s1 + " and " + s2);

        try {
            String result = combinedResult.get();
            System.out.println("Combined Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    static String fetchData(String source) {
        try {
            // Simulate fetching data from a source (e.g., API call, database query)
            Thread.sleep(2000); // Simulating delay
            return "Data from " + source;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Error fetching data from " + source;
        }
    }
}
