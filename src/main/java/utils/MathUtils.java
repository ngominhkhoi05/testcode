package utils;

import java.util.Random;

public class MathUtils {
    public static int congInt(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    public static float congFloat(float... a) {
        float sum = 0;
        for (float num : a) {
            sum += num;
        }
        return sum;
    }

    public static double congDouble(double... a) {
        double sum = 0;
        for (double num : a) {
            sum += num;
        }
        return sum;
    }

    public static long congLong(long... a) {
        long sum = 0;
        for (long num : a) {
            sum += num;
        }
        return sum;
    }

    // Hàm nhân
    public static int nhanInt(int... a) {
        int product = 1;
        for (int num : a) {
            product *= num;
        }
        return product;
    }

    public static float nhanFloat(float... a) {
        float product = 1;
        for (float num : a) {
            product *= num;
        }
        return product;
    }

    public static double nhanDouble(double... a) {
        double product = 1;
        for (double num : a) {
            product *= num;
        }
        return product;
    }

    public static long nhanLong(long... a) {
        long product = 1;
        for (long num : a) {
            product *= num;
        }
        return product;
    }

    // Hàm chia
    public static int chiaInt(int... a) {
        if (a.length == 0) return 0; // Xử lý trường hợp không có số nào
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                throw new ArithmeticException("Không thể chia cho 0");
            }
            result /= a[i];
        }
        return result;
    }

    public static float chiaFloat(float... a) {
        if (a.length == 0) return 0;
        float result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                throw new ArithmeticException("Không thể chia cho 0");
            }
            result /= a[i];
        }
        return result;
    }

    public static double chiaDouble(double... a) {
        if (a.length == 0) return 0;
        double result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                throw new ArithmeticException("Không thể chia cho 0");
            }
            result /= a[i];
        }
        return result;
    }

    public static long chiaLong(long... a) {
        if (a.length == 0) return 0;
        long result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                throw new ArithmeticException("Không thể chia cho 0");
            }
            result /= a[i];
        }
        return result;
    }
    //UCLN
    public static int UCLN(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while (b!=0){
            int tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    //BCNN
    public static int BCNN(int a,int b){
        return Math.abs(a*b)/UCLN(a,b);
    }
    public static boolean isPrime(int n){
        if (n<2) return false;
        else if (n>=2) {
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n%i==0) return false;
            }
            return true;
        }
        return true;
    }
    public static int randomInt(int min, int max) {
        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }
        Random random = new Random();
        int kq=random.nextInt(max-min+1)+min;
        return kq;
    }
    public static double randomDouble(double min, double max) {
        if (min > max) {
            double temp = max;
            max = min;
            min = temp;
        }
        Random random = new Random();
        double kq=random.nextDouble()*max-min;
        return kq;
    }
    public static int giaiThua(int n) {
        if (n < 0) throw new IllegalArgumentException("n phải >= 0");
        int ketQua = 1;
        for (int i = 2; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }
    public static int reverseNumber(int n){
        String s="";
        while(n!=0){
            s=s+n%10;
            n=n/10;
        }
        return Integer.parseInt(s);
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static int countDigits(int n){
        int count=0;
        while(n!=0){
            count=count+n%10;
            n=n/10;
        }
        return count;
    }
    public static boolean isPalindromeNumber(int n){
        String s=String.valueOf(n);
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
