package registerPackage;
import customerPackage.Customer;
import mainpackage.Main;
//import mainpackage.Customer;
//register
public class Registration {
	//int register[] = new int[25];
	static int regID=0,indx=0;
	String emailNew;
	static String[] firstNameArray = new String[25];
	static String[] middleNameArray = new String[25];
	static String[] lastNameArray = new String[25];
	static String[] phoneArray = new String[25];
	static String[] addressArray = new String[25];
	static String[] proofTypeArray = new String[25];
	
	customerPackage.Customer cus = new Customer();
	public void register(String first_name,String middlie_name,String last_name,String address,String contact,String email,String proofType)
	{
		
		cus.setFirst_name(first_name);
		cus.setMiddlie_name(middlie_name);
		cus.setLast_name(last_name);
		cus.setEmail(email);
		cus.setContact(contact);
		cus.setAddress(address);
		cus.setProofType(proofType);
		System.out.println("\nThank you for registration..!!");
		System.out.println("\nYOUR DETAILS ARE ...\n");
		this.display();
	}
	public void display()
	{
		System.out.println("First Name : "+cus.getFirst_name());
		firstNameArray[indx] = cus.getFirst_name();
		System.out.println("Middle Name : "+cus.getMiddlie_name());
		middleNameArray[indx] = cus.getMiddlie_name();
		System.out.println("Last Name : "+cus.getLast_name());
		lastNameArray[indx] = cus.getLast_name(); 
		System.out.println("E-Mail : "+cus.getEmail());
		
		System.out.println("Phone Number : "+cus.getContact());
		phoneArray[indx] = cus.getContact();
		System.out.println("Address : "+cus.getAddress());
		addressArray[indx] = cus.getAddress();
		System.out.println("Proof Type : "+cus.getProofType());
		proofTypeArray[indx] = cus.getProofType();
		System.out.println("Your registration No. is "+ ++regID);
		
		indx++;
		
	}
	
	public void displayUpdate(int idNo)
	{
		System.out.println("First Name : "+firstNameArray[idNo-1]);
		System.out.println("Middle Name : "+middleNameArray[idNo-1]);
		System.out.println("Last Name : "+lastNameArray[idNo-1]);
		System.out.println("E-Mail : "+cus.getEmail());
		System.out.println("Phone Number : "+phoneArray[idNo-1]);
		System.out.println("Address : "+addressArray[idNo-1]);
		System.out.println("Proof Type : "+proofTypeArray[idNo-1]);
		System.out.println("Your registration No. is "+ idNo);
		
		//indx++;
		
	}
	
	/*public int registerArrayPass()
	{
		//bk.allBooking();
		return 
	}*/
	
	public void emailupdate(String email,String emailArray[],int idNo)
	{
		
		cus.setEmail(email);
		emailNew = cus.getEmail();
		Main.emailArray[indx] = emailNew;
		System.out.println("\nEmail updated......!!!!\n");
		
		//System.out.println("New mail ID : "+cus.getEmail());
		this.displayUpdate(idNo);
	}
}
