package Last_Minute_Brush_Up_Problems;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {


    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer>[] graph = new ArrayList[numCourses];
        boolean[] visited = new boolean[numCourses];
        boolean[] dfs = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {

            graph[i] = new ArrayList<>();
        }

        for (int arr[] : prerequisites) {

            graph[arr[1]].add(arr[0]);
        }

        for (int i = 0; i < numCourses; i++) {

            if (!visited[i] && isCyclic(graph, visited, i, dfs)) return false;
        }

        return true;
    }


    public boolean isCyclic(List<Integer>[] graph, boolean[] visited, int vertex, boolean[] dfs) {

        visited[vertex] = true;
        dfs[vertex] = true;

        for (int a : graph[vertex]) {

            if (dfs[a] || (!visited[a] && isCyclic(graph, visited, a, dfs))) return true;
        }

        return dfs[vertex] = false;
    }


    public static void main(String[] args) {

        int[][] coursesPrerequisites = {{1, 0}};
        CourseSchedule courseSchedule = new CourseSchedule();
        boolean canFinish = courseSchedule.canFinish(2, coursesPrerequisites);
        System.out.println(" can courses finish ?? "+canFinish);

    }
}
