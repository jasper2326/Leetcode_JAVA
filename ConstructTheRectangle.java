public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        if (area == 0) {
            return result;
        }
        int a = (int)Math.sqrt(area);
        while (area % a != 0) {
            a--;
        }
        int b = area / a;
        if (a >= b) {
            return new int[]{a, b};
        } else {
            return new int[]{b, a};
        }
    }
}
