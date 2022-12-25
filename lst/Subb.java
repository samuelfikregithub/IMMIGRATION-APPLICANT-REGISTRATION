package com.example.lst;

        import javafx.application.Application;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.*;
        import javafx.scene.text.Font;
        import javafx.scene.text.FontWeight;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import static javafx.scene.paint.Color.*;

public class Subb extends Application {



    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(" Welcome to IMMigration service");
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        Text txt = new Text("Welcome to emigration service");
        txt.setFont(Font.font("aroma", FontWeight.THIN, 20));
        root.add(txt, 0, 0, 2, 1);

        Label lbl21 = new Label("User-ID:");
        root.add(lbl21, 0, 1);


        TextField txt21 = new TextField();
        root.add(txt21, 1, 1);

        Label lbl22 = new Label("Password:");
        root.add(lbl22, 0, 2);

        PasswordField txt22 = new PasswordField();
        root.add(txt22, 1, 2);

        Button btn = new Button("LOGIN");
        VBox vBtn = new VBox(10);
        //Styling nodes
        btn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");


        txt.setStyle("-fx-font: normal bold 20px 'serif' ");
        lbl21.setStyle("-fx-font: normal bold 20px 'serif' ");
        lbl22.setStyle("-fx-font: normal bold 20px 'serif' ");
        root.setStyle("-fx-background-color:WHEAT;");
        vBtn.setAlignment(Pos.BOTTOM_LEFT);
        vBtn.getChildren().add(btn);
        root.add(vBtn, 1, 4);

        btn.setOnAction(actionEvent ->
        {


            //  if(actionEvent.getSource()==btn){
            //    root=new GridPane();

          Db con =new Db();
            con.conMethod();
            HelloApplication.Ss();
        });

        root.setBackground(new Background(new BackgroundFill(PERU,
                CornerRadii.EMPTY, Insets.EMPTY.EMPTY)));
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    };
    public static void main(String[] args) {
        launch();
    }
}
