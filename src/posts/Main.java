package posts;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Post> posts = new HashSet<>();
        Set<Author> authors = new HashSet<>();

        createPost(posts, authors, "kkjhj", "kjjh", "mnhj", "jbhg", 45, "jbh",
                0);

        System.out.println(posts);
        System.out.println(authors);


    }

    public static Set<Post> createPost(Set<Post> posts, Set<Author> authors, String ohol, String opys, String city,
                                       String country, int nomb, String name, int typeOfPost ){

        Author author1 = null;
        for (Author author : authors) {
            if (author.getNomber()==nomb && author.getName().equals(name)){
                 author1 = author;
            }else {
                author1 = new Author(nomb, name);
                authors.add(author1);
            }
        }



        switch (typeOfPost){
            case 0: {
                OfferJob offerPost = new OfferJob(ohol, opys, city, country, author1);
                posts.add(offerPost);
                break;
            }
            case 1:{
                SerchJob serchPost = new SerchJob(ohol, opys, city, country, author1);
                posts.add(serchPost);
                break;
            }
        }


        return posts;

    }

}
