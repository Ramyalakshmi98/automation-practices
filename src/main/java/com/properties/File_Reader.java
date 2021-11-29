package com.properties;

import java.io.IOException;

public class File_Reader {
	private File_Reader() {
		//restrict to create a object in another class
	}
	public static File_Reader getFR() {
		File_Reader reader=new File_Reader();
		return reader;
		

	}
	public Configuration_Reader getCR() throws IOException {
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
		
	}

}
