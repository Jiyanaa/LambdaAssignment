package com.training.assignmeents.part2test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.training.assignmeents.part2.ListFiles;

/**
 * @author swayadav
 *
 */
public class ListFilesTest {

	/**
	 * @throws IOException
	 * list all files and directory using listFiles() method
	 */
	@Test
	public void testForListFilesFromCurrentDirecoryUsingMethod() throws IOException {
		String path = "C:\\STS workspace\\LambdaAssignment";
		File[] files = ListFiles.ListFilesFromCurrentDirecory(path);
	}

	/**
	 * @throws IOException
	 * list all directories in sorted order
	 */
	@Test
	public void testForListDirectoriesUsingMethod() throws IOException {
		String path = "C:\\STS workspace\\LambdaAssignment";
		String result = ListFiles.ListSubdirectoryFromDirectory(path);
		String expected = ".settings\nsrc\ntarget\n";
		assertEquals(expected, result);
	}
	
	/**
	 * @throws IOException
	 * list out all files and directory using lambda expression
	 */
	@Test
	public void testForlambdaExpressionToListAllFiles() throws IOException {
		String path = "C:\\STS workspace\\LambdaAssignment";
		ListFiles.lambdaExpressionToListFile(path);
	}
	
	
	/**
	 * @throws IOException
	 * list out all directories from particular path
	 */
	@Test
	public void testForlambdaExpressionToListAllDirectories() throws IOException {
		String path = "C:\\STS workspace\\LambdaAssignment";
		ListFiles.lambdaExpressionToListDirectory(path);
	}
	
	
}
