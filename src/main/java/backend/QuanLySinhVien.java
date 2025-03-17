package backend;

import entity.Student;
import utils.ScannerUtils;

import java.util.*;

public class QuanLySinhVien {
    private List<Student> students=new ArrayList<Student>();
    private ScannerUtils sc=new ScannerUtils();
    public void addStudent(){
        System.out.println("Nhap ten: ");
        String ten=sc.nhapStringNotEmpty(1);
        System.out.println("Nhap tuoi:");
        int tuoi=sc.nhapIntLonHonX(16);
        System.out.println("Nhap diem TB:");
        double diemTB=sc.nhapDoubleFromXToY(0,10);

        Student student=new Student(ten,tuoi,diemTB);
        students.add(student);
    }
    public void inStudent(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void addCoSan(){
        students.add(new Student("Khôi", 19, 8.5));
        students.add(new Student("Ngân", 18, 9.0));
        students.add(new Student("Đạt", 20, 7.8));
        students.add(new Student("Bình", 21, 6.5));
        students.add(new Student("Hải", 22, 7.2));
        students.add(new Student("Lan", 20, 8.1));
        students.add(new Student("Phong", 19, 7.5));
        students.add(new Student("Linh", 18, 9.3));
        students.add(new Student("Nam", 21, 6.9));
        students.add(new Student("Hương", 22, 8.0));
    }
    public void writeFileEX(){
        StudentWriter.createAndAddListToPDF(students,"output.pdf");
    }
    public void readFileEX(){
        StudentReader.readStudent(students,"output.pdf");
    }
    public void xoaAll(){
        students.clear();
    }
    public void sapXepTheoID(){
        Collections.sort(students,Comparator.comparing(Student::getMaSV));
    }
    public void sapXepTheoTen(){
        Collections.sort(students,Comparator.comparing(Student::getHoTen));
    }
    public void sapXepTheoTuoi(){
        Collections.sort(students,Comparator.comparing(Student::getTuoi));
    }
    public void sapXepTheoDiem(){
        Collections.sort(students,Comparator.comparing(Student::getDiemTB));
    }
    public void xoaTheoTen(){
        System.out.println("Nhap ten muon xoa: ");
        String ten=sc.nhapStringNotEmpty(1);
        students.removeIf(student -> student.getHoTen().equalsIgnoreCase(ten));
    }
    public void xoaTheoId(){
        System.out.println("Nhap id muon xoa: ");
        String id=sc.nhapStringNotEmpty(1);
        students.removeIf(st->st.getMaSV().equalsIgnoreCase(id));
    }
    public void inTrungTen(){
        Set<String> nameSet=new HashSet<String>();
        for (Student student : students) {
            nameSet.add(student.getHoTen());
        }
        String[] arrName=nameSet.toArray(new String[nameSet.size()]);

        int[] cnt=new int[arrName.length];
        Arrays.fill(cnt,0);

        for(int i=0;i<arrName.length;i++){
            for (Student student : students) {
                if (arrName[i].equals(student.getHoTen())) {
                    cnt[i]++;
                }
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i]>=2) {
                for (Student student : students) {
                    if (student.getHoTen().equals(arrName[i])) {
                        System.out.println(student);
                    }
                }
            }
        }
    }
    public void menu(){
        int luaChon=-1;
        while (luaChon!=0) {
            System.out.println("1. Them 1 sinh vien vao list");
            System.out.println("2. In all");
            System.out.println("3. Them co san 10 student vao list");
            System.out.println("4. writeFileEX");
            System.out.println("5. readFileEX");
            System.out.println("6. Xoa all");
            System.out.println("7. Sap xep theo ten");
            System.out.println("8. Sap xep theo tuoi");
            System.out.println("9. Sap xep theo diem");
            System.out.println("10. Xoa sinh vien theo id");
            System.out.println("12. Xoa sinh vien theo ten");
            System.out.println("13. In ra nhung nguoi trung ten");
            System.out.println("0. Exit");
            luaChon=sc.nhapInt();
            if (luaChon==1) {
                addStudent();
            } else if (luaChon==2) {
                inStudent();
            } else if (luaChon==3) {
                addCoSan();
            }else if (luaChon==4) {
                writeFileEX();
            } else if (luaChon==5) {
                readFileEX();
            } else if (luaChon==6) {
                xoaAll();
            } else if (luaChon==7) {
                sapXepTheoTen();
            } else if (luaChon==8) {
                sapXepTheoTuoi();
            } else if (luaChon==9) {
                sapXepTheoDiem();
            } else if (luaChon==10) {
                sapXepTheoID();
            } else if (luaChon==11) {
                xoaTheoId();
            } else if (luaChon==12) {
                xoaTheoTen();
            } else if(luaChon==13){
                inTrungTen();
            }
        }
    }
}
