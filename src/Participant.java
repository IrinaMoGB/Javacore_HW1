public class Participant {
    private String name;
    private int hasMaxJumpHeight;
    private int hasMaxJumpLength;

    public Participant(String name, int hasMaxJumpHeight, int hasMaxJumpLength){
        this.name = name;
        this. hasMaxJumpHeight = hasMaxJumpHeight;
        this. hasMaxJumpLength = hasMaxJumpLength;
    }
    public String getName(){
        return name;

    }
    public int getHasMaxJumpHeight(){
        return hasMaxJumpHeight;

    }

    public int getHasMaxJumpLength() {
        return hasMaxJumpLength;
    }
}
