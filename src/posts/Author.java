package posts;

public class Author {
    private int nomber;
    private String name;

    public Author(int nomber, String name) {
        this.nomber = nomber;
        this.name = name;
    }

    public int getNomber() {
        return nomber;
    }

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nomber=" + nomber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (getNomber() != author.getNomber()) return false;
        return getName() != null ? getName().equals(author.getName()) : author.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getNomber();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
