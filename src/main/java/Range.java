public class Range {

    private String text;

    public Range(String text) {
        this.text = text;
    }

    public boolean isStartWithInclusive() {
        return text.startsWith("[");
    }
}
