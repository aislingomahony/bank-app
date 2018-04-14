package com.bookcatalogue.model;

import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author x17135486
 */
@XmlRootElement
public class Book{   

    private int id;
    private String title;
    private String author;
    private String publisher;
    
    public Book() {
    }

    public Book(int id, String title, String author, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public Book(String title, String author, String publisher) {
    	this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}    
}
