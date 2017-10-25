/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondatabase;

import java.util.Objects;

/**
 *
 * @author Luke
 */
public class Person {
    private String imie;
    private String nazwisko;
    private String pesel;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    
    public Person(String imie, String nazwisko, String pesel)
    {
        setImie(imie);
        setNazwisko(nazwisko);
        setPesel(pesel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.imie, other.imie)) {
            return false;
        }
        if (!Objects.equals(this.nazwisko, other.nazwisko)) {
            return false;
        }
        if (!Objects.equals(this.pesel, other.pesel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + '}';
    }
    
    
    
}
