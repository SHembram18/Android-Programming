 class Contact
{
	int id;
	String name;
	String phone;

	public Contact()
	{

	}

	public Contact(int id, String name, String phone)
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
	} 
	public Contact (String name, String phone)
	{

		this.name = name;
		this.phone = phone;
	}
	public int getID()
	{
		return this.id;
	}
	public void setID()
	{
		this.id = id;
	}
	public String getName()
	{
		return this.name;

	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;

	}
}
  public  class AndroidSQLDatabaseTest {
	public static void main(String[] args) {
		Contact obj = new Contact(42, "Santosh Hembram", "6370381260");
		System.out.println("Your ID = "+obj.getID() );
		System.out.println("Your Name = "+obj.getName() );
		System.out.println("Your Contact Number = "+obj.getPhone() );
	}
	
}