package FunctionalInterface;

import java.io.Serializable;

class BackupData implements Serializable {
    String data = "Backup Completed.";
}

public class BackupTest {
    public static void main(String[] args) {
        BackupData b = new BackupData();
        System.out.println(b.data);
    }
}