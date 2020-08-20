/*
package net.gwzz.liberium;

import java.io.*;
import java.net.*;

public class Downloader {

  public static int roundToPowerOf2(int a) {
    int n = a - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return n + 1;
  }

  public static byte[] readInputStream(InputStream inputStream) throws IOException {
    if(inputStream == null){
      return new byte[0];
    }
    int buflen = roundToPowerOf2(inputStream.available());  
		byte[] buffer = new byte[buflen > 4096 ? buflen : 4096];
		int len = 0;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();  
		while((len = inputStream.read(buffer)) != -1) {  
			bos.write(buffer, 0, len);  
		}
    bos.close();
    inputStream.close();
		return bos.toByteArray();
	}

  public static void download(String from, String to){
    File save = new File(to);
    try(
      FileOutputStream fos = new FileOutputStream(save)
    ){
      HttpURLConnection conn = (HttpURLConnection) new URL(from).openConnection();
      InputStream inputStream = conn.getInputStream();
      byte[] getData = readInputStream(inputStream);
      if (!save.exists()) {
        save.createNewFile();
      }
      fos.write(getData);
    } catch(Exception e){
      e.printStackTrace();
    }
  }

}
*/