/*
 * Roxanne Buenaventura
 * CSD 402: Java for Programmers
 * Module 11: Assignment 11.2
 * 10 October, 2026
 * Description: This program demonstrates the use of BorderPane and GridPane layout containers in JavaFX through a simplified coffe shop point-of-sale (POS) interface. The application features a header, beverage category navigation, current order display, status bar, and a grid of beverage selection buttons. Users can add beverages to their order, and the interface updates accordingly.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.scene.layout.VBox;

public class CoffeeShopPOS extends Application{
    @Override 
    public void start(Stage primaryStage) {

        // Create the main layout container for the POS interface.
        BorderPane root = new BorderPane();

        // Create a header and position it in the top region.

        Label header = new Label("The Daily Grind - Coffee Shop POS");

        // Style the header with a dark green background and white text.
        header.setStyle(
            "-fx-background-color: #284638;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 22px;" +
            "-fx-font-weight: bold;" +
            "-fx-padding: 20px;"
        );

        header.setMaxWidth(Double.MAX_VALUE);

        root.setTop(header);

        // Create a placeholder for the beverage category navigation.
        Label categories = new Label("Beverage Categories");

        // Style the category navigation area.
        categories.setStyle(
            "-fx-background-color: #E8EDE7;" +
            "-fx-padding: 20px;" +
            "-fx-font-size: 14px;"
        );


        // Create a vertical container for the beverage categories.
        VBox categoryPanel = new VBox(10);
        categoryPanel.setPadding(new Insets(20));
        // Allow enough space to display the full category heading.
        categoryPanel.setPrefWidth(220);

        // Add the category heading to the panel.
        categoryPanel.getChildren().add(categories);

        // Apply the background color to the entire panel.
        categoryPanel.setStyle("-fx-background-color: #E8EDE7;");

        // Position the category panel in the left region.
        root.setLeft(categoryPanel);

        // Create a placeholder for the customer's current order.
        Label orderDetails = new Label("Current Order");

        // Style the current order area.
        orderDetails.setStyle(
            "-fx-background-color: #E8EDE7;" +
            "-fx-padding: 20px;" +
            "-fx-font-size: 14px;"
        );

        orderDetails.setPrefWidth(180);

        // Create a vertical container for the current order.
        VBox orderPanel = new VBox(10);
        orderPanel.setPadding(new Insets(20));
        orderPanel.setPrefWidth(180);

        // Add the order heading to the panel.
        orderPanel.getChildren().add(orderDetails);

        // Apply the background color to the entire panel.
        orderPanel.setStyle("-fx-background-color: #E8EDE7;");

        // Create a label to display beverages added to the order.
        Label orderItems = new Label("No items selected");

        // Allow the order display to show multiple lines.
        orderItems.setWrapText(true);

        // Add the order display below the Current Order heading.
        orderPanel.getChildren().add(orderItems);

        // Position the order panel in the right region.
        root.setRight(orderPanel);

        // Display the application's current status.
        Label status = new Label("Ready to take an order");

        // Style the status bar at the bottom of the application.
        status.setStyle(
            "-fx-background-color: #D4DED2;" +
            "-fx-padding: 12px;" +
            "-fx-font-size: 12px;"
        );

        status.setMaxWidth(Double.MAX_VALUE);

        root.setBottom(status);

        // Create a grid layout for the beverage selection buttons.
        GridPane beverageGrid = new GridPane();

        // Create a heading for the beverage selection area.
        Label beverageHeading = new Label("Beverage Selection");

        // Make the beverage selection heading more prominent.
        beverageHeading.setStyle(
            "-fx-font-size: 18px;" +
            "-fx-font-weight: bold;" +
            "-fx-text-fill: #284638;"
        );

        // Position the heading in row 0 and span all three columns.
        beverageGrid.add(beverageHeading, 0, 0, 3, 1);

        // Add spacing between the columns and rows.
        beverageGrid.setHgap(10);
        beverageGrid.setVgap(10);

        // Add 20 pixels of space around the grid's contents.
        beverageGrid.setPadding(new Insets(20));

        // Center the heading horizontally within its grid cell.
        GridPane.setHalignment(beverageHeading, HPos.CENTER);

        // Place the beverage grid in the center of the BorderPane.
        root.setCenter(beverageGrid);

        // Create buttons for the available beverages.
        Button latteButton = new Button("Latte");
        Button mochaButton = new Button("Mocha");
        Button americanoButton = new Button("Americano");
        Button cappuccinoButton = new Button("Cappuccino");
        Button chaiButton = new Button("Chai Latte");
        Button dripButton = new Button("Drip Coffee");

        // Connect each beverage button to the order display.
        latteButton.setOnAction(event ->
            addBeverage("Latte", orderItems, status));

        mochaButton.setOnAction(event ->
            addBeverage("Mocha", orderItems, status));

        americanoButton.setOnAction(event ->
            addBeverage("Americano", orderItems, status));

        cappuccinoButton.setOnAction(event ->
            addBeverage("Cappuccino", orderItems, status));

        chaiButton.setOnAction(event ->
            addBeverage("Chai Latte", orderItems, status));

        dripButton.setOnAction(event ->
            addBeverage("Drip Coffee", orderItems, status));

        // Arrange the beverage buttons using column and row indexes.
        beverageGrid.add(latteButton, 0, 1);
        beverageGrid.add(mochaButton, 1, 1);
        beverageGrid.add(americanoButton, 2, 1);

        beverageGrid.add(cappuccinoButton, 0, 2);
        beverageGrid.add(chaiButton, 1, 2);
        beverageGrid.add(dripButton, 2, 2);

        // Create a scene containing the label.
        Scene scene = new Scene(root, 1000, 600);

        // Configure the application window.
        primaryStage.setTitle("The Daily Grind - Coffee Shop POS");
        primaryStage.setScene(scene);
        primaryStage.show();
        }

        // Adds a selected beverage to the order and updates the status.
        private void addBeverage(String beverage, Label orderItems, Label status) {

            String currentOrder = orderItems.getText();

            if (currentOrder.equals("No items selected")) {
                orderItems.setText(beverage);
            } else {
                orderItems.setText(currentOrder + "\n" + beverage);
            }

            status.setText(beverage + " added to order");
        }
    public static void main(String[] args) {
        launch(args);
    }
}
