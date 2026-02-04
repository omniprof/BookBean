
package com.bpbonline.bookbean;

import java.util.Objects;

/**
 *
 * @author omniprof
 */
public class BookBean {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int pages;
    private int copiesInStock;
    private int copiesSold;
    private double wholesaleCost;
    private double retailPrice;
    private boolean suitableForChildren;    

    // Extra fields
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCopiesInStock() {
        return copiesInStock;
    }

    public void setCopiesInStock(int copiesInStock) {
        this.copiesInStock = copiesInStock;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public boolean isSuitableForChildren() {
        return suitableForChildren;
    }

    public void setSuitableForChildren(boolean suitableForChildren) {
        this.suitableForChildren = suitableForChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookBean bookBean = (BookBean) o;
        return pages == bookBean.pages && copiesInStock == bookBean.copiesInStock && copiesSold == bookBean.copiesSold && Double.compare(wholesaleCost, bookBean.wholesaleCost) == 0 && Double.compare(retailPrice, bookBean.retailPrice) == 0 && suitableForChildren == bookBean.suitableForChildren && Objects.equals(title, bookBean.title) && Objects.equals(author, bookBean.author) && Objects.equals(publisher, bookBean.publisher) && Objects.equals(isbn, bookBean.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher, isbn, pages, copiesInStock, copiesSold, wholesaleCost, retailPrice, suitableForChildren);
    }

//	@Override
//	public int hashCode() {
//		return Objects.hash(author, copiesInStock, copiesSold, isbn, pages, publisher, retailPrice, suitableForChildren,
//				title, wholesaleCost);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		BookBean other = (BookBean) obj;
//		return Objects.equals(author, other.author) && copiesInStock == other.copiesInStock
//				&& copiesSold == other.copiesSold && Objects.equals(isbn, other.isbn) && pages == other.pages
//				&& Objects.equals(publisher, other.publisher)
//				&& Double.doubleToLongBits(retailPrice) == Double.doubleToLongBits(other.retailPrice)
//				&& suitableForChildren == other.suitableForChildren && Objects.equals(title, other.title)
//				&& Double.doubleToLongBits(wholesaleCost) == Double.doubleToLongBits(other.wholesaleCost);
//	}
    
    

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 97 * hash + Objects.hashCode(this.title);
//        hash = 97 * hash + Objects.hashCode(this.author);
//        hash = 97 * hash + Objects.hashCode(this.publisher);
//        hash = 97 * hash + Objects.hashCode(this.isbn);
//        hash = 97 * hash + this.pages;
//        hash = 97 * hash + this.copiesInStock;
//        hash = 97 * hash + this.copiesSold;
//        hash = 97 * hash + (int) (Double.doubleToLongBits(this.wholesaleCost) ^ (Double.doubleToLongBits(this.wholesaleCost) >>> 32));
//        hash = 97 * hash + (int) (Double.doubleToLongBits(this.retailPrice) ^ (Double.doubleToLongBits(this.retailPrice) >>> 32));
//        hash = 97 * hash + (this.suitableForChildren ? 1 : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final BookBean other = (BookBean) obj;
//        if (this.pages != other.pages) {
//            return false;
//        }
//        if (this.copiesInStock != other.copiesInStock) {
//            return false;
//        }
//        if (this.copiesSold != other.copiesSold) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.wholesaleCost) != Double.doubleToLongBits(other.wholesaleCost)) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.retailPrice) != Double.doubleToLongBits(other.retailPrice)) {
//            return false;
//        }
//        if (this.suitableForChildren != other.suitableForChildren) {
//            return false;
//        }
//        if (!Objects.equals(this.title, other.title)) {
//            return false;
//        }
//        if (!Objects.equals(this.author, other.author)) {
//            return false;
//        }
//        if (!Objects.equals(this.publisher, other.publisher)) {
//            return false;
//        }
//        return Objects.equals(this.isbn, other.isbn);
//    }

    
}
