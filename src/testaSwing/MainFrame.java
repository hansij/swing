package testaSwing;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener{
	Book book = new Book();

	private static final long serialVersionUID = 1L;
	private JTextField txtFieldTitle;
	private JTextField txtFieldAuthor;
	private JTextField txtFieldPrice;
	private JTextField txtFieldLanguage;
	private JTextArea ta1;
	private JButton btn;
	private JButton btn2;
	private JRadioButton proRadio;
	private JRadioButton amateurRadio;
	private ButtonGroup playersBtnGroup;
	private ArrayList<Book> aList;
	private JLabel txtTextArea;
	private JLabel txtTitle;
	private JLabel txtAuthor;
	private JLabel txtPrice;
	private JLabel txtLanguage;
	private Border redBorder = BorderFactory.createLineBorder(Color.red);
	
	public MainFrame() {
		
		super("Hello");
		
		/*setLayout(new BorderLayout());

		setLayout(new BorderLayout());
		add(ta1, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);*/
		
		setLayout(null);
		
		setSize(1200, 800);
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		getContentPane().setBackground(Color.CYAN);
		
		aList = new ArrayList<Book>(); //Skapar en lyssnar som lyssnar efter händelser
		//Knappar
		btn = new JButton("Lägg in bok");
		btn.setBounds(120,80,200,20);
		add(btn);
		btn.addActionListener(this); //Skapar en lyssnar som lyssnar efter händelser
		btn2 = new JButton("Visa böcker");
		btn2.setBounds(120,110,200,20);
		add(btn2);
		btn2.addActionListener(this); //Skapar en lyssnar som lyssnar efter händelser
		//Textfält
		txtFieldTitle = new JTextField();
		txtFieldTitle.setBounds(370,82,200,20);
		add(txtFieldTitle);
		txtFieldAuthor = new JTextField();
		txtFieldAuthor.setBounds(370,120,200,20);
		add(txtFieldAuthor);
		txtFieldPrice = new JTextField();
		txtFieldPrice.setBounds(370,158,200,20);
		add(txtFieldPrice);
		txtFieldLanguage = new JTextField();
		txtFieldLanguage.setBounds(370,196,200,20);
		add(txtFieldLanguage);
		//Textareor (större textfält)
		ta1 = new JTextArea();
		ta1.setBounds(620,85,400,420);
		ta1.setBorder(redBorder);
		add(ta1);
		//RadioKnappar start
		proRadio = new JRadioButton("Bok");
		amateurRadio = new JRadioButton("Programmeringsbok");
		proRadio.setSelected(true);
		playersBtnGroup = new ButtonGroup();
		playersBtnGroup.add(proRadio);
		playersBtnGroup.add(amateurRadio);
		proRadio.setBounds(370,250,200,20);
		amateurRadio.setBounds(370,275,200,20);
		add(proRadio);
		add(amateurRadio);
		//RadioKnappar end
		//Labels
		txtTextArea = new JLabel("Böcker");
		txtTextArea.setBounds(620,65,200,20);
		add(txtTextArea);
		txtTitle = new JLabel("Titel");
		txtTitle.setBounds(370,65,200,20);
		add(txtTitle);
		txtAuthor = new JLabel("Författare");
		txtAuthor.setBounds(370,103,200,20);
		add(txtAuthor);
		txtPrice = new JLabel("Pris");
		txtPrice.setBounds(370,141,200,20);
		add(txtPrice);
		txtLanguage = new JLabel("Språk");
		txtLanguage.setBounds(370,179,200,20);
		add(txtLanguage);
		
		/****************************************************************************
		* Detta är de ramar man kan prova för stor textrutan *
		* *
		* **************************************************************************
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder(); ***************************************************************************/
		repaint();
		revalidate();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn) //Lägg in bok
		{
		String title = txtFieldTitle.getText();
		String anAuthor = txtFieldAuthor.getText();
		String anPrice = txtFieldPrice.getText();
		String aLanguage = txtFieldLanguage.getText();
		int thePrice = Integer.parseInt(anPrice);
		Book enBok = new Book(title, anAuthor, aLanguage, thePrice);
		aList = new ArrayList<Book>();
		aList.add(enBok);
		if (proRadio.isSelected() == true){
		}
		if (amateurRadio.isSelected() == true){
		}
		}//if getSource
		if(e.getSource() == btn2) //Visa böcker
		{
		//Foreach JavaWay :)
		//For each book b IN aList
		for (Book b : aList) {
		ta1.append("Titel: \t" + b.getTitle() + "\n");
		ta1.append("Författare: \t" + b.getAuthor() + "\n");
		ta1.append("Språk: \t" + b.getLanguage() + "\n");
		ta1.append("Pris: \t" + Integer.toString(b.getPrice()) + "\n");
		ta1.append("\n");
		}//foreach
		}
	}

}
