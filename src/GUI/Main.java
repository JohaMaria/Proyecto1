/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author monge55
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewMDIApplication
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        insertMaterial = new javax.swing.JMenuItem();
        insertStudent = new javax.swing.JMenuItem();
        loanBooks = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Registro");

        insertMaterial.setMnemonic('o');
        insertMaterial.setText("RegistrarMaterial");
        insertMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMaterialActionPerformed(evt);
            }
        });
        fileMenu.add(insertMaterial);

        insertStudent.setMnemonic('s');
        insertStudent.setText("RegistrarEstudiante");
        insertStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStudentActionPerformed(evt);
            }
        });
        fileMenu.add(insertStudent);

        loanBooks.setMnemonic('a');
        loanBooks.setText("RegistrarLibros");
        loanBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanBooksActionPerformed(evt);
            }
        });
        fileMenu.add(loanBooks);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Prestamo");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Prestamo");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Devolucion");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("View");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Estudiantes");
        helpMenu.add(contentMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Libros");
        helpMenu.add(pasteMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Audiovisuales");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void loanBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanBooksActionPerformed
        InsertBooks insertBooks = new InsertBooks();
        desktopPane.add(insertBooks);
        insertBooks.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_loanBooksActionPerformed

    private void insertMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertMaterialActionPerformed
        InsertAudiovisuals insertAudio = new InsertAudiovisuals();
        desktopPane.add(insertAudio);
        insertAudio.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_insertMaterialActionPerformed

    private void insertStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStudentActionPerformed

        InsertStudents insertStudent = new InsertStudents();
        desktopPane.add(insertStudent);
        insertStudent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_insertStudentActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        Verification verification= new Verification();
        desktopPane.add(verification);
        verification.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        ReturnBooks returnBooks= new ReturnBooks();
        desktopPane.add(returnBooks);
        returnBooks.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem insertMaterial;
    private javax.swing.JMenuItem insertStudent;
    private javax.swing.JMenuItem loanBooks;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}