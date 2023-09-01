
package tallerperrocodificada;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Tallerperrocodificada extends JFrame implements ActionListener{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
 
    JButton b1;
    
    public static void main(String[] args) {
       Tallerperrocodificada perros=new Tallerperrocodificada();
    }
    
    public Tallerperrocodificada () {
        
        setBounds(100, 100, 500, 300);
        setLayout(new FlowLayout());
        
        l1=new JLabel("ingrese el numero de perros pequeños");
        
        l2=new JLabel("ingrese el numero de perros medianos");
        l3=new JLabel("ingrese el numero de perros grandes");
        l4=new JLabel("ingrese el numero de horas que quiere pasear los perros");
        l5=new JLabel();
        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerperrocodificada/per.jpg")));
        l5.setSize(0xfa, 250);
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t4=new JTextField(10);
        
        b1=new JButton("Calcular");
        b1.addActionListener(this);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        
        add(l5);
        
        add(b1);
        
        setVisible(true); 
        
    }
   @Override
    
    public void actionPerformed(ActionEvent e) {
        String accion=e.getActionCommand();
        
        
        if (accion.equals("Calcular")) {
            
            int total = Integer.parseInt(t3.getText()) +
            Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            int h1 = Integer.parseInt(t4.getText());
            
         if (total==1) {
            int p1 = Integer.parseInt(t1.getText())*Integer.parseInt(t4.getText())*3000;
            int p2 = Integer.parseInt(t2.getText())*Integer.parseInt(t4.getText())*5000;
            int p3 = Integer.parseInt(t3.getText())*Integer.parseInt(t4.getText())*10000;
            
            int totalp=p1+p2+p3;
            
            JOptionPane.showMessageDialog(this, "el total que tienes que pagar por\n pasear a los perros es de: "+totalp);
         }else if (total>1) {
            int p1 = Integer.parseInt(t1.getText())*Integer.parseInt(t4.getText())*3000;
            int p2 = Integer.parseInt(t2.getText())*Integer.parseInt(t4.getText())*5000;
            int p3 = Integer.parseInt(t3.getText())*Integer.parseInt(t4.getText())*10000;
            
            int totala=p1+p2+p3;
            int totalw=totala-(totala/10);
            
            JOptionPane.showMessageDialog(this, "el total que tienes que pagar por pasear\n a los perros con descuento es de: "+totalw);
        }
    }
}
}
