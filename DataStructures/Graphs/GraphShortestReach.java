// https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach
package Graphs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class GraphShortestReach {

    public static class Graph {
        private final int ELEMENT_WEIGHT = 6;
        private int size;
        private List<List<Integer>> adjacencyList;

        public Graph(int size) {
            this.size = size;
            this.adjacencyList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                List<Integer> a = new ArrayList<>();
                this.adjacencyList.add(a);
            }
        }

        public void addEdge(int a, int b) {
            this.adjacencyList.get(a).add(b);
            this.adjacencyList.get(b).add(a);
        }

        public int[] shortestReach(int startId) {
            // init distances and set all to -1
            int[] distances = new int[size];

            Arrays.fill(distances, -1);

            Queue<Integer> q = new LinkedList<>();
            Set<Integer> seen = new HashSet<>();

            q.offer(startId);
            distances[startId] = 0;
            seen.add(startId);

            while (!q.isEmpty()) {
                int curr = q.poll();
                for (int neighbor : this.adjacencyList.get(curr)) {
                    if (!seen.contains(neighbor)) {
                        q.offer(neighbor);
                        seen.add(neighbor);
                        distances[neighbor] = distances[curr] + ELEMENT_WEIGHT;
                    }
                }
            }
            return distances;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {

            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;

                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

