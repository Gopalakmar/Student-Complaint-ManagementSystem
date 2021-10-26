#include<iostream.h>
#include<conio.h>
#include<stdio.h>

class hotel
{
int room_no;
char name[30];
char address[50];
char phone[10];
public:
void  main_menu();
void  add();
void  display();
void  rooms();
void edit();
int check(int);
void modify(int);
void delete_rec(int);
};
void hotel::main_menu()
{
int choice;
while(choice!=5)
{
clrscr();
cout<<"\n\t\t\t\t*************";
cout<<"\n\t\t\t\t*MAINMENU*";
cout<<"\n\t\t\t\t*************";
cout<<"\n\n\n\t\t\t1.BookARoom";
cout<<"\n\t\t\t2.CustomerRecord";
cout<<"\n\t\t\t3.RoomsAllotted";
cout<<"\n\t\t\t4.EditRecord";
cout<<"\n\t\t\t5.Exit";
cout<<"\n\n\t\t\tEnterYourChoice:";
cin>>choice;
switch(choice)
{
      case 1:add();
  break;
      case 2:display();
  break;
   case 3:rooms();
  break;
   case 4:edit();
 break;
case 5:break;
 default:
{
cout<<"\n\n\t\t\tWrongchoice!!!";
cout<<"\n\t\t\tPressanykeytocontinue!";
getch();
}
}
}
}
void hotel::add()
{
clrscr();
int r,flag;
ofstream fout("Record.dat",ios::app);
cout<<"\nEnterCustomerDetalis";
cout<<"\n**********************";
cout<<"\n\nRoomno:";
cin>>r;
flag=check(r);
if(flag)
cout<<"\nSorry..!!!Roomisalreadybookd";
else
{
room_no=r;

cout<<"Name:";
cin>>name;

cout<<"Address:";
cin>>address;

cout<<"PhoneNo:";
cin>>phone;

cout<<"\nRoomisbooked!!!";
}

cout<<"\nPressanykeytocontinue!!";

getch();

}

void hotel::display()

{

clrscr();

int r,flag;

cout<<"\nEnterroomno:";

cin>>r;

while(!fin.eof())

{
if(room_no==r)

{

clrscr();

cout<<"\n**CusromerDetails**";

cout<<"\n*********************";

cout<<"\n\nRoomno:"<<room_no;

cout<<"\nName:"<<name;

cout<<"\nAddress:"<<address;

cout<<"\nPhoneno:"<<phone;

flag=1;

break;

}

}

if(flag==0)

cout<<"\nSorryRoomno.notfoundorvacant!!";

cout<<"\n\nPressanykeytocontinue!!";

getch();

}

void hotel::rooms()

{

clrscr();

cout<<"\n\t\t\tListOfRoomsAllotted";

cout<<"\n\t\t\t*********************";

cout<<"\n\nRoomNo.\tName\t\tAddress\t\tPhoneNo.\n";

while(!fin.eof())

{

cout<<"\n\n"<<room_no<<"\t\t"<<name;

cout<<"\t\t"<<address<<"\t\t"<<phone;
}

cout<<"\n\n\n\t\t\tPressanykeytocontinue!!";

getch();

}

void hotel::edit()

{

clrscr();

int choice,r;

cout<<"\nEDITMENU";

cout<<"\n*********";

cout<<"\n\n1.ModifyCustomerRecord";

cout<<"\n2.DeleteCustomerRecord";

cout<<"\nEnteryourchoice:";

cin>>choice;

clrscr();

cout<<"\nEnterroomno:";

cin>>r;

switch(choice)

{

case1:modify(r);

break;

case2:delete_rec(r);

break;

default:cout<<"\nWrongChoice!!";

}

cout<<"\nPressanykeytocontinue!!!";

getch();

}

int hotel::check(int r)

{

int flag=0;




if(room_no==r)

{

flag=1;

break;
}

return(flag);

}

void hotel::modify(int r)

{

long pos,flag=0;

if(room_no==r)

{

cout<<"\nEnterNewDetails";

cout<<"\n*****************";

cout<<"\nName:";

gets(name);

cout<<"Address:";

gets(address);

cout<<"Phoneno:";

gets(phone);

file.seekg(pos);

file.write((char*)this,sizeof(hotel));

cout<<"\nRecordismodified!!";

flag=1;

break;

}

if(flag==0)

cout<<"\nSorryRoomno.notfoundorvacant!!";

file.close();

}

void hotel::delete_rec(int r)

{

int flag=0;

char ch;
if(room_no==r)

{

cout<<"\nName:"<<name;

cout<<"\nAddress:"<<address;

cout<<"\nPoneNo:"<<phone;

cout<<"\n\nDoyouwanttodeletethisrecord(y/n):";

cin>>ch;

if(ch=='n')

flag=1;

}

else


}

if(flag==0)

cout<<"\nSorryroomno.notfoundorvacant!!";

else

{

remove("Record.dat");

rename("temp.dat","Record.dat");

}

}

void main()

{

hotel h;

clrscr();

cout<<"\n\t\t\t****************************";

cout<<"\n\t\t\t*HOTELMANAGEMENTPROJECT*";

cout<<"\n\t\t\t****************************";

cout<<"\n\n\n\n\t\t\tGroup members:";

cout<<"1)Ashutosh Vasanta Dhoke\n2) Bhagwat G Jadhoa\n\t3)Gopal M Akmar";

cout<<"\n\n\n\n\n\t\t\t\tPressanykeytocontinue!!";
    h.main_menu();
getch();
}



