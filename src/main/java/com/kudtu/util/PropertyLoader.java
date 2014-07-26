package com.kudtu.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertyLoader {

    public static String APPLICATION_PROPERTY_NODE = "application.properties";

    public static String PROP_KEY_TWITTER_CONSUMER_KEY_SECRET = "TWITTER.CONSUMER_KEY_SECRET";
    public static String PROP_KEY_WEIBO_USERNAME = "WEIBO.USERNAME";
    public static String PROP_KEY_WEIBO_PASSWORD = "WEIBO.PASSWORD";
    public static String PROP_KEY_META_PLATFORM = "META.PLATFORM";
    
    private Properties properties;

    public static PropertyLoader getApplicationPropertyLoader() throws IOException {
	PropertyLoader propertyLoader = new PropertyLoader(APPLICATION_PROPERTY_NODE);
	return propertyLoader;
    }

    public PropertyLoader(String path) throws IOException {
	File file = new File(path);
	Reader reader = new FileReader(file);
	properties = new Properties();
	properties.load(reader);
    }

    public String getTwitterConsumerKeySecretSet() {
	return properties.getProperty(PROP_KEY_TWITTER_CONSUMER_KEY_SECRET);
    }

    public String getWeiboUsername() {
	return properties.getProperty(PROP_KEY_WEIBO_USERNAME);
    }

    public String getWeiboPassword() {
	return properties.getProperty(PROP_KEY_WEIBO_PASSWORD);
    }

    public String getMetaPlatform() {
	return properties.getProperty(PROP_KEY_META_PLATFORM);
    }

}
