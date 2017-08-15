public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizon = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                vertical++;
            } else if (c == 'D') {
                vertical--;
            } else if (c == 'L') {
                horizon--;
            } else {
                horizon++;
            }
        }
        if (vertical == 0 && horizon == 0) {
            return true;
        } else {
            return false;
        }
    }
}
