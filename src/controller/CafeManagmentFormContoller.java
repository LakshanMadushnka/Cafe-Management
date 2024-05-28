package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.print.PrinterJob;
import javafx.scene.control.TextArea;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.print.PrinterException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CafeManagmentFormContoller implements Initializable {

    public Spinner quantitySpinner111;
    public Spinner quantitySpinner1;
    public Spinner quantitySpinner132;
    public Spinner quantitySpinner13;
    public Spinner quantitySpinner2;
    public Spinner quantitySpinner14;
    public Spinner quantitySpinner121;
    public Spinner quantitySpinner131;
    public Spinner quantitySpinner3;
    public Spinner quantitySpinner15;
    public Spinner quantitySpinner112;
    public Spinner quantitySpinner122;
    public Spinner quantitySpinner12;
    public Label TxtDate;
    public Label TxtTime;
    public javafx.scene.control.TextArea TextArea;
    public TextField serviceChargeField1;
    public TextField subTotalField;
    public TextField totalField;
    public CheckBox p1;
    public CheckBox p2;
    public CheckBox p3;
    public CheckBox p4;
    public CheckBox p5;
    public CheckBox p6;
    public CheckBox p7;
    public CheckBox p8;
    public CheckBox p9;
    public CheckBox p10;
    public CheckBox p11;
    public CheckBox p12;
    public CheckBox p13;
    public CheckBox p14;
    public CheckBox p15;
    public Label itemName1;
    public Label itemName2;
    public Label itemName3;
    public Label itemName4;
    public Label itemName5;
    public Label itemName6;
    public Label itemName7;
    public Label itemName8;
    public Label itemName9;
    public Label itemName10;
    public Label itemName11;
    public Label itemName12;
    public Label itemName13;
    public Label itemName14;
    public Label itemName15;
    public Button btnTotal;

    @FXML
    private Spinner<Integer> quantitySpinner;

    @FXML
    private Spinner<Integer> quantitySpinner5555;

    @FXML
    private Label image01;

    @FXML
    private Label image02;

    @FXML
    private Label image03;

    @FXML
    private Label image04;

    @FXML
    private Label image05;

    @FXML
    private Label image06;

    @FXML
    private Label image07;

    @FXML
    private Label image08;

    @FXML
    private Label image09;

    @FXML
    private Label image10;

    @FXML
    private Label image11;

    @FXML
    private Label image12;

    @FXML
    private Label image13;

    @FXML
    private Label image14;

    @FXML
    private Label image15;


        private double total=0.0;
        private int x=0;
        private double srvcCharge;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner.setValueFactory(valueFactory);
        quantitySpinner.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner5555.setValueFactory(valueFactory1);
        quantitySpinner5555.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner111.setValueFactory(valueFactory2);
        quantitySpinner111.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner1.setValueFactory(valueFactory3);
        quantitySpinner1.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner132.setValueFactory(valueFactory4);
        quantitySpinner132.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner13.setValueFactory(valueFactory5);
        quantitySpinner13.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner2.setValueFactory(valueFactory6);
        quantitySpinner2.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory7 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner14.setValueFactory(valueFactory7);
        quantitySpinner14.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory8 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner121.setValueFactory(valueFactory8);
        quantitySpinner121.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory9 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner131.setValueFactory(valueFactory9);
        quantitySpinner131.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory10 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner3.setValueFactory(valueFactory10);
        quantitySpinner3.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory11 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner15.setValueFactory(valueFactory11);
        quantitySpinner15.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory12 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner112.setValueFactory(valueFactory12);
        quantitySpinner112.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory13 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner122.setValueFactory(valueFactory13);
        quantitySpinner122.setEditable(true);

        SpinnerValueFactory<Integer> valueFactory14 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 1);
        quantitySpinner12.setValueFactory(valueFactory14);
        quantitySpinner12.setEditable(true);


        TextArea.setEditable(false);

        setImage();
        setTime();
        serviceChargeField1.setText("0.0");
        subTotalField.setText("0.0");
        totalField.setText("0.0");


    }

    private void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                    }

                    // Get the current date and time
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);

                    // Update the UI on the JavaFX Application Thread
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            TxtTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                            TxtDate.setText(df.format(date));

                        }
                    });
                }
            }
        }).start();
    }

    public void btnExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnReset(ActionEvent actionEvent) {
        total = 0.0;
        x =0;
        btnTotal.setDisable(false);
        quantitySpinner.getValueFactory().setValue(0);
        quantitySpinner5555.getValueFactory().setValue(0);
        quantitySpinner111.getValueFactory().setValue(0);
        quantitySpinner132.getValueFactory().setValue(0);
        quantitySpinner1.getValueFactory().setValue(0);
        quantitySpinner13.getValueFactory().setValue(0);
        quantitySpinner2.getValueFactory().setValue(0);
        quantitySpinner14.getValueFactory().setValue(0);
        quantitySpinner121.getValueFactory().setValue(0);
        quantitySpinner131.getValueFactory().setValue(0);
        quantitySpinner3.getValueFactory().setValue(0);
        quantitySpinner15.getValueFactory().setValue(0);
        quantitySpinner112.getValueFactory().setValue(0);
        quantitySpinner122.getValueFactory().setValue(0);
        quantitySpinner12.getValueFactory().setValue(0);
        serviceChargeField1.setText("0.0");
        subTotalField.setText("0.0");
        totalField.setText("0.0");
        TextArea.setText("");
        p1.setSelected(false);
        p2.setSelected(false);
        p3.setSelected(false);
        p4.setSelected(false);
        p5.setSelected(false);
        p6.setSelected(false);
        p7.setSelected(false);
        p8.setSelected(false);
        p9.setSelected(false);
        p10.setSelected(false);
        p11.setSelected(false);
        p12.setSelected(false);
        p13.setSelected(false);
        p14.setSelected(false);
        p15.setSelected(false);



        


        
    }

    public void setImage() {
        loadImage("/images/coldcoffee.jpg", image01);
        loadImage("/images/cappuccinocoffee.jpg", image02);
        loadImage("/images/chocolatecoffee.jpg", image03);
        loadImage("/images/greentea.jpg", image04);
        loadImage("/images/mineralswater.png", image05);
        loadImage("/images/strawberrycake.jpg", image06);
        loadImage("/images/chocolatecake.jpg", image07);
        loadImage("/images/fruitscake.jpg", image08);
        loadImage("/images/rainbow.jpg", image09);
        loadImage("/images/coke.jpg", image10);
        loadImage("/images/vegetarianpizza.jpg", image11);
        loadImage("/images/chickenburger.jpg", image12);
        loadImage("/images/chickennoodles.jpg", image13);
        loadImage("/images/7up.jpg", image14);
        loadImage("/images/orange_juice.jpg", image15);
    }

    private void loadImage(String path, Label label) {
        try {
            URL imageUrl = getClass().getResource(path);
            if (imageUrl == null) {
                System.err.println("Error: Image not found at path " + path);
                return;
            }
            Image image = new Image(imageUrl.toExternalForm());
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(label.getMaxWidth());
            imageView.setFitHeight(label.getPrefHeight());
            imageView.setPreserveRatio(true);
            label.setGraphic(imageView);
        } catch (Exception e) {
            System.err.println("Error loading image: " + path);
            e.printStackTrace();
        }
    }

    public boolean qtyIsZero(int qty){
        if(qty==0){
            JOptionPane.showMessageDialog(null, "Please increase the item quantity!");
            return false;
        }
        return true;
    }

    public void serviceChargeField(ActionEvent actionEvent) {
        
    }



    public void prchsCheckBox(ActionEvent actionEvent) {
        int qty =Integer.parseInt(quantitySpinner.getValue().toString());


        if (qtyIsZero(qty) && p1.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty*500.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName1.getText()+" .(x"+qty+")"+"\t\t\t "+price+"\n");
            dudate();
        }else {
            p1.setSelected(false);
        }


    }

    public void prchsCheckBox1(ActionEvent actionEvent) {
        int qty1 =Integer.parseInt(quantitySpinner1.getValue().toString());


        if (qtyIsZero(qty1) && p2.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty1*700.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName2.getText()+" .(x"+qty1+")"+"\t "+price+"\n");

            dudate();
        }else {
            p2.setSelected(false);
        }


}


    public void prchsCheckBox2(ActionEvent actionEvent) {
        int qty2 =Integer.parseInt(quantitySpinner5555.getValue().toString());


        if (qtyIsZero(qty2) && p3.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty2*600.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName3.getText()+" .(x"+qty2+")"+"\t\t"+price+"\n");

            dudate();
        }else {
            p3.setSelected(false);
        }
    }

    public void prchsCheckBox3(ActionEvent actionEvent) {
        int qty3 =Integer.parseInt(quantitySpinner12.getValue().toString());


        if (qtyIsZero(qty3) && p4.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty3*400.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName4.getText()+" .(x"+qty3+")"+"\t\t\t"+price+"\n");

            dudate();
        }else {
            p4.setSelected(false);
        }
    }

    public void prchsCheckBox4(ActionEvent actionEvent) {
        int qty4 =Integer.parseInt(quantitySpinner13.getValue().toString());


        if (qtyIsZero(qty4) && p5.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty4*100.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName5.getText()+" .(x"+qty4+")"+"\t\t\t\t"+price+"\n");

            dudate();
        }else {
            p5.setSelected(false);
        }
    }

    public void prchsCheckBox5(ActionEvent actionEvent) {
        int qty5 =Integer.parseInt(quantitySpinner2.getValue().toString());


        if (qtyIsZero(qty5) && p6.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty5*550.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName6.getText()+" .(x"+qty5+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p6.setSelected(false);
        }
    }

    public void prchsCheckBox6(ActionEvent actionEvent) {
        int qty6 =Integer.parseInt(quantitySpinner14.getValue().toString());


        if (qtyIsZero(qty6) && p7.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty6*550.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName7.getText()+" .(x"+qty6+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p7.setSelected(false);
        }
    }

    public void prchsCheckBox7(ActionEvent actionEvent) {
        int qty7 =Integer.parseInt(quantitySpinner111.getValue().toString());


        if (qtyIsZero(qty7) && p8.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty7*400.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName8.getText()+" .(x"+qty7+")"+"\t\t\t "+price+"\n");

            dudate();
        }else {
            p8.setSelected(false);
        }
    }

    public void prchsCheckBox8(ActionEvent actionEvent) {
        int qty8 =Integer.parseInt(quantitySpinner121.getValue().toString());


        if (qtyIsZero(qty8) && p9.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty8*500.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName9.getText()+" .(x"+qty8+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p9.setSelected(false);
        }
    }

    public void prchsCheckBox9(ActionEvent actionEvent) {
        int qty9 =Integer.parseInt(quantitySpinner131.getValue().toString());


        if (qtyIsZero(qty9) && p10.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty9*150.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName10.getText()+" .(x"+qty9+")"+"\t\t\t "+price+"\n");

            dudate();
        }else {
            p10.setSelected(false);
        }
    }

    public void prchsCheckBox10(ActionEvent actionEvent) {
        int qty10 =Integer.parseInt(quantitySpinner3.getValue().toString());


        if (qtyIsZero(qty10) && p11.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty10*800.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName11.getText()+" .(x"+qty10+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p11.setSelected(false);
        }
    }

    public void prchsCheckBox11(ActionEvent actionEvent) {
        int qty11 =Integer.parseInt(quantitySpinner15.getValue().toString());


        if (qtyIsZero(qty11) && p12.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty11*750.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName12.getText()+" .(x"+qty11+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p12.setSelected(false);
        }
    }

    public void prchsCheckBox12(ActionEvent actionEvent) {
        int qty12 =Integer.parseInt(quantitySpinner112.getValue().toString());


        if (qtyIsZero(qty12) && p13.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty12*800.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName13.getText()+" .(x"+qty12+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p13.setSelected(false);
        }
    }

    public void prchsCheckBox13(ActionEvent actionEvent) {
        int qty13 =Integer.parseInt(quantitySpinner122.getValue().toString());


        if (qtyIsZero(qty13) && p14.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty13*150.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName14.getText()+" .(x"+qty13+")"+"\t\t\t         "+price+"\n");

            dudate();
        }else {
            p14.setSelected(false);
        }
    }

    public void prchsCheckBox14(ActionEvent actionEvent) {
        int qty14 =Integer.parseInt(quantitySpinner132.getValue().toString());


        if (qtyIsZero(qty14) && p15.isSelected()){
            x++;
            if(x==1){
                mataraCafe();
            }
            double price = qty14*400.00;
            total +=price;
            TextArea.setText(TextArea.getText()+x+". "+itemName15.getText()+" .(x"+qty14+")"+"\t\t "+price+"\n");

            dudate();
        }else {
            p15.setSelected(false);
        }
    }





    private void mataraCafe() {
        int purchaseId = 15020 + (int) (Math.random() * 80800);
        TextArea.setText("***************************** Matara Cafe ****************************\n"
                +"TIme: "+TxtTime.getText()+"         \t\t\t      Date: "+TxtDate.getText()+"\n"
                +"Purchase Id:  " + purchaseId+"\n"
                +"***********************************************************************\n\n"
                +"Item Name:\t\t\t\t"+"Price (Rs.)\n");
    }


    public void dudate(){
        serviceChargeField1.setText(String.valueOf(String.format("%.2f",(total/20))));
        subTotalField.setText(String.valueOf(String.format("%.2f",total)));
        totalField.setText(String.valueOf(String.format("%.2f",(total+(total/20)))));
    }


    public void btnTotalOnAction(ActionEvent actionEvent) {
        if(total == 0.0){
            JOptionPane.showMessageDialog(null, "You haven't select any item!");
        }else{
            TextArea.setText(TextArea.getText()
                    +"\n\n\n\n\n\n***********************************************************************\n\n"
                    +"Service charge (5%): \t\t\t"+"Rs."+total/20+"\n"
                    +"Sub Total: \t\t\t\t\t"+"Rs."+total+"\n"
                    +"Total: \t\t\t\t\t        "+"Rs."+(total+(total/20))+"\n\n"
                    +"****************************** Thank You! *****************************\n"
            );
            btnTotal.setDisable(true);
        }
    }


    public void btnReceipt(ActionEvent actionEvent) {
        if (total != 0 && btnTotal.isDisable()) {
            PrinterJob job = PrinterJob.createPrinterJob();
            if (job != null) {
                boolean proceed = job.showPrintDialog(null); // Show print dialog to the user
                if (proceed) {
                    boolean printed = job.printPage(TextArea);
                    if (printed) {
                        job.endJob();
                    } else {
                        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Printing failed.");
                    }
                } else {
                    Logger.getLogger(getClass().getName()).log(Level.INFO, "Print job was cancelled.");
                }
            } else {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Could not create a print job.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any item");
        }
    }

}


