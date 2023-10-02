package Lektion_41.code.create_file;

import java.io.File;

public class Delete_File {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete file.");
        }
    }
}
