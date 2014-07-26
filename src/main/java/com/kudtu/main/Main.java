package com.kudtu.main;

import java.io.IOException;

import com.kudtu.crawler.ICrawler;
import com.kudtu.crawler.twitter.TwitterCrawler;
import com.kudtu.crawler.weibo.WeiboCrawler;
import com.kudtu.util.Log;
import com.kudtu.util.PropertyLoader;

public class Main {
    public static void main(String[] args) {
	try {
	    PropertyLoader loader = new PropertyLoader(PropertyLoader.APPLICATION_PROPERTY_NODE);
	    ICrawler crawler = null;
	    if (loader.getMetaPlatform().equalsIgnoreCase("TWITTER")) {
		crawler = new TwitterCrawler();
	    } else if (loader.getMetaPlatform().equalsIgnoreCase("WEIBO")) {
		crawler = new WeiboCrawler();
	    } else {
		Log.error(Main.class, "No specified microblogging platform, please configure it correctly.");
		System.exit(0);
	    }
	    crawler.run(args);
	} catch (IOException e) {
	    Log.info(Main.class, "IOException");
	}

    }
}
