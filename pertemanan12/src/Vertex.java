public class Vertex {
    private char label;
    private boolean wasVisited;

    public char getLabel() {
        return label;
    }

    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
