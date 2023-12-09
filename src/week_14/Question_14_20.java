package week_14;

import week_14.classes.Post;

public class Question_14_20 {
    public static void main(String[] args) {
        Post post1 = new Post("1");
        Post post2 = new Post("2");
        Post post3 = new Post("2");
        //Post post4 = new Post("4");
        System.out.println(post3.getPostID());

        post1.addTag("Java");
        post1.addTag("Coding");
        post1.addTag("Programing");
        post1.addTag("Programing");
        System.out.println(post1.getTags());
        post2.addTag("Java");
        post2.addTag("Technology");
        post2.addTag("Coding");
        System.out.println("Does post1 have the tag 'Java'? " + post1.exists("Java"));
        System.out.println("Does post2 have the tag 'Technology'? " + post2.exists("Technology"));
        post1.removeTag("Programming");
        post1.removeTag("Programing");
        System.out.println(post1.getTags());

    }
}
