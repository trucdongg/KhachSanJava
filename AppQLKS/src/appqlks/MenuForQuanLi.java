/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqlks;

/**
 *
 * @author abmsk
 */
public class MenuForQuanLi extends javax.swing.JFrame {

    /**
     * Creates new form MenuQuanLi
     */
    public MenuForQuanLi() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        gpkm = new keeptoo.KButton();
        trangthaiphong = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/content.png"))); // NOI18N
        jLabel2.setText("QUẢN LÍ ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 110));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpkm.setBackground(new java.awt.Color(229, 229, 229));
        gpkm.setForeground(new java.awt.Color(229, 229, 229));
        gpkm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/box.png"))); // NOI18N
        gpkm.setText("TRẠNG THÁI PHÒNG");
        gpkm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gpkm.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        gpkm.setkBorderRadius(0);
        gpkm.setkEndColor(new java.awt.Color(153, 153, 153));
        gpkm.setkHoverEndColor(new java.awt.Color(31, 136, 203));
        gpkm.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        gpkm.setkHoverStartColor(new java.awt.Color(31, 136, 203));
        gpkm.setkSelectedColor(new java.awt.Color(0, 102, 204));
        gpkm.setkStartColor(new java.awt.Color(51, 51, 51));
        gpkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpkmActionPerformed(evt);
            }
        });
        kGradientPanel1.add(gpkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 400, 200));

        trangthaiphong.setBackground(new java.awt.Color(229, 229, 229));
        trangthaiphong.setForeground(new java.awt.Color(229, 229, 229));
        trangthaiphong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/oil.png"))); // NOI18N
        trangthaiphong.setText("GIÁ PHÒNG VÀ KHUYẾN MÃI");
        trangthaiphong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        trangthaiphong.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        trangthaiphong.setkBorderRadius(0);
        trangthaiphong.setkEndColor(new java.awt.Color(153, 153, 153));
        trangthaiphong.setkHoverEndColor(new java.awt.Color(31, 136, 203));
        trangthaiphong.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        trangthaiphong.setkHoverStartColor(new java.awt.Color(31, 136, 203));
        trangthaiphong.setkSelectedColor(new java.awt.Color(0, 102, 204));
        trangthaiphong.setkStartColor(new java.awt.Color(51, 51, 51));
        trangthaiphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trangthaiphongActionPerformed(evt);
            }
        });
        kGradientPanel1.add(trangthaiphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 400, 200));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1020, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gpkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpkmActionPerformed
        QuanLi a=new QuanLi();
        
        a.setVisible(true);
    }//GEN-LAST:event_gpkmActionPerformed

    private void trangthaiphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trangthaiphongActionPerformed
        TrangThaiPhong a=new TrangThaiPhong();
        
        a.setVisible(true);
    }//GEN-LAST:event_trangthaiphongActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuForQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForQuanLi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton gpkm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KButton trangthaiphong;
    // End of variables declaration//GEN-END:variables
}
