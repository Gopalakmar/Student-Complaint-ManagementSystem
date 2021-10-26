import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder; 
public class NumberSyst extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtDecimal;
	private JTextField txtBinary;
	private JTextField txtHexadecimal;
	private JTextField txtocatal;

	public static void main(String[] args) {
		new NumberSyst();
	}

	 public NumberSyst() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.add(getLabel("Decimal:-",12, 16, 80, 19));
		contentPane.add(getLabel("Binary:-",12, 47, 80, 19));
		contentPane.add(getLabel("Hexadecimal:-",12, 75, 80, 29));
		contentPane.add(getLabel("Ocatal:-",12, 110, 80, 29));

		txtDecimal = getTextField(90, 16, 126, 19);
		contentPane.add(txtDecimal);

		txtBinary = getTextField(90, 47, 126, 19);
		contentPane.add(txtBinary);
		
		txtHexadecimal = getTextField(90, 77, 126, 19);
		contentPane.add(txtHexadecimal);
		
		txtocatal = getTextField(90, 110, 126, 19);
		contentPane.add(txtocatal);

		JButton cmdConvert = new JButton("Convert");
		cmdConvert.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmdConvert.addActionListener( this );
		cmdConvert.setBounds(227, 16, 80, 50);
		contentPane.add(cmdConvert);
		
		setResizable(true);
		setTitle("Decimal To Binary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 330, 214);
		setLocationRelativeTo( null );
		setVisible( true );
	}
	
	private JLabel getLabel( String caption, int x, int y, int w, int h ) {
		JLabel lbl = new JLabel( caption );
		lbl.setBounds(x, y, w, h);
		
		return lbl;
	}
	
	private JTextField getTextField( int x, int y, int w, int h ) {
		JTextField tf = new JTextField();
		tf.setBounds(x, y, w, h);
		
		return tf;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		try {
			int decimal = Integer.parseInt( txtDecimal.getText() );
			int dec1=decimal;
			 int rem;
			 int dec2=dec1;
            char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            char dig[]={'0','1','2','3','4','5','6','7'};
           	  
                         String he="";  
			String str ="";
			String str1="";
			for(;decimal>0;){
				int binary = decimal%2;
				str = Integer.toString(binary) + str;
				decimal /= 2;
			}
			
  while(dec1>0)  
     {  
       rem=dec1%16;   
       he=hexchars[rem]+he;   
       dec1=dec1/16;
  
     }  
     	
 
    while(dec2>0)
    {
       rem=dec2%8; 
       str1=dig[rem]+str1; 
       dec2=dec2/8;
    }
      
                  txtBinary.setText( str );
		  txtHexadecimal.setText( he );  
		  txtocatal.setText( str1 );
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog( null, e.getMessage() );
			txtDecimal.setText( "" );
		}
	}
}