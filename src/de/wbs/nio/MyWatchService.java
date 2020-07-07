package de.wbs.nio;

import java.io.IOException;
import java.nio.file.*;

public class MyWatchService {

    public static void main(String[] args) {
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path path = Paths.get("D:/javatmp");
            Path path2 = Paths.get("D:/javademo");
            path.register(watcher,StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE);
            path2.register(watcher,StandardWatchEventKinds.ENTRY_MODIFY);
            while(true){
                WatchKey key = watcher.take();
                System.out.println("Änderung:");
                for(WatchEvent<?> event : key.pollEvents()){
                    System.out.println(event.kind() + " : " + event.context());
                }
                key.reset();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
