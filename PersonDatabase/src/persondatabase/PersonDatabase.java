/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondatabase;
import java.util.Arrays;

/**
 *
 * @author Luke
 */
public class PersonDatabase {
    private final int POJEMNOSC_TABLICY = 1;
    private Person[] people;
    private int place;
    
    public PersonDatabase()
    {
        people = new Person[POJEMNOSC_TABLICY];
        place = 0;
    }
    
    public void add(Person p)
    {
        if(place == people.length)
        {
            people = Arrays.copyOf(people, people.length * 2);
        }
        people[place] = p;
        place++;
    }
    
    public void remove(Person p)
    {
        int i = 0;
        int NOT_FOUND = -1;
        int found = NOT_FOUND;
        if(p != null)
        {
            while(found == NOT_FOUND && i < people.length)
            {
                if(p.equals(people[i]))
                {
                    found = i;
                }
                else
                {
                    i++;
                }
            }
            
            if(found != NOT_FOUND)
            {
                System.arraycopy(people, found + 1, people, found, people.length - found - 1);
                place--;
            }
        }
        else
            return;
        
    }
    
    public Person get(int index) throws ArrayIndexOutOfBoundsException
    {
        if(index >= place || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("Podano błędny parametr");
        }
        return people[index];
    }
    
    public int size()
    {
        return place;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person database size: " + place);
        sb.append("\n");
        for(int i = 0; i < place; i++)
        {
            sb.append(people[i].toString());
            sb.append("\n");
        }
        return sb.toString();
        
    }
    
    
}
