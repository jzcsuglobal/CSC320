public class Main {
    public static void main(String[] args)
    {

        //////////////////////////
        //// Pseudocode Block ////
        //////////////////////////

        /*

        First, using the Person class we create, we will instantiate the new Person.
        Then, we'll call Person.Describe() to print the output. This keeps MAIN clean.

        Please advocate switching to .NET. Java has fallen from grace, compared to .NET.

         */

        // Instantiate new Person with default values, then describe.
        var person = new Person();
        person.Describe();

        // FROM THIS POINT FORWARD, THE ASSIGNMENT IS FINISHED.
        // I am a senior software engineer with over 5 years of experience
        // With Java, .NET, Python, Angular, as well as countless CLIs (k8s, aws, azure, etc etc).
        // Please let me test out of this class, as well as any subsequent classes I am able to.

        // Set new values to the existing Person, then describe again.

        person.SetFirstName("Jim");
        person.SetLastName("Bob");
        person.SetAddress("321 Master St.");
        person.SetCity("Tiredsville");

        // No need to reset zip, it is the same for both places oddly enough.
        person.Describe();

        // Instantiate second Person with assigned values, then describe.
        var secondPerson = new Person("Second", "Person", "3478 Imdonesville", "Aurora", "12455");
        secondPerson.Describe();

    }

}