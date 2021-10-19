package com.company.hm2;

public class robot_moves {
    boolean judgeCircle(String moves) {
        int startingPointHorizontal = 0;
        int startingPointVertical = 0;
        char[] robotMoves = moves.toCharArray();

        for (int i = 0; i < robotMoves.length; i++) {
            if (robotMoves[i] == 'U') {
                startingPointVertical++;
            } else if (robotMoves[i] == 'D') {
                startingPointVertical--;
            } else if (robotMoves[i] == 'L') {
                startingPointHorizontal--;
            } else if (robotMoves[i] == 'R') {
                startingPointHorizontal++;
            }
        }

        if (startingPointVertical == 0 && startingPointHorizontal == 0) {
            return true;
        }
        return false;
    }
}
