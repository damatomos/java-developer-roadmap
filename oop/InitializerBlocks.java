import java.util.Arrays;

public class InitializerBlocks {

    /**
     *
     * An initializer block in Java is a block of code,
     * enclosed in curly braces {} , that is executed when an
     * instance of a class is created. It's used to initialize
     * instance variables or perform setup tasks before the constructor
     * is called. There are two types: instance initializer blocks,
     * which run every time a new object is created, and static
     * initializer blocks, which run only once when the class is first loaded.
     *
     */

    private final static class Monster
    {
        private String[] attacks;

        // initialize when a instance is created
        {
            System.out.println("A new instance was created");
            attacks = new String[]{"Attack 1", "Attack 2"};
            System.out.println("Attacks has been to initialized");
        }

        // Initialize once time when the first class is initialized
        static {
            System.out.println("Attacks: ");
        }

        public String[] getAttacks()
        {
            return attacks;
        }
    }

    public static void main(String[] args) {
        Monster monster = new Monster();
        System.out.println(Arrays.stream(monster.getAttacks()).reduce((s, s2) -> s.concat(", " + s2)));
    }
}
