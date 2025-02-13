public class Palidrome {
    public static void main(String[] args) {
        int number = 123321; //ввод числа
        System.out.println(palindromeCheck(number));
    }

    public static boolean palindromeCheck(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversNum = 0;
        while (x > reversNum) {
            reversNum = reversNum * 10 + x % 10;
            x /= 10;
        }
        return x == reversNum || x == reversNum / 10;
    }
}
