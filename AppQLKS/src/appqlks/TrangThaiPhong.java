/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqlks;

import static appqlks.QuanLi.dtm;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abmsk
 */
public class TrangThaiPhong extends javax.swing.JFrame {

    /**
     * Creates new form TrangThaiPhong
     */
    public TrangThaiPhong() {
        initComponents();
         this.setLocationRelativeTo(this);
        TableHangPhong.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableHangPhong.getTableHeader().setOpaque(false);
        TableHangPhong.getTableHeader().setBackground(new Color(32,136,203));
        TableHangPhong.getTableHeader().setForeground(new Color(255,255,255));
        TableKhuyenMai.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableKhuyenMai.getTableHeader().setOpaque(false);
        TableKhuyenMai.getTableHeader().setBackground(new Color(32,136,203));
        TableKhuyenMai.getTableHeader().setForeground(new Color(255,255,255));
        layHP();
        layKhuyenMai() ;
    }
private void layHP() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableHangPhong.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from HANGPHONG ";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maHP"));
                vt.add(rs.getString("loai"));
                vt.add(rs.getString("kieu"));
                vt.add(rs.getString("gia"));
                dtm.addRow(vt);
            }
            TableHangPhong.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void LuuKM(String MKM,String GIAM) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into KHUYENMAI values (?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MKM);
            ps.setString(2, GIAM);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void LuuHP(String MHP,String LOAI,String KIEU,String GIA) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into HANGPHONG values (?,?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MHP);
            ps.setString(2, LOAI);
            ps.setString(3, KIEU);
            ps.setString(4, GIA);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private int kiemTraMHP(String MHP) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from HANGPHONG where maHP ='" + MHP + "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tonTai = 1;
            }
            rs.close();
            ps.close();
            ketNoi.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }

private int kiemTraKM(String MKM) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from KHUYENMAI where maKM ='" + MKM + "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tonTai = 1;
            }
            rs.close();
            ps.close();
            ketNoi.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
    private void SuaHP(String MHP) {
        Connection ketNoi = AppQLKS.layKetNoi();
        
        String sql = "update HANGPHONG set loai=N'"+loai.getText()+"',kieu=N'"+kieu.getText()+"',gia='"+gia.getText()+"'where maHP='"+MHP+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void SuaKM(String MKM) {
        Connection ketNoi = AppQLKS.layKetNoi();
        
        String sql = "update KHUYENMAI set giam='"+giam.getText()+"'where maKM='"+MKM+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   private void xoaHP(String MHP) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from HANGPHONG where maHP = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MHP);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   private void xoaKM(String MKM) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from KHUYENMAI where maKM = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MKM);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void layKhuyenMai() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableKhuyenMai.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from KHUYENMAI ";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maKM"));
                vt.add(rs.getString("giam"));
                dtm.addRow(vt);
            }
            TableKhuyenMai.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        TableHangPhong = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableKhuyenMai = new javax.swing.JTable();
        xoakm = new rojeru_san.RSButton();
        xoahp = new rojeru_san.RSButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gia = new javax.swing.JTextField();
        makhuyenmai = new javax.swing.JTextField();
        giam = new javax.swing.JTextField();
        kieu = new javax.swing.JTextField();
        hangphong = new javax.swing.JTextField();
        loai = new javax.swing.JTextField();
        luukm = new rojeru_san.RSButton();
        luuhp = new rojeru_san.RSButton();
        thongbaokm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/oil.png"))); // NOI18N
        jLabel2.setText("QUẢN LÍ GIÁ PHÒNG VÀ KHUYẾN MÃI");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 110));

        TableHangPhong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TableHangPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hạng Phòng", "Loại", "Kiểu", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableHangPhong.setFocusable(false);
        TableHangPhong.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableHangPhong.setRowHeight(25);
        TableHangPhong.setSelectionBackground(new java.awt.Color(183, 221, 251));
        TableHangPhong.setShowVerticalLines(false);
        TableHangPhong.getTableHeader().setReorderingAllowed(false);
        TableHangPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableHangPhongMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TableHangPhong);
        if (TableHangPhong.getColumnModel().getColumnCount() > 0) {
            TableHangPhong.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 590, 400));

        TableKhuyenMai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TableKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khuyến Mãi", "Giảm %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableKhuyenMai.setFocusable(false);
        TableKhuyenMai.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableKhuyenMai.setRowHeight(25);
        TableKhuyenMai.setSelectionBackground(new java.awt.Color(183, 221, 251));
        TableKhuyenMai.setShowVerticalLines(false);
        TableKhuyenMai.getTableHeader().setReorderingAllowed(false);
        TableKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableKhuyenMaiMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TableKhuyenMai);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 590, 400));

        xoakm.setBackground(new java.awt.Color(153, 153, 153));
        xoakm.setText("XÓA KM");
        xoakm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xoakm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoakmActionPerformed(evt);
            }
        });
        jPanel1.add(xoakm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, -1, -1));

        xoahp.setBackground(new java.awt.Color(153, 153, 153));
        xoahp.setText("XÓA HP");
        xoahp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xoahp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoahpActionPerformed(evt);
            }
        });
        jPanel1.add(xoahp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Mã Khuyến Mãi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Giảm (%)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Hạng Phòng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Kiểu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Loại");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Giá");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, -1, -1));

        gia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 150, 40));

        makhuyenmai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(makhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 150, 40));

        giam.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(giam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 150, 40));

        kieu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(kieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, 150, 40));

        hangphong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(hangphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 150, 40));

        loai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, 150, 40));

        luukm.setBackground(new java.awt.Color(102, 102, 102));
        luukm.setText("LƯU KHUYẾN MÃI");
        luukm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luukm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukmActionPerformed(evt);
            }
        });
        jPanel1.add(luukm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, -1, -1));

        luuhp.setBackground(new java.awt.Color(102, 102, 102));
        luuhp.setText("LƯU HẠNG PHÒNG");
        luuhp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luuhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuhpActionPerformed(evt);
            }
        });
        jPanel1.add(luuhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, -1, -1));

        thongbaokm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(thongbaokm, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 440, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableKhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKhuyenMaiMousePressed
          dtm = (DefaultTableModel) TableKhuyenMai.getModel(); 
        int i = TableKhuyenMai.getSelectedRow();
        makhuyenmai.setText(dtm.getValueAt(i, 0).toString());       
        giam.setText(dtm.getValueAt(i,1).toString()); 
    }//GEN-LAST:event_TableKhuyenMaiMousePressed

    private void TableHangPhongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHangPhongMousePressed
         dtm = (DefaultTableModel) TableHangPhong.getModel(); 
        int i = TableHangPhong.getSelectedRow();
        hangphong.setText(dtm.getValueAt(i, 0).toString());       
        loai.setText(dtm.getValueAt(i,1).toString()); 
        kieu.setText(dtm.getValueAt(i,2).toString()); 
        gia.setText(dtm.getValueAt(i,3).toString()); 
    }//GEN-LAST:event_TableHangPhongMousePressed

    private void luukmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukmActionPerformed
                 String MKM=makhuyenmai.getText();
        String GIAM=giam.getText();
        int temp0=0,temp1=0;
        int check=kiemTraKM(MKM);
        
        if(MKM.equals("")){
                temp0=1;
             thongbaokm.setForeground(Color.RED);
             thongbaokm.setText("Mã Khuyến MãiKhông Được Bỏ Trống ");
        }
        else if(GIAM.equals("")){
            temp1=1;
             thongbaokm.setForeground(Color.RED);
             thongbaokm.setText("Giảm % Không Được Bỏ Trống ");
        }
    
        else if(temp0!=1 &&temp1!=1 ){   
            if(check==1){
                SuaKM(MKM);
                 layKhuyenMai();
               thongbaokm.setForeground(Color.BLUE);
             thongbaokm.setText("Sửa Thành Công ");
            }
            else{
                LuuKM(MKM,GIAM);
                 thongbaokm.setForeground(Color.BLUE);
                 thongbaokm.setText("Lưu Thành Công ");
                layKhuyenMai();
            }  
        }  
    }//GEN-LAST:event_luukmActionPerformed

    private void xoakmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoakmActionPerformed
            String MKM =makhuyenmai.getText();
        int check;
        int kiemTra = 0;  
        if (MKM.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập Mã  bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraKM(MKM);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaKM(MKM);
                    JOptionPane.showMessageDialog(this, "Xóa  thành công");
                    this.layKhuyenMai();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Mã Chưa Có");
            }
        }
    }//GEN-LAST:event_xoakmActionPerformed

    private void luuhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuhpActionPerformed
        String MHP=hangphong.getText();
        String LOAI=loai.getText();
        String KIEU=kieu.getText();
        String GIA=gia.getText();
        
        int temp0=0,temp1=0,temp2=0,temp3=0;
        int check=kiemTraMHP(MHP);
        if(MHP.equals("")){
                temp0=1;
             thongbaokm.setForeground(Color.RED);
             thongbaokm.setText("Mã Không Được Bỏ Trống ");
        }
        else if(LOAI.equals("")){
            temp1=1;
             thongbaokm.setForeground(Color.RED);
             thongbaokm.setText("Loại Không Được Bỏ Trống ");
        }
    else if(KIEU.equals("")){
            temp2=1;
             thongbaokm.setForeground(Color.RED);
             thongbaokm.setText("Kiểu Không Được Bỏ Trống ");
        }
        else if(GIA.equals("")){
            temp3=1;
             thongbaokm.setForeground(Color.RED);
             thongbaokm.setText("Giá Không Được Bỏ Trống ");
        }
    
        else if(temp0!=1 &&temp1!=1&& temp2!=1 && temp3!=1 ){   
            if(check==1){
               SuaHP(MHP);
                 layHP();
               thongbaokm.setForeground(Color.BLUE);
                 thongbaokm.setText("Sửa Thành Công ");
            }
            else{
                LuuHP(MHP,LOAI,KIEU,GIA);
                 thongbaokm.setForeground(Color.BLUE);
                 thongbaokm.setText("Lưu Thành Công ");
                layHP();
            }  
        }  
    }//GEN-LAST:event_luuhpActionPerformed

    private void xoahpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoahpActionPerformed
                 String MHP =hangphong.getText();
        int check;
        int kiemTra = 0;  
        if (MHP.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập Mã  bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraMHP(MHP);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaHP(MHP);
                    JOptionPane.showMessageDialog(this, "Xóa  thành công");
                    this.layHP();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Mã Chưa Có");
            }
        }
    }//GEN-LAST:event_xoahpActionPerformed

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
            java.util.logging.Logger.getLogger(TrangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangThaiPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableHangPhong;
    private javax.swing.JTable TableKhuyenMai;
    private javax.swing.JTextField gia;
    private javax.swing.JTextField giam;
    private javax.swing.JTextField hangphong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kieu;
    private javax.swing.JTextField loai;
    private rojeru_san.RSButton luuhp;
    private rojeru_san.RSButton luukm;
    private javax.swing.JTextField makhuyenmai;
    private javax.swing.JLabel thongbaokm;
    private rojeru_san.RSButton xoahp;
    private rojeru_san.RSButton xoakm;
    // End of variables declaration//GEN-END:variables
}
