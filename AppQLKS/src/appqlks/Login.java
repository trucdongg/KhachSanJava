/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqlks;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abmsk
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public Login() {
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

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        taikhoan = new javax.swing.JTextField();
        matkhau = new javax.swing.JPasswordField();
        dangnhap = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 28, -1, 46));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("TÀI KHOẢN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 112, 111, 45));

        taikhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        taikhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 380, 40));

        matkhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matkhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        matkhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matkhauKeyPressed(evt);
            }
        });
        jPanel1.add(matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 380, 40));

        dangnhap.setBackground(new java.awt.Color(255, 255, 255));
        dangnhap.setkBorderRadius(50);
        dangnhap.setkEndColor(new java.awt.Color(51, 51, 51));
        dangnhap.setkStartColor(new java.awt.Color(0, 204, 102));
        dangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dangnhapMousePressed(evt);
            }
        });
        dangnhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ĐĂNG NHẬP");
        dangnhap.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 10, 110, 40));

        jPanel1.add(dangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 230, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("MẬT KHẨU");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 237, 111, 35));

        kGradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 450, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHẦN MỀM QUẢN LÍ KHÁCH SẠN");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 310, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private int kiemTra(String user,String pass){
        Connection ketNoi= AppQLKS.layKetNoi();
        int tonTai=0;
        String sql="select * from NHANVIEN where username='"+user+"' and pw='"+pass+"'";
        try{
            PreparedStatement ps=ketNoi.prepareStatement(sql);
      
            ResultSet rs=ps.executeQuery();
           
            if(rs.next()){
                tonTai=1;
            }
            rs.close();
          
            ps.close();
            ketNoi.close();
            
        }
        catch( SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
        }
        return tonTai;
    }
 
    public int kiemTraAD(String user,String pass) {
       int  tonTaiAD=0;
        
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "select * from NHANVIEN where username='"+user+"' and pw='"+pass+"'";      
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                  tonTaiAD=Integer.parseInt(rs.getString("isAdmin"));
                  
            }       
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tonTaiAD;
    }      
 
   public int kiemTraAL(String user,String pass) {
       int  tonTaiAL=0;
        
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "select * from NHANVIEN where username='"+user+"' and pw='"+pass+"'";      
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                  tonTaiAL=Integer.parseInt(rs.getString("isAllowed"));
                  
            }       
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tonTaiAL;
    } 
    
   
    private void dangnhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangnhapMousePressed
        String user=taikhoan.getText();
        String pass=matkhau.getText();
        int check,checkad,checkal;
        int temp0=0,temp1=0;
        if(user.equals("")){
            temp0=1;
            JOptionPane.showMessageDialog(this, "Tài Khoản không được bỏ trống");
        }
        else if(pass.equals("")){
            temp1=1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu không được bỏ trống");
        }
        else if(temp0!=1 && temp1!=1){
            check=kiemTra(user,pass);
            checkad=kiemTraAD(user,pass);
            checkal=kiemTraAL(user,pass);
            if((checkad==1 || checkal==1) && check==1){
               
                NewMain a=new NewMain();
                this.setVisible(false);
                a.setVisible(true);
            }
            else if(check==1 && checkad!=1){
                MainForUser a=new MainForUser();
                this.setVisible(false);
                a.setVisible(true);
            }
            else{
                 JOptionPane.showMessageDialog(this, "Sai Tài Khoản Hoặc Mật Khẩu");
            }
     
        }
        
    }//GEN-LAST:event_dangnhapMousePressed

    private void matkhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matkhauKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         String user=taikhoan.getText();
        String pass=matkhau.getText();
        int check,checkad,checkal;
        int temp0=0,temp1=0;
        if(user.equals("")){
            temp0=1;
            JOptionPane.showMessageDialog(this, "Tài Khoản không được bỏ trống");
        }
        else if(pass.equals("")){
            temp1=1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu không được bỏ trống");
        }
        else if(temp0!=1 && temp1!=1){
            check=kiemTra(user,pass);
            checkad=kiemTraAD(user,pass);
            checkal=kiemTraAL(user,pass);
            if((checkad==1 || checkal==1) && check==1){
                JOptionPane.showMessageDialog(this, "Bạn Là Quản Lý");
                NewMain a=new NewMain();
                this.setVisible(false);
                a.setVisible(true);
            }
            else if(check==1 && checkad!=1){
                 JOptionPane.showMessageDialog(this, "Bạn Là Nhân Viên");
                MainForUser a=new MainForUser();
                this.setVisible(false);
                a.setVisible(true);
            }
            else{
                 JOptionPane.showMessageDialog(this, "Sai Tài Khoản Hoặc Mật Khẩu");
            }
     
        }
      }
    }//GEN-LAST:event_matkhauKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel dangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPasswordField matkhau;
    public static javax.swing.JTextField taikhoan;
    // End of variables declaration//GEN-END:variables
}
