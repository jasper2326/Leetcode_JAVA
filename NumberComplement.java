public class NumberComplement {
    public static int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        System.out.println(mask);
        num = ~num;
        System.out.println(num);
        return num & mask;
    }

    public static void main(String[] args) {
        int a = findComplement(4);
        System.out.println(a);
    }
}
