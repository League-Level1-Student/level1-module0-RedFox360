package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		
String catImageURL = "https://www.catster.com/wp-content/uploads/2018/03/Calico-cat.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component catImageComponent = createImage(catImageURL);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(catImageComponent);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("What type of cat is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(question.equalsIgnoreCase("calico"))	{
	System.out.println("CORRECT");
}
else	{
	System.out.println("INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(catImageComponent);
		// 10. find another image and create it (might take more than one line
		// of code)
String cat2URL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTbXsPNGy5AMkwJxFKbyEcpZPoteMPJ4DnbQA&usqp=CAU";
		// 11. add the second image to the quiz window
Component cat2ImageComponent = createImage(cat2URL);
quizWindow.add(cat2ImageComponent);
quizWindow.pack();
String question1 = JOptionPane.showInputDialog("What type of cat is this?");
// 7. print "CORRECT" if the user gave the right answer
if(question1.equalsIgnoreCase("maine coon"))	{
System.out.println("CORRECT");
}
else	{
System.out.println("INCORRECT");
}
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
