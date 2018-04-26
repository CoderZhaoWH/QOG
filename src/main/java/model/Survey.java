package model;

import java.util.Date;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Survey generated by hbm2java
 */
public class Survey implements java.io.Serializable {

	private Integer id;
	private User user;
	private String title;
	private String description;
	private Date createtime;
	private String createuser;
	private int number;
	private char isable;
	private String image;
	private Set questions = new HashSet(0);
	private Set answers = new HashSet(0);

	public Survey() {
	}

	public Survey(User user, String title, String description, Date createtime,
			String createuser, int number, char isable, String image) {
		this.user = user;
		this.title = title;
		this.description = description;
		this.createtime = createtime;
		this.createuser = createuser;
		this.number = number;
		this.isable = isable;
		this.image = image;
	}

	public Survey(User user, String title, String description, Date createtime,
			String createuser, int number, char isable, String image,
			Set questions, Set answers) {
		this.user = user;
		this.title = title;
		this.description = description;
		this.createtime = createtime;
		this.createuser = createuser;
		this.number = number;
		this.isable = isable;
		this.image = image;
		this.questions = questions;
		this.answers = answers;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreateuser() {
		return this.createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public char getIsable() {
		return this.isable;
	}

	public void setIsable(char isable) {
		this.isable = isable;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set questions) {
		this.questions = questions;
	}

	public Set getAnswers() {
		return this.answers;
	}

	public void setAnswers(Set answers) {
		this.answers = answers;
	}

}