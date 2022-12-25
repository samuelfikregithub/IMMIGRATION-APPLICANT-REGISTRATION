package com.example.lst;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.Statement;

public class Controller implements EventHandler<ActionEvent> {
    String str1, str2,str3,str4,str5 ,str6, str7 ,str8 ,str9 ,str10,str11,str12,str13,str14,str= null;
    TextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8,txt9,txt10,txt11,txt12,txt13,txt14;
    //CheckBox cb1, cb2;
    Alert al = new Alert(Alert.AlertType.INFORMATION);

   public Controller(TextField txt1, TextField txt2, TextField txt3,
                     TextField txt4, TextField txt5, TextField txt6 , TextField txt7,
                     TextField txt8, TextField txt9,
                     TextField txt10, TextField txt11, TextField txt12, TextField txt13, TextField txt14,String strt1) {

       this.txt1 = txt1;
       str=strt1;
       this.txt2 = txt2;
       this.txt3 = txt3;
       this.txt4 = txt4;
       this.txt5= txt5;
       this.txt6= txt6;
       this.txt7= txt7;
       this.txt8 = txt8;
       this.txt9 = txt9;
       this.txt10 = txt10;
       this.txt11 = txt11;
       this.txt12= txt12;
       this.txt13= txt13;
      //this.txt14= txt14;
       Db conectionDb =new Db();
       conectionDb.conMethod()  ;
   }

    @Override
    public void handle(ActionEvent event) {

        str1 = txt1.getText();
        str2= txt2.getText();
        str3= txt3.getText();
        str4 = txt4.getText();
        str5 = txt5.getText();
        str6= txt6.getText();
        str7= txt7.getText();
        str8= txt8.getText();
        str9= txt9.getText();
        str10= txt10.getText();
        str11= txt11.getText();
        str12= txt12.getText();
        str13= txt13.getText();
      //  str14= txt14.getText();

       Db connectionDB=new Db();
       connectionDB.conMethod();


        queryHandler();
        //Alert a = new Alert(Alert.AlertType.WARNING, "this is out class handler11" + str + str2);
        //a.show();
    }

    private void queryHandler() {
        try {
            String query = "Insert into REG(FNAME,LNAME,GFNAME,HEIGHT,EYECOLOR,HAIRCOLOR" +
                    ",OCCUPATION,REGION,ZONE,KEBELE,PHONENUM,HOUSENUM,GENDER)" +
                    " VALUES('" + str1 + "','" + str2 + "','" + str3 + "','" + str4 + "','" + str9 +
                    "','" + str6 + "','" + str7 + "','" + str12 + "'," +
                    "'" + str5 + "','" + str10 + "','" + str8 + "','" + str11 + "','"+ str +"')";
            Db db = new Db();
            Connection connection = db.conMethod();
            Statement statement = connection.createStatement();
            boolean status = statement.execute(query);
            if (!status) {
                al.setContentText("successfuly inserted");
                al.showAndWait();
            } else {
                al.setContentText("Not successfuly inserted");
                al.showAndWait();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

}