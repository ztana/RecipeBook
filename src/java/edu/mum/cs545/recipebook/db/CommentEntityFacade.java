/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.recipebook.db;

import edu.mum.cs545.recipebook.domain.CommentEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class CommentEntityFacade extends AbstractFacade<CommentEntity> {

    @PersistenceContext(unitName = "AnnapurnaRecipeBookPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommentEntityFacade() {
        super(CommentEntity.class);
    }
    
}
