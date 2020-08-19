/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:43 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        // <The Reference Type> <The Reference Variable Name> = new <Constructor Calling>;
        Video video = new Video("Sooryavansham");
        Video video1 = new Video("Sivaji: The Boss");
        System.out.println(video.hashCode());
        System.out.println(video1.hashCode());
    }
}
