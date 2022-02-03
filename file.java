package com.xyz.app1.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class file{
public static void main(String[] args) throws IOException {
Path path = Paths.get("D:\\score.txt");
if(!Files.exists(path)) {
Files.createFile(path);
System.out.println("Your Score is 55");
}else {
System.out.println("file is existed already");
}
}
}