package de.wbs.nio;

import com.sun.xml.internal.stream.StaxXMLInputSource;

import java.io.IOException;
import java.nio.file.*;

public class Pathdemo2 {

    public static void main(String[] args) {
        Path path = Paths.get("D:/","workspace","StartProjekt","src","fileundio");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.resolve("src"));
        System.out.println(path.resolve("src").toAbsolutePath());
        System.out.println(path.getName(1));
        System.out.println(path.getName(1).resolve("bin"));
        System.out.println(path.getName(1).resolve("bin").toAbsolutePath());
        System.out.println(path.toAbsolutePath());
        System.out.println();

        for(int i = path.getNameCount();i>0;i--){
            System.out.println(path.getName(i-1) + " : " + path.getName(i-1).toAbsolutePath());
        }

        // gewünschte Nutzung
        Path home = Paths.get(System.getProperty("user.home"));
        System.out.println(home.toAbsolutePath());
        try {
            System.out.println(home.resolve(".android").toRealPath(LinkOption.NOFOLLOW_LINKS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(home.getName(0).resolve("docs").toAbsolutePath());

        System.out.println(home.resolve("docs").toAbsolutePath());

    }
}
