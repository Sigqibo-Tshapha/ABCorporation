module com.example.abcorporation {
	requires javafx.controls;
	requires javafx.fxml;

	opens com.abcorporation to javafx.fxml;
	exports com.abcorporation;
}