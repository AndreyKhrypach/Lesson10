package Helper;

public class CharacterMatcher {
    public int index;
    public char charName;

    public CharacterMatcher(int index, char charName) {
        this.index = index;
        this.charName = charName;
    }

    @Override
    public String toString() {
        return "CharacterMatcher{" +
                "index=" + index +
                ", charName=" + charName +
                '}';
    }
}
