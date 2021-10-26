import java.awt.*;
import java.applet.Applet;
class Awt_sample extends Frame
{
    Awt_sample()
    {
            
           Choice c1=new Choice();
            c1.add("IT");
            c1.add("EE");
            c1.add("EJ");
	    c1.add("ME");
	    c1.add("CE");
            c1.add("AE");
            add(c1);
                        
    }
  public static void main(String[] args)
   {
      Awt_sample a1=new Awt_sample();
        a1.setSize(500,500);
        a1.setTitle("Gopal");
        a1.setVisible(true);
        
   }
}