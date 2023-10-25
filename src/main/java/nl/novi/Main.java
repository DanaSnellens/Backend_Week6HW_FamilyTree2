package nl.novi;

public class Main {
    public static void main(String[] args) {

        Person mother = new Person("Birgit", "Snellens", "vrouw", 62);
        Person father = new Person("Nigel", "Harle", "man", 71);
        Person me = new Person("Dana", "Snellens", "vrouw", 35);
        Person daan = new Person ("Daan", "Harle", "man", 42);
        Person anouk = new Person("Anouk", "Harle", "vrouw", 46);
        Person hummel = new Person("Hummel", "Snellens-Ten Voorde", "jochie", -0);

        me.addParents(father, mother, me);
        me.addSibling(me, anouk);
        me.addSibling(me, daan);

    }
}
