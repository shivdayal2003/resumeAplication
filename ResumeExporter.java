import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class ResumeExporter {

    public void exportToPDF(String name, String email, String phone, String experience) throws Exception {
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.newLineAtOffset(100, 700);

        contentStream.showText("Name: " + name);
        contentStream.newLine();
        contentStream.showText("Email: " + email);
        contentStream.newLine();
        contentStream.showText("Phone: " + phone);
        contentStream.newLine();
        contentStream.showText("Experience: " + experience);

        contentStream.endText();
        contentStream.close();

        document.save("Resume.pdf");
        document.close();
    }
}
