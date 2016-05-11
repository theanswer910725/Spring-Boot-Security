package com.BONC;

import java.util.Date;

public class Post {
	 private static long count = 1;
	 private Long id;
	 private String title;
	 private String content;
	 private Date created;
	 
	 public Post(String title, String content) {
	    this.id = count++;
	    this.title = title;
	    this.content = content;
	    this.created = new Date();
	 }

	public static long getCount() {
		return count;
	}

	public static void setCount(long count) {
		Post.count = count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	 
}
