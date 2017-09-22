package com.exercises;

import java.io.File;
import java.io.FilenameFilter;

public class PE19 {
	 public static void main(String a[]){
	        File folder = new File("src/com/iofiles/");
	        File[] files = folder.listFiles(new FilenameFilter() {
	             
	            @Override
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".ts")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(File f:files){
	            System.out.println(f.getName());
	        }
	    }
}
