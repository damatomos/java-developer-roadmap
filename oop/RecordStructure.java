public class RecordStructure {

    /**
     * A Java Record is a special kind of Java class which has a
     * concise syntax for defining immutable data-only classes.
     * Java Record instances can be useful for holding records
     * returned from a database query, records returned from a
     * remote service call, records read from a CSV file, or similar
     * types of use cases.
     *
     * A Java Record consist of one or more data fields which corresponds
     * to member variables in a regular Java class. The Java compiler auto
     * generates getter methods, toString(), hashcode() and equals() methods
     * for these data fields, so you don't have to write that boilerplate code
     * yourself. Since a Java Record is immutable, no setter methods are generated.
     *
     * A Record type definition is final, meaning you cannot create subclasses (subrecords) of a Java Record type.
     */

    static record Person(String name, Integer age){

        // Add constructors
        public Person(String name)
        {
            this(name, 43);
        }

        // Add methods
        public String getSlug()
        {
            return name.toLowerCase() + "-" + age.toString();
        }

        // Add Static Methods
        public static String getFirstChar(Person person)
        {
            return Character.toString(person.name().charAt(0));
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Mikhael", 24);

        System.out.println(person.name() + " " + person.age());
        System.out.println(person.getSlug());
        System.out.println(Person.getFirstChar(person));
    }
}
