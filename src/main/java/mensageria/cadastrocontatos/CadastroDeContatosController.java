package mensageria.cadastrocontatos;

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class CadastroDeContatosController {

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSair;

    @FXML
    private Button btnSalvar;

    @FXML
    private Label lblMensagem;

    @FXML
    private Pane paneMensagem;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;


    @FXML
    void limparCampos(ActionEvent event) {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }

    @FXML
    void sair(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void salvarContatos(ActionEvent event) {
        paneMensagem.setVisible(true);

        if (txtNome.getText().isEmpty()){
            lblMensagem.setText("O campo Nome é obrigatório.");
        } else if (txtEmail.getText().isEmpty()) {
            lblMensagem.setText("O campo E-mail é obrigatório.");
        } else if (txtTelefone.getText().isEmpty()) {
            lblMensagem.setText("O campo Telefone é obrigatório.");
        } else {
            lblMensagem.setText("Contato salvo com sucesso!");
        }

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(3));
        pauseTransition.setOnFinished(e -> paneMensagem.setVisible(false));
        pauseTransition.play();

    }

}