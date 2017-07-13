package com.ideascale.work.dao;

import com.ideascale.work.model.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * User: nowshad
 * Date: 7/13/17
 * Time: 12:29 PM
 */
@Repository
public class CommentDaoImpl implements CommentDao {
    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public void save(Comment comment) {
        manager.persist(comment);
    }

    @Override
    public Comment getComment(Long id) {
        return manager.find(Comment.class, id);
    }

    @Override
    public Collection<Comment> findAll() {
        Collection<Comment> comments = manager.createQuery("Select c From com.ideascale.work.model.Comment c", Comment.class).getResultList();
        return comments;
    }
}
