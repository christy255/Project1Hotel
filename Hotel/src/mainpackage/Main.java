package mainpackage;
import java.util.Scanner;//main

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import customerPackage.Customer;
import registerPackage.Registration;

import bookingPackage.Booking;
public class Main {
	static int regID=1,indx=0;
	public static String[] emailArray = new String[25];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String ac,cot,cable,wifi,laundry;
		
		String first_name;
		String middlie_name;
		String last_name;
		String address;
		String contact;
		String email;
		String proofType;
		int choice;
		String cont,ed;
		Scanner s = new Scanner(System.in);
		Registration reg = new Registration();
		
		//String emailArray[] = new String[25];
		String nameArray[] = new String[25];
		int registerIdArray[] = new int[25];
		Booking bk = new Booking();
			do {
			System.out.println("\nENTER YOUR CHOICE : \n");
			System.out.println("1. Register."+"\n"+"2. Book."+"\n"+"3. Check Status."+"\n"+"4. Email."+"\n"+"5. All Bookings."+"\n"+"6. All Customers."+"\n"+"7. Exit.");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1 :		
					System.out.println("Enter first name:");
					first_name = br.readLine();
					nameArray[indx] = first_name;
					System.out.println("Enter middle name:");
					middlie_name = br.readLine();
					System.out.println("Enter last name:");
					last_name = br.readLine();
					System.out.println("Enter email:");
					email = br.readLine();
					emailArray[indx] = email;
					System.out.println("Enter contact:");
					contact = br.readLine();
					System.out.println("Enter address:");
					address = br.readLine();
					System.out.println("Enter proof Type:");
					proofType = br.readLine();
					registerIdArray[indx] = regID;
					indx++;
					regID++;
					reg.register(first_name,middlie_name,last_name,address,contact,email,proofType);
					break;
					
			case 2 : bk.book();
					break;
					
			case 3 : bk.status();
					break;
					
			case 4 : System.out.println("Do you want to update the email id?(Y/N)");
					ed=br.readLine();
					
					if(ed.equalsIgnoreCase("Y"))
					{
					System.out.println("\n***** UPDATE E-MAIL *******\n");
					System.out.println("Enter your ID : ");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter new Email id:");
					email = br.readLine();	
					reg.emailupdate(email,emailArray,id);	
					}
					break;
			case 5 : bk.allBooking(registerIdArray,indx);
					break;
					
			case 6 : bk.allCustomers(nameArray,indx,registerIdArray);
					break;
					
			case 7 : System.out.println("Thank You..!!\nHave a nice Day...!!");
					System.exit(0);
			
			}
					
			System.out.println("\nDo you want main menu....??(Y/N)");
			cont = s.nextLine();
			}while(cont.equalsIgnoreCase("y"));
		
			if(cont.equalsIgnoreCase("n"))
			{
				System.out.println("Thank you for Registration");
				System.exit(0);
			}
		}
	}
		
		

	


