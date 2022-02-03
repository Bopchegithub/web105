package com.xyz.app1.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class folder1 {
public static void main(String[] args) throws IOException {
Path path = Paths.get("D:\\file1.txt");
Path path1 = Paths.get("D:\\file2.txt");
if(!Files.exists(path)) {
Files.createFile(path);
Files.writeString(path, "Java Programming" ,

StandardOpenOption.APPEND);

System.out.println("data is written");
}else {
Files.writeString(path, "Java Programming" ,

StandardOpenOption.APPEND);

System.out.println("data is appended");
}
}
}