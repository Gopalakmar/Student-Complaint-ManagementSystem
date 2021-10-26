import java.util.*;
class Hotel
{
	int roomNo,phone;
	String name,address;
Scanner sc= new Scanner(System.in);

void mainmenu()
{     
 
int ch=0;

	while(ch!=5)
	{
		 
		System.out.println("\n\t\t\t\t*************");
		System.out.println("\n\t\t\t\t* MAIN MENU *");
		System.out.println("\n\t\t\t\t*************");
		System.out.println("\n\n\n\t\t\t1.Book A Room");
		System.out.println("\n\t\t\t2.Customer Record");
		System.out.println("\n\t\t\t3.Rooms Allotted");
		System.out.println("\n\t\t\t4.Edit Record");
		System.out.println("\n\t\t\t5.Exit");
		System.out.println("\n\n\t\t\tEnter Your Choice: ");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1: 
				addr();
					break;
			case 2: 
				disp();
					break;
			case 3: 
				rooms();
					break;
			case 4:
				edit();
					break;
			case 5: 
                   break;
			default:
		        	{
				 System.out.println("\n\n\t\t\tWrong choice!!!");
				 System.out.println("\n\t\t\tPress any key to continue!!");
                    }		
		}
	}
	
}
void addr()
{
	
	int r,flag=0;
	System.out.println("\n ************************");
	System.out.println("\n *Enter Customer Detalis*");
	System.out.println("\n ************************");
   
	System.out.println("\n\n Room no: ");
	r=sc.nextInt();
	flag=check(r);

	
if(flag==r)
	{
System.out.println("\n Sorry..!!!Room is already booked");
	}
else
	{
		roomNo=r;
		System.out.println(" Name: ");
		name=sc.next();
		System.out.println(" Address: ");
		address=sc.next();
		System.out.println(" Phone No: ");
		phone=sc.nextInt();
		
		System.out.println("\n Room is booked!!!");
	}
	
	System.out.println("\n\t\tDo you want to continue room booking...");

}
void disp()
{
	int r,flag=0;
	System.out.println("\n Enter room no: ");
	r=sc.nextInt();
       	if(roomNo==r)
		{
			
			System.out.println("\n Cusromer Details");
			System.out.println("\n ****************");
			System.out.println("\n\n Room no: "+roomNo);
			System.out.println("\n Name: "+name);
			System.out.println("\n Address: "+address);
			System.out.println("\n Phone no: "+phone);
	    	flag=0;
       }

	if(flag==1)
	
	System.out.println("\n Sorry Room no. not found or vacant!!");
	System.out.println("\n\n Press any key to continue!!");
	
	
}
 
void rooms()
{
	System.out.println("\n\t\t\t**************************");
	System.out.println("\n\t\t\t**List Of Rooms Allotted**");
	System.out.println("\n\t\t\t**************************");
	System.out.println("\n\n Room No.\tName\t\tAddress\t\tPhone No.\n");
      
	System.out.println("\n\n "+roomNo+"\t\t"+name+"\t\t"+address+"\t\t"+phone);
       
        System.out.println("\n\n\n\t\t\tPress any key to continue!!");
     
}
 
void edit()
{
	
	int ch,r;
	System.out.println("\n EDIT MENU");
	System.out.println("\n *********");
	System.out.println("\n\n 1.Modify Customer Record");
	System.out.println("\n 2.Delete Customer Record");
	
	System.out.println("\n Enter your choice: ");
	ch=sc.nextInt();
	System.out.println("\n Enter room no: ");
	r=sc.nextInt();
	
	switch(ch)
	{
		case 1: modify(r);
				break;
		case 2: delete_rec(r);
				break;
		default: System.out.println("\n Wrong Choice!!");
	}
	
	System.out.println("\n Press any key to continue!!!");
}
 
int check(int r)
{
	int flag=0;
	if(roomNo==r)
		{
			flag=1;
				
		}
	return(flag);
}
 
void modify(int r)
{
	long pos,flag=0;

		if(roomNo==r)
		{
			System.out.println("\n Enter New Details");
			System.out.println("\n *****************");
			System.out.println("\n Name: ");
			name=sc.next();
			System.out.println(" Address: ");
			address=sc.next();
			System.out.println(" Phone no: ");
			phone=sc.nextInt();	
			System.out.println("\n Record is modified!!");
			flag=1;
		
		}
	if(flag==0)
		System.out.println("\n Sorry Room no. not found or vacant!!");
}
 
void delete_rec(int r)
{
	int flag=0;
	String ch;

		if(roomNo==r)
		{
			System.out.println("\n Name: "+name);
			System.out.println("\n Address: "+address);
			System.out.println("\n Pone No: "+phone);
			System.out.println("\n\n Do you want to delete this record(y/n): ");
			ch=sc.next();
			
			if(ch=="n")
				{

                         flag=1;
                }
             }
		if(flag==1)
		{
	
			System.out.println("\n Sorry room no. not found or vacant!!");
		}
}
}
 class HotelManagment
{
	public static void main(String[] args)
       {
	
	System.out.println("\n\t\t\t****************************");
	System.out.println("\n\t\t\t* HOTEL MANAGEMENT PROJECT *");
	System.out.println("\n\t\t\t****************************");
	System.out.println("\n\n\n\n\n\t\t\t\tPress any key to continue!!");
	
	 Hotel obj= new Hotel();
         obj.mainmenu();
           
      }
}
