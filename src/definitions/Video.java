/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:36 PM
 *  File Name : Video.java
 * */
package definitions;

import java.util.Objects;

public class Video {

    // Components of a Definition Class:
    // 1. private fields.
    // 2. Getter methods for private fields.
    // 3. Setter methods for private fields.
    // 4. Constructor methods for initializing the attributes of the object.
    // 5. The toString() method.
    // 6. The equals() and the hashCode() method.

    private String videoName;
    private int rating;
    private boolean checkout;

    // The Constructor Method : Used to initialize the attributes of an object.
    // public <non-static> <no-return type> <SameAsTheClassName> () {}

    // The Java compiler creates a no-parameter constructor for us automatically.
    // default constructor

    // we can create two types of constructors:
    // 1. Non-Parameterized Constructors : The constructor has no parameters.

    public Video() {
        this.videoName = "";
        this.rating = 0;
        this.checkout = false;
    }

    // 2. Parameterized Constructors : They have some parameters.

    public Video(String videoName, int rating, boolean checkout) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkout = checkout;
    }

    public Video(String videoName) {
        this.videoName = videoName;
        this.rating = 100;
        this.checkout = true;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    // the toString() method : used to convert an object to String
    public String toString() {
        return String.format(
                "Video Name: %s, Video Rating: %d, Is Video Available: %b",
                getVideoName(), getRating(), isCheckout()
        );
    }

    // The equals() and the hashCode() methods.
    // The Object class in Java is the super class (parent) of all other classes.
    // When we create any class in Java, it automatically inherits the Object class.

    // video.equals(video1)
    @Override
    public boolean equals(Object o) {
        if (this == o) { // video == video1
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Video video = (Video) o;
        return this.getRating() == video.getRating() &&
                this.isCheckout() == video.isCheckout() &&
                this.getVideoName().equals(video.getVideoName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), getRating(), isCheckout());
    }
}
