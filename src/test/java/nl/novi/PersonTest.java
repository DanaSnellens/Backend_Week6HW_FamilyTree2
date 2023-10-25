package nl.novi;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person mother;

    Person father;

    Person me;

    Pet diesel;

    Person zus;

    @org.junit.jupiter.api.BeforeEach
    //ARRANGE VOOR ALLE TESTS
    void setUp() {
        mother = new Person("Birgit", "Johanna Catherina",
                "Snellens", "vrouw",62);
        father = new Person("Nigel", "Harle", "man", 71);

        me = new Person("Dana", "Snellens", "vrouw", 35);

        diesel = new Pet ("Diesel", 9, "Cane Corso");

        zus = new Person("Anouk", "Harle", "vrouw", 47);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
        // ACT
        String getName = mother.getName();
        // ASSERT
        assertEquals("Birgit", getName);
    }

    @org.junit.jupiter.api.Test
    void setName() {
        // ACT
        mother.setName("Tralala");
        String name = mother.getName();
        // ASSERT
        assertEquals("Tralala", name);
    }

    @org.junit.jupiter.api.Test
    void getMiddleName() {
        // ACT
        String getMiddleName = mother.getMiddleName();
        // ASSERT
        assertEquals("Johanna Catherina", getMiddleName);
    }

    @org.junit.jupiter.api.Test
    void setMiddleName() {
        // ACT
        mother.setMiddleName("Blabla");
        String middleName = mother.getMiddleName();
        // ASSERT
        assertEquals("Blabla", middleName);
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        // ACT
        String getLastName = mother.getLastName();
        // ASSERT
        assertEquals("Snellens", getLastName);
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        // ACT
        mother.setLastName("Boeboe");
        String lastName = mother.getLastName();
        // ASSERT
        assertEquals("Boeboe", lastName);
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        // ACT
        String getSex = mother.getSex();
        // ASSERT
        assertEquals("vrouw", getSex);
    }

    @org.junit.jupiter.api.Test
    void setSex() {
        // ACT
        mother.setSex("man");
        String sex = mother.getSex();
        // ASSERT
        assertEquals("man", sex);
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        // ACT
        int getAge = mother.getAge();
        // ASSERT
        assertEquals(62, getAge);
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        // ACT
        mother.setAge(33);
        int age = mother.getAge();
        // ASSERT
        assertEquals(33, age);
    }

    @org.junit.jupiter.api.Test
    void getMother() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void setMother() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void getFather() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void setFather() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void getSiblings() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void setSiblings() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void getChildren() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void setChildren() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void getPets() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void setPets() {
        // ACT
        // ASSERT
    }

    @org.junit.jupiter.api.Test
    void addParents() {
        // ACT
        me.addParents(mother, father, me);
        // ASSERT
        assertEquals("Birgit", me.getMother().getName());
        assertEquals("Nigel", me.getFather().getName());
    }

    @org.junit.jupiter.api.Test
    void addChild() {
        // ACT
        father.addChild(father, me);
        // ASSERT
        assertEquals("Dana", father.getChildren().get(0).getName());
        assertEquals(1, father.getChildren().size());
    }

    @org.junit.jupiter.api.Test
    void addPet() {
        // ACT
        me.addPet(me, diesel);
        // ASSERT
        assertEquals(diesel, me.getPets().get(0));
    }

    @org.junit.jupiter.api.Test
    void addSibling() {
        // ACT
        me.addSibling(me, zus);
        // ASSERT
        assertEquals(zus, me.getSiblings().get(0));
    }

    @org.junit.jupiter.api.Test
    void getGrandChildren() {
        // ACT
        // ASSERT
    }
}