package model;

public class Project {
	
	private int id;
	private String projectName;
	private String stream;
	private String branch;
	private String technology;
	private String language;
	private double price;
	private int timeDurationInMonth;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTimeDurationInMonth() {
		return timeDurationInMonth;
	}
	public void setTimeDurationInMonth(int timeDurationInMonth) {
		this.timeDurationInMonth = timeDurationInMonth;
	}
	
}
