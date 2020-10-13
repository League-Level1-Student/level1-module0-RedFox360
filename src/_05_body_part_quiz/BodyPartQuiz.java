package _05_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the default java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the default package, and change the names below.

	String firstImage = "src/_05_body_part_quiz/arnold.jpeg";
	String secondImage = "src/_05_body_part_quiz/leonardo.jpeg";
	String thirdImage = "src/_05_body_part_quiz/morgan.jpeg";
	String fourthImage = "src/_05_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(100, 100);

		showNextImage();

	}

	private void startQuiz() {

		int score = 0;
		String guess = JOptionPane.showInputDialog("who is this?");

		if (guess.equalsIgnoreCase("arnold schwarzenegger")) {
			System.out.println("You're correct!");
			score += 1;
		} else {
			System.out.println("You are incorrect. The correct answer is Arnold Schwarzenegger");
		}
		System.out.println("Your current score is " + score + ".");
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this?");

		if (guess.equalsIgnoreCase("leonardo Dicaprio")) {
			System.out.println("You're correct!");
			score += 1;
		} else {
			System.out.println("You are incorrect. The correct answer is Leonardo Dicaprio");
		}
		System.out.println("Your current score is " + score + ".");
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this?");

		if (guess.equalsIgnoreCase("morgan freeman")) {
			System.out.println("You're correct!");
			score += 1;
		} else {
			System.out.println("You are incorrect. The correct answer is Morgan Freeman");
		}
		System.out.println("Your current score is " + score + ".");
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this?");

		if (guess.equalsIgnoreCase("Jack Black")) {
			System.out.println("You're correct!");
			score += 1;
		} else {
			System.out.println("You are incorrect. The correct answer is Jack Black");
		}
		System.out.println("Your current score is " + score + ".");
		showNextImage();
		 
		 
		
		
		
		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
