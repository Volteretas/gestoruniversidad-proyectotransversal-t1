/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.vistas;

import java.awt.Dimension;
import proyectouniversidadulp.modelo.Conexion;

/**
 *
 * @author Santiago
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAgregarAlumno = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        jmAgregarAlumno.setText("Alumno");

        jMenuItem1.setText("Agregar Alumno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmAgregarAlumno.add(jMenuItem1);

        jMenuItem2.setText("Buscar Alumno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmAgregarAlumno.add(jMenuItem2);

        jMenuItem3.setText("Obtener Alumnos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmAgregarAlumno.add(jMenuItem3);

        jMenuItem4.setText("Editar Alumno");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmAgregarAlumno.add(jMenuItem4);

        jMenuBar1.add(jmAgregarAlumno);

        jMenu2.setText("Materia");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Agregar Materia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Buscar Materia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Obtener Materias");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Editar Materia");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inscripcion");

        jMenuItem9.setText("Inscribir Alumno");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Desinscribir Alumno");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Agregar Nota");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Buscar Alumno por Materia");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Materias Cursadas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Materias no Cursadas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Obtener Inscripciones");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAgregarAlumno vaa = new vistaAgregarAlumno();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vaa.getSize();
        
        vaa.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vaa.setVisible(true);
        Escritorio.add(vaa);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaBuscarAlumno vba = new vistaBuscarAlumno();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vba.getSize();
        
        vba.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vba.setVisible(true);
        Escritorio.add(vba);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerAlumnos voa = new vistaObtenerAlumnos();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = voa.getSize();
        
        voa.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        voa.setVisible(true);
        Escritorio.add(voa);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaActivarDesactivarAlumno vada = new vistaActivarDesactivarAlumno();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vada.getSize();
        
        vada.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vada.setVisible(true);
        Escritorio.add(vada);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAgregarMateria vam = new vistaAgregarMateria();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vam.getSize();
        
        vam.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vam.setVisible(true);
        Escritorio.add(vam);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaBuscarMateria vbm = new vistaBuscarMateria();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vbm.getSize();
        
        vbm.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vbm.setVisible(true);
        Escritorio.add(vbm);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerMaterias vom = new vistaObtenerMaterias();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vom.getSize();
        
        vom.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vom.setVisible(true);
        Escritorio.add(vom);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaEditarMateria vem = new vistaEditarMateria();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vem.getSize();
        
        vem.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vem.setVisible(true);
        Escritorio.add(vem);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaInscribirAlumno vai = new vistaInscribirAlumno();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vai.getSize();
        
        vai.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vai.setVisible(true);
        Escritorio.add(vai);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaDesinscribirAlumno vda = new vistaDesinscribirAlumno();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vda.getSize();
        
        vda.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vda.setVisible(true);
        Escritorio.add(vda);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAgregarNota van = new vistaAgregarNota();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = van.getSize();
        
        van.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        van.setVisible(true);
        Escritorio.add(van);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaBuscarAlumnoMateria vbam = new vistaBuscarAlumnoMateria();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vbam.getSize();
        
        vbam.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vbam.setVisible(true);
        Escritorio.add(vbam);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerMateriasCursadas vomc = new vistaObtenerMateriasCursadas();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vomc.getSize();
        
        vomc.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vomc.setVisible(true);
        Escritorio.add(vomc);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerMateriaNoCursadas vomnc = new vistaObtenerMateriaNoCursadas();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vomnc.getSize();
        
        vomnc.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vomnc.setVisible(true);
        Escritorio.add(vomnc);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerInscripciones voi = new vistaObtenerInscripciones();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = voi.getSize();
        
        voi.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        voi.setVisible(true);
        Escritorio.add(voi);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jmAgregarAlumno;
    // End of variables declaration//GEN-END:variables
}
