package org.example.nativejavaplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan
public class NativeJavaPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeJavaPlaygroundApplication.class, args);
    }

}
