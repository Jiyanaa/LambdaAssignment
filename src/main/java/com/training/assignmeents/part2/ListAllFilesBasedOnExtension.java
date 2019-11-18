package com.training.assignmeents.part2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author swayadav
 *
 */
public class ListAllFilesBasedOnExtension {

	
	/**
	 * @param path
	 * @throws IOException
	 */
	public static void listOnlyFilesUsingLambda(String path) throws IOException {
		Files.list(Paths.get(path))
		.filter(Files::isRegularFile).forEach(System.out::println);
	}
	
	/**
	 * @param path
	 * @throws IOException
	 */
	public static void listOnlyDirectoriesUsingLambda(String path) throws IOException {
		Files.list(Paths.get(path))
		.filter(Files::isDirectory).forEach(System.out::println);
	}
	
	/**
	 * @param path
	 * @throws IOException
	 */
	public static void listFilesWithParticularExtension(String path) throws IOException {
		Files.list(Paths.get(path))
		.filter(filepath -> filepath.toString().endsWith(".txt")).forEach(System.out::println);
	}
	
	
	/**
	 * @param path
	 * @param extension
	 */
	public static void listFilesFromExtensionUsingLambda(String path,String extension) {
		File file = new File(path);
		File[] listFiles = file.listFiles((d, s) -> {
			return s.toLowerCase().endsWith(extension);
		});
		
		for (File f : listFiles) {
			System.out.println(f);
		}
	}
	
	
	/**
	 * @param path
	 * @param extension
	 */
	public static void listFilesUsingFileFilter(String path, String extension) {
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("Directory does not exist");
		}
		File[] files = file.listFiles(new NewFileNameFilter(extension));
		if(files.length==0) {
			System.out.println("list is empty");
		}
		else {
			for (File f : files) {
				System.out.println(f);
			}
		}
	}
}


/**
 * @author swayadav
 * custom file filter to list out files from current directory
 *
 */
class NewFileNameFilter implements FilenameFilter	{

	private String extension;
	
	public NewFileNameFilter(String extension) {
		this.extension = extension.toLowerCase();
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.toLowerCase().endsWith(extension);
	}
	
}
