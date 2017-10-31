package MainController.AISD.lr4_5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUI {
    ObjectQueue objectQueue = new ObjectQueue();
    @FXML
    private Button GetButton;

    @FXML
    private TextField InputTextField;

    @FXML
    private Button PutButton;

    @FXML
    private TextArea OutputTextFieldQueue;

    @FXML
    private TextArea OutputTextFieldGetObject;


    @FXML
    void x(ActionEvent event) {
        if (objectQueue.size() > 0) {
            OutputTextFieldQueue.setText(toStringQueue());
        }
        if (event.getSource() == (PutButton) || InputTextField != null) {
            objectQueue.push(InputTextField.getText());
            OutputTextFieldQueue.setText(toStringQueue());
        }
        if (event.getSource() == (GetButton) || objectQueue.size() > 0) {
            OutputTextFieldGetObject.setText(objectQueue.get(objectQueue.size()).toString());

        }

    }

    public String toStringQueue() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objectQueue.size(); i++) {
            stringBuilder.append(objectQueue.get(i));
        }
        return stringBuilder.toString();
    }

}
