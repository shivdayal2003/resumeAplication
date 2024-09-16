import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import java.io.FileOutputStream;

public class ResumeExporter {

    public void exportToDOCX(String name, String email, String phone, String experience) throws Exception {
        XWPFDocument document = new XWPFDocument();

        XWPFParagraph paragraph = document.createParagraph();
        paragraph.createRun().setText("Name: " + name);
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Email: " + email);
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Phone: " + phone);
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Experience: " + experience);

        try (FileOutputStream out = new FileOutputStream("Resume.docx")) {
            document.write(out);
        }
        document.close();
    }
}
