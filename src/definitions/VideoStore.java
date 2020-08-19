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

    public VideoStore(Video[] store) {
        this.store = store;
    }

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
