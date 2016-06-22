package com.BONC.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public class BookingServiceImpl implements BookingService {

	@Override
	@Cacheable(value = "books", key = "#isbn")
	public Book getByIsbn(String isbn) {
		bookingServiceImpl();
		return new Book(isbn,"Thinking in Java");
	}
	
    private void bookingServiceImpl() {
        try {
            long time = 5000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

	@Override
	@CachePut(value = "books", key = "#isbn")
	public Book update(String isbn, Book book) {
	    return new Book(book.getIsbn(), book.getTitle());
	}

	@Override
	@CacheEvict(value = "books", key = "#isbn")
	public void evict(String isbn) {

	}
}
