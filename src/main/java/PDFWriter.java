import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.properties.TextAlignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PDFWriter {
    public static void ghiDe() {
        String filePath = "output.pdf"; // Tên file PDF sẽ tạo

        try{
            PdfWriter writer=new PdfWriter(filePath);
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);

            document.add(new Paragraph("Hello World"));
            document.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void ghiTiep(){
        String tmpPath ="tmp.pdf";
        String filePath = "output.pdf";

        try{
            PdfReader reader = new PdfReader(filePath);
            PdfDocument fileCu = new PdfDocument(reader);

            PdfWriter writer = new PdfWriter(tmpPath);
            PdfDocument fileNew = new PdfDocument(writer);
            Document document = new Document(fileNew);


            fileCu.copyPagesTo(1,fileCu.getNumberOfPages(),fileNew);
            fileCu.close();
            document.add(new Paragraph(" 12Khoi dep trai"));
            fileNew.close();

            File deleteFileCu=new File(filePath);
            deleteFileCu.delete();

            File renameFileNew=new File(tmpPath);
            renameFileNew.renameTo(deleteFileCu);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
//        ghiDe();
    ghiTiep();
    }
}
