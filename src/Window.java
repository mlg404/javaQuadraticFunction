import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame {

  public Window() {
    this.setSize(400, 300);
    this.setTitle("Resolver equação de segundo grau");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);

    JTextField aText = new JTextField();
    aText.setSize(30, 30);
    aText.setLocation(50, 25);

    JTextField bText = new JTextField();
    bText.setSize(30, 30);
    bText.setLocation(50, 75);

    JTextField cText = new JTextField();
    cText.setSize(30, 30);
    cText.setLocation(50, 125);

    JLabel aLabel = new JLabel("x²");
    aLabel.setSize(30, 30);
    aLabel.setLocation(85, 25);

    JLabel bLabel = new JLabel("x");
    bLabel.setSize(30, 30);
    bLabel.setLocation(85, 75);

    JLabel cLabel = new JLabel("c");
    cLabel.setSize(30, 30);
    cLabel.setLocation(85, 125);

    JTextField deltaText = new JTextField();
    deltaText.setSize(30, 30);
    deltaText.setLocation(250, 25);
    deltaText.setEditable(false);

    JTextField x1Text = new JTextField();
    x1Text.setSize(30, 30);
    x1Text.setLocation(250, 75);
    x1Text.setEditable(false);

    JTextField x2Text = new JTextField();
    x2Text.setSize(30, 30);
    x2Text.setLocation(250, 125);
    x2Text.setEditable(false);

    JLabel deltaLabel = new JLabel("Delta");
    deltaLabel.setSize(60, 30);
    deltaLabel.setLocation(285, 25);

    JLabel x1Label = new JLabel("x1");
    x1Label.setSize(60, 30);
    x1Label.setLocation(285, 75);

    JLabel x2Label = new JLabel("x2");
    x2Label.setSize(60, 30);
    x2Label.setLocation(285, 125);

    JButton calculateButton = new JButton("Calculate");
    calculateButton.setSize(100, 50);
    calculateButton.setLocation(50, 200);
    calculateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Equation equation = new Equation(Double.parseDouble(aText.getText()), Double.parseDouble(bText.getText()),
            Double.parseDouble(cText.getText()));

        deltaText.setText(equation.delta.toString());
        x1Text.setText(equation.x1.toString());
        x2Text.setText(equation.x2.toString());
      }
    });

    JButton clearButton = new JButton("Clear");
    clearButton.setSize(100, 50);
    clearButton.setLocation(250, 200);
    clearButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        aText.setText("");
        bText.setText("");
        cText.setText("");
        deltaText.setText("");
        x1Text.setText("");
        x2Text.setText("");
      }
    });

    this.add(aText);
    this.add(bText);
    this.add(cText);
    this.add(calculateButton);
    this.add(clearButton);
    this.add(aLabel);
    this.add(bLabel);
    this.add(cLabel);
    this.add(deltaText);
    this.add(x1Text);
    this.add(x2Text);
    this.add(deltaLabel);
    this.add(x1Label);
    this.add(x2Label);

    this.setVisible(true);

  }

}