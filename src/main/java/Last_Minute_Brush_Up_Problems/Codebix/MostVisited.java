package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.*;

public class MostVisited {

    public List<Integer> getMostVisited(int n, List<List<Integer>> sprints) {
        int[] arr = new int[n + 2];

        for (int i = 0; i < sprints.size() - 1; i++) {
            List<Integer> sprint1 = sprints.get(i);
            List<Integer> sprint2 = sprints.get(i + 1);
            int start = Math.min(sprint1.get(0), sprint2.get(0));
            int end = Math.max(sprint1.get(0), sprint2.get(0));
            arr[start] += 1;
            arr[end + 1] -= 1;
        }

        int maxFrequency = 0;
        int currentFrequency = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            currentFrequency += arr[i];
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                result.clear();
                result.add(i);
            } else if (currentFrequency == maxFrequency) {
                result.add(i);
            }
        }

        return result;
    }


    int getMostVisited(int n, int[] sprint) {
        int[] ans = new int[n];
        int m = sprint.length;
        int res = 0;
        for (int i = 0; i < m - 1; ++i) {
            int start = Math.min(sprint[i], sprint[i + 1]) - 1;
            int end = Math.max(sprint[i], sprint[i + 1]) - 1;
            ans[start] += 1;
            if (end < n - 1)ans[end + 1] -= 1;
        }
        res = ans[0];
        for (int i = 1; i < n; ++i) {
            ans[i] = ans[i - 1] + ans[i];
            res = Math.max(res, ans[i]);
        }
        return res;
    }


    public void highestVisitCount(int n, List<Integer> values) {
        Map<Integer,Integer> params =new HashMap<>();
        for (int value = 0; value < values.size() - 1; value++) {
            List<Integer> incrementList =
                    getListOfIncrementValues(values, value);
            for (int i = 1; i <= n; i++) {
                if(incrementList.contains(i) && params.containsKey(i)){
                    int count = params.get(i);
                    params.put(i,count+1);
                }else if(incrementList.contains(i)){
                    params.put(i,1);
                }
            }
        }

        Optional<Map.Entry<Integer, Integer>> max = params.entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(max.get().getKey());

    }

    private List<Integer> getListOfIncrementValues(List<Integer> values, int value) {
        List<Integer> incrementList =new ArrayList<>();
        int beforeValue = values.get(value);
        int afterValue = values.get(value +1);
        if(beforeValue<=afterValue){
            for(int inc=beforeValue;inc<=afterValue;inc++){
                incrementList.add(inc);
            }
        }else {
            for(int inc=beforeValue;inc>=afterValue;inc--){
                incrementList.add(inc);
            }
        }
        return incrementList;
    }

    public static void main(String[] args) {
        MostVisited mostVisited = new MostVisited();
        int n = 10;
        List<List<Integer>> sprints = Arrays.asList(
                Arrays.asList(2, 4),
                Arrays.asList(4, 1),
                Arrays.asList(1, 2)
        );
int[]arr = {2,4,1,2};
        mostVisited.highestVisitCount(n, Arrays.asList(2,4,1,2));
       // System.out.println("Most visited points: " + result);
    }
}
