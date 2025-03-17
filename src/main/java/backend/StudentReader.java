package backend;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import entity.Student;

import java.io.IOException;
import java.util.List;

public class StudentReader {
    public static void addPDFToList(List<Student> st, String path){
        try {
            PdfReader reader = new PdfReader(path);
            PdfDocument pdfDocument = new PdfDocument(reader);

            for(int i=1;i<=pdfDocument.getNumberOfPages();i++){
                String contentPage = PdfTextExtractor.getTextFromPage(pdfDocument.getPage(i));
                String[] contentPageArray = contentPage.split("\n");
                for (String s : contentPageArray) {
                    String[] words = s.split("-");
                    String id = words[0].trim();
                    String hoTen=words[1].trim();
                    int tuoi=Integer.parseInt(words[2].replace("tuổi","").trim());
                    double diem=Double.parseDouble(words[3].trim());
                    Student x=new Student(hoTen,tuoi,diem);
                    x.setMaSV(id);
                    st.add(x);
                }
            }
            pdfDocument.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readStudent(List<Student> st, String path){
        try {
            PdfReader reader = new PdfReader(path);
            PdfDocument pdfDocument = new PdfDocument(reader);

            for(int i=1;i<=pdfDocument.getNumberOfPages();i++){
                String contentPage = PdfTextExtractor.getTextFromPage(pdfDocument.getPage(i));
                String[] contentPageArray = contentPage.split("\n");
                for (String s : contentPageArray) {
                    String[] words = s.split("-");
                    String id = words[0].trim();
                    String hoTen=words[1].trim();
                    int tuoi=Integer.parseInt(words[2].replace("tuổi","").trim());
                    double diem=Double.parseDouble(words[3].trim());
                    Student x=new Student(hoTen,tuoi,diem);
                    x.setMaSV(id);
                    st.add(x);
                }
            }
            pdfDocument.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
