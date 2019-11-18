package com.training.assignmeents.part2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author swayadav
 *
 */
public class ListFiles {
	
	/**
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static File[] ListFilesFromCurrentDirecory(String path) throws IOException {
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
		}
		if(files.length==0) {
			System.out.println("No Files Are Found");
		}
		return files;
	}
	
	/**
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String ListSubdirectoryFromDirectory(String path) throws IOException {
		File file = new File(path);
		File[] files = file.listFiles();
		String temp = "";
		for (File f : files) {
			if(f.isDirectory()) {
				temp+=f.getName()+"\n";
			}
		}
		System.out.println(temp);
		return temp;
		
	}
	
	/**
	 * @param path
	 * @throws IOException
	 */
	public static void lambdaExpressionToListFile(String path) throws IOException {
		Stream<Path> files = Files.list(Paths.get(path));
		files.forEach(System.out::println);
		files.close();
	}
	

	/**
	 * @param path
	 * @throws IOException 
	 */
	public static void lambdaExpressionToListDirectory(String path) throws IOException {
		Files.list(Paths.get(path))
        .filter(Files::isDirectory)
        .sorted()
        .forEach(System.out::println);
	}

}
