package com.nullatom.spider;

public class Main {
	public static void main(String[] args) {
		

		FindSources fst = new FindSources("https://www.90pan.com/o137878&pg=",11,"C:/Users/Administrator/Desktop/MCPEApks");
		
		
		new Thread(()->{fst.findDownloadPageUrls();}).start();

	}
}
