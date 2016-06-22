package com.BONC.cache;

public interface BookingService {
	/**
	 * 根据isbn获取book
	 * @param isbn
	 * @return
	 */
	public Book getByIsbn(String isbn);
	
	/**
	 * 更新数据（缓存清除并重建）
	 * @param isbn
	 * @param book
	 * @return
	 */
	public Book update(String isbn, Book book);
	
	/**
	 * 删除（缓存直接清除）
	 * @param isbn
	 */
	public void evict(String isbn);
}
