package com.learning.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.learning.blog.entities.Category;
import com.learning.blog.entities.Comment;
import com.learning.blog.entities.User;

public class PostDto {
	private Integer postId;
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	private Set<CommentDto> comments = new HashSet<>();
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}
	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	/**
	 * @return the addedDate
	 */
	public Date getAddedDate() {
		return addedDate;
	}
	/**
	 * @param addedDate the addedDate to set
	 */
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	/**
	 * @return the category
	 */
	public CategoryDto getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryDto category) {
		this.category = category;
	}
	/**
	 * @return the user
	 */
	public UserDto getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(UserDto user) {
		this.user = user;
	}
	
	
	/**
	 * @return the postId
	 */
	public Integer getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public PostDto() {
		super();
	}
	/**
	 * @return the comment
	 */
	public Set<CommentDto> getComments() {
		return comments;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}
	
}
