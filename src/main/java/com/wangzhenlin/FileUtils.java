package com.wangzhenlin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	public static List<String> readFile(String fileName) throws IOException{
		List<String> lines =  new ArrayList<String>();
		
		File file = new File(fileName);
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(file),"UTF-8")
				);
		
		String str = null;
		while((str=reader.readLine())!=null) {
			lines.add(str);
		}
		return lines;
	}
	
}
