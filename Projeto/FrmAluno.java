
// JTextField e JPasswordField.
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class FrmAluno extends JFrame{

    Aluno a;

    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblEmail;
    private JTextField txtEmail;

    private JLabel lblCPF;
    private JTextField txtCPF;

    private JLabel lblMatricula;
    private JTextField txtMatricula;

    private JLabel lblData;
    private JTextField txtData;

    private JButton btnNovo;
    private JButton btnLimpar;

    //COnstrutor TextFieldFrame adiciona JTextFields a JFrame 
    public FrmAluno(){
        super("Interface do Formulario");
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(5, 2));

        lblNome = new JLabel();
        lblNome.setText("Nome");
        txtNome = new JTextField();
        add(lblNome);
        add(txtNome);

        btnNovo = new JButton();
        btnNovo.setText("Novo");
        btnLimpar = new JButton(); 
        btnLimpar.setText("Limpar");
        add(btnNovo);
        add(btnLimpar);
 
        }


    
}
