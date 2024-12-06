public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Имя " + this.name + ", Фамилия " + this.lastName;
    }
    @Override
    public boolean equals(Object author) {
        if (this.getClass() != author.getClass()) {
            return false;
        }
        Author a2 = (Author) author;
        return this.name.equals(a2.name) && this.lastName.equals(a2.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
