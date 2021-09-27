/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virionis.nikolas.rainbow.six.siege.attachments;

/**
 *
 * @author USER
 */
public class Barrel extends Attachment{
    private Double damageMultiplier;
    private String recoilEffect;

    public Barrel(Double damageMultiplier, String recoilEffect, String name) {
        super(name);
        this.damageMultiplier = damageMultiplier;
        this.recoilEffect = recoilEffect;
    }
    
    
}
