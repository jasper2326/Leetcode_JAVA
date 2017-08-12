public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int distance = 0;
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2) {
                distance++;
            }
            x /= 2;
            y /= 2;
        }
        return distance;
    }

    public static int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static int hammingDistance3(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            distance += xor & 1;
            xor = xor >> 1;
        }
        return distance;
    }

    public static void main(String[] args) {
        int a = hammingDistance3(1,4);
        System.out.println(a);
    }
}
