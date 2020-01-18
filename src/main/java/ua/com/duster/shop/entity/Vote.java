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
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;

    @Column(name = "book_id")
    private Long bookId;
    private String username;
}
