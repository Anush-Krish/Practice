//package anush.swing;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SwingAl extends Frame implements ActionListener {
//    String msg="";
//    Button yes=new Button("yes");
//    Button no=new Button("no");
//    Button maybe=new Button("maybe");
//    Label l = new Label(msg);
//    SwingAl(String s){
//        super(s);
//        setLayout(new FlowLayout());
//        add(yes);
//        add(no);
//        add(maybe);
//        add(l);
//        yes.addActionListener(this);
//        no.addActionListener(this);
//        maybe.addActionListener(this);
//
//    }
//    public void actionListner(ActionEvent actionEvent){
//        String ac= actionEvent.getActionCommand();
//        if(ac=="yes"){
//            msg="yes pressed";
//        }
//
//
//        l.setText(msg);
//    }
//
//    public static void main(String[] args) {
//        SwingAl al = new SwingAl("Button");
//        al.setSize(100,100);
//        al.setVisible(true);
//    }
//
//}
