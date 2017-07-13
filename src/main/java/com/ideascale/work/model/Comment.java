package com.ideascale.work.model;

import javax.persistence.*;

/**
 * User: nowshad
 * Date: 7/13/17
 * Time: 11:56 AM
 */
@Entity
@Table(name = "jpa_comments")
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="text")
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        return id.equals(comment.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
