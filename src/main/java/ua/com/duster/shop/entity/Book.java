package ua.com.duster.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;


@Entity
@Table
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@SelectBeforeUpdate
public class Book {

    public Book() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    @Column(updatable = false)
    private Byte[] content;

    @Column(name = "page_count")
    private Integer pageCount;
    private String isbn;

    @ManyToOne
    @JoinColumn
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Author author;

    @Column(name = "publisher_year")
    private Integer publishYear;

    @ManyToOne
    @JoinColumn
    private Publisher publisher;

    private Byte[] image;

    private Integer avgRating;

    @Column(name = "total_vote_count")
    private Long totalVoteCount;

    @Column(name = "total_rating")
    private Long totalRating;

    @Column(name = "view_count")
    private Long viewCount;

    private String descr;


    @Override
    public String toString() {
        return name;
    }
}
