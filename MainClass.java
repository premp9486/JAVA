package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JFrame implements ActionListener {
    String acctype;
    String meter_pass;
    MainClass(String acctype, String meter_pass){
        this.meter_pass = meter_pass;
        this.acctype = acctype;
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash/ebs.png"));
        Image image = imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLable = new JLabel(imageIcon2);
        add(imageLable);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerImage));
        newcustomer.addActionListener(this);
        menu.add(newcustomer);

        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/customerDetails.png"));
        Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsImage));
        customerdetails.addActionListener(this);
        menu.add(customerdetails);

        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon depositdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/depositdetails.png"));
        Image depositdetailsImage = depositdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(depositdetailsImage));
        depositdetails.addActionListener(this);
        menu.add(depositdetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatebillImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/calculatorbills.png"));
        Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillImage));
        calculatebill.addActionListener(this);
        menu.add(calculatebill);


        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));




        JMenuItem viewInfo =new JMenuItem("View Information");
        viewInfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon viewInfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/information.png"));
        Image viewInfoImage = viewInfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewInfo.setIcon(new ImageIcon(viewInfoImage));
        viewInfo.addActionListener(this);
        info.add(viewInfo);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem paybill =new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/pay.png"));
        Image paybillImage = paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        paybill.addActionListener(this);
        user.add(paybill);

        JMenuItem billdetails =new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/details.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        billdetails.addActionListener(this);
        user.add(billdetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem genBill =new JMenuItem("Generate Bill");
        genBill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/bill.png"));
        Image genBillImage = genBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImage));
        genBill.addActionListener(this);
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem notepad =new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        notepad.addActionListener(this);
        utility.add(notepad);


        JMenuItem calculator =new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem eexit =new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/splash/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        eexit.addActionListener(this);
        exit.add(eexit);

        if (acctype.equals("Admin")){
            menuBar.add(menu);
        }else {
            menuBar.add(bill);
            menuBar.add(user);
            menuBar.add(info);
        }
        menuBar.add(utility);
        menuBar.add(exit);


        setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("New Customer")) {
            new newCustomer();
        } else if (msg.equals("Customer Details")) {
            new customer_details();
        } else if (msg.equals("Deposit Details")) {
            new deposit_details();
        } else if (msg.equals("Calculate Bill")) {
            new calculate_bill();
        } else if (msg.equals("View Information")) {
            new ViewInformation(meter_pass);
        } else if (msg.equals("Bill Details")) {
            new BillDetails(meter_pass);
        } else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Exit")) {
            setVisible(false);
            new Login();
        }else if (msg.equals("Pay Bill")) {
            new pay_bill(meter_pass);
        } else if (msg.equals("Generate Bill")) {
            new GenerateBill(meter_pass);
        }
    }

    public static void main(String[] args) {
        new MainClass("","");
    }
}