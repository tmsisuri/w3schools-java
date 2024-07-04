enum Level {
    LOW,
    MEDIUM,
    HIGH
}
public class LoopThroughAnEnum {
    public static void main(String[] args) {
        for(Level l : Level.values()) {
            System.out.println(l);
        }
    }
}
