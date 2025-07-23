package com.residenciasunal.residenciasunal;

import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    HashMap mapEstudiantes;
    MinHeap heapEstudiantes;

    public View() {
        initComponents();
        mapEstudiantes = new HashMap();
        heapEstudiantes = new MinHeap();
        mockData(5);
    }

    private boolean validarCampos(String cedulaStr, String nombre, String carrera, String puntajeStr) {
        if (cedulaStr.isEmpty() || nombre.isEmpty() || carrera.isEmpty() || puntajeStr.isEmpty()) {
            String msg = "Todos los campos son obligatorios.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error de validacion", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private int parsearCedula(String cedulaStr) {
        try {
            return Integer.parseInt(cedulaStr);
        } catch (NumberFormatException ex) {
            String msg = "La cedula debe ser un numero entero.";
            System.err.println(msg + " Valor recibido: " + cedulaStr);
            JOptionPane.showMessageDialog(this, msg, "Error de formato", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    private long parsearPuntaje(String puntajeStr) {
        try {
            return Long.parseLong(puntajeStr);
        } catch (NumberFormatException ex) {
            String msg = "El puntaje debe ser un número entero.";
            System.err.println(msg + " Valor recibido: " + puntajeStr);
            JOptionPane.showMessageDialog(this, msg, "Error de formato", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBusqueda = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TituloBuscar = new javax.swing.JLabel();
        TextoBusqueda = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        PanelPrioridad = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TituloCupos = new javax.swing.JLabel();
        TextoCupos = new javax.swing.JTextField();
        BotonAsignar = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        TituloPrioridad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelInformacion = new javax.swing.JPanel();
        TituloInformacion = new javax.swing.JLabel();
        TextoCedula = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoCarrera = new javax.swing.JTextField();
        TextoPuntaje = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BotonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        PanelBusqueda.setBackground(java.awt.Color.white);
        PanelBusqueda.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        PanelBusqueda.setLayout(new javax.swing.BoxLayout(PanelBusqueda, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setMaximumSize(new java.awt.Dimension(500, 100));
        jPanel5.setMinimumSize(new java.awt.Dimension(500, 200));
        jPanel5.setPreferredSize(new java.awt.Dimension(343, 70));

        TituloBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloBuscar.setText("Buscar por cédula:");
        jPanel5.add(TituloBuscar);

        TextoBusqueda.setMaximumSize(new java.awt.Dimension(70, 26));
        TextoBusqueda.setMinimumSize(new java.awt.Dimension(70, 26));
        TextoBusqueda.setPreferredSize(new java.awt.Dimension(130, 26));
        TextoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoBusquedaActionPerformed(evt);
            }
        });
        jPanel5.add(TextoBusqueda);

        BotonBuscar.setBackground(java.awt.Color.lightGray);
        BotonBuscar.setForeground(java.awt.Color.white);
        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(BotonBuscar);

        BotonEliminar.setBackground(java.awt.Color.red);
        BotonEliminar.setForeground(java.awt.Color.white);
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(BotonEliminar);

        PanelBusqueda.add(jPanel5);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));
        PanelBusqueda.add(jPanel6);

        getContentPane().add(PanelBusqueda, java.awt.BorderLayout.CENTER);

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("RESIDENCIAS UNAL");
        getContentPane().add(Titulo, java.awt.BorderLayout.PAGE_START);

        PanelPrioridad.setBackground(java.awt.Color.white);
        PanelPrioridad.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PanelPrioridad.setMaximumSize(new java.awt.Dimension(200, 120));
        PanelPrioridad.setMinimumSize(new java.awt.Dimension(200, 120));
        PanelPrioridad.setPreferredSize(new java.awt.Dimension(200, 120));
        PanelPrioridad.setLayout(new javax.swing.BoxLayout(PanelPrioridad, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 70));

        TituloCupos.setText("Cupos");
        jPanel1.add(TituloCupos);

        TextoCupos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoCupos.setMaximumSize(new java.awt.Dimension(130, 26));
        TextoCupos.setMinimumSize(new java.awt.Dimension(130, 26));
        TextoCupos.setPreferredSize(new java.awt.Dimension(130, 26));
        TextoCupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCuposActionPerformed(evt);
            }
        });
        jPanel1.add(TextoCupos);

        PanelPrioridad.add(jPanel1);

        BotonAsignar.setBackground(java.awt.Color.lightGray);
        BotonAsignar.setForeground(java.awt.Color.white);
        BotonAsignar.setText("Asignar");
        BotonAsignar.setAlignmentX(0.5F);
        BotonAsignar.setMaximumSize(new java.awt.Dimension(120, 27));
        BotonAsignar.setMinimumSize(new java.awt.Dimension(120, 27));
        BotonAsignar.setPreferredSize(new java.awt.Dimension(120, 27));
        BotonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsignarActionPerformed(evt);
            }
        });
        PanelPrioridad.add(BotonAsignar);
        PanelPrioridad.add(jSeparator);

        TituloPrioridad.setText("Lista de prioridad");
        TituloPrioridad.setAlignmentX(0.5F);
        PanelPrioridad.add(TituloPrioridad);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
        PanelPrioridad.add(jPanel2);

        getContentPane().add(PanelPrioridad, java.awt.BorderLayout.EAST);

        PanelInformacion.setBackground(java.awt.Color.white);
        PanelInformacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PanelInformacion.setMaximumSize(new java.awt.Dimension(150, 166));
        PanelInformacion.setMinimumSize(new java.awt.Dimension(150, 166));
        PanelInformacion.setPreferredSize(new java.awt.Dimension(150, 166));
        PanelInformacion.setLayout(new javax.swing.BoxLayout(PanelInformacion, javax.swing.BoxLayout.Y_AXIS));

        TituloInformacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TituloInformacion.setText("Student Info");
        TituloInformacion.setAlignmentX(0.5F);
        TituloInformacion.setMaximumSize(new java.awt.Dimension(90, 15));
        TituloInformacion.setMinimumSize(new java.awt.Dimension(90, 15));
        TituloInformacion.setPreferredSize(new java.awt.Dimension(90, 15));
        PanelInformacion.add(TituloInformacion);

        TextoCedula.setText("Cedula");
        TextoCedula.setMaximumSize(new java.awt.Dimension(90, 30));
        TextoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCedulaActionPerformed(evt);
            }
        });
        PanelInformacion.add(TextoCedula);

        TextoNombre.setText("Nombre");
        TextoNombre.setMaximumSize(new java.awt.Dimension(90, 30));
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });
        PanelInformacion.add(TextoNombre);

        TextoCarrera.setText("Carrera");
        TextoCarrera.setMaximumSize(new java.awt.Dimension(90, 30));
        TextoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCarreraActionPerformed(evt);
            }
        });
        PanelInformacion.add(TextoCarrera);

        TextoPuntaje.setText("Puntaje");
        TextoPuntaje.setMaximumSize(new java.awt.Dimension(90, 30));
        TextoPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPuntajeActionPerformed(evt);
            }
        });
        PanelInformacion.add(TextoPuntaje);

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setMaximumSize(new java.awt.Dimension(500, 100));

        BotonAgregar.setBackground(java.awt.Color.blue);
        BotonAgregar.setForeground(java.awt.Color.white);
        BotonAgregar.setText("Agregar");
        BotonAgregar.setAlignmentX(0.5F);
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(BotonAgregar);

        PanelInformacion.add(jPanel4);

        getContentPane().add(PanelInformacion, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void TextoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCarreraActionPerformed

    private void TextoPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPuntajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPuntajeActionPerformed

    private void TextoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoBusquedaActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        String cedulaStr = TextoCedula.getText().trim();
        String nombre = TextoNombre.getText().trim();
        String carrera = TextoCarrera.getText().trim();
        String puntajeStr = TextoPuntaje.getText().trim();

        // Validación centralizada
        if (!validarCampos(cedulaStr, nombre, carrera, puntajeStr)) {
            return;
        }

        int cedula = parsearCedula(cedulaStr);
        if (cedula < 0) {
            return;
        }

        long puntaje = parsearPuntaje(puntajeStr);
        if (puntaje < 0) {
            return;
        }

        if (!mapEstudiantes.containsKey(cedulaStr)) {
            Estudiante est = new Estudiante(cedula, nombre, carrera, puntaje);
            mapEstudiantes.put(cedulaStr, est);
            heapEstudiantes.insert(est);

            System.out.println("Estudiante agregado: " + est);
            JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            TextoCedula.setText("");
            TextoNombre.setText("");
            TextoCarrera.setText("");
            TextoPuntaje.setText("");
        } else {
            String msg = "La cedula “" + cedulaStr + "” ya está registrada.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarLista();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void TextoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCedulaActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        String cedulaStr = TextoBusqueda.getText().trim();

        if (cedulaStr.isEmpty()) {
            String msg = "Debe ingresar la cedula del estudiante a eliminar.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error de validacion", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mapEstudiantes.containsKey(cedulaStr)) {
            Estudiante eliminado = mapEstudiantes.remove(cedulaStr);
            // heapEstudiantes.remove(eliminado);
            System.out.println("Estudiante eliminado: " + eliminado);
            JOptionPane.showMessageDialog(this, "Estudiante eliminado con exito.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            TextoCedula.setText("");
        } else {
            String msg = "No se encontro ningun estudiante con cedula “" + cedulaStr + "”.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarLista();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        // Leer la cédula de búsqueda
        String cedulaBusqueda = TextoBusqueda.getText().trim();

        if (cedulaBusqueda.isEmpty()) {
            String msg = "Debe ingresar la cédula para buscar.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error de validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar en el mapa
        if (mapEstudiantes.containsKey(cedulaBusqueda)) {
            Estudiante est = mapEstudiantes.get(cedulaBusqueda);
            // Crear panel de estudiante y poblar datos
            PanelEstudiante panelAsig = new PanelEstudiante();
            panelAsig.getCedula().setText(String.valueOf(est.getCedula()));
            panelAsig.getNombre().setText(est.getNombre());
            panelAsig.getCarrera().setText(est.getCarrera());
            panelAsig.getPuntaje().setText(String.valueOf(est.getPuntaje()));
            panelAsig.getAsignado().setText(String.valueOf(est.getAsignado() ? "Cupo asignado" : "Cupo no asignado"));

            // Limpiar contenido previo y agregar el nuevo panel
            jPanel6.removeAll();
            jPanel6.add(panelAsig);
            jPanel6.revalidate();
            jPanel6.repaint();

            System.out.println("Estudiante mostrado en panel: " + est);
        } else {
            String msg = "No se encontró ningún estudiante con cédula “" + cedulaBusqueda + "”.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarLista();
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignarActionPerformed

        // Leer cantidad de cupos
        String cuposStr = TextoCupos.getText() != null ? TextoCupos.getText().trim() : "";
        int cupos;
        try {
            cupos = Integer.parseInt(cuposStr);
            if (cupos <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            String msg = "Ingrese un número válido de cupos (>0).";
            System.err.println(msg + " Valor recibido: " + cuposStr);
            JOptionPane.showMessageDialog(this, msg, "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar disponibilidad
        if (heapEstudiantes.isEmpty()) {
            String msg = "No hay estudiantes disponibles para asignar.";
            System.err.println(msg);
            JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Preparar panel de resultados
        jPanel6.removeAll();

        int asignados = 0;
        // Asignar hasta cupos o hasta agotar heap
        while (cupos > 0 && !heapEstudiantes.isEmpty()) {
            Estudiante est = heapEstudiantes.extractMin();
            est.setAsignado(true);
            asignados++;
            cupos--;

            // Crear un nuevo panel para cada estudiante asignado
            PanelEstudiante panelAsig = new PanelEstudiante();
            panelAsig.getCedula().setText(String.valueOf(est.getCedula()));
            panelAsig.getNombre().setText(est.getNombre());
            panelAsig.getCarrera().setText(est.getCarrera());
            panelAsig.getPuntaje().setText(String.valueOf(est.getPuntaje()));
            panelAsig.getAsignado().setText("Cupo asignado");

            // Agregar el panel al contenedor
            jPanel6.add(panelAsig);
        }
        // Repaint panel
        jPanel6.revalidate();
        jPanel6.repaint();

        // Mostrar resumen
        StringBuilder resultado = new StringBuilder();
        resultado.append("Se asignaron ").append(asignados).append(" cupo(s). ");
        if (cupos > 0) {
            resultado.append("Quedaron ").append(cupos).append(" cupo(s) sin asignar.");
        }

        System.out.println(resultado.toString());
        JOptionPane.showMessageDialog(
                this,
                resultado.toString(),
                "Resultado de asignación",
                JOptionPane.INFORMATION_MESSAGE
        );
        actualizarLista();
    }//GEN-LAST:event_BotonAsignarActionPerformed

    private void TextoCuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCuposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCuposActionPerformed

    private void actualizarLista() {
        // Limpiar panel
        jPanel2.removeAll();

        // Crear una copia del heap para iterar sin modificar el original
        MinHeap copia = heapEstudiantes.clone();

        // Extraer sucesivamente para mantener el orden
        while (!copia.isEmpty()) {
            Estudiante est = copia.extractMin();
            PanelEstudiante panel = new PanelEstudiante();
            panel.getCedula().setText(String.valueOf(est.getCedula()));
            panel.getNombre().setText(est.getNombre());
            panel.getCarrera().setText(est.getCarrera());
            panel.getPuntaje().setText(Long.toString(est.getPuntaje()));
            panel.getAsignado().setText(est.getAsignado() ? "Cupo asignado" : "Cupo no asignado");

            jPanel2.add(panel);
        }

        // Refrescar visualmente
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    private void mockData(int n) {
        for (int i = 1; i <= n; i++) {
            String cedulaStr = String.format("%08d", 1000 + i);
            String nombre = "Nombre" + i;
            String carrera = "Carrera" + ((i % 3) + 1);
            long puntaje = 50 + (i * 5);

            Estudiante est = new Estudiante(Integer.parseInt(cedulaStr), nombre, carrera, puntaje);
            mapEstudiantes.put(cedulaStr, est);
            heapEstudiantes.insert(est);
        }
        // Refrescar lista en la vista
        actualizarLista();
    }

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonAsignar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelInformacion;
    private javax.swing.JPanel PanelPrioridad;
    public javax.swing.JTextField TextoBusqueda;
    public javax.swing.JTextField TextoCarrera;
    public javax.swing.JTextField TextoCedula;
    public javax.swing.JTextField TextoCupos;
    public javax.swing.JTextField TextoNombre;
    public javax.swing.JTextField TextoPuntaje;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloBuscar;
    private javax.swing.JLabel TituloCupos;
    private javax.swing.JLabel TituloInformacion;
    private javax.swing.JLabel TituloPrioridad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator;
    // End of variables declaration//GEN-END:variables
}
