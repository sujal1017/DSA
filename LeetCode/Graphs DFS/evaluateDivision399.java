import java.util.*;

public class evaluateDivision399 {

    public double[] calcEquation(
            List<List<String>> equations,
            double[] values,
            List<List<String>> queries) {

        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();

        // Build graph
        for (int i = 0; i < equations.size(); i++) {

            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            double value = values[i];

            if (!graph.containsKey(a)) {
                graph.put(a, new HashMap<>());
            }

            if (!graph.containsKey(b)) {
                graph.put(b, new HashMap<>());
            }

            // a / b = value
            graph.get(a).put(b, value);

            // b / a = 1 / value
            graph.get(b).put(a, 1.0 / value);
        }

        double[] answer = new double[queries.size()];

        // Process queries
        for (int i = 0; i < queries.size(); i++) {

            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);

            // If either variable doesn't exist
            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                answer[i] = -1.0;
            } 
            else {

                HashSet<String> visited = new HashSet<>();

                answer[i] = dfs(
                        graph,
                        start,
                        end,
                        1.0,
                        visited
                );
            }
        }

        return answer;
    }

    // DFS
    public double dfs(
            HashMap<String, HashMap<String, Double>> graph,
            String current,
            String target,
            double values,
            HashSet<String> visited) {

        // We reached the target
        if (current.equals(target)) {
            return values;
        }

        visited.add(current);

        // Visit all connected variables
        for (String next : graph.get(current).keySet()) {

            // Already visited
            if (visited.contains(next)) {
                continue;
            }

            double weight = graph.get(current).get(next);

            double result = dfs(
                    graph,
                    next,
                    target,
                    values * weight,
                    visited
            );

            // Target found
            if (result != -1.0) {
                return result;
            }
        }

        // No path found
        return -1.0;
    }

    // Main method for testing
    public static void main(String[] args) {

        evaluateDivision399 s = new evaluateDivision399();

        // Equations:
        // a / b = 2
        // b / c = 3

        List<List<String>> equations = new ArrayList<>();

        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));

        double[] values = {2.0, 3.0};

        // Queries
        List<List<String>> queries = new ArrayList<>();

        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        // Calculate answers
        double[] answer = s.calcEquation(
                equations,
                values,
                queries
        );

        // Print result
        System.out.println(Arrays.toString(answer));
    }
}