/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


// JTextField e JPasswordField.
import InterfaceGrafica.Ex07_Containers.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class FrmConta extends JFrame{
    
//    int     ultimaConta = 0;
    int     ultimaConta = -1;
    Conta[] contas = new Conta[10];
    // Na linha acima as contas foram criadas
       
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
    
    DefaultListModel lista;
    private JLabel lblListaContas;
    private JList lstContas;    
    
    // construtor TextFieldFrame adiciona JTextFields a JFrame
    public FrmConta()
    {
        super("Interface do Formulário");   
        
        MontarInterface();
        
        // Associa eventos
        // rotinas de tratamento de evento registradoras
        EventoHandler handler = new EventoHandler();
        btnLimpar.addActionListener(handler);
        btnNovo.addActionListener(handler);  
    }

    public void MontarInterface()
    {
        // ***** Criando os controles da interface
        lblNumero = new JLabel("Número"); 
        txtNumero = new JTextField(); 

        lblAgencia = new JLabel("Agência"); 
        txtAgencia = new JTextField();

        lblTitular = new JLabel("Titular");
        txtTitular = new JTextField();

        lblSaldo = new JLabel("Saldo");
        txtSaldo = new JTextField(); 
        
        btnNovo = new JButton("Novo");
        btnLimpar = new JButton("Limpar"); 
        
        lblListaContas = new JLabel("Lista de Contas");
        //DefaultListModel lista = new DefaultListModel();
        lista = new DefaultListModel();
        lstContas = new JList(lista);        
      
        
        // Estruturando a interface: 
        // Parte 1 (Formulario) Parte 2 Lista de contas
        // **** Parte 1: Painel com o Formulário
        JPanel formularioPane = new JPanel();
        // Gerenciador de Layout
        formularioPane.setLayout(new GridLayout(6, 2));
        // UMa borda em volta
        formularioPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Adicionando os controles
        formularioPane.add(lblNumero);        formularioPane.add(txtNumero);
        formularioPane.add(lblAgencia);       formularioPane.add(txtAgencia);        
        formularioPane.add(lblTitular);       formularioPane.add(txtTitular);
        formularioPane.add(lblSaldo);         formularioPane.add(txtSaldo);
        formularioPane.add(btnNovo);          formularioPane.add(btnLimpar);
       
        // Parte 2 : Painel com a lista de contas 
        //add(lstContas);        
        JScrollPane listScroller = new JScrollPane(lstContas);
        listScroller.setPreferredSize(new Dimension(250, 80));
        listScroller.setAlignmentX(LEFT_ALIGNMENT);

        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
        listPane.add(lblListaContas);
        listPane.add(Box.createRigidArea(new Dimension(0,5)));
        listPane.add(listScroller);
        listPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        // **** Montando as partes maiores
        // O container da Janela (ContentPane) e 
        // Os dois paineis com Formulário (superior-Norte) e Lista (Centro)       
        Container contentPane = getContentPane();
        contentPane.add(formularioPane, BorderLayout.NORTH);          
        contentPane.add(listPane, BorderLayout.CENTER); 
    }
   
    
    public void MontarLista()
    {
        int i;
        Conta aux;
        lista.clear();
        for(i=0; i<=ultimaConta; i++)
        {
            aux = contas[i];
            String str = aux.getNomeTitular() + "  - Num : " + aux.getNumero();
            lista.addElement(str);  // DefaultListModel atributo de JFrame       
        }        
    }
    public void NovaConta()
    {
        Conta c = new Conta();
        
        c.setNomeTitular(txtTitular.getText());

        int aux = Integer.parseInt(txtNumero.getText());
        c.setNumero(aux);

        aux = Integer.parseInt(txtAgencia.getText());
        c.setAgencia(aux);

        double saldo = Double.parseDouble(txtSaldo.getText());
        c.setValor(saldo);        
        
        // Adicionando o objeto no vetor
        ultimaConta++;
        contas[ultimaConta] = c;
        
        JOptionPane.showMessageDialog(null, 
                    "Objeto criado com sucesso! Numero : " + c.getNumero() + " Total : " + (ultimaConta+1));
      
        MontarLista();
        LimparCampos();
    }
    
    public void LimparCampos()
    {
        txtAgencia.setText("");
        txtNumero.setText("");
        txtTitular.setText("");
        txtSaldo.setText("");
    }
    
    // classe interna private para tratamento de evento
    private class EventoHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String string = "";

            if (event.getSource() == btnLimpar)
            {
                 string = String.format("btnLimpar: %s", 
                                 event.getActionCommand());
                 LimparCampos();
            }
            else if (event.getSource() == btnNovo)
            {
                 string = String.format("btnNovo: %s", 
                                 event.getActionCommand());
                 NovaConta();
            }
            JOptionPane.showMessageDialog(null, string);
        }
    } 
    
    public static void main(String[] args)
    {
        FrmConta  f = new FrmConta();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(400, 200);
        f.setBounds(300, 300, 600, 400);
        f.setVisible(true);
    }   
}