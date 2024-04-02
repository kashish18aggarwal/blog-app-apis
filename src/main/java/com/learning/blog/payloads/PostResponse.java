package com.learning.blog.payloads;

import java.util.List;

public class PostResponse {
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private long totalElements;
	private int totalPages;
	private boolean lastPage;
	/**
	 * @return the content
	 */
	public List<PostDto> getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(List<PostDto> content) {
		this.content = content;
	}
	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}
	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the totalElements
	 */
	public long getTotalElements() {
		return totalElements;
	}
	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}
	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * @return the lastPage
	 */
	public boolean isLastPage() {
		return lastPage;
	}
	/**
	 * @param lastPage the lastPage to set
	 */
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
	public PostResponse() {
		super();
	}
	
}
