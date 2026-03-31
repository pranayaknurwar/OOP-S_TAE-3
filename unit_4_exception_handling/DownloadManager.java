package unit_4_exception_handling;

public class DownloadManager implements Runnable {

    private String fileName;

    public DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager("file1.zip"));
        Thread t2 = new Thread(new DownloadManager("file2.zip"));

        t1.start();
        t2.start();
    }
}
