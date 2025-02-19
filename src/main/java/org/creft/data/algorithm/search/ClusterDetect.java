package org.creft.data.algorithm.search;

import java.util.ArrayList;
import java.util.List;

public class ClusterDetect {

    public static<T extends Comparable<T>> List<Integer> findClusters(T[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return result;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i++){
            for( int j = 0; j < cols; j++){
                if(matrix[i][j].equals(1) && !visited[i][j])
                    result.add(dfs(matrix, i, j, visited, rows, cols));

            }
        }

        return result;
    }

    private static<T extends Comparable<T>> int dfs(T[][] matrix, int i, int j, boolean[][] visited, int rows, int cols){
        if(i < 0 || j < 0 || i >= rows || j >= cols || matrix[i][j].equals(0) || visited[i][j]) return 0;

        visited[i][j] = true;

        int count = 1;

        count += dfs(matrix, i, j-1, visited, rows, cols);//up
        count += dfs(matrix, i, j+1, visited, rows, cols);//down
        count += dfs(matrix, i-1, j, visited, rows, cols);//left
        count += dfs(matrix, i+1, j, visited, rows, cols);//right

        return count;
    }
}
