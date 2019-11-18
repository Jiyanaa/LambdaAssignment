package com.training.assignmeents.part2test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.training.assignmeents.part2.ListAllFilesBasedOnExtension;

public class ListAllFilesBasedOnExtensionTest {

	@Test
	public void testForlistOnlyFilesUsingLambda() throws IOException {
		String path = "C:\\STS workspace\\LambdaAssignment";
		ListAllFilesBasedOnExtension.listOnlyFilesUsingLambda(path);
	}
	
	@Test
	public void testForlistOnlyDirectoriesUsingLambda() throws IOException{
		String path = "C:\\STS workspace\\LambdaAssignment";
		ListAllFilesBasedOnExtension.listOnlyDirectoriesUsingLambda(path);
	}
	
	@Test
	public void testForlistFilesWithTxtExtension() throws IOException {	
		String path = "C:\\Users\\swayadav\\Documents\\StudyMaterials";
		ListAllFilesBasedOnExtension.listFilesWithParticularExtension(path);
	}
	
	@Test
	public void testForListFilesFromExtensionUsingLambda() throws IOException {	
		String path = "C:\\STS workspace\\LambdaAssignment";
		String extension = ".classpath";
		ListAllFilesBasedOnExtension.listFilesFromExtensionUsingLambda(path,extension);
	}
	
	@Test
	public void testForListFilesUsingFileFilter() throws IOException {	
		String path = "C:\\STS workspace\\LambdaAssignment";
		String extension = ".project";
		ListAllFilesBasedOnExtension.listFilesUsingFileFilter(path,extension);
	}
	
	
	

}
