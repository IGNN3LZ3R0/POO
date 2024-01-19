import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datito extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton unirButton;
    private JButton unionButton;
    private JButton cerrarButton;
    private JPanel Jpanel1;
    private JButton limpiarButton;
    private JLabel Valor1;
    private JLabel Valor2;
    private JLabel Resultado;
    private JTextField textField3;

    public datito(){
        super("Operaciones");
        setContentPane(Jpanel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double Valor1 = Double.parseDouble(textField2.getText());
                    double Valor2 = Double.parseDouble(textField1.getText());
                    double reciberesutados= Valor1+Valor2;
                    textField3.setText(Double.toString(reciberesutados));
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }
        });
        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String nombre=datito.this.textField2.getText();
            String saludo="Hola "+ nombre;

            JOptionPane.showMessageDialog(null, saludo);
            }
        });

    }

}
