/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.proyecto.proyectolistatareas;

import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dylan
 */
public class MostrarEstados extends javax.swing.JFrame {
     private ListaTareas listaTareasSeleccionada;
    /**
     * Creates new form MostrarEstados
     */
    public MostrarEstados(ListaTareas listaTareas) {
        initComponents();
                if(listaTareas == null) {
            // Si la lista de tareas es null, redirecciona al home screen
            this.dispose();
            new MainScreen().setVisible(true);
        }
        
        // Carga los datos de la lista de tareas seleccionada
        this.listaTareasSeleccionada = listaTareas;
        this.nombreListaTbx.setText(listaTareas.getNombre());
        cargarTablaListas();
        cargarTablaListas1();
        cargarTablaListas2();
        cargarTablaListas3();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        nombreListaTbx = new javax.swing.JTextField();
        tableScrollPane = new javax.swing.JScrollPane();
        listaTareasTable = new javax.swing.JTable();
        volverBtn = new javax.swing.JButton();
        tableScrollPane1 = new javax.swing.JScrollPane();
        listaTareasTable1 = new javax.swing.JTable();
        tableScrollPane2 = new javax.swing.JScrollPane();
        listaTareasTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tableScrollPane3 = new javax.swing.JScrollPane();
        listaTareasTable3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tareas por estado");

        jLabel6.setText("Nombre de Lista:");

        nombreListaTbx.setEditable(false);
        nombreListaTbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreListaTbxActionPerformed(evt);
            }
        });

        listaTareasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        listaTareasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTareasTableMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(listaTareasTable);

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        listaTareasTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        listaTareasTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTareasTable1MouseClicked(evt);
            }
        });
        tableScrollPane1.setViewportView(listaTareasTable1);

        listaTareasTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        listaTareasTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTareasTable2MouseClicked(evt);
            }
        });
        tableScrollPane2.setViewportView(listaTareasTable2);

        jLabel7.setText("Completadas");

        jLabel8.setText("En progreso");

        jLabel9.setText("Canceladas");

        listaTareasTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        listaTareasTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTareasTable3MouseClicked(evt);
            }
        });
        tableScrollPane3.setViewportView(listaTareasTable3);

        jLabel10.setText("Pendientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreListaTbx, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(volverBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tableScrollPane)
                            .addComponent(tableScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
                            .addComponent(tableScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
                            .addComponent(tableScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(584, 584, 584))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(582, 582, 582))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(584, 584, 584))
            .addGroup(layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreListaTbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(volverBtn))
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTareasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasTableMouseClicked


    }//GEN-LAST:event_listaTareasTableMouseClicked

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        this.dispose();
        new MainScreen().setVisible(true);
    }//GEN-LAST:event_volverBtnActionPerformed

    private void listaTareasTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTareasTable1MouseClicked

    private void listaTareasTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTareasTable2MouseClicked

    private void nombreListaTbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreListaTbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreListaTbxActionPerformed

    private void listaTareasTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTareasTable3MouseClicked

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
            java.util.logging.Logger.getLogger(MostrarEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarEstados(null).setVisible(true);
            }
        });
    }

private void cargarTablaListas() {
        
        String [] columnas = new String [] {"Tarea", "Estado"};
        
        try{
            // Carga las listas de tareas desde el archivo de texto
            Lista listaDeTareasList = FileHelper.obtenerTareasPorLista(listaTareasSeleccionada);

            // Obtiene el tamaño de la lista
            int listaSize = listaDeTareasList.getTamanio();

            // Se define la matriz que contendrá la información del Table
            String tableData [][] = new String [listaSize][2];

            // Recorre la lista para ir agregando cada elemento al array de la tabla
            int rowIndex = 0;
            for(int i = 0; i < listaSize; i++) {

                Tarea tarea = (Tarea) listaDeTareasList.getValor(i);

                if (tarea.getEstado().equalsIgnoreCase("Completada")) {
                    // Agrega la tarea a la tabla solo si su estado es Completada
                    tableData[rowIndex][0] = tarea.getTarea();
                    tableData[rowIndex][1] = tarea.getEstado();
                    rowIndex++;
                }
            }

            // Redimensiona la matriz para que solo tenga las filas necesarias
            String[][] trimmedTableData = Arrays.copyOfRange(tableData, 0, rowIndex);

            // Obtiene el modelo de la tabla y le agrega el array con la información obtenida anteriormente
            DefaultTableModel model = new DefaultTableModel(trimmedTableData, columnas);
            this.listaTareasTable.setModel(model);
        
        } catch (Exception ex) {
            // En caso de error se loggea la información del error en la consola
            System.err.println("Error cargando datos de la tabla");
            ex.printStackTrace();
        }
    }

        private void cargarTablaListas1() {
        
        String [] columnas = new String [] {"Tarea", "Estado"};
        
        try{
            // Carga las listas de tareas desde el archivo de texto
            Lista listaDeTareasList = FileHelper.obtenerTareasPorLista(listaTareasSeleccionada);

            // Obtiene el tamaño de la lista
            int listaSize = listaDeTareasList.getTamanio();

            // Se define la matriz que contendrá la información del Table
            String tableData [][] = new String [listaSize][2];

            // Recorre la lista para ir agregando cada elemento al array de la tabla
            int rowIndex = 0;
            for(int i = 0; i < listaSize; i++) {

                Tarea tarea = (Tarea) listaDeTareasList.getValor(i);

                if (tarea.getEstado().equalsIgnoreCase("En progreso")) {
                    // Agrega la tarea a la tabla solo si su estado es En progreso
                    tableData[rowIndex][0] = tarea.getTarea();
                    tableData[rowIndex][1] = tarea.getEstado();
                    rowIndex++;
                }
            }

            // Redimensiona la matriz para que solo tenga las filas necesarias
            String[][] trimmedTableData = Arrays.copyOfRange(tableData, 0, rowIndex);

            // Obtiene el modelo de la tabla y le agrega el array con la información obtenida anteriormente
            DefaultTableModel model = new DefaultTableModel(trimmedTableData, columnas);
            this.listaTareasTable2.setModel(model);
        
        } catch (Exception ex) {
            // En caso de error se loggea la información del error en la consola
            System.err.println("Error cargando datos de la tabla");
            ex.printStackTrace();
        }
    }

        private void cargarTablaListas2() {
        
        String [] columnas = new String [] {"Tarea", "Estado"};
        
        try{
            // Carga las listas de tareas desde el archivo de texto
            Lista listaDeTareasList = FileHelper.obtenerTareasPorLista(listaTareasSeleccionada);

            // Obtiene el tamaño de la lista
            int listaSize = listaDeTareasList.getTamanio();

            // Se define la matriz que contendrá la información del Table
            String tableData [][] = new String [listaSize][2];

            // Recorre la lista para ir agregando cada elemento al array de la tabla
            int rowIndex = 0;
            for(int i = 0; i < listaSize; i++) {

                Tarea tarea = (Tarea) listaDeTareasList.getValor(i);

                if (tarea.getEstado().equalsIgnoreCase("pendiente")) {
                    // Agrega la tarea a la tabla solo si su estado es pendiente
                    tableData[rowIndex][0] = tarea.getTarea();
                    tableData[rowIndex][1] = tarea.getEstado();
                    rowIndex++;
                }
            }

            // Redimensiona la matriz para que solo tenga las filas necesarias
            String[][] trimmedTableData = Arrays.copyOfRange(tableData, 0, rowIndex);

            // Obtiene el modelo de la tabla y le agrega el array con la información obtenida anteriormente
            DefaultTableModel model = new DefaultTableModel(trimmedTableData, columnas);
            this.listaTareasTable3.setModel(model);
        
        } catch (Exception ex) {
            // En caso de error se loggea la información del error en la consola
            System.err.println("Error cargando datos de la tabla");
            ex.printStackTrace();
        }
    }
        
          private void cargarTablaListas3() {
        
        String [] columnas = new String [] {"Tarea", "Estado"};
        
        try{
            // Carga las listas de tareas desde el archivo de texto
            Lista listaDeTareasList = FileHelper.obtenerTareasPorLista(listaTareasSeleccionada);

            // Obtiene el tamaño de la lista
            int listaSize = listaDeTareasList.getTamanio();

            // Se define la matriz que contendrá la información del Table
            String tableData [][] = new String [listaSize][2];

            // Recorre la lista para ir agregando cada elemento al array de la tabla
            int rowIndex = 0;
            for(int i = 0; i < listaSize; i++) {

                Tarea tarea = (Tarea) listaDeTareasList.getValor(i);

                if (tarea.getEstado().equalsIgnoreCase("cancelada")) {
                    // Agrega la tarea a la tabla solo si su estado es cancelada
                    tableData[rowIndex][0] = tarea.getTarea();
                    tableData[rowIndex][1] = tarea.getEstado();
                    rowIndex++;
                }
            }

            // Redimensiona la matriz para que solo tenga las filas necesarias
            String[][] trimmedTableData = Arrays.copyOfRange(tableData, 0, rowIndex);

            // Obtiene el modelo de la tabla y le agrega el array con la información obtenida anteriormente
            DefaultTableModel model = new DefaultTableModel(trimmedTableData, columnas);
            this.listaTareasTable1.setModel(model);
        
        } catch (Exception ex) {
            // En caso de error se loggea la información del error en la consola
            System.err.println("Error cargando datos de la tabla");
            ex.printStackTrace();
        }
    }      
        

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable listaTareasTable;
    private javax.swing.JTable listaTareasTable1;
    private javax.swing.JTable listaTareasTable2;
    private javax.swing.JTable listaTareasTable3;
    private javax.swing.JTextField nombreListaTbx;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JScrollPane tableScrollPane1;
    private javax.swing.JScrollPane tableScrollPane2;
    private javax.swing.JScrollPane tableScrollPane3;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}