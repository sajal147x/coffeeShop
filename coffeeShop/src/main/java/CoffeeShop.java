import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;

public class CoffeeShop extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to MoonBucks");
		buildOrders neworder = new buildOrders();
		BorderPane moonbucks = new BorderPane();
		BackgroundImage backGround = new BackgroundImage(new Image("coffeewallpaper.jpg",1280,720,false,false), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		new BackgroundSize(1.0, 1.0, true, true, false, false));
		moonbucks.setBackground(new Background(backGround));
		Scene scene = new Scene(moonbucks,1280,720);
		//creating the start button
		Button startButton = new Button("START ORDER");
		startButton.setPrefSize(110,70);
		startButton.setStyle("-fx-background-color: black;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		//creating the delete button
		Button deleteButton = new Button("DELETE ORDER");
		deleteButton.setPrefSize(150,70);
		deleteButton.setStyle("-fx-background-color: black;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		//creating the add cream button
		Button addCream = new Button("ADD CREAM");
		addCream.setPrefSize(110,50);
		addCream.setStyle("-fx-background-color: saddlebrown;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		addCream.setVisible(false);
		// creatin the add sugar
		Button addSugar = new Button("ADD SUGAR");
		addSugar.setPrefSize(110,50);
		addSugar.setStyle("-fx-background-color: saddlebrown;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		addSugar.setVisible(false);
		// creating the extra shot
		Button addShot = new Button("ADD SHOT");
		addShot.setPrefSize(110,50);
		addShot.setStyle("-fx-background-color: saddlebrown;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		addShot.setVisible(false);
		// creating the add protein
		Button addProtein = new Button("ADD WHEY PROTEIN");
		addProtein.setPrefSize(150,50);
		addProtein.setStyle("-fx-background-color: saddlebrown;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		addProtein.setVisible(false);
		// creating the add tequila
		Button addTequila = new Button("ADD TEQUILA");
		addTequila.setPrefSize(110,50);
		addTequila.setStyle("-fx-background-color: saddlebrown;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		addTequila.setVisible(false);
		// creating the display button
		Button display = new Button("DISPLAY ORDER");
		display.setPrefSize(150,70);
		display.setStyle("-fx-background-color: black;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: white;"+
				"-fx-border-radius: 5;");
		display.setVisible(false);

		VBox orderBox = new VBox(addCream, addSugar, addShot, addProtein, addTequila, display);
		orderBox.setSpacing(20);

		HBox startBox = new HBox(startButton, deleteButton);
		startBox.setSpacing(30);
		startBox.setPadding(new Insets(40,0,30,100));
		orderBox.setPadding(new Insets(60,0,40,80));
		TextArea orderSummary = new TextArea();
		orderSummary.setStyle("-fx-background-color: saddlebrown;"+
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 5;" +
				"-fx-border-color: white;"+
				"-fx-font-weight: bold;"+
				"-fx-text-fill: black;"+
				"-fx-border-radius: 5;");
		orderSummary.setEditable(false);
		VBox textareabox = new VBox(orderSummary);
		textareabox.setPadding(new Insets(0,20,200,0));
		moonbucks.setLeft(orderBox);
		moonbucks.setRight(textareabox);
		moonbucks.setTop(startBox);
		//button actions
		startButton.setOnAction(e -> {
			addCream.setVisible(true);
			addShot.setVisible(true);
			addSugar.setVisible(true);
			addTequila.setVisible(true);
			addProtein.setVisible(true);
			display.setVisible(true);
		});
		deleteButton.setOnAction(event -> {
			orderSummary.setText("");
			neworder.newCoffee();
			addCream.setVisible(false);
			addShot.setVisible(false);
			addSugar.setVisible(false);
			addTequila.setVisible(false);
			addProtein.setVisible(false);
			display.setVisible(false);
			addCream.setDisable(false);
			addProtein.setDisable(false);
			addShot.setDisable(false);
			addSugar.setDisable(false);
			addTequila.setDisable(false);
		});
		addCream.setOnAction(event -> {neworder.addCream();
		addCream.setDisable(true);});
		addProtein.setOnAction(event -> {neworder.addWhey();
		addProtein.setDisable(true);});
		addShot.setOnAction(event -> {neworder.addExtraShot();
		addShot.setDisable(true);});
		addSugar.setOnAction(event -> {neworder.addSugar();
		addSugar.setDisable(true);});
		addTequila.setOnAction(event -> {neworder.addTequila();
		addTequila.setDisable(true);});
		display.setOnAction(event -> {orderSummary.setText("Black Coffee: $3.99+ \n" + neworder.orderDetails + "Total Cost: " + neworder.returnCost());});

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
