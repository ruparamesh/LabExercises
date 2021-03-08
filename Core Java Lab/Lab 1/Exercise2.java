import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* 
 * <applet code = "Exercise2" width = 1000 height = 500>
 * </applet>  
 * */

public class Exercise2 extends Applet implements ItemListener{

	CheckboxGroup grp = new CheckboxGroup();	
	Checkbox redLight, yellowLight, greenLight;	
	Label msg;
	public void init(){
		redLight = new Checkbox("Red", grp, false);
		yellowLight = new Checkbox("Yellow", grp, false);
		greenLight = new Checkbox("Green", grp, false);
		msg = new Label("");
		
		redLight.addItemListener(this);
		yellowLight.addItemListener(this);
		greenLight.addItemListener(this);
		
		add(redLight);
		add(yellowLight);
		add(greenLight);
		add(msg);
		msg.setFont(new Font("Serif", Font.BOLD, 20));
	}
	public void itemStateChanged(ItemEvent ie) {
		redLight.setForeground(Color.BLACK);
		yellowLight.setForeground(Color.BLACK);
		greenLight.setForeground(Color.BLACK);
		
		if(redLight.getState() == true) {
			redLight.setForeground(Color.RED);
			msg.setForeground(Color.RED);
			msg.setText("STOP");
		}
		else if(yellowLight.getState() == true) {
			yellowLight.setForeground(Color.YELLOW);
			msg.setForeground(Color.YELLOW);
			msg.setText("READY");
		}
		else{
			greenLight.setForeground(Color.GREEN);
			msg.setForeground(Color.GREEN);
			msg.setText("GO");
		}
	}
}