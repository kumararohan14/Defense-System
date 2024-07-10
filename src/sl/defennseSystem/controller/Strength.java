
package sl.defennseSystem.controller;


public enum Strength {
    Low(20),
    Medium(50),
    High(70);

    private  int value;

    Strength(int value) {
        this.value = value;
    }

    public  int getValue() {
        return value;
    }
}
