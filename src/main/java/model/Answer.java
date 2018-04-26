package model;

import java.util.Date;

/**
 * Answer generated by hbm2java
 */
public class Answer implements java.io.Serializable {
	private int surveyid;
	private int number;
	private String type;
	private String content;

	public int getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "{surveyid:" + surveyid + ", number:" + number + ", type:" + type + ", content:" + content + "}";
	}

	
}