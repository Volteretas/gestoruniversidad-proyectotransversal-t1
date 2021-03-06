/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectouniversidadulp.control.InscripcionData;
import proyectouniversidadulp.control.MateriaData;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Materia;

/**
 *
 * @author Santiago
 */
public class vistaBuscarAlumnoMateria extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    /**
     * Creates new form vistaBuscarAlumnoMateria
     */
    public vistaBuscarAlumnoMateria() {
        initComponents();
        modelo = new DefaultTableModel();
        this.armarCabezera();
        this.borrarFila();
        this.agregarItem();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcMateria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Buscar alumnos por materia");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Materias");

        jcMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jcMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtAlumnos.setEnabled(false);
        jScrollPane1.setViewportView(jtAlumnos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarTabla(){
        try{
            Conexion conexion = new Conexion();
            InscripcionData id = new InscripcionData(conexion);
            String activo;
            Materia materia = (Materia) jcMateria.getSelectedItem();
            
            ArrayList<Alumno> alumnos = (ArrayList<Alumno>) id.obtenerAlumnosMateria(materia.getIdMateria());

            
            for(Alumno alum: alumnos){
                if(alum.isActivo()){
                    activo = "Si";
                }else{
                    activo = "No";
                }
                modelo.addRow(new Object[]{alum.getIdAlumno(), alum.getLegajo(), alum.getNombre(),alum.getApellido(), alum.getFechNac().toString(), activo});
            
            }
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar " + ex);
        }
    }
    
    
    private void agregarItem(){
        try{
            Conexion conexion = new Conexion();
            MateriaData md = new MateriaData(conexion);
        
            ArrayList<Materia> materias = (ArrayList<Materia>) md.obtenerMateria(true);
        
            for(int i = 0; i < materias.size(); i++){
                jcMateria.addItem(materias.get(i));
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
        
    }
    
    private void armarCabezera(){
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("idAlumno");
        titulos.add("Legajo");
        titulos.add("Nombre");
        titulos.add("Apellido");
        titulos.add("Nacimiento");
        titulos.add("Activo");
        
        for(Object titulo: titulos){
            modelo.addColumn(titulo);
        }
        
        jtAlumnos.setModel(modelo);
    }
    
    private void borrarFila(){
        
        int filas = modelo.getRowCount() - 1;
        
        for (int cont = filas; cont >= 0; cont--){
            modelo.removeRow(cont);
        }
    }
    
    private void jcMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriaActionPerformed
        // TODO add your handling code here:
        this.borrarFila();
        this.llenarTabla();
    }//GEN-LAST:event_jcMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Materia> jcMateria;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
}
