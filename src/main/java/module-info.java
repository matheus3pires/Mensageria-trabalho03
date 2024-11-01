module mensageria.cadastrocontatos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens mensageria.cadastrocontatos to javafx.fxml;
    exports mensageria.cadastrocontatos;
}