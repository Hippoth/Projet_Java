/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.vue;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import java.util.Optional;
import fr.uga.iut2.genconf.modele.*;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author hippo
 */
public class VueModifierCommunication extends javax.swing.JPanel {
    private final GUI gui;
    private Set<String> communicationsExistantes;
    private boolean valideComm, validCorres;
    private Session sess;
    private Communication comm;
    /**
     * Creates new form VueModifierCommunication2
     */
    public VueModifierCommunication(GUI gui) {
        this.gui = gui;
        this.communicationsExistantes = new HashSet();
        this.valideComm = false;

        initComponents();
        
        this.valider.setEnabled(false);
    }
    
    public void setComsExistantes(final Set<String> communicationsExistantes){
        assert communicationsExistantes != null;
        this.communicationsExistantes = communicationsExistantes;
    }

    public void setSession(Session sess){
        this.sess = sess;
        this.labelCommunication.setText(this.labelCommunication.getText()+comm.getTitre()+" de la session "+sess.getNom());
    }

    public void setCommunication(Communication comm){
        this.comm = comm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCommunication = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomComm = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        precedent = new javax.swing.JButton();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();

        labelCommunication.setText("Modifier la communication ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Communication"));

        jLabel2.setText("Nom :");

        nomComm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verificationCom(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Correspondant"), "Correspondant"), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabelNom.setText("Nom :");

        jLabelPrenom.setText("Prenom :");

        jLabelEmail.setText("Email :");

        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verificationCorres(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabelPrenom)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabelNom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(nomComm)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        precedent.setText("Precedent");
        precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedentActionPerformed(evt);
            }
        });

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelCommunication)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(precedent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annuler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valider)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCommunication)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precedent)
                    .addComponent(valider)
                    .addComponent(annuler))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verificationCom(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificationCom
        this.valideComm = !communicationsExistantes.contains(nomComm.getText()) || (nomComm.getText() == this.comm.getTitre());
        this.nomComm.setForeground(this.valideComm ? Color.black : Color.red);
        this.valider.setEnabled(valideComm&&validCorres);
    }//GEN-LAST:event_verificationCom

    private void precedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedentActionPerformed
        this.gui.toVoirPlusCommunications(this.sess.getNom(), this.sess.getNomConf());
    }//GEN-LAST:event_precedentActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        this.gui.modifierCommunication(Optional.empty(), this.comm.getTitre());
    }//GEN-LAST:event_annulerActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        IHM.InfosUtilisateur correspondant = new IHM.InfosUtilisateur(
            this.jTextFieldEmail.getText().trim().toLowerCase(),
            this.jTextFieldNom.getText().trim(),
            this.jTextFieldPrenom.getText().trim()
        );
        
        // Infos sur la nouvelle communication
        IHM.InfosCommunication com = new IHM.InfosCommunication(
                this.nomComm.getText(),
                this.sess.getType().toString(),
                correspondant,
                this.sess
        );
        
        this.gui.modifierCommunication(Optional.of(com), this.comm.getTitre());
    }//GEN-LAST:event_validerActionPerformed

    private void verificationCorres(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificationCorres
        boolean validEmail;
        String nom, prenom;
        EmailValidator validator = EmailValidator.getInstance(false, false);

        nom = this.jTextFieldNom.getText().trim();
        prenom = this.jTextFieldPrenom.getText().trim();
        validEmail = validator.isValid(this.jTextFieldEmail.getText().trim().toLowerCase())
                && !freeEmail(this.jTextFieldEmail.getText().trim().toLowerCase());
        this.jTextFieldEmail.setForeground(validEmail ? Color.black : Color.red);

        this.validCorres = validEmail
                && (nom != null) && (nom.length() > 0)
                && (prenom != null) && (prenom.length() > 0);

        this.valider.setEnabled(validCorres&&valideComm);
    }//GEN-LAST:event_verificationCorres

    private boolean freeEmail(String email){
        return this.gui.freeEmail(email);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JLabel labelCommunication;
    private javax.swing.JTextField nomComm;
    private javax.swing.JButton precedent;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
