package posts;

public class Post{
    private String zaholovok;
    private String opys;
    private Location location = new Location();
    private Author author;

    public Post(String zaholovok, String opys, String city, String count, Author author) {
        this.zaholovok = zaholovok;
        this.opys = opys;
        this.location.setCity(city);
        this.location.setCountry(count);
        this.author = author;
    }

    public String getZaholovok() {
        return zaholovok;
    }

    public void setZaholovok(String zaholovok) {
        this.zaholovok = zaholovok;
    }

    public String getOpys() {
        return opys;
    }

    public void setOpys(String opys) {
        this.opys = opys;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (getZaholovok() != null ? !getZaholovok().equals(post.getZaholovok()) : post.getZaholovok() != null)
            return false;
        if (getOpys() != null ? !getOpys().equals(post.getOpys()) : post.getOpys() != null) return false;
        if (getLocation() != null ? !getLocation().equals(post.getLocation()) : post.getLocation() != null)
            return false;
        return getAuthor() != null ? getAuthor().equals(post.getAuthor()) : post.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getZaholovok() != null ? getZaholovok().hashCode() : 0;
        result = 31 * result + (getOpys() != null ? getOpys().hashCode() : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Post{" +
                "zaholovok='" + zaholovok + '\'' +
                ", opys='" + opys + '\'' +
                ", location=" + location +
                ", author=" + author +
                '}';
    }
}
