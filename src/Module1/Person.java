package Module1;

public class Person {

    public Person()
    {
        SetDefaultPerson();
    }
    public Person(String firstName, String lastName, String address, String city, String zip)
    {
        SetFirstName(firstName);
        SetLastName(lastName);
        SetAddress(address);
        SetCity(city);
        SetZip(zip);
    }

    private String FirstName;
    private String LastName;
    private String Address;
    private String City;
    private String Zip;

    public String GetFirstName()
    {
        return FirstName;
    }

    public String GetLastName()
    {
        return LastName;
    }

    public String GetAddress()
    {
        return Address;
    }

    public String GetCity()
    {
        return City;
    }

    public String GetZip()
    {
        return Zip;
    }

    public void SetFirstName(String firstName)
    {
        FirstName = firstName;
    }

    public void SetLastName(String lastName)
    {
        LastName = lastName;
    }

    public void SetAddress(String address)
    {
        Address = address;
    }

    public void SetCity(String city)
    {
        City = city;
    }

    public void SetZip(String zip)
    {
        Zip = zip;
    }

    private void SetDefaultPerson()
    {
        FirstName = "Frank";
        LastName = "Tester";
        Address = "123 Testing Street";
        City = "No Nulls";
        Zip = "15111";
    }

    public void Describe()
    {
        System.out.println("-- Describing Person! --");
        System.out.println("First Name: " + GetFirstName());
        System.out.println("Last Name: " + GetLastName());
        System.out.println("Address: " + GetAddress());
        System.out.println("City: " + GetCity());
        System.out.println("Zip: " + GetZip());
    }
}
