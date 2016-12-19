package il.ac.hit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class programGUI {
	private JFrame frame;
	private JButton btUpdate, btOK;
	private JTextField tf;
	private JTextArea ta;
	private JPanel panelBottom, panelTop, panelCenter;

	public programGUI()
	{
		frame = new JFrame("D E M O");
		tf = new JTextField(10);
		ta = new JTextArea(30,30);
		btOK = new JButton("OK");
		panelBottom = new JPanel();
		panelTop = new JPanel();
		//getting frame content pane
		Container container = frame.getContentPane();
		//assigning background colors for each one of the panels
		panelBottom.setBackground(Color.BLUE);
		panelTop.setBackground(Color.YELLOW);
		
		//assigning layout managers for each one of the containers
		panelBottom.setLayout(new GridLayout(1,3,5,5));
		panelTop.setLayout(new FlowLayout());
		container.setLayout(new BorderLayout());
		panelCenter = new JPanel();
		panelCenter.setLayout(new FlowLayout());
		panelCenter.add(ta);
		panelBottom.add(btOK);
					
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				frame.setVisible(false); frame.dispose(); System.exit(0);
			}
		}
		);
		btOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!tf.getText().equals("")){
					ReflectionTry rt = new ReflectionTry(tf.getText());
					ta.setText(rt.toString());
				}
				
				
			}
		});
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(ta);	
		panelTop.add(tf);
		frame.add(panelTop,BorderLayout.NORTH);
		frame.add(panelBottom, BorderLayout.SOUTH);
		frame.add(scrollPane, BorderLayout.CENTER);
	}
	
	public void go()
	{
		frame.setSize(400,300);   frame.setVisible(true);
	}

}
