package com.edu.service.response;

public class PaginationResult<T> {

	private T pageData;

	private Pagination pagination;

	public T getPageData() {
		return pageData;
	}

	public void setPageData(T pageData) {
		this.pageData = pageData;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public PaginationResult(T pageData, Pagination pagination) {
		this.pageData = pageData;
		this.pagination = pagination;
	}

	public PaginationResult() {

	}
}
