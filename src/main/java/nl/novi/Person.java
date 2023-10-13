package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;

    private List<Person> siblings;
    private List<Person> children;
    private List<Person> pets;

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

}

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getPets() {
        return pets;
    }

    public void setPets(List<Person> pets) {
        this.pets = pets;
    }


    public void addParents(Person mother, Person father, Person child){
        child.setFather(father);
        child.setMother(mother);
    }

    public void addChild(Person parent, Person child){
        List<Person> children = new ArrayList<>();
        if(parent.getchildren() != null){
            for (Person person : parent.getChildren()) {
                children.add(person);
            }
        }
        children.add(child);
        parent.setChildren(children);
    }

    //in list?\

    public void addPet(Pet pet){}

    public void addSibling(){}

    public void getGrandChildren(){}
}

