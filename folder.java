package com.xyz.app1.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class folder {
public static void main(String[] args) throws IOException {
Path path = Paths.get("D:\\folder1");
if(!Files.exists(path)) {
Files.createDirectory(path);
System.out.println("folder is created");
}else {
System.out.println("folder is existed already");
}
}
}