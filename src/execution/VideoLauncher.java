/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:43 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.VideoStore;

import java.util.Scanner;

public class VideoLauncher {

    private static final int ADD_VIDEO = 1;
    private static final int CHECK_OUT_VIDEO = 2;
    private static final int RETURN_VIDEO = 3;
    private static final int RECEIVE_RATING = 4;
    private static final int LIST_INVENTORY = 5;
    private static final int EXIT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        VideoStore myVideoStore = new VideoStore();
        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Video: ");
            System.out.println("2. Check out video: ");
            System.out.println("3. Return video: ");
            System.out.println("4. Receive rating: ");
            System.out.println("5. List inventory: ");
            System.out.println("6. Exit: ");
            System.out.println("Enter you choice (1..6): ");
            clientInput = scanner.nextInt();
            String videoName;
            switch (clientInput) {
                case ADD_VIDEO:
                    System.out.println("Enter the name of the video that you want to add: ");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.addVideo(videoName);
                    break;
                case CHECK_OUT_VIDEO:
                    break;
                case RETURN_VIDEO:
                    break;
                case RECEIVE_RATING:
                    break;
                case LIST_INVENTORY:
                    myVideoStore.listInventory();
                    break;
                default:
            }
        } while (clientInput != EXIT);
        scanner.close();
    }
}
