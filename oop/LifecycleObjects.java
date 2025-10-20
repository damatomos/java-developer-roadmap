public class LifecycleObjects {

    final static class Person {
        private String name;
        private Integer age;

        public Person() {}

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

    public static void main(String [] args)
    {
        Person p; // Declare a variable
        p = new Person("John Snow", 23); // Create object in the memory and initialize constructor

        System.out.printf("Name: %s\nAge: %d%n", p.name, p.age); // Use object

        p = null; // Become object in an inaccessible object

        System.gc(); // Call Garbage Collector (Object is not in use and will be removed)
    }
}
