/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 19/08/20
 *  Time: 11:51 AM
 *  File Name : VideoStore.java
 * */
package definitions;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[10];
    }

    public VideoStore(Video[] store) {
        this.store = store;
    }

    /**
     * This method will add a new video to our inventory (store array).
     *
     * @param name The name of the new video that you want to add to the inventory.
     */
    public void addVideo(String name) {
        System.out.println(name + " is now added to the video inventory.");
    }

    /**
     * This method will help the client to rent a video.
     *
     * @param name The name of the video that the client wants to rent.
     */
    public void doCheckout(String name) {
        System.out.println("Thank you for renting \"" + name + "\".");
    }

    /**
     * This method prints all the videos in the inventory (store array).
     */
    public void listInventory() {
        for (Video video : store) {
            System.out.println(video);
        }
    }

    public Video[] getStore() {
        return store.clone();
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }
}
