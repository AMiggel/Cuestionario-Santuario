
package ventanas;

import clases.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class interfaz extends javax.swing.JFrame {

    
    public interfaz() {
        initComponents();
        
        Qtion.setText(p.getPreguntas(posicion));
        String[] a = r.setRespuestas(posicion);
        
        buttonGroup1.clearSelection();
        
        op1.setText(a[0]);
        op2.setText(a[1]);
        op3.setText(a[2]);
        op4.setText(a[3]);
        op1.requestFocus();
        
        anterior.setEnabled(false);
        
        calificacion.setEnabled(false);

    }

  int posicion = 0;
  
  Respuestas r = new Respuestas();  
  Preguntas p = new Preguntas();
  Object[] select = {"","","","","",""};
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Qtion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        calificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Santuario"));

        Qtion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Qtion.setText("¿Pregunta 1?");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Pregunta");

        buttonGroup1.add(op1);
        op1.setText("jRadioButton1");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op2);
        op2.setText("jRadioButton2");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op3);
        op3.setText("jRadioButton3");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op4);
        op4.setText("jRadioButton4");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        calificacion.setText("calificacion ");
        calificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2))
                    .addComponent(Qtion)
                    .addComponent(op1)
                    .addComponent(op2)
                    .addComponent(op3)
                    .addComponent(op4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(anterior)
                        .addGap(75, 75, 75)
                        .addComponent(siguiente)
                        .addGap(71, 71, 71)
                        .addComponent(calificacion)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(Qtion)
                .addGap(31, 31, 31)
                .addComponent(op1)
                .addGap(18, 18, 18)
                .addComponent(op2)
                .addGap(18, 18, 18)
                .addComponent(op3)
                .addGap(18, 18, 18)
                .addComponent(op4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(siguiente)
                    .addComponent(calificacion))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        if (posicion == 26) {
        
            siguiente.setEnabled(false);
       
            calificacion.setEnabled(true);
        }
      
        
   
        if ( posicion < 28) {
        
        anterior.setEnabled(true);
            
        posicion++;    
            
        Qtion.setText(p.getPreguntas(posicion));
        
        String[] a = r.setRespuestas(posicion);
        
        buttonGroup1.clearSelection();
        
        op1.setText(a[0]);
        op2.setText(a[1]);
        op3.setText(a[2]);
        op4.setText(a[3]);
        op1.requestFocus();
        }
        
        else{
        
         Toolkit.getDefaultToolkit().beep();
            
        }


    }//GEN-LAST:event_siguienteActionPerformed

    private void calificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calificacionActionPerformed

    int calificacion = 0 ;
    
        for (int i = 0; i < 27; i++) {

            
            if (select[i].equals(r.getRespuestas(i))) {
                
                calificacion = calificacion + 1 ;
                
            }
        
        }
                    JOptionPane.showMessageDialog(null, "Tu Calificacion Es " + calificacion);

        
    }//GEN-LAST:event_calificacionActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        select[posicion] = op1.getLabel();
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        select[posicion] = op2.getLabel();
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        select[posicion] = op3.getLabel();
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        select[posicion] = op4.getLabel();
    }//GEN-LAST:event_op4ActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed

        if (posicion > 0) {
            //posicion--;//
        }
        else{

        }

        if (posicion == 1) {
            anterior.setEnabled(false);
        }
 
        if (posicion > -1) {

            posicion--;

            siguiente.setEnabled(true);

            Qtion.setText(p.getPreguntas(posicion));

            String[] a = r.setRespuestas(posicion);

            buttonGroup1.clearSelection();

            op1.setText(a[0]);
            op2.setText(a[1]);
            op3.setText(a[2]);
            op4.setText(a[3]);
            op1.requestFocus();
        }
        else{

            Toolkit.getDefaultToolkit().beep();

        }

    }//GEN-LAST:event_anteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Qtion;
    private javax.swing.JButton anterior;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calificacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
