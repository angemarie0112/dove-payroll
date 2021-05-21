package com.dovePayroll.languages;

public class Language {
	private String languageName;
	private String moduleName;
	private String className;
	
	public Language() {}
	public Language(String langName, String modName, String clName) {
		this.languageName = langName;
		this.moduleName = modName;
		this.className = clName;
	}
	
	public String getLanguageName() {
		return languageName;
	} 
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String fetchFileLocation() {
		String location = "Language/" + this.languageName + "/" + this.moduleName + "/" + this.className + ".jsp";
		return location;
	}
	
	
	
}
