package com.example.lst;




import javafx.application.Application;
import javafx.collections.FXCollections;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;
import static javafx.scene.paint.Color.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class HelloApplication  {
    public static void Ss(){
        Stage stage1=new Stage();


        stage1.setTitle("IMMIGRATION APPLICANT REGISTRATION");
        Label lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,
                lbl9,lbl10,lbl11,lbl12,lbl13,lbl14,lbl15,lbl16,lbl17,lbl18,lbl19,lbl20;
        lbl1 =new Label("first name ");
        lbl2 =new Label("last name ");
        lbl3 =new Label("Gfather name ");
        lbl4 =new Label("height ");
        lbl5 =new Label(" eyecolor");
        lbl6 =new Label("colorofhair ");
        lbl7 =new Label("occupation ");
        lbl8 =new Label("Gender");
        lbl9 =new Label("dateofbirth");
        lbl10 =new Label("Martialstatus ");
        lbl11 =new Label("REGION");
        lbl12 =new Label("ZONE");
        lbl13 =new Label("WEREDA");
        lbl14 =new Label("KEBELE");
        lbl15 =new Label("PHONE NUMBER");
        lbl16 =new Label("HOUSE NUMBER");
        lbl17=new Label("Email");
        lbl18 =new Label("P.O.Box");
        lbl19 =new Label("application by");
        //style
        lbl9.setStyle("-fx-font: normal bold 20px 'serif' ");
        lbl10.setStyle("-fx-font: normal bold 20px 'serif' ");
        lbl1.setStyle("-fx-font: normal bold 20px 'serif' ");
        lbl2.setStyle("-fx-font: normal bold 20px 'serif' ");
        lbl3.setStyle("-fx-font: normal bold 20px 'serif' ");
        //lbl22.setStyle("-fx-font: normal bold 20px 'serif' ");
        // lbl20 =new Label("HOUSE NUMBER");
        //creating txtfield
        TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15;
        txt1 =new TextField();
        txt2 =new TextField();
        txt3 =new TextField();
        txt4 =new TextField();
        txt5 =new TextField();
        txt6 =new TextField();
        txt7 =new TextField();
        txt8 =new TextField();
        txt9=new TextField();
        txt10 =new TextField();
        txt11=new TextField();
        txt12=new TextField();
        txt13=new TextField();
        txt14=new TextField();
        txt15=new TextField();
        // txt16=new TextField();
        ToggleGroup group = new ToggleGroup();
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        r1.setToggleGroup(group);
        r2.setToggleGroup(group);
        HBox hbx= new HBox();
        hbx.setSpacing(10);
        hbx.getChildren().addAll(r1,r2);
        String str=new String();
        if(r1.isSelected())
             str="male";
        else if (r2.isSelected()) {
             str ="female";
        }
else {
    Alert ab=new Alert(Alert.AlertType.INFORMATION);
ab.setContentText("pls slct gndr");
ab.showAndWait();}
        //combo box for date,month and year


        String days[] =
                { "day","01", "02", "03", "04", "05", "06","07","08","09","10","11", "12","13","14", "15"};
        ComboBox cbx1 =
                new ComboBox(FXCollections
                        .observableArrayList(days));
        cbx1.getSelectionModel().selectFirst();
        String month[] =
                { "Month", "1", "2",
                        "2", "4","5", "6", "7",
                        "8", "9","10", "11", "12",
                };
        ComboBox cbx2 =
                new ComboBox(FXCollections
                        .observableArrayList(month));
        cbx2.getSelectionModel().selectFirst();
        String years[] =
                { "year","2000", "2001", "2002",
                        "2003"};
        ComboBox cbx3 =
                new ComboBox(FXCollections
                        .observableArrayList(years));
        cbx3.getSelectionModel().selectFirst();
        HBox hBox4 = new HBox();
        hBox4.getChildren().addAll(cbx1,cbx2,cbx3 );
        hBox4.setSpacing(10);
        BorderPane pane = new BorderPane();
        GridPane root=new GridPane();
        //creating radio button for martial status
        ToggleGroup group2 = new ToggleGroup();
        RadioButton r3 = new RadioButton("single");
        RadioButton r4 = new RadioButton("maried");
        RadioButton r5= new RadioButton("if other specify");
        r3.setToggleGroup(group2);
        r4.setToggleGroup(group2);
        r5.setToggleGroup(group2);
        HBox hbx2= new HBox();
        hbx2.setSpacing(10);
        hbx2.getChildren().addAll(r3,r4,r5);
        ToggleGroup group3 = new ToggleGroup();
        RadioButton r6 = new RadioButton("applicant ");
        RadioButton r7 = new RadioButton("parent");
        RadioButton r8= new RadioButton("proxy");
        r6.setToggleGroup(group3);
        r7.setToggleGroup(group3);
        r8.setToggleGroup(group3);
        HBox hbx3= new HBox();
        hbx3.setSpacing(10);
        hbx3.getChildren().addAll(r6,r7,r8);
        Button btn2;
        btn2 = new Button("ADD");
        btn2.setOnAction(new Controller(txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,
                txt9,txt10,txt11,txt12,txt13,txt14,str));



        root.addRow( 1,lbl1,txt1,lbl2,txt2,lbl3,txt3,btn2);
        root.addColumn(1,lbl4,lbl5,lbl6,lbl7,lbl8);
        root.addColumn(2,txt4,txt5,txt6,txt7,hbx);
        root.addRow(5,lbl9,cbx1,cbx2,cbx3);
        root.addRow(7,lbl10,hbx2);
        root.addRow(8,lbl11,txt11,lbl12,txt12,lbl13,txt13,lbl14,txt14,lbl15,txt15);
        root.addRow(9,lbl16,txt8,lbl17,txt9,lbl18,txt10);
        root.addRow(11,lbl19,hbx3);
        root.setVgap(20);
        root.setHgap(20);

        root.setBackground(new Background(new BackgroundFill(BISQUE,
                CornerRadii.EMPTY, Insets.EMPTY.EMPTY)));
        Scene scene =new Scene(root,600,600);
        stage1.setScene(scene );
        //  stage1.setResizable(false);
        stage1.show();
    }

    }