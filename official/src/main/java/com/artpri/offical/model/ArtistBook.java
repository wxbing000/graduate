package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ArtistBook entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_book"
    ,catalog="jpw"
)

public class ArtistBook  implements java.io.Serializable {


    // Fields    

     private Integer bookId;

	private Integer userNum;
     private String bookPress;
     private String bookName;
     private String bookPublicatTime;
     private String bookPricing;
     private String bookContent;
     private String bookCatalogue;
     private String bookCategory;
     private String bookIsbn;
     private String bookImpression;
     private String bookAuthor;
     private String bookWriter;
     private String bookSize;
     private String bookPicturePath;
     private Integer bookShowState;
     /** default constructor */
    public ArtistBook() {
    }


    // Constructors

    /** minimal constructor */
    public ArtistBook(Integer userNum, String bookPicturePath, Integer bookShowState) {
        this.userNum = userNum;
        this.bookPicturePath = bookPicturePath;
        this.bookShowState = bookShowState;
    }

	public ArtistBook(Integer bookId, String bookName, String bookPicturePath) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPicturePath = bookPicturePath;
	}
    
    /** full constructor */
    public ArtistBook(Integer userNum, String bookPress, String bookName, String bookPublicatTime, String bookPricing, String bookContent, String bookCatalogue, String bookCategory, String bookIsbn, String bookImpression, String bookAuthor, String bookWriter, String bookSize, String bookPicturePath, Integer bookShowState) {
        this.userNum = userNum;
        this.bookPress = bookPress;
        this.bookName = bookName;
        this.bookPublicatTime = bookPublicatTime;
        this.bookPricing = bookPricing;
        this.bookContent = bookContent;
        this.bookCatalogue = bookCatalogue;
        this.bookCategory = bookCategory;
        this.bookIsbn = bookIsbn;
        this.bookImpression = bookImpression;
        this.bookAuthor = bookAuthor;
        this.bookWriter = bookWriter;
        this.bookSize = bookSize;
        this.bookPicturePath = bookPicturePath;
        this.bookShowState = bookShowState;
    }

   
    @Column(name="book_author", length=60)

    public String getBookAuthor() {
        return this.bookAuthor;
    }
    
    @Column(name="book_catalogue", length=65535)

    public String getBookCatalogue() {
        return this.bookCatalogue;
    }
    
    @Column(name="book_category", length=20)

    public String getBookCategory() {
        return this.bookCategory;
    }
    
    @Column(name="book_content", length=65535)

    public String getBookContent() {
        return this.bookContent;
    }
    
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="book_id", unique=true, nullable=false)

    public Integer getBookId() {
        return this.bookId;
    }
    
    @Column(name="book_impression", length=30)

    public String getBookImpression() {
        return this.bookImpression;
    }
    
    @Column(name="book_isbn", length=30)

    public String getBookIsbn() {
        return this.bookIsbn;
    }
    
    @Column(name="book_name", length=60)

    public String getBookName() {
        return this.bookName;
    }
    
    @Column(name="book_picture_path", nullable=false, length=100)

    public String getBookPicturePath() {
        return this.bookPicturePath;
    }
    
    @Column(name="book_press", length=60)

    public String getBookPress() {
        return this.bookPress;
    }
    
    @Column(name="book_pricing", length=10)

    public String getBookPricing() {
        return this.bookPricing;
    }
    
    @Column(name="book_publicat_time", length=30)

    public String getBookPublicatTime() {
        return this.bookPublicatTime;
    }
    
    @Column(name="book_show_state", nullable=false)

    public Integer getBookShowState() {
        return this.bookShowState;
    }
    
    @Column(name="book_size", length=20)

    public String getBookSize() {
        return this.bookSize;
    }
    
    @Column(name="book_writer", length=60)

    public String getBookWriter() {
        return this.bookWriter;
    }
    
    @Column(name="user_num", nullable=false)

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    
    public void setBookCatalogue(String bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }
    
    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    
    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    
    public void setBookImpression(String bookImpression) {
        this.bookImpression = bookImpression;
    }
    
    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public void setBookPicturePath(String bookPicturePath) {
        this.bookPicturePath = bookPicturePath;
    }
    
    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }
    
    public void setBookPricing(String bookPricing) {
        this.bookPricing = bookPricing;
    }
    
    public void setBookPublicatTime(String bookPublicatTime) {
        this.bookPublicatTime = bookPublicatTime;
    }
    
    public void setBookShowState(Integer bookShowState) {
        this.bookShowState = bookShowState;
    }
    
    public void setBookSize(String bookSize) {
        this.bookSize = bookSize;
    }
    
    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
   








}