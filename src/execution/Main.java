/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:43 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.Video;
import definitions.VideoStore;

public class Main {
    public static void main(String[] args) {
        Video[] videos = new Video[5];
        for (int i = 0; i < videos.length; i++) {
            videos[i] = new Video("Video" + (i + 1));
        }
        VideoStore myVideoStore = new VideoStore(videos);
        myVideoStore.listInventory();
    }
}
