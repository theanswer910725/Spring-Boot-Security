package com.BONC;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static List<Post> posts = new ArrayList<Post>();
    static {
        posts.add(new Post("title1", "content1"));
        posts.add(new Post("title2", "content2"));
    }
    
    public static Post getById(long id) {
    	//do more...
        return posts.get(0);
    }
}
