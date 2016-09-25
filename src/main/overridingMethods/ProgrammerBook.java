package main.overridingMethods;

import java.util.Objects;

/**
 * Created by silan on 25.09.2016.
 */
public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + ", Language: '" + language + "', Level: " + level + "'.";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode() * 3 + level * 47;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        if (level != programmerBook.level) {
            return false;
        }
        if (null == language) {
            return (Objects.equals(null, programmerBook.language));
        } else {
            if (!language.equals(programmerBook.language)) {
                return false;
            }
        }
        return true;
    }
}
