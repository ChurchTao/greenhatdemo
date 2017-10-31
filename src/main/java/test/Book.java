package test;

import com.greenhat.orm.annotation.Column;
import com.greenhat.orm.annotation.Entity;
import com.greenhat.orm.annotation.Id;
import com.greenhat.orm.annotation.Table;

/**
 * Created by jiacheng on 2017/8/15.
 */
@Entity
@Table(value = "book")
public class Book {
    @Id
    @Column("bookId")
    int bookId;
    @Column("name")
    String name;
    @Column("price")
    String price;
    @Column("kind")
    String kind;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
