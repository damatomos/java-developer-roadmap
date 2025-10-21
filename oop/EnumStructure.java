public class EnumStructure {

    /**
     * A Java Enum is a special Java type used to define collections of constants.
     * More precisely, a Java enum type is a special kind of Java class. An enum
     * can contain constants, methods etc. Java enums were added in Java 5.
     */

    // Simple mode to a enum
    private static enum Stage
    {
        STAGE_ONE,
        STAGE_TWO,
        STAGE_THREE
    }

    // Enum with fields
    private static enum StageFields
    {
        STAGE_ONE(30, 3),
        STAGE_TWO(50, 2),
        STAGE_THREE(120, 4)
        ;

        private final int total_enemies;
        private final int total_hearts;

        StageFields(int total_enemies, int total_hearts)
        {
            this.total_enemies = total_enemies;
            this.total_hearts = total_hearts;
        }
    }

    // Enum with methods
    private static enum StageMethods
    {
        STAGE_ONE(30, 3),
        STAGE_TWO(50, 2),
        STAGE_THREE(120, 4)
        ;

        private final int total_enemies;
        private final int total_hearts;

        StageMethods(int total_enemies, int total_hearts)
        {
            this.total_enemies = total_enemies;
            this.total_hearts = total_hearts;
        }

        public String toString(){
            return """
                   Stage: %s
                   Enemies: %d
                   Hearts: %d
                   """.formatted(this.name(), total_enemies, total_hearts);
        }
    }

    public static void main(String[] args) {
        StageFields stageFields = StageFields.STAGE_THREE;
        StageMethods stageMethods = StageMethods.STAGE_TWO;
        System.out.println(stageMethods.toString());
        System.out.println(stageFields.total_enemies);
        System.out.println(Stage.STAGE_ONE);
    }
}
