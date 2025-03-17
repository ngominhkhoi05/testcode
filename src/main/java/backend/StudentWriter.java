package backend;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import entity.Student;
import utils.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class StudentWriter {

    public static void addListToPDF(List<Student> st,String path){
        try {
            PdfWriter writer = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);

            PdfFont font = PdfFontFactory.createFont("C:/Windows/Fonts/arial.ttf", "Identity-H");
            document.setFont(font);

            for (Student stu : st) {
                document.add(new Paragraph(stu.getMaSV()+" - "+ StringUtils.toTitleCase(stu.getHoTen()) +" - "+stu.getTuoi()+" tuổi - "+stu.getDiemTB()));
            }
            document.close();
            System.out.println("Ghi danh sách vào file pdf thành công!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void createAndAddListToPDF(List<Student> st,String path){
        File file = new File(path);
        if (file.exists()){
            StudentReader.addPDFToList(st,path);
            StudentWriter.addListToPDF(st,path);
        } else {
            StudentWriter.addListToPDF(st,path);
        }
    }
    public static void ghiTiep(List<Student> st,String path){

    }
}
