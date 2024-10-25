package org.newdata;

public class NewData {
	
	private String id;
	private String type;
	private String name;
	private Image image;
	private Thumbnail thumbnail;
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public Image getImage() {
		return image;
	}
	public Thumbnail getThumbnail() {
		return thumbnail;
	}
	public NewData(String id, String type, String name, Image image, Thumbnail thumbnail) {
		
		this.id = id;
		this.type = type;
		this.name = name;
		this.image = image;
		this.thumbnail = thumbnail;
	}
	
	
	
	
	

}
