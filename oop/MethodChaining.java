import java.util.ArrayList;
import java.util.List;

public class MethodChaining {

    /**
     *
     * Method chaining is a programming technique where multiple
     * method calls are made sequentially on the same object, one
     * after another, in a single statement. Each method in the chain
     * returns an object, allowing the next method to be called on that
     * returned object. This approach enhances code readability and conciseness
     * by reducing the need for temporary variables and intermediate steps.
     *
     */

    final static class BuilderString {
        private String text = "";
        private List<String> groups = new ArrayList<>();

        public BuilderString concat(String partial)
        {
            this.text = String.format("%s %s ", this.text, partial);
            return this;
        }

        public BuilderString group()
        {
            groups.add(this.text.trim());
            this.text = "";
            return this;
        }

        public String getText()
        {
            return this.text.trim();
        }

        public String getGroups()
        {
            return this.groups.stream().reduce(String::concat).get().concat("\n" + this.text.trim());
        }
    }

    public static void main(String[] args)
    {
        BuilderString bs = new BuilderString();
        bs.concat("Abacate").concat("Cenoura").group().concat("Cebola");
        System.out.println(bs.getGroups());
    }

}
