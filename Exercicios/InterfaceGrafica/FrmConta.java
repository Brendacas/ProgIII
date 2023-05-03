package InterfaceGrafica;



import java.awt.Container;
//JTextField e JPassowordField.
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class FrmConta extends JFrame{

 //   ContaUI c;

    private JLabel lblNumero;
    private JTextField txtNumero;

    
    private JLabel lblAgencia;
    private JTextField txtAgencia;

    
    private JLabel lblTitular;
    private JTextField txtTitular;

    private JLabel lblSaldo;  
    private JTextField txtSaldo; 
    
    private JButton btnNovo;
    private JButton btnLimpar;

    //construtor TextFieldFrame adiciona JTextFields a JFrame 
    public FrmConta(){
        super("Interface do Formulário");
        //setLayout(new FlowLayout());
        setLayout(new FlowLayout());

        lblNumero = new JLabel();
        lblNumero.setText("Numero");
        txtNumero = new JTextField(); 
        add(lblNumero);
        add(txtNumero);

        lblAgencia = new JLabel();
        lblAgencia.setText("Agencia");
        txtAgencia = new JTextField();
        add(lblAgencia);
        add(txtAgencia);



    }

    public static void main(String[] args)
    {
        FrmConta  f = new FrmConta();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(400, 200);
        f.setBounds(300, 300, 400, 200);
        f.setVisible(true);
    }   
}






