/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streaming.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author formation
 */
@Embeddable
public class Descriptif {
    @Column(length = 32,nullable = false)
    private String titre;
    @Column(length = 1024)
    private String description;
    
    @Column(nullable = false)
    private Integer annee;
    @Column(nullable = false)
    private Integer duree;
    
}
