import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  Counter(){
    JFrame frame =new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    //initialize your two int instance variables to 0

    int leftCount = 0;
    int rightCount = 0;

    //add action listener to the left and right buttons

    left.addActionListener(this);
    right.addActionListener(this);

    //need to add left and right buttons to the frame

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Count: "+ leftCount);
    rightLabel = new JLabel("Count: "+ rightCount);
    frame.add(leftLabel);
    frame.add(rightLabel);

    //Need the reset button so people can start over to 0 for both buttons

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    //makes frame visible so people can see 

    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")){
      leftCount++;
      leftLabel.setText("Count: " + leftCount);
    }

    else if(ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("Count: " + rightCount);
    }

    else {
      rightCount = 0;
      leftCount = 0;
      leftLabel.setText("Count: " + leftCount);
      rightLabel.setText("Count: " + rightCount);
    }
  }
} 