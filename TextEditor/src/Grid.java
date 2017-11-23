import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Grid extends JFrame{
	int fontSize=14;
	int OpenFile;
	int SaveFile;
	final JTextPane textPane = new JTextPane();
	JFileChooser fileOpen;
	JFileChooser fileSave;
	Grid(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenuItem news = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open...");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem close = new JMenuItem("Exit");
		file.add(news);
		file.add(open);
		file.add(save);
		file.add(close);
		JMenu edit = new JMenu("Edit");
		menuBar.add(edit);
		JMenu clr=new JMenu("Color");
		JMenuItem col1 = new JMenuItem("Red");
		JMenuItem col2 = new JMenuItem("Blue");
		JMenuItem col3 = new JMenuItem("Green");
		JMenuItem col4= new JMenuItem("Orange");
		JMenuItem col5= new JMenuItem("Magenta");
		clr.add(col1);
		clr.add(col2);
		clr.add(col3);
		clr.add(col4);
		clr.add(col5);
		menuBar.add(clr);
		JMenu size = new JMenu("Font Size");
		JMenuItem size1 = new JMenuItem("10");
		JMenuItem size2 = new JMenuItem("15");
		JMenuItem size3 = new JMenuItem("20");
		JMenuItem size4 = new JMenuItem("25");
		JMenuItem size5 = new JMenuItem("30");
		JMenuItem size6 = new JMenuItem("40");
		JMenuItem size7 = new JMenuItem("60");
		size.add(size1);
		size.add(size2);
		size.add(size3);
		size.add(size4);
		size.add(size5);
		size.add(size6);
		size.add(size7);
		menuBar.add(size);
		
		JMenu font=new JMenu("Font Style");
		JMenuItem font1 = new JMenuItem("Arial Narrow");
		JMenuItem font2 = new JMenuItem("Braggadocio");
		JMenuItem font3 = new JMenuItem("Lucida Calligraphy");
		JMenuItem font4= new JMenuItem("Rockwell Extra Bold");
		font.add(font1);
		font.add(font2);
		font.add(font3);
		font.add(font4);
		menuBar.add(font);
		


				col1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						StyledDocument doc = textPane.getStyledDocument();
					    int start = textPane.getSelectionStart();
					    int end = textPane.getSelectionEnd();
						Style style;
					    if (start == end) { 
					        return;
					    }
					    if (start > end) { 
					        int life = start;
					        start = end;
					        end = life;
					    }
					    style = textPane.addStyle("Monospaced", null);
					    StyleConstants.setForeground(style, Color.RED.darker());
					    doc.setCharacterAttributes(start, end - start, style, false);
					}
				});
		
			col2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							StyledDocument doc = textPane.getStyledDocument();
						    int start = textPane.getSelectionStart();
						    int end = textPane.getSelectionEnd();
							Style style;
						    if (start == end) { 
						        return;
						    }
						    if (start > end) { 
						        int life = start;
						        start = end;
						        end = life;
						    }
						    style = textPane.addStyle("Monospaced", null);
						    StyleConstants.setForeground(style, Color.BLUE.darker());
						    doc.setCharacterAttributes(start, end - start, style, false);
						}
					});
			col3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					StyledDocument doc = textPane.getStyledDocument();
				    int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
					Style style;
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
				    style = textPane.addStyle("Monospaced", null);
				    StyleConstants.setForeground(style, Color.GREEN.darker());
				    doc.setCharacterAttributes(start, end - start, style, false);
				}
			});
			col4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					StyledDocument doc = textPane.getStyledDocument();
				    int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
					Style style;
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
				    style = textPane.addStyle("Monospaced", null);
				    StyleConstants.setForeground(style, Color.ORANGE.darker());
				    doc.setCharacterAttributes(start, end - start, style, false);
				}
			});
			col5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					StyledDocument doc = textPane.getStyledDocument();
				    int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
					Style style;
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
				    style = textPane.addStyle("Monospaced", null);
				    StyleConstants.setForeground(style, Color.MAGENTA.darker());
				    doc.setCharacterAttributes(start, end - start, style, false);
				}
			});
			
			
			font1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Font font = new Font("Arial Narrow", Font.PLAIN, 20);
			        textPane.setFont(font);
				}
			});
			font2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Font font = new Font("Braggadocio", Font.PLAIN, 20);
			        textPane.setFont(font);
				}
			});
			font3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Font font = new Font("Lucida Calligraphy", Font.PLAIN, 20);
			        textPane.setFont(font);
				}
			});
			font4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Font font = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
			        textPane.setFont(font);
				}
			});
			size1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					StyleContext context = new StyleContext();
					Style style;
	
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize, 10);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});
			size2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					StyleContext context = new StyleContext();
					Style style;
	
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize,15);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});
			size3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					StyleContext context = new StyleContext();
					Style style;
	
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize,20);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});
			size4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					StyleContext context = new StyleContext();
					Style style;
	
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize,25);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});
			size5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					StyleContext context = new StyleContext();
					Style style;
	
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize, 30);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});
			size6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					StyleContext context = new StyleContext();
					Style style;
	
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize,40);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});
			size7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text = textPane.getSelectedText();
					StyleContext context = new StyleContext();
					Style style;
					int start = textPane.getSelectionStart();
				    int end = textPane.getSelectionEnd();
				    if (start == end) { 
				        return;
				    }
				    if (start > end) { 
				        int life = start;
				        start = end;
				        end = life;
				    }
					textPane.replaceSelection("");
	
					style = context.addStyle("mystyle", null);
					style.addAttribute(StyleConstants.FontSize,60);
					try {
						textPane.getStyledDocument().insertString(start, text, style);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}	
				}
			});

		
		
		 Action cutAction = new DefaultEditorKit.CutAction();
	     cutAction.putValue(Action.NAME, "Cut");
	     edit.add(cutAction);
	     Action copyAction = new DefaultEditorKit.CopyAction();
	      copyAction.putValue(Action.NAME, "Copy");
	      edit.add(copyAction);
	      Action pasteAction = new DefaultEditorKit.PasteAction();
	      pasteAction.putValue(Action.NAME, "Paste");
	      edit.add(pasteAction);
		getContentPane().add(textPane);
 
		news.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPane.setText("");
			}
		});
 
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				openFile();
				if (OpenFile == JFileChooser.APPROVE_OPTION){
					textPane.setText(readFile(fileOpen.getSelectedFile().getAbsolutePath()));
				}
			}
		});
 
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				saveFile();
				if (SaveFile == JFileChooser.APPROVE_OPTION){
					try {
						BufferedWriter out = new BufferedWriter(new FileWriter(fileSave.getSelectedFile().getPath()));
						out.write(textPane.getText());
						out.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});
 
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
	}
	public void openFile(){
		JFileChooser open = new JFileChooser();
		int option = open.showOpenDialog(this);
		OpenFile = option;
		fileOpen = open;
	}
 
	public void saveFile(){
		JFileChooser save = new JFileChooser();
		int option = save.showSaveDialog(this);
		SaveFile = option;
		fileSave = save;
	}
	private String readFile(String filename)
	{
	  String records = new String();
	  try
	  {
	    BufferedReader reader = new BufferedReader(new FileReader(filename));
	    String line;
	    while ((line = reader.readLine()) != null)
	    {
	      records+=line;
	    }
	    reader.close();
	    return records;
	  }
	  catch (Exception e)
	  {
	    System.err.format("Exception while reading read '%s'.", filename);
	    e.printStackTrace();
	    return null;
	  }
	}
}