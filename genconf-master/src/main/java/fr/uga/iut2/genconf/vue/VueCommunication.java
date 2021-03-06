/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.vue;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import fr.uga.iut2.genconf.modele.*;
import java.util.ArrayList;

/**
 *
 * @author hippo
 */
public class VueCommunication extends javax.swing.JPanel {
    private final GUI gui;
    private Set<String> comsExistantes;
    private Session s;
    private boolean valide;

    /**
     * Creates new form VueConference
     */
    public VueCommunication(GUI gui) {
        this.gui = gui;
        this.comsExistantes = new HashSet<>();        
        
        initComponents();        
        this.modifier.setEnabled(false);
        this.supCom.setEnabled(false);
    }
        
    public void setComsExistantes(final Set<String> comsExistantes) {
        assert comsExistantes != null;
        this.comsExistantes = comsExistantes;
        contentPane(comsExistantes);
    }

    public void setSession(Session s) {
        this.s = s;
        this.labelConf.setText("Pour la conférence : "+this.s.getNomConf());
        this.labelSession.setText("Pour la session : "+this.s.getNom());
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Communication = new javax.swing.JLabel();
        modifier = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        comsPane = new javax.swing.JScrollPane();
        listComs = new javax.swing.JList<>();
        labelConf = new javax.swing.JLabel();
        CreerCom = new javax.swing.JButton();
        Précedent = new javax.swing.JButton();
        labelSession = new javax.swing.JLabel();
        supCom = new javax.swing.JButton();

        Communication.setText("Choisir la communication : ");

        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        listComs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listComsMouseClicked(evt);
            }
        });
        comsPane.setViewportView(listComs);

        labelConf.setText("Pour la conférence ");

        CreerCom.setText("Creer communication");
        CreerCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreerComActionPerformed(evt);
            }
        });

        Précedent.setText("Precedent");
        Précedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrécedentActionPerformed(evt);
            }
        });

        labelSession.setText("Pour la session ");

        supCom.setText("Supprimer communication");
        supCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Précedent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annuler)
                        .addGap(18, 18, 18)
                        .addComponent(modifier))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Communication)
                            .addComponent(labelConf)
                            .addComponent(labelSession))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(supCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CreerCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelConf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSession)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Communication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifier)
                            .addComponent(annuler)
                            .addComponent(Précedent)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreerCom)
                        .addGap(18, 18, 18)
                        .addComponent(supCom)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        this.gui.modifierCommunication(Optional.empty(), "");
    }//GEN-LAST:event_annulerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        this.gui.toModifierCommunication(this.s.getNom(), this.s.getNomConf(), this.listComs.getSelectedValue());
    }//GEN-LAST:event_modifierActionPerformed

    private void CreerComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreerComActionPerformed
            this.gui.saisirNouvelleCommunication(this.s.getNom(), this.s.getNomConf());            
    }//GEN-LAST:event_CreerComActionPerformed

    private void supComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supComActionPerformed
        this.gui.supprimerCommunication(this.listComs.getSelectedValue(), this.s.getNom(), this.s.getNomConf());
    }//GEN-LAST:event_supComActionPerformed

    private void PrécedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrécedentActionPerformed
        this.gui.toVoirPlusSession(this.s.getNomConf());
    }//GEN-LAST:event_PrécedentActionPerformed

    private void listComsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listComsMouseClicked
        valide = !this.listComs.isSelectionEmpty();
        this.modifier.setEnabled(valide);
        this.supCom.setEnabled(valide);
    }//GEN-LAST:event_listComsMouseClicked

    private void contentPane(Set<String> coms){
        listComs.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = new ArrayList(coms);
            public int getSize() { return strings.size(); }
            public String getElementAt(int i) { return strings.get(i); }
        });           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Communication;
    private javax.swing.JButton CreerCom;
    private javax.swing.JButton Précedent;
    private javax.swing.JButton annuler;
    private javax.swing.JScrollPane comsPane;
    private javax.swing.JLabel labelConf;
    private javax.swing.JLabel labelSession;
    private javax.swing.JList<String> listComs;
    private javax.swing.JButton modifier;
    private javax.swing.JButton supCom;
    // End of variables declaration//GEN-END:variables
}
