/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:36 PM
 *  File Name : Video.java
 * */
package definitions;

public class Video {

    // Creating Definition Classes in Java.

    // member variables =?
    // fields/variables/attributes

    // 1. Always set the visibility modifier of a field to private unless otherwise specified.
    // 2. Always set the access modifier of a field to non-static unless otherwise specified.

    private String videoName;
    private int rating;
    private boolean checkout;

    // There are some special types of methods:
    // 1. a getter method: used to read the value of a private field.
    // observer method / accessor method

    // formula for getter method
    // public <am:sameAsTheField> <rt:sameAsTheField> get<NameOfTheField>() {}

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    // 2. a setter method: used to write the value of a private field.
    // transformer method / mutator method

    // formula to create a setter method.
    // public <am:sameAsTheField> void set<NameOfTheField>(<SameAsTheField>) {}

    public void setRating(int rating) {
        this.rating = rating;
    }

    // exception for boolean: the name of the getter method starts with 'is' instead of 'get'
    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }
}
