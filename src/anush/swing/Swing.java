//package anush.swing;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//class Swing extends Frame implements ActionListener {
//    Button yes= new Button("yes");
//    String msg="";
//    Label l= new Label(msg);
//    Swing(String s){
//        super(s);
//        add(yes);
//        yes.addActionListener(this);
//    }
//    public void actionEvent(ActionEvent actionEvent){
//        String ac= actionEvent.getActionCommand();
//        if(ac=="yes"){
//            msg="yes prwdfs";
//        }
//        l.setText(msg);
//    }
//
//    public static void main(String[] args) {
//        Swing sw= new Swing("Sw");
//        sw.setSize(100,100);
//        sw.setVisible(true);
//    }
//}
