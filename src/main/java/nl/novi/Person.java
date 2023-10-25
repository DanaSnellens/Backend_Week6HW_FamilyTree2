package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //Attributen Person class
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;

    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    //Constructors Person class
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

    // Getters & setters Person class
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

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    //Methods Person class
    public void addParents(Person mother, Person father, Person child){
        child.setFather(father);
        child.setMother(mother);
        father.addChild(father, child);
        mother.addChild(mother, child);
    }

    public void addChild(Person parent, Person child){
        List<Person> children = new ArrayList<>();
        if(parent.getChildren()  != null){
            for (Person person : parent.getChildren()) {
                children.add(person);
            }
        }
        children.add(child);
        parent.setChildren(children);
    }

    //ONDERSTAANDE ZELF (BUITEN HW-KLAS) GEDAAN, DUS NOT SURE

    public void addPet(Person person, Pet pet){
        List<Pet> pets = new ArrayList<>();
        if(person.getPets() !=null){
            for (Pet owner :getPets()) {
                pets.add(owner);
            }
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSibling(Person person, Person sibling){
        List<Person> siblings = new ArrayList<>();
        if(person.getSiblings() != null) {
            for (Person p : getSiblings()) {
                siblings.add(p);
            }
        }
        siblings.add(sibling);
        person.setSiblings(siblings);
    }

    public List<Person> getGrandChildren(Person parent){
        List<Person> grandChildren = new ArrayList<>();
        if (parent.getChildren() != null)
            for (Person children: parent.getChildren()){
                if (children.getChildren() != null){
                    for (Person child : children.getChildren()){
                        grandChildren.add(children);
                    }
                }
            }
        return grandChildren;
    }
}

