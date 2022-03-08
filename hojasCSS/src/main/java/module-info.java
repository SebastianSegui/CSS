module es.ideas.hojascss {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.ideas.hojascss to javafx.fxml;
    exports es.ideas.hojascss;
}
