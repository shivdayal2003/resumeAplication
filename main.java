import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class ResumeBuilderController {
    
    @FXML
    private TextField nameField, emailField, phoneField;
    
    @FXML
    private TextArea experienceField;
    
    private String selectedTemplate;

    @FXML
    private void selectTemplate1() {
        selectedTemplate = "template1";
        // Load template 1 preview if needed
    }

    @FXML
    private void selectTemplate2() {
        selectedTemplate = "template2";
        // Load template 2 preview if needed
    }

    @FXML
    private void generateResume() {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String experience = experienceField.getText();

        if (selectedTemplate != null) {
            if (selectedTemplate.equals("template1")) {
                // Generate resume with template 1
                generateResumeTemplate1(name, email, phone, experience);
            } else if (selectedTemplate.equals("template2")) {
                // Generate resume with template 2
                generateResumeTemplate2(name, email, phone, experience);
            }
        } else {
            // Alert user to select a template first
        }
    }

    private void generateResumeTemplate1(String name, String email, String phone, String experience) {
        // Logic for generating resume with template 1 (e.g., call PDF or DOCX export methods)
    }

    private void generateResumeTemplate2(String name, String email, String phone, String experience) {
        // Logic for generating resume with template 2
    }
}
