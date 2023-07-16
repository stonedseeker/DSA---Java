package Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPathPrint("", maze , 0,0, new int[maze.length][maze[0].length], 0);
    }
    static void allpath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        //if the above condition does not trigger that means that we are considering the block in our path so

        maze[r][c] = false;

        if (r < maze.length - 1) allpath(p + 'D', maze, r + 1, c);
        if (c < maze[0].length - 1) allpath(p + 'R', maze, r, c + 1);
        if (r > 0) allpath(p + 'U', maze, r - 1, c);
        if (c > 0) allpath(p + 'L', maze, r, c - 1);

        //here the function will get ended so before function ends
        //also remove the changes done in the function, i.e, line22;

        maze[r][c] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println("\n");
            return;
        }

        if (!maze[r][c]) return;

        //if the above condition does not trigger that means that we are considering the block in our path so

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        if (c < maze[0].length - 1) allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        if (r > 0) allPathPrint(p + 'U', maze, r - 1, c, path, step + 1 );
        if (c > 0) allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);

        //here the function will get ended so before function ends
        //also remove the changes done in the function, i.e, line22;

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
