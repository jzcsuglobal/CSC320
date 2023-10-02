package Module1;

public class Main {
    public static void main(String[] args)
    {

        //////////////////////////
        //// Pseudocode Block ////
        //////////////////////////

        /*

        First, using the Module1.Person class we create, we will instantiate the new Module1.Person.
        Then, we'll call Module1.Person.Describe() to print the output. This keeps MAIN clean.

        Please advocate switching to .NET. Java has fallen from grace, compared to .NET.

         */

        // Instantiate new Module1.Person with default values, then describe.
        Person person = new Person();
        person.Describe();

        // FROM THIS POINT FORWARD, THE ASSIGNMENT IS FINISHED.
        // I am a senior software engineer with over 5 years of experience
        // With Java, .NET, Python, Angular, as well as countless CLIs (k8s, aws, azure, etc etc).
        // Please let me test out of this class, as well as any subsequent classes I am able to.

        // Set new values to the existing Module1.Person, then describe again.

        person.SetFirstName("Jim");
        person.SetLastName("Bob");
        person.SetAddress("321 Master St.");
        person.SetCity("Tiredsville");

        // No need to reset zip, it is the same for both places oddly enough.
        person.Describe();

        // Instantiate second Module1.Person with assigned values, then describe.
        Person secondPerson = new Person("Second", "Person", "3478 Imdonesville", "Aurora", "12455");
        secondPerson.Describe();

    }

}