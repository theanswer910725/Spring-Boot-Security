package com.BONC.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching 
public class App {

	@Autowired
    BookingService bookingService;

    @RequestMapping(value = "/{isbn}")
    public Book get(@PathVariable String isbn) {
        long start = System.nanoTime();
        Book book = bookingService.getByIsbn(isbn);
        System.out.println("调用时间：" + (System.nanoTime() - start));
        return book;
    }
    
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("books");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
