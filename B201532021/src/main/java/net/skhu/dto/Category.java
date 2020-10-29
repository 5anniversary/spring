package net.skhu.dto;

import java.io.Serializable;

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	int id;
	String title;
	String titleEng;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEng() {
		return titleEng;
	}

	public void setTitleEng(String titleEng) {
		this.titleEng = titleEng;
	}

}
