import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.IOException;

public class PDFReader {
    public static void main(String[] args) {
        String filePath = "output.pdf"; // Đường dẫn file cần đọc

        try {
            // Mở file PDF để đọc
            PdfReader pdfReader = new PdfReader(filePath);
            PdfDocument pdfDoc = new PdfDocument(pdfReader);

            // Đọc từng trang và in nội dung ra màn hình
            for (int i = 1; i <= pdfDoc.getNumberOfPages(); i++) {
                String pageContent = PdfTextExtractor.getTextFromPage(pdfDoc.getPage(i));
                System.out.println("Trang " + i + ":\n" + pageContent);
                System.out.println("--------------------------------------");
            }

            // Đóng file PDF
            pdfDoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
