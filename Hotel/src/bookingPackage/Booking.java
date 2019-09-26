package bookingPackage;
import customerPackage.Customer;//booking
import java.util.Scanner;
import java.util.Scanner;
public class Booking {
	static int total=0;	
	int date;
	String ac,cot,cable,wifi,laundry,ch,ch1;
	static int []booked = new int[25];
	int dateArray[] = new int[25];
	int roomArray[] = new int[25];
	static int value,i,flag=0,indx=0,roomNo,indx1=0;
	Scanner sc= new Scanner(System.in);
	Customer cus = new Customer();
	public void book() 
	{
		// TODO Auto-generated method stub
		System.out.println("\n********* ROOM BOOKING ******\n  ");
		System.out.println("Please choose the services:"+"AC/non-AC(AC/nAC)");
		ac=sc.nextLine();
		cus.setAc(ac);
		if(cus.getAc().equalsIgnoreCase("AC"))
		{
			total=1000;
		}
		else
		{
			total=750;
		}
		System.out.println("Cot(Single/Double):");
		cot=sc.nextLine();
		cus.setCot(cot);
		if(cus.getCot().equalsIgnoreCase("Single"))
		{
			total=total+0;
		}
		else
		{
			total=total+350;
		}
		System.out.println("With cable connection/without cable connection(C/nC):");
		cable=sc.nextLine();
		cus.setCable(cable);
		if((cus.getCable().equalsIgnoreCase("With cable connection"))||(cable.equals("C")))
		{
			total=total+50;
		}
		else
		{
			total=total+0;
		}
		System.out.println("Wi-Fi needed or not(W/nW):");
		wifi=sc.nextLine();
		cus.setWifi(wifi);
		if((cus.getWifi().equalsIgnoreCase("Wi-Fi needed"))||(wifi.equals("W")))
		{
			total=total+200;
		}
		else
		{
			total=total+0;
		}
		System.out.println("Laundry service needed or not(L/nL):");
		laundry=sc.nextLine();
		cus.setLaundry(laundry);
		if((cus.getLaundry().equalsIgnoreCase("Laundry service needed"))||(laundry.equals("L")))
		{
			total=total+100;
		}
		else
		{
			total=total+0;
		}
		System.out.println("Enter date :");
		date = sc.nextInt();
		dateArray[indx1] = date;
		System.out.println("Total charge is:"+total);
		System.out.println("The services choosen are");
		System.out.println(cus.getCot()+" Cot "+cus.getAc()+" Room");
		System.out.println(cus.getCable()+" connection enabled");
		System.out.println(cus.getWifi()+" enabled");
		System.out.println(cus.getLaundry()+" needed");
		booked[indx] = 1;
		indx++;
		System.out.println("\nThank you for booking. Your room number is "+ ++roomNo);
		roomArray[indx1] = roomNo;
		++indx1;
		
		
	}
	
	public void status()
	{
		System.out.println("***** CHECKING STATUS ******\n");
		System.out.println("Enter room number ");
		int room = sc.nextInt();
		if(booked[room-1]==1)
		{
			System.out.println("Room "+room+" already booked  ");
		}
		else
		{
			System.out.println("Room "+room+" not booked  ");
		}
		
	}
	
	public void allBooking(int registerIdArray[],int indx)
	{
		System.out.println("Enter the start date : ");
		int start = sc.nextInt();
		System.out.println("Enter the end date : ");
		int end = sc.nextInt();
		System.out.println("The bookings made from "+start+" to "+end+" are..\n");
		System.out.println("Room number   "+"Customer ID");
		for(int k=0;k<indx1;k++)
		{
			if((dateArray[k]>=start && dateArray[k]<=end)||(dateArray[k]<=start && dateArray[k]>=end))
			{
			System.out.println("    "+roomArray[k]+"            "+registerIdArray[k]);
			}
		}
		
	}
	
	public void allCustomers(String nameArray[],int indx,int registerIdArray[])
	{
		System.out.println("********* REGISTERED CUSTOMERS **********\n");
		System.out.println("Customer ID   "+"   Customer Name");
		for(int k=0;k<indx;k++)
		{
			
			System.out.println("     "+registerIdArray[k]+"             "+nameArray[k]);
			
		}
		
	}
	

}
