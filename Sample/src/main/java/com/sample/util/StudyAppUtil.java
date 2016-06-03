package com.sample.util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*import java.util.Base64;*/
import java.util.Base64;

public class StudyAppUtil {
	
	public static void writeFile(byte[] content, String filesDirectory, String fileName) throws IOException {
		 
		File file = new File(filesDirectory);
		
		if(!file.exists()) {
			file.mkdirs();
		}
		file = new File(filesDirectory + File.separator + fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fop = new FileOutputStream(file);
 
		fop.write(content);
		fop.flush();
		fop.close();
 
	}
	
	public static String readFile(String path)
	{
		Path filepath;
		try{
			filepath = Paths.get(path);
		}
		catch(Exception e)
		{
			return null;
		}
		byte[] data;
		try {
			if(Files.exists(filepath))
			{	
				data = Files.readAllBytes(filepath);
			
			 String base64String = Base64.getEncoder().encodeToString(data);
			 return base64String;
			 
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		return null;
	
	}
	
	public static byte[] readFileBytes(String path)
	{
		System.out.println(path);
		Path filepath = Paths.get(path);
		byte[] data;
		try {
			if(Files.exists(filepath))
			{	
				data = Files.readAllBytes(filepath);
			
			 //String base64String = Base64.getEncoder().encodeToString(data);
			 return data;
			 
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		return null;
	
	}

}
