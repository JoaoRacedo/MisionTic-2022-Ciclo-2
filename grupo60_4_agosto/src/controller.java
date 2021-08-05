import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controller {

    @FXML
    private Button ShowData;

    @FXML
    private TextField inputData;

    @FXML
    private TextArea outputData;

    @FXML
    void clickData(ActionEvent event) {
        String test = String.join(" ", inputData.getText());
        outputData.setText(outputData.getText() + test + "\n");
        inputData.setText("");
    }
    @FXML
    void process(ActionEvent event) {
        String datos = outputData.getText().strip();
        String[] datos_sep = datos.split("\n");
        for(int i = 0; i < datos_sep.length; i++)
            System.out.println(datos_sep[i]);
    }
    

}