package com.ideascale.work.dao;

import com.ideascale.work.model.Comment;

import java.util.Collection;

/**
 * User: nowshad
 * Date: 7/13/17
 * Time: 12:29 PM
 */
public interface CommentDao {
    void save(Comment comment);
    Comment getComment(Long id);
    Collection<Comment> findAll();
}
