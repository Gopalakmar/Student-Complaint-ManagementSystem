import java.io.*;
import java.net.*;
class URLDemo
{
  public static void main (String [] args)
  {
      String st= "http://admissions.puched.ac.in/";
     if(st.length !=1)
        {

         System.out.println("usage:java URLDemo url");
          return;
 
        }
        URL url=new URL(st);
        System.out.println("Authority="+url.getAuthority());
         System.out.println("File="+url.getFile());
          System.out.println("Host="+url.getHost());
        System.out.println("Path="+url.getPath());
System.out.println("Port="+url.getPort());
System.out.println("Protocl="+url.getProtocol());
System.out.println("Query="+url.getQuery());
System.out.println("Ref="+url.getRef());
System.out.println("UserInfo="+url.getUserInfo());
System.out.println('\n');
InputStream is=url.openStream();
int ch;
while((ch=is.read())!=-1)
System.out.println((char)ch);
is.close();
  }
}