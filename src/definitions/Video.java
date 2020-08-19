/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:36 PM
 *  File Name : Video.java
 * */
package definitions;

public class Video {
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
}
