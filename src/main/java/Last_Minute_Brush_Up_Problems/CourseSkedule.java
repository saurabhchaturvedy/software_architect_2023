package Last_Minute_Brush_Up_Problems;

import java.util.LinkedList;
import java.util.List;

public class CourseSkedule {

    List<Integer>[] adj;
    boolean[] marked;
    boolean[] visited;

    public boolean canFinish(int numCourses, int[][] prerequisites) {


        marked = new boolean[numCourses];
        visited = new boolean[numCourses];
        adj = new List[numCourses];

        for (int i = 0; i < numCourses; i++) {

            this.adj[i] = new LinkedList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (isCyclic(i)) {
                    return false;
                }
            }
        }

        return true;
    }


    public boolean isCyclic(int i) {
        visited[i] = true;

        for (int neighbour : adj[i]) {

            if (!visited[neighbour]) {

                if (isCyclic(neighbour)) {

                    return true;
                }
            } else if (!marked[neighbour]) {
                return true;
            }
        }
        marked[i] = true;
        return false;
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 0}, {0, 1}};
        CourseSkedule courseSkedule = new CourseSkedule();
        boolean canFinish = courseSkedule.canFinish(2, arr);
        System.out.println("Can the courses be finished : : ? " + canFinish);
    }
}
