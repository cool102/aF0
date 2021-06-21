package lesson6Faq.task4;

public class Person {
    String surname;
    String name;
    IdentityDocument identityDocument;

   public static Person random(){
    String surname = NameGenerator.generateName();
    String name = NameGenerator.generateName();
    IdentityDocument identityDocument = IdentityDocument.random();
     return new Person(surname,name, identityDocument);
   }

    public Person(String surname, String name, IdentityDocument identityDocument) {
        this.surname = surname;
        this.name = name;
        this.identityDocument = identityDocument;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public IdentityDocument getidentityDocument() {
        return identityDocument;
    }
}
