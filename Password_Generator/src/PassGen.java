import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.util.Random;

    public class PassGen {

        private JFrame frame;
        private JTextField textResult;
        private final ButtonGroup buttonGroup = new ButtonGroup();

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        PassGen window = new PassGen();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        public void passGenerator(int len) {
            String str1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
            StringBuilder str2 = new StringBuilder();
            Random rand = new Random();
            while (0 < len--) {
                str2.append(str1.charAt(rand.nextInt(str1.length())));
            }
            textResult.setText(str2.toString());
        }

        public PassGen() {
            initialize();
        }

        private void initialize() {
            frame = new JFrame();
            frame.setBounds(100, 100, 764, 550);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setLayout(null);

            JLabel lblNewLabel = new JLabel("\tGENERATED PASSWORD");
            lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
            lblNewLabel.setBackground(new Color(153, 0, 102));
            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel.setBounds(268, 99, 239, 44);
            frame.getContentPane().add(lblNewLabel);

            JLabel lblNewLabel_1 = new JLabel("STRONG PASSORD GENERATOR");
            lblNewLabel_1.setForeground(new Color(102, 0, 51));
            lblNewLabel_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
            lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_1.setBounds(10, 23, 410, 44);
            frame.getContentPane().add(lblNewLabel_1);

            JCheckBox CheckBox1 = new JCheckBox("6 Characters");
            buttonGroup.add(CheckBox1);
            CheckBox1.setHorizontalAlignment(SwingConstants.CENTER);
            CheckBox1.setFont(new Font("Times New Roman", Font.BOLD, 14));
            CheckBox1.setBounds(268, 222, 239, 35);
            frame.getContentPane().add(CheckBox1);

            JCheckBox CheckBox2 = new JCheckBox("10 Characters");
            buttonGroup.add(CheckBox2);
            CheckBox2.setHorizontalAlignment(SwingConstants.CENTER);
            CheckBox2.setFont(new Font("Times New Roman", Font.BOLD, 14));
            CheckBox2.setBounds(268, 285, 239, 35);
            frame.getContentPane().add(CheckBox2);

            JCheckBox CheckBox3 = new JCheckBox("12 Characters");
            buttonGroup.add(CheckBox3);
            CheckBox3.setHorizontalAlignment(SwingConstants.CENTER);
            CheckBox3.setFont(new Font("Times New Roman", Font.BOLD, 14));
            CheckBox3.setBounds(268, 353, 239, 35);
            frame.getContentPane().add(CheckBox3);

            textResult = new JTextField();
            textResult.setFont(new Font("Times New Roman", Font.BOLD, 16));
            textResult.setHorizontalAlignment(SwingConstants.CENTER);
            textResult.setBounds(268, 154, 239, 35);
            frame.getContentPane().add(textResult);
            textResult.setColumns(10);

            JButton btnNewButton = new JButton("GENERATE PASSWORD");
            btnNewButton.setForeground(new Color(0, 51, 204));
            btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
            btnNewButton.setBounds(268, 413, 239, 35);
            frame.getContentPane().add(btnNewButton);
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (CheckBox1.isSelected()) {
                        passGenerator(6);
                    } else if (CheckBox2.isSelected()) {
                        passGenerator(10);
                    } else if (CheckBox3.isSelected()) {
                        passGenerator(12);
                    } else {
                        passGenerator(8);
                    }
                }
            });
        }
    }
