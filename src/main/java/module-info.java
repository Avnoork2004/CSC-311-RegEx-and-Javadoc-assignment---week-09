module org.example.csc311_regexandjavadoc_week_09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311_regexandjavadoc_week_09 to javafx.fxml;
    exports org.example.csc311_regexandjavadoc_week_09;
}