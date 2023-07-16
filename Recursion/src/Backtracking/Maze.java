package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(51,9));
////        tellPath("", 3, 3);
//        System.out.println(pathListDiagonal("",3,3));
//        for (String s : pathListDiagonal("", 3, 3)){
//            System.out.println(s);
//        }

        boolean[][] maze = new boolean[][]{
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("", maze , 0,0);

    }

    static int count (int r, int c) {
        if(r == 1 || c == 1) return 1;
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    static void tellPath(String up, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(up);
            return;
        }
        if (r > 1) tellPath(up + 'D', r - 1, c);
        if (c > 1) tellPath(up + 'R', r, c-1);
    }

    static ArrayList<String> tellPathList(String up, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) list.addAll(tellPathList(up + 'D', r - 1, c));
        if (c > 1) list.addAll(tellPathList(up + 'R', r, c-1));

        return list;
    }
    static ArrayList<String> pathListDiagonal(String up, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) list.addAll(pathListDiagonal(up + "Down ", r - 1, c));
        if (c > 1) list.addAll(pathListDiagonal (up + "Right  ", r, c-1));
        if (r > 1 && c > 1) list.addAll(pathListDiagonal(up + "Diagonal ", + r-1,c-1));

        return list;
    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        if (r < maze.length - 1) pathRestriction(p + 'D', maze, r + 1, c);
        if (c < maze[0].length - 1) pathRestriction(p + 'R', maze, r, c + 1);
    }
}










