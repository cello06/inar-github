package week_14.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Post {
    private Set<String> tags;
    private String postID;
    private static ArrayList<String> postIDs = new ArrayList<>();

    public Post(String postID) {
        this.tags = new HashSet<>();
        if(!setPostID(postID)){
            System.out.println("There is already Post with " + postID + " ID");
        }else{
            postIDs.add(postID);
        }

    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    public void removeTag(String tag) {
        if (this.tags.isEmpty()) {
            throw new RuntimeException("There is no File!");
        }
        if (!this.tags.contains(tag)) {
            System.out.println("There is no *'" + tag + "'* tag in this post!");
        } else {
            this.tags.remove(tag);
        }
    }

    public boolean exists(String tag) {
        return this.tags.contains(tag);
    }

    public Set<String> getTags() {
        return this.tags;
    }

    public boolean setPostID(String postID) {
        if (Post.postIDs.contains(postID)) {
            return false;
        }
        this.postID = postID;
        Post.postIDs.add(this.postID);
        return true;
    }
    public String getPostID(){
        return this.postID;
    }
}
