package _09_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("unused")
public class SoundEffects implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public void run()	{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	frame.setVisible(true);
	button1.setText("button click");
	button1.addActionListener(this);
	button2.setText("windows XP");
	button2.addActionListener(this);
	button3.setText("windows XP startup");
	button3.addActionListener(this);
	
	
	
	
	
	
	
	
	
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	frame.pack();
	
}
private void playSound(String soundFile) {
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==button1)	{
		
	playSound("buttonClick.wav");
	}
	if(e.getSource()==button2)	{
		
		playSound("windowsXPErrorSound.wav");
		}
if(e.getSource()==button3)	{
		
		playSound("windowsXPStartup.wav");
		}
}
}
