package Good_Solutions_Problems;

import java.util.*;

class RankTeamByVotes {
    public String rankTeams(String[] votes) {
        int numTeams = votes[0].length();
        
        // Create a map to store the vote counts for each team
        Map<Character, int[]> voteCounts = new HashMap<>();
        
        // Initialize the vote counts for each team
        for (String vote : votes) {
            for (int i = 0; i < numTeams; i++) {
                char team = vote.charAt(i);
                voteCounts.putIfAbsent(team, new int[numTeams]);
                voteCounts.get(team)[i]++;
            }
        }
        
        // Convert the map entries to a list for sorting
        List<Map.Entry<Character, int[]>> entries = new ArrayList<>(voteCounts.entrySet());
        
        // Sort the teams based on the vote counts and team IDs
        Collections.sort(entries, (a, b) -> {
            int[] countA = a.getValue();
            int[] countB = b.getValue();
            
            for (int i = 0; i < numTeams; i++) {
                if (countA[i] != countB[i]) {
                    return Integer.compare(countB[i], countA[i]);
                }
            }
            
            return Character.compare(a.getKey(), b.getKey());
        });
        
        // Build the final result string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, int[]> entry : entries) {
            sb.append(entry.getKey());
        }
        
        return sb.toString();
    }
}
