package HW04;

public enum Category {
    Standert("STANDARD"),
    Premium("PREMIUM");

    private final String label;

    Category(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}