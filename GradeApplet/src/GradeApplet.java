import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;



public class GradeApplet extends Applet implements ActionListener{
	//construct components
	Label titleLable = new Label("CSCI 2467 GRADE APPLET");
	Label studentPointsLabel = new Label("Enter points recieved by student: ");
	TextField studentPointsField = new TextField(10);
	Label totalPointsLabel = new Label("Total Class Points: ");
	TextField totalPointsField = new TextField(10);
	Button calcButton = new Button("Calculate");
	Label outputLabel = new Label("Click the Calculate button to calculate grade.");

	public void init() {
		
		setSize(new Dimension(350,200));
		add(this.titleLable);
		add(this.studentPointsLabel);
		add(this.studentPointsField);
		add(this.totalPointsLabel);
		add(this.totalPointsField);
		add(this.calcButton);
		this.calcButton.addActionListener(this);
		add(this.outputLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double studentPoints = Double.parseDouble(studentPointsField.getText());
		double totalPoints = Double.parseDouble(totalPointsField.getText());
		float grade = (float) ( (studentPoints / totalPoints) * (100));
		char letterGrade = 'A';
		
		if (grade >= 90.0)
			letterGrade = 'A';
		else if (grade >= 80.0)
			letterGrade = 'B';
		else if (grade >= 70.0)
			letterGrade = 'C';
		else if (grade >= 60.0)
			letterGrade = 'D';
		else  
		     letterGrade = 'E';
		
		outputLabel.setText("Student letter grade is " + letterGrade + " (" + Math.round(grade) + "%).");
	}
}