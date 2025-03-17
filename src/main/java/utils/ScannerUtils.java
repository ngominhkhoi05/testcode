package utils;
//Ngô Minh Khôi 6451071037

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    public static final Scanner sc = new Scanner(System.in);
    //Nhập số bình thường
    public static int nhapInt(){
            while (true){
                try {
                    int a = sc.nextInt();
                    sc.nextLine();
                    return a;
                }
                catch (Exception e){
                    System.out.println("Nhập sai đinh dạng số nguyên! Vui lòng nhập lại: ");
                    sc.nextLine();
                }
            }
    }
    //Nhập số lớn hơn x
    public static int nhapIntLonHonX(int x){
        while (true){
            try{
                int a = nhapInt();
                if (a<=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại số >"+x+" và đúng định dạng số nguyên: ");
            }
        }
    }
    //Nhập số bé hơn x
    public static int nhapIntBeHonX(int x){
        while (true){
            try{
                int a = nhapInt();
                if (a>=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại số <"+x+" và đúng định dạng số nguyên: ");
            }
        }
    }
    //Nhập số trong khoảng
    public static int nhapIntFromXToY(int from,int to){
        if (from>to){
            int temp = from;
            from = to;
            to = temp;
        }
        while (true){
            try{
                int a = nhapInt();
                if (a>to || a<from){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập đúng định dạng và nhập số trong đoạn ["+from+";"+to+"]: ");
            }
        }
    }

    public static double nhapDouble(){
        while (true){
            try {
                double a =sc.nextDouble();
                sc.nextLine();
                return a;
            }
            catch (InputMismatchException e){
                System.out.println("Nhập sai đinh dạng! Vui lòng nhập lại: ");
                sc.nextLine();
            }
        }
    }
    public static double nhapDoubleLonHonX(double x){
        while (true){
            try{
                double a = nhapDouble();
                if (a<=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại số >"+x+" và đúng định dạng số thực: ");
            }
        }
    }
    public static double nhapDoubleBeHonX(double x){
        while (true){
            try{
                double a =nhapDouble();
                if (a>=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại số <"+x+" và đúng định dạng số thực: ");
            }
        }
    }
    public static double nhapDoubleFromXToY(double from,double to){
        if (from>to){
            double temp = from;
            from = to;
            to = temp;
        }
        while (true){
            try{
                double a = nhapDouble();
                if (a>to || a<from){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập đúng định dạng số thực và nhập số trong đoạn ["+from+";"+to+"]: ");
            }
        }
    }
    public static float nhapFloat(){
        while (true){
            try{
                float a = sc.nextFloat();
                sc.nextLine();
                return a;
            } catch (InputMismatchException e){
                System.out.println("Nhập sai định dạng! Vui lòng nhập lại: ");
                sc.nextLine();
            }
        }
    }
    public static float nhapFloatBeHonX(float x){
        while (true){
            try{
                float a =nhapFloat();
                if (a>=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại số <"+x+" và đúng định dạng số thực: ");
            }
        }
    }
    public static float nhapFloatLonHonX(float x){
        while (true){
            try{
                float a = nhapFloat();
                if (a<=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại số >"+x+" và đúng định dạng số thực: ");
            }
        }
    }
    public static float nhapFloatFromXToY(float from,float to){
        if (from>to){
            float temp = from;
            from = to;
            to = temp;
        }
        while (true){
            try{
                float a = nhapFloat();
                if (a>to || a<from){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập đúng định dạng và nhập số trong đoạn ["+from+";"+to+"]: ");
            }
        }
    }
    public static String nhapString(){
        String a=sc.nextLine();
        return a;
    }
    //Hàm nhâp chuỗi truyền vào độ dài tối thiểu
    public static String nhapStringNotEmpty(int minimumLength) {
        while (true) {
            String a = sc.nextLine();
            if (a.length() >= minimumLength) {
                return a;
            }
            System.out.println("Chuỗi chưa đủ độ dài! Vui lòng nhập lại: ");
        }
    }
    public static String nhapStringOfMaximumLength(int maximumLength) {
        while (true) {
            String a = sc.nextLine();
//            sc.nextLine();
            if (a.length() <= maximumLength) {
                return a;
            }
            System.out.println("Chuỗi quá độ dài! Vui lòng nhập lại: ");
        }
    }
    public static String nhapStringOfLengthXToY(int x,int y){
        while (true) {
            String a = sc.nextLine();
            if (a.length() <=y && a.length()>=x) {
                return a;
            }
            System.out.println("Chuỗi có độ dài không hợp lệ! Vui lòng nhập lại: ");
        }
    }
    public static long nhapLong() {
        while (true) {
            try {
                long a = sc.nextLong();
                sc.nextLine();
                return a;
            } catch (InputMismatchException e) {
                System.out.println("Sai định dạng! Vui lòng nhập lại số nguyên dài: ");
                sc.nextLine();
            }
        }
    }
    public static long nhapLongLonHonX(long x) {
        while (true) {
            try {
                long a = nhapLong();
                if (a<=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập lại số <"+x+" và đúng định dạng số nguyên: ");
            }
        }
    }
    public static long nhapLongBeHonX(long x) {
        while (true) {
            try {
                long a =nhapLong();
                if (a>=x){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập lại số <"+x+" và đúng định dạng số nguyên: ");
            }
        }
    }
    public static long nhapLongFromXToY(long from,long to){
        if (from>to){
            long temp = from;
            from = to;
            to = temp;
        }
        while (true){
            try{
                long a = nhapLong();
                if (a>to || a<from){
                    throw new InputMismatchException();
                }
                return a;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập đúng định dạng số nguyên và nhập số trong đoạn ["+from+"-"+to+"]: ");
            }
        }
    }
    //Nhập ngày
    public static LocalDate nhapNgay(){
        while (true){
            try{
                System.out.println("Nhập vào (dd/mm/yyyy)");
                String a=sc.nextLine();
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(a,formatter);
                return date;
            } catch (DateTimeParseException e){
                System.out.println("Nhập sai định dạng dd/MM/yyyy! Nhập lại:");
            }
        }
    }
    public static void closeScanerUtils() {
        sc.close();
    }
}
