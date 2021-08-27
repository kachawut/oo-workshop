public class Range {

    private String text;

    public Range(String text) {
        this.text = text;
    }

    public boolean isStartWithInclusive() {
        return text.startsWith("[");
    }

    public int getStartInput() {
        return Integer.parseInt(text.substring(1,2));
    }

    public boolean isEndWithInclusive() {
        return text.startsWith("[");
    }
}
