package com.properties_adactin;

import java.io.IOException;

import com.properties.Configuration_Reader;
import com.properties.File_Reader;

public class File_Reader_Adactin {
	private File_Reader_Adactin() {
		//restrict to create a object in another class
	}
	public static File_Reader_Adactin getFRA() {
		File_Reader_Adactin reader=new File_Reader_Adactin();
		return reader;
		

	}
	public Configuration_Reader_Adactin getCRA() throws IOException {
		Configuration_Reader_Adactin reader=new Configuration_Reader_Adactin();
		return reader;
		
	}


}

