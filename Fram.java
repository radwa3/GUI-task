import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Fram extends JFrame{
	
public static void main (String[]args){
	
	Fram frame = new Fram();
	frame.setVisible(true);
	frame.setSize(600, 600);
	frame.setTitle("Text Eitor");
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	JPanel jpanel = new JPanel();
	jpanel.setSize(100,100);
	jpanel.setBackground(Color.black);
	frame.add(jpanel);
	
	JTextField text = new JTextField();
	text.setSize(50, 50);
	text.setBackground(Color.RED);
	text.setVisible(true);
	jpanel.add(text);
	
	JMenuBar bar = new JMenuBar();
	
	
	JMenu file = new JMenu("File");
	
	JMenuItem open = new JMenuItem("Open" );
	open.setAccelerator(KeyStroke.getKeyStroke('O',KeyEvent.CTRL_MASK));
	open.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0){
			JOptionPane.showMessageDialog(frame, "opened");
			
		}
	});
	
	
	JMenuItem neww = new JMenuItem("New" );
	neww.setAccelerator(KeyStroke.getKeyStroke('N',KeyEvent.CTRL_MASK));
	neww.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0){
			JOptionPane.showMessageDialog(frame, "New");
			
		}
	});
	
	JMenuItem save = new JMenuItem("save" );
	save.setAccelerator(KeyStroke.getKeyStroke('S',KeyEvent.CTRL_MASK));
	save.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0){
			JOptionPane.showMessageDialog(frame, "saved");
			
		}
	});
	
	
	JMenuItem exit = new JMenuItem("Exit" );
	exit.setAccelerator(KeyStroke.getKeyStroke('E',KeyEvent.CTRL_MASK));
	exit.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0){
			JOptionPane.showMessageDialog(frame, "Exit");
			
		}
	});
	
	file.add(open);
	file.add(neww);
	file.add(save);
	file.add(exit);
	
	JMenu Edit = new JMenu("Edit");
	JMenuItem copy = new JMenuItem("Copy" );
	JMenuItem cut = new JMenuItem("Cut");
	JMenuItem paste = new JMenuItem("Paste");
	JMenuItem delete = new JMenuItem("Delete");
	JMenuItem select = new JMenuItem("Select All");
	
	Edit.add(copy);
	Edit.add(cut);
	Edit.add(paste);
	Edit.add(delete);
	Edit.add(select);
	
	JMenu help = new JMenu("Help");
	JMenuItem about = new JMenuItem("About" );
	about.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0){
			JOptionPane.showMessageDialog(frame, "This is the text editor version 1.1 created for GUI testing ");
			
		}
	});
	
	help.add(about);
	
	bar.add(file);
	bar.add(Edit);
	bar.add(help);
	
	
	frame.setJMenuBar(bar);
	
	
}

}
