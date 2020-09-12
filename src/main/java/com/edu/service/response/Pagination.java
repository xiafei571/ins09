package com.edu.service.response;

public class Pagination {

	private Integer pageIndex;

	private Integer pageSize;

	private Integer cursor;

	private Integer offset;

	private Integer totalCount;

	private Integer totalPage;

	private Integer currentCount;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCursor() {
		return cursor;
	}

	public void setCursor(Integer cursor) {
		this.cursor = cursor;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		if (null == totalPage) {
			totalPage = (totalCount + pageSize - 1) / pageSize;
		}
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}

	public Pagination(Integer pageIndex, Integer pageSize) {
		if (pageIndex == null || pageIndex <= 0) {
			pageIndex = 1;
		}
		if (pageSize == null || pageSize <= 0) {
			pageSize = 10;
		}
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.cursor = (pageIndex - 1) * pageSize;
		this.offset = pageSize;
	}
}
