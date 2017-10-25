package persondatabase;

public class PersonManager {

    public static void main(String[] args) {
        
       PersonDatabase db = new PersonDatabase();
       db.add(new Person("Katarzyna", "Jaszczak", "123456789"));
       db.add(new Person("Anna", "Jaszczak", "987654321"));
       db.add(new Person("Robert", "Jaszczak", "456123789"));
       
        System.out.println(db);
        db.remove(new Person("Paweł", "Jaszczak", "123456789"));
        System.out.println(db);
    }
    
}
