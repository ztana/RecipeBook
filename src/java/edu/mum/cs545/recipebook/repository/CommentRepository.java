/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.recipebook.repository;

import edu.mum.cs545.recipebook.domain.CommentEntity;

/**
 *
 * @author Endlakachew Asnake
 * 
 * An interface for comment repository.
 */
public interface CommentRepository {
    
    /**
     * Creates a new comment.
     * @param comment the {@link CommentEntity} to create.
     * @return the created {@link CommentEntity} instance.
     */
    public CommentEntity addNewComment(CommentEntity comment);
    
    /**
     * Deletes a specific comment.
     * 
     * @param commentId the comment to delete
     */
    public void deleteComment(String commentId); 
}
