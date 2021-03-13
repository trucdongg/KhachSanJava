/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqlks;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author abmsk
 */
public class MainForUser extends javax.swing.JFrame {
static DefaultTableModel dtm;
    public int tongTien;
    public int tongTienDV;
    public int tongTienPhong;
    public int tongTK;
    /**
     * Creates new form NewMain
     */
    public MainForUser() {
        
        initComponents();
        Date date=new Date();
        ngaysinh.setDate(date);
        ngaybd.setDate(date);
        ngaykt.setDate(date);
        ngaybdt.setDate(date);
        ngaylaphd.setDate(date);
        this.setLocationRelativeTo(this);
        this.btnHOME.setSelected(true);
        TablePT.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TablePT.getTableHeader().setOpaque(false);
        TablePT.getTableHeader().setBackground(new Color(32,136,203));
        TablePT.getTableHeader().setForeground(new Color(255,255,255));
        TablePhongTrong.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TablePhongTrong.getTableHeader().setOpaque(false);
        TablePhongTrong.getTableHeader().setBackground(new Color(32,136,203));
        TablePhongTrong.getTableHeader().setForeground(new Color(255,255,255));
        TableCTPT.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableCTPT.getTableHeader().setOpaque(false);
        TableCTPT.getTableHeader().setBackground(new Color(32,136,203));
        TableCTPT.getTableHeader().setForeground(new Color(255,255,255));
        TableNhanVien.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableNhanVien.getTableHeader().setOpaque(false);
        TableNhanVien.getTableHeader().setBackground(new Color(32,136,203));
        TableNhanVien.getTableHeader().setForeground(new Color(255,255,255));
        TableKhachHang.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableKhachHang.getTableHeader().setOpaque(false);
        TableKhachHang.getTableHeader().setBackground(new Color(32,136,203));
        TableKhachHang.getTableHeader().setForeground(new Color(255,255,255));
        TablePhieuDat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TablePhieuDat.getTableHeader().setOpaque(false);
        TablePhieuDat.getTableHeader().setBackground(new Color(32,136,203));
        TablePhieuDat.getTableHeader().setForeground(new Color(255,255,255));
        TableCTPD.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableCTPD.getTableHeader().setOpaque(false);
        TableCTPD.getTableHeader().setBackground(new Color(32,136,203));
        TableCTPD.getTableHeader().setForeground(new Color(255,255,255));
        TableTrongPD.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableTrongPD.getTableHeader().setOpaque(false);
        TableTrongPD.getTableHeader().setBackground(new Color(32,136,203));
        TableTrongPD.getTableHeader().setForeground(new Color(255,255,255));
        TableDV.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableDV.getTableHeader().setOpaque(false);
        TableDV.getTableHeader().setBackground(new Color(32,136,203));
        TableDV.getTableHeader().setForeground(new Color(255,255,255));
        TableCTPDV.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableCTPDV.getTableHeader().setOpaque(false);
        TableCTPDV.getTableHeader().setBackground(new Color(32,136,203));
        TableCTPDV.getTableHeader().setForeground(new Color(255,255,255));
        TableHD.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableHD.getTableHeader().setOpaque(false);
        TableHD.getTableHeader().setBackground(new Color(32,136,203));
        TableHD.getTableHeader().setForeground(new Color(255,255,255));
        TableCTHD.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableCTHD.getTableHeader().setOpaque(false);
        TableCTHD.getTableHeader().setBackground(new Color(32,136,203));
        TableCTHD.getTableHeader().setForeground(new Color(255,255,255));
        TableTienPhong.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableTienPhong.getTableHeader().setOpaque(false);
        TableTienPhong.getTableHeader().setBackground(new Color(32,136,203));
        TableTienPhong.getTableHeader().setForeground(new Color(255,255,255));
        TableTK.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
        TableTK.getTableHeader().setOpaque(false);
        TableTK.getTableHeader().setBackground(new Color(32,136,203));
        TableTK.getTableHeader().setForeground(new Color(255,255,255));
        layNV();
        layKhach();  
        layCTPD();
        layPD();
        layPT();
        layCTPT();
        layPhongTrongDat() ;
        layPhongTrong() ;
        layDV() ;
        layCTDV() ;
        loadComboBoxKhachDat();
        loadComboBoxKhachThue();
        loadComboBoxKhuyenMai();
        loadComboBoxPhongCon();
        loadComboBoxPDTrong();     
        loadComboBox();
        loadComboBoxdathp();
        loadPhieuThueDV();
        loadComboBoxPhongDV();
        loadComboBoxDV();
        loadComboBoxHD();
        layHD() ;
        layTienPhong();
        layCTHD();
        layBoPhan();
        layTen();
       
    }

    private void layBoPhan() {
    
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "select * from BOPHAN join NHANVIEN on BOPHAN.maBP=NHANVIEN.maBP and NHANVIEN.username='"+Login.taikhoan.getText()+"'";
        
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    this.bophan.setText(rs.getString("tenBP"));
            }
            
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
     private void layTen() {
    
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "select * from NHANVIEN where username='"+Login.taikhoan.getText()+"'";
        
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    this.ten.setText(rs.getString("ten"));
            }
            
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
     private void layTienPhong() {
        tongTienPhong=0;
        DefaultTableModel dtm = (DefaultTableModel) TableTienPhong.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
        String MAPTHD=(String)mapthd.getSelectedItem();   
        String sql = "select gia,p.maphong from phong as p join hangphong as hp on p.maHP = hp.maHP and p.maphong in (select ctpt.maphong from ctpt where ctpt.maPT = '"+MAPTHD+"')";
//        String sql="SELECT TABLE3.*,HP.gia,HP.gia*ngayo as tongtien FROM (SELECT TABLE2.*,PHONG.maHP FROM (select CTPT.maphong, ngayo, ngayo as temp from (select datediff(day,'"+ngaydenhd.getText()+"','"+ngaydihd.getText()+"')as ngayo, PHIEUTHUE.maPT from PHIEUTHUE join hoadon on PHIEUTHUE.maPT = hoadon.maPT and PHIEUTHUE.maPT = '"+MAPTHD+"') AS [TABLE1] 	JOIN CTPT ON CTPT.maPT = TABLE1.maPT  ) as [TABLE2] JOIN PHONG ON TABLE2.maphong = PHONG.maphong) AS TABLE3 JOIN HANGPHONG AS HP ON TABLE3.MAHP =HP.MAHP";
            Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maphong"));          
                vt.add(rs.getString("gia"));  
                 tongTienPhong=tongTienPhong+Integer.parseInt(rs.getString("gia"));
                dtm.addRow(vt);
            }    
            TableTienPhong.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
           
           
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     private void layTienPhongxem() {
        tongTienPhong=0;
        DefaultTableModel dtm = (DefaultTableModel) TableTienPhong.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
        String MPT=MPTCX.getText();   
        String sql = "select gia,p.maphong from phong as p join hangphong as hp on p.maHP = hp.maHP and p.maphong in (select ctpt.maphong from ctpt where ctpt.maPT = '"+MPT+"')";
//        String sql="SELECT TABLE3.*,HP.gia,HP.gia*ngayo as tongtien FROM (SELECT TABLE2.*,PHONG.maHP FROM (select CTPT.maphong, ngayo, ngayo as temp from (select datediff(day,'"+ngaydenhd.getText()+"','"+ngaydihd.getText()+"')as ngayo, PHIEUTHUE.maPT from PHIEUTHUE join hoadon on PHIEUTHUE.maPT = hoadon.maPT and PHIEUTHUE.maPT = '"+MAPTHD+"') AS [TABLE1] 	JOIN CTPT ON CTPT.maPT = TABLE1.maPT  ) as [TABLE2] JOIN PHONG ON TABLE2.maphong = PHONG.maphong) AS TABLE3 JOIN HANGPHONG AS HP ON TABLE3.MAHP =HP.MAHP";
            Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maphong"));          
                vt.add(rs.getString("gia"));  
                 tongTienPhong=tongTienPhong+Integer.parseInt(rs.getString("gia"));
                dtm.addRow(vt);
            }    
            TableTienPhong.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
           
           
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
     
      public void layKM() {
    
        Connection ketNoi = AppQLKS.layKetNoi();
        String MAPTHD=(String)mapthd.getSelectedItem();
        String sql = "select * from KHUYENMAI join CTPT on KHUYENMAI.maKM=CTPT.maKM and CTPT.maPT='"+MAPTHD+"'";
        
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    this.KhuyenMai.setText(rs.getString("giam"));
                
            }
            
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
       public void layKMxem() {
    
        Connection ketNoi = AppQLKS.layKetNoi();
        String MPT=MPTCX.getText();
        String sql = "select * from KHUYENMAI join CTPT on KHUYENMAI.maKM=CTPT.maKM and CTPT.maPT='"+MPT+"'";
        
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    this.KhuyenMai.setText(rs.getString("giam"));
                
            }
            
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }         
    
    
     public void layTenKhach() {
    
        Connection ketNoi = AppQLKS.layKetNoi();
        String MAPTHD=(String)mapthd.getSelectedItem();
        String sql = "select * from phieuthue as p join KHACH as kh on p.cmnd = kh.cmnd and p.maPT='"+MAPTHD+"'";
        
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    this.khachcthd.setText(rs.getString("ten"));
                    this.cmndkhach.setText(rs.getString("cmnd"));
                    this.ngaydenhd.setText(rs.getString("ngayden"));
            }
            
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
    
     public void layTenKhachxem() {
    
        Connection ketNoi = AppQLKS.layKetNoi();
        String MPT=MPTCX.getText();
        String sql = "select * from phieuthue as p join KHACH as kh on p.cmnd = kh.cmnd and p.maPT='"+MPT+"'";
        
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    this.khachcthd.setText(rs.getString("ten"));
                    this.cmndkhach.setText(rs.getString("cmnd"));
                    this.ngaydenhd.setText(rs.getString("ngayden"));
            }
            
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
private int TongSoDichVu(String maPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select soluong from CTPDV where maPT='"+maPT+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tonTai=tonTai+Integer.parseInt(rs.getString("soluong"));
            }
            rs.close();
            ps.close();
            ketNoi.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }   
    
      private void layCTHD() {
       tongTienDV=0;
        DefaultTableModel dtm = (DefaultTableModel) TableCTHD.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
        String MAPTHD=(String)mapthd.getSelectedItem();
        String sql = "select DICHVU.tenDV,CTPDV.soluong,DICHVU.gia,DICHVU.gia * CTPDV.soluong as tongtien  from CTPDV join DICHVU on CTPDV.maDV = DICHVU.maDV AND CTPDV.maPT = '"+MAPTHD+"'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("tenDV"));
                vt.add(rs.getString("soluong"));
                vt.add(rs.getString("gia"));
                vt.add(rs.getString("tongtien"));    
                tongTienDV = tongTienDV +Integer.parseInt(rs.getString("tongtien"));
                dtm.addRow(vt);
            }
            TableCTHD.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
            String TIENDV=String.valueOf(tongTienDV);
            tienDV.setText(TIENDV);
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    private void layCTHDxem() {
       tongTienDV=0;
        DefaultTableModel dtm = (DefaultTableModel) TableCTHD.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
        String MPT=MPTCX.getText();
        String sql = "select DICHVU.tenDV,CTPDV.soluong,DICHVU.gia,DICHVU.gia * CTPDV.soluong as tongtien  from CTPDV join DICHVU on CTPDV.maDV = DICHVU.maDV AND CTPDV.maPT = '"+MPT+"'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("tenDV"));
                vt.add(rs.getString("soluong"));
                vt.add(rs.getString("gia"));
                vt.add(rs.getString("tongtien"));    
                tongTienDV = tongTienDV +Integer.parseInt(rs.getString("tongtien"));
                dtm.addRow(vt);
            }
            TableCTHD.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
            String TIENDV=String.valueOf(tongTienDV);
            tienDV.setText(TIENDV);
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
    
     private void layKhach() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableKhachHang.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from KHACH ";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("cmnd"));
                vt.add(rs.getString("ten"));
                vt.add(rs.getString("diachi"));
                vt.add(rs.getString("sdt"));
                vt.add(rs.getString("email"));
                vt.add(rs.getString("maphong"));   
                dtm.addRow(vt);
            }
            TableKhachHang.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void layHD() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableHD.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from HOADON ";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maHD"));
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("maNV"));
                vt.add(rs.getString("ngaylap"));
                vt.add(rs.getString("tienphong"));
                vt.add(rs.getString("tiendv"));
                vt.add(rs.getString("tiennhan"));  
                dtm.addRow(vt);
            }
            TableHD.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      private void Luu(String id) {
        Connection ketNoi = AppQLKS.layKetNoi();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String ns=df.format(ngaysinh.getDate());
        int PHAI=0;
        if(phai.getSelectedIndex()==0) {
            PHAI=1;
        }
        else PHAI=0;
        String BP = (String)tenbp.getSelectedItem();  
        String sql = "update NHANVIEN set ten=N'"+tenNV.getText()+"', phai="+PHAI+" ,ngaysinh='"+ns+"', diachi='"+diachi.getText()+"' ,sdt='"+sdt.getText()+"' ,email='"+email.getText()+"' ,mabp='"+BP+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void UpdatePD(String cmndkdat) {
        Connection ketNoi = AppQLKS.layKetNoi();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String NGAYBD=df.format(ngaybd.getDate());
        String NGAYKT=df.format(ngaykt.getDate());
        String HP = (String)dathp.getSelectedItem();  
       
    
    }
        
        
        
        
        
  public void loadComboBox()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "SELECT DISTINCT maBP FROM BOPHAN";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                tenbp.addItem(ketQua.getString("maBP"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }    
 
          public void loadComboBoxdathp()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "SELECT DISTINCT maHP FROM HANGPHONG";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                dathp.addItem(ketQua.getString("maHP"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    } 
          
        public void loadPhieuThueDV()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "SELECT  maPT FROM PHIEUTHUE";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                phieuthuedv.addItem(ketQua.getString("maPT"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }          
          
          
          
   public void loadComboBoxKhachDat()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "SELECT DISTINCT cmnd FROM KHACH";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                cmndkdat.addItem(ketQua.getString("cmnd"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    } 
      public void loadComboBoxKhachThue()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "SELECT DISTINCT cmnd FROM KHACH";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                cmndkthue.addItem(ketQua.getString("cmnd"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    } 
      public void loadComboBoxPhongHP()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String HP=(String)dathp.getSelectedItem();
        String query = "select * from hangphong as hp join phong as p on hp.maHP = p.maHP and p.maHP='"+HP+"'and p.trangthai='0'";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                datphongtrong.addItem(ketQua.getString("maphong"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }  
       public void loadComboBoxPhongDV()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String PTDV=(String)phieuthuedv.getSelectedItem();
        String query = "select * from phong as p join ctpt as ct on p.maphong = ct.maphong and ct.maPT='"+PTDV+"'";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                phongdv.addItem(ketQua.getString("maphong"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }         
         public void loadComboBoxDV()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        
        String query = "select * from DICHVU";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                dvctdv.addItem(ketQua.getString("maDV"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }      
 
  public void loadComboBoxHD()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        
        String query = "select maPT from PHIEUTHUE where isPay='0'";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                mapthd.addItem(ketQua.getString("maPT"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }      
         
         
      public void loadComboBoxKhuyenMai()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "SELECT * FROM KHUYENMAI";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                khuyenmai.addItem(ketQua.getString("maKM"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }       
  
      
 public void loadComboBoxPhongCon()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "Select * from PHONG where trangthai='0'";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                phongcon.addItem(ketQua.getString("maphong"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    } 
  public void loadComboBoxPDTrong()
    {
        Connection ketNoi = AppQLKS.layKetNoi();
        String query = "Select * from PHONG where trangthai='0'";
        try
        {
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next())
            {
                
                datphongtrong.addItem(ketQua.getString("maphong"));                
            }            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    } 
private void layPD() {
    
        DefaultTableModel dtm = (DefaultTableModel) TablePhieuDat.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from PHIEUDAT";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPD"));
                vt.add(rs.getString("cmnd"));
                vt.add(rs.getString("ngaybatdau"));
                vt.add(rs.getString("ngayodukien"));
                dtm.addRow(vt);
            }
            TablePhieuDat.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layCTPD() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableCTPD.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from CTPD";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPD"));
                vt.add(rs.getString("maHP"));
                vt.add(rs.getString("sl_dat"));
                dtm.addRow(vt);
            }
            TableCTPD.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
private void layNV() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableNhanVien.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from NHANVIEN join BOPHAN on NHANVIEN.maBP = BOPHAN.maBP";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("username"));
                vt.add(rs.getString("isActive"));
                vt.add(rs.getString("ten"));
                vt.add(rs.getString("phai"));
                vt.add(rs.getString("ngaysinh"));
                vt.add(rs.getString("diachi"));
                vt.add(rs.getString("sdt"));
                vt.add(rs.getString("email"));
                vt.add(rs.getString("tenbp"));
                dtm.addRow(vt);
            }
            TableNhanVien.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layPT() {
    
        DefaultTableModel dtm = (DefaultTableModel) TablePT.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from PHIEUTHUE where isPay='0'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("cmnd"));
                vt.add(rs.getString("username"));
                vt.add(rs.getString("ngayden"));
                vt.add(rs.getString("isPay"));
                dtm.addRow(vt);
            }
            TablePT.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layPTall() {
    
        DefaultTableModel dtm = (DefaultTableModel) TablePT.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from PHIEUTHUE";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("cmnd"));
                vt.add(rs.getString("username"));
                vt.add(rs.getString("ngayden"));
                vt.add(rs.getString("isPay"));
                dtm.addRow(vt);
            }
            TablePT.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layPTisPay() {
    
        DefaultTableModel dtm = (DefaultTableModel) TablePT.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from PHIEUTHUE where isPay='1'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("cmnd"));
                vt.add(rs.getString("username"));
                vt.add(rs.getString("ngayden"));
                vt.add(rs.getString("isPay"));
                dtm.addRow(vt);
            }
            TablePT.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layCTPT() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableCTPT.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from CTPT join PHIEUTHUE on CTPT.maPT=PHIEUTHUE.maPT and PHIEUTHUE.isPay='0'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maKM")); 
                dtm.addRow(vt);
            }
            TableCTPT.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layCTPTall() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableCTPT.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from CTPT";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maKM")); 
                dtm.addRow(vt);
            }
            TableCTPT.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layCTPTisPay() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableCTPT.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from CTPT join PHIEUTHUE on CTPT.maPT=PHIEUTHUE.maPT and PHIEUTHUE.isPay='1'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maKM")); 
                dtm.addRow(vt);
            }
            TableCTPT.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layPhongTrong() {
    
        DefaultTableModel dtm = (DefaultTableModel) TablePhongTrong.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "Select * from PHONG where trangthai='0'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maHP")); 
                 vt.add(rs.getString("sl_khach_max")); 
                dtm.addRow(vt);
            }
            TablePhongTrong.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void layPhongTrongDat() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableTrongPD.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "Select * from PHONG where trangthai='0'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maHP")); 
                 vt.add(rs.getString("sl_khach_max")); 
                dtm.addRow(vt);
            }
            TableTrongPD.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SuaTrangThai(String phong) {
        Connection ketNoi = AppQLKS.layKetNoi();
     
        String sql = " update PHONG set trangthai='1' where maphong='"+phong+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void layDV() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableDV.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from DICHVU";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maDV"));
                vt.add(rs.getString("tenDV"));
                vt.add(rs.getString("gia"));       
                dtm.addRow(vt);
            }
            TableDV.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void layCTDV() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableCTPDV.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from CTPDV join PHIEUTHUE on CTPDV.maPT=PHIEUTHUE.maPT and PHIEUTHUE.isPay='0'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maDV"));
                vt.add(rs.getString("soluong"));
                dtm.addRow(vt);
            }
            TableCTPDV.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       private void layCTDVisPay() {
    
        DefaultTableModel dtm = (DefaultTableModel) TableCTPDV.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "select * from CTPDV join PHIEUTHUE on CTPDV.maPT=PHIEUTHUE.maPT and PHIEUTHUE.isPay='1'";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maPT"));
                vt.add(rs.getString("maphong"));
                vt.add(rs.getString("maDV"));
                vt.add(rs.getString("soluong"));
                dtm.addRow(vt);
            }
            TableCTPDV.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        bophan = new javax.swing.JLabel();
        dangxuat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnHOME = new rojeru_san.RSButton();
        btnTHUEPHONG = new rojeru_san.RSButton();
        btnDICHVU = new rojeru_san.RSButton();
        btnHOADON = new rojeru_san.RSButton();
        btnKHACHHANG = new rojeru_san.RSButton();
        quanly = new javax.swing.JPanel();
        datphong = new javax.swing.JPanel();
        ngaybd = new com.toedter.calendar.JDateChooser();
        ngaykt = new com.toedter.calendar.JDateChooser();
        dathp = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablePhieuDat = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableCTPD = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        sldat = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        datloai = new javax.swing.JLabel();
        kieudat = new javax.swing.JLabel();
        chuyenctpd = new keeptoo.KGradientPanel();
        jLabel42 = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        maphieudat = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        TableTrongPD = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        cmndkdat = new javax.swing.JComboBox<>();
        thongbaodatphong = new javax.swing.JLabel();
        xoactpd = new rojeru_san.RSButton();
        xoapd = new rojeru_san.RSButton();
        luuphieudat = new rojeru_san.RSButton();
        luuy = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        datphongtrong = new javax.swing.JComboBox<>();
        ngaytraphong = new keeptoo.KButton();
        thuephong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCTPT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePhongTrong = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        maphieuthue = new javax.swing.JTextField();
        khuyenmai = new javax.swing.JComboBox<>();
        cmndkthue = new javax.swing.JComboBox<>();
        thanhtoan = new javax.swing.JLabel();
        phongcon = new javax.swing.JComboBox<>();
        ngaybdt = new com.toedter.calendar.JDateChooser();
        chuyenctpt = new keeptoo.KGradientPanel();
        jLabel52 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel53 = new javax.swing.JLabel();
        luuphieuthue = new rojeru_san.RSButton();
        xoactpt = new rojeru_san.RSButton();
        xoapt = new rojeru_san.RSButton();
        thongbaophieuthue = new javax.swing.JLabel();
        luuy1 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        hangphongthue = new javax.swing.JLabel();
        nvthue = new javax.swing.JLabel();
        ispay = new keeptoo.KButton();
        isnotpay = new keeptoo.KButton();
        dichvu = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TableCTPDV = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        TableDV = new javax.swing.JTable();
        sldv = new javax.swing.JTextField();
        phongdv = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        phieuthuedv = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        dvctdv = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        madv = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        tendv = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        dongia = new javax.swing.JTextField();
        luuctdv = new keeptoo.KButton();
        luudv = new keeptoo.KButton();
        thongbaodichvu = new javax.swing.JLabel();
        xoadv = new keeptoo.KButton();
        dvnotpay = new keeptoo.KButton();
        dvispay = new keeptoo.KButton();
        hoadon = new javax.swing.JPanel();
        inhoadon = new keeptoo.KButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        TableHD = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        mapthd = new javax.swing.JComboBox<>();
        ngaylaphd = new com.toedter.calendar.JDateChooser();
        mahoadon = new javax.swing.JTextField();
        LuuHD = new keeptoo.KButton();
        thongbaohoadon = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        TableCTHD = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        tongtiencthd = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        ngaydenhd = new javax.swing.JLabel();
        ngaydihd = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        khachcthd = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TableTienPhong = new javax.swing.JTable();
        cmndkhach = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        nvhd = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        KhuyenMai = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        tienDV = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        TienPhong = new javax.swing.JLabel();
        tienDV1 = new javax.swing.JLabel();
        ngayo = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        tienphongafter = new javax.swing.JLabel();
        MPTCX = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        xemchitiet = new keeptoo.KButton();
        thongke = new javax.swing.JPanel();
        tungay = new com.toedter.calendar.JDateChooser();
        denngay = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TableTK = new javax.swing.JTable();
        xemthongke = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        tongdoanhthu = new javax.swing.JLabel();
        khachhang = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableKhachHang = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        cmnd = new javax.swing.JTextField();
        diachikhach = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tenkhach = new javax.swing.JTextField();
        sdtkhach = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        emailkhach = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        XoaKhach = new keeptoo.KButton();
        LuuKhach = new keeptoo.KButton();
        thongbaokhach = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        nhanvien = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableNhanVien = new javax.swing.JTable();
        diachi = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        phai = new javax.swing.JComboBox<>();
        tenbp = new javax.swing.JComboBox<>();
        ngaysinh = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tenNV = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        isActive = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        SuaTT = new keeptoo.KButton();
        thongbao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage.png"))); // NOI18N
        jLabel2.setText("QUẢN LÍ KHÁCH SẠN ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("BỘ PHẬN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("TÊN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 30));

        ten.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ten.setText("exam");
        jPanel2.add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 30));

        bophan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bophan.setText("QUẢN LÝ");
        jPanel2.add(bophan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        dangxuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        dangxuat.setText("ĐĂNG XUẤT");
        dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dangxuatMousePressed(evt);
            }
        });
        jPanel2.add(dangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 30, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 100));

        jPanel3.setBackground(new java.awt.Color(94, 106, 107));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phone-call.png"))); // NOI18N
        jLabel1.setText("HOTLINE - 0378489364");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/copyright.png"))); // NOI18N
        jLabel8.setText("NO COPYRIGHT");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 12, -1, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DESIGN BY MY TEAM");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 1520, 60));

        jPanel4.setBackground(new java.awt.Color(239, 235, 235));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHOME.setBackground(new java.awt.Color(240, 240, 240));
        btnHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/house.png"))); // NOI18N
        btnHOME.setText("ĐẶT PHÒNG      ");
        btnHOME.setColorHover(new java.awt.Color(255, 208, 208));
        btnHOME.setColorText(new java.awt.Color(102, 102, 102));
        btnHOME.setColorTextHover(new java.awt.Color(102, 102, 102));
        btnHOME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOMEActionPerformed(evt);
            }
        });
        jPanel4.add(btnHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 110));

        btnTHUEPHONG.setBackground(new java.awt.Color(240, 240, 240));
        btnTHUEPHONG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hotel.png"))); // NOI18N
        btnTHUEPHONG.setText("THUÊ PHÒNG  ");
        btnTHUEPHONG.setColorHover(new java.awt.Color(255, 208, 208));
        btnTHUEPHONG.setColorText(new java.awt.Color(102, 102, 102));
        btnTHUEPHONG.setColorTextHover(new java.awt.Color(102, 102, 102));
        btnTHUEPHONG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTHUEPHONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHUEPHONGActionPerformed(evt);
            }
        });
        jPanel4.add(btnTHUEPHONG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 100));

        btnDICHVU.setBackground(new java.awt.Color(240, 240, 240));
        btnDICHVU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food-service.png"))); // NOI18N
        btnDICHVU.setText("DỊCH VỤ            ");
        btnDICHVU.setColorHover(new java.awt.Color(255, 208, 208));
        btnDICHVU.setColorText(new java.awt.Color(102, 102, 102));
        btnDICHVU.setColorTextHover(new java.awt.Color(102, 102, 102));
        btnDICHVU.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDICHVU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDICHVUActionPerformed(evt);
            }
        });
        jPanel4.add(btnDICHVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 100));

        btnHOADON.setBackground(new java.awt.Color(240, 240, 240));
        btnHOADON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.png"))); // NOI18N
        btnHOADON.setText("HÓA ĐƠN         ");
        btnHOADON.setColorHover(new java.awt.Color(255, 208, 208));
        btnHOADON.setColorText(new java.awt.Color(102, 102, 102));
        btnHOADON.setColorTextHover(new java.awt.Color(102, 102, 102));
        btnHOADON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHOADON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOADONActionPerformed(evt);
            }
        });
        jPanel4.add(btnHOADON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 100));

        btnKHACHHANG.setBackground(new java.awt.Color(240, 240, 240));
        btnKHACHHANG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rate.png"))); // NOI18N
        btnKHACHHANG.setText("KHÁCH HÀNG   ");
        btnKHACHHANG.setColorHover(new java.awt.Color(255, 208, 208));
        btnKHACHHANG.setColorText(new java.awt.Color(102, 102, 102));
        btnKHACHHANG.setColorTextHover(new java.awt.Color(102, 102, 102));
        btnKHACHHANG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKHACHHANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKHACHHANGActionPerformed(evt);
            }
        });
        jPanel4.add(btnKHACHHANG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 260, 100));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 720));

        quanly.setLayout(new java.awt.CardLayout());

        datphong.setBackground(new java.awt.Color(229, 229, 229));
        datphong.setPreferredSize(new java.awt.Dimension(1260, 720));
        datphong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ngaybd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        datphong.add(ngaybd, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 150, 25));

        ngaykt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        datphong.add(ngaykt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 150, 25));

        dathp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dathp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dathpItemStateChanged(evt);
            }
        });
        dathp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                dathpPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        datphong.add(dathp, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 150, 25));

        TablePhieuDat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TablePhieuDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu Đặt", "CMND Khách Đặt", "Ngày Bắt Đầu", "Ngày Đi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePhieuDat.setFocusable(false);
        TablePhieuDat.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablePhieuDat.setRowHeight(25);
        TablePhieuDat.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TablePhieuDat.setShowVerticalLines(false);
        TablePhieuDat.getTableHeader().setReorderingAllowed(false);
        TablePhieuDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePhieuDatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablePhieuDatMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(TablePhieuDat);

        datphong.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 590, 360));

        TableCTPD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableCTPD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu Đặt", "Mã Hạng Phòng", "Số Lượng Đặt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableCTPD.setFocusable(false);
        TableCTPD.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableCTPD.setRowHeight(25);
        TableCTPD.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableCTPD.setShowVerticalLines(false);
        TableCTPD.getTableHeader().setReorderingAllowed(false);
        TableCTPD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableCTPDMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(TableCTPD);

        datphong.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 550, 360));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("PHIẾU ĐẶT");
        datphong.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("CHI TIẾT PHIẾU ĐẶT");
        datphong.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("Mã Phiếu Đặt");
        datphong.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 153));
        jLabel32.setText("Kiểu");
        datphong.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 153));
        jLabel33.setText("Ngày Bắt Đầu");
        datphong.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, -1, -1));

        sldat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        datphong.add(sldat, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 670, 150, 25));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 153));
        jLabel34.setText("CMND Khách Đặt");
        datphong.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 51, 153));
        jLabel35.setText("Ngày Đi");
        datphong.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 51, 153));
        jLabel36.setText("Phòng");
        datphong.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 51, 153));
        jLabel37.setText("Loại");
        datphong.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 40, -1));

        datloai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        datloai.setText("EXAM");
        datphong.add(datloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 150, 25));

        kieudat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        kieudat.setText("EXAM");
        datphong.add(kieudat, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 220, 25));

        chuyenctpd.setBackground(new java.awt.Color(229, 229, 229));
        chuyenctpd.setkBorderRadius(50);
        chuyenctpd.setkEndColor(new java.awt.Color(204, 204, 204));
        chuyenctpd.setkGradientFocus(200);
        chuyenctpd.setkStartColor(new java.awt.Color(102, 102, 102));
        chuyenctpd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chuyenctpdMousePressed(evt);
            }
        });
        chuyenctpd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText(">>");
        chuyenctpd.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 20));

        kGradientPanel11.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel11.setkBorderRadius(50);
        kGradientPanel11.setkEndColor(new java.awt.Color(32, 136, 203));
        kGradientPanel11.setkGradientFocus(200);
        kGradientPanel11.setkStartColor(new java.awt.Color(32, 136, 203));
        kGradientPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("THUÊ PHÒNG");
        kGradientPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 20));

        chuyenctpd.add(kGradientPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 188, 39));

        datphong.add(chuyenctpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 60, 39));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 51, 153));
        jLabel45.setText("Số Lượng Đặt");
        datphong.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, -1, -1));

        maphieudat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        datphong.add(maphieudat, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 150, 25));

        TableTrongPD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableTrongPD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phòng", "Hạng Phòng", "Số Lượng Khách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableTrongPD.setFocusable(false);
        TableTrongPD.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableTrongPD.setRowHeight(25);
        TableTrongPD.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableTrongPD.setShowVerticalLines(false);
        TableTrongPD.getTableHeader().setReorderingAllowed(false);
        TableTrongPD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableTrongPDMousePressed(evt);
            }
        });
        jScrollPane11.setViewportView(TableTrongPD);

        datphong.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 590, 250));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 102, 204));
        jLabel56.setText("PHÒNG TRỐNG");
        datphong.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 30));

        cmndkdat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmndkdat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmndkdatItemStateChanged(evt);
            }
        });
        cmndkdat.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmndkdatPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        datphong.add(cmndkdat, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 150, 25));

        thongbaodatphong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        datphong.add(thongbaodatphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 250, 30));

        xoactpd.setBackground(new java.awt.Color(0, 153, 153));
        xoactpd.setText("XÓA CTPĐ");
        xoactpd.setColorHover(new java.awt.Color(102, 102, 102));
        xoactpd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        xoactpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoactpdActionPerformed(evt);
            }
        });
        datphong.add(xoactpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 140, -1));

        xoapd.setBackground(new java.awt.Color(0, 153, 153));
        xoapd.setText("XÓA PHIẾU ĐẶT");
        xoapd.setColorHover(new java.awt.Color(102, 102, 102));
        xoapd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        xoapd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoapdActionPerformed(evt);
            }
        });
        datphong.add(xoapd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 540, 140, -1));

        luuphieudat.setBackground(new java.awt.Color(0, 102, 204));
        luuphieudat.setText("LƯU PHIẾU ĐẶT");
        luuphieudat.setColorHover(new java.awt.Color(102, 102, 102));
        luuphieudat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luuphieudat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuphieudatActionPerformed(evt);
            }
        });
        datphong.add(luuphieudat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 430, 160, 50));

        luuy.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        luuy.setForeground(new java.awt.Color(0, 51, 204));
        luuy.setText("Lưu Ý: Xóa CTPĐ rồi mới xóa PĐ");
        datphong.add(luuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 690, 240, 20));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 51, 153));
        jLabel40.setText("Hạng Phòng");
        datphong.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, -1));

        datphongtrong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        datphongtrong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                datphongtrongItemStateChanged(evt);
            }
        });
        datphongtrong.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                datphongtrongPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        datphong.add(datphongtrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 50, 25));

        ngaytraphong.setText("NGÀY TRẢ PHÒNG");
        ngaytraphong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ngaytraphong.setkEndColor(new java.awt.Color(102, 102, 102));
        ngaytraphong.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        ngaytraphong.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ngaytraphong.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        ngaytraphong.setkSelectedColor(new java.awt.Color(102, 102, 102));
        ngaytraphong.setkStartColor(new java.awt.Color(51, 0, 153));
        datphong.add(ngaytraphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 590, 140, -1));

        quanly.add(datphong, "card2");

        thuephong.setBackground(new java.awt.Color(229, 229, 229));
        thuephong.setPreferredSize(new java.awt.Dimension(1260, 720));
        thuephong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePT.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TablePT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phiếu Thuê", "CMND Khách", "Nhân Viên", "Ngày Đến", "Thanh Toán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePT.setFocusable(false);
        TablePT.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablePT.setRowHeight(25);
        TablePT.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TablePT.setShowVerticalLines(false);
        TablePT.getTableHeader().setReorderingAllowed(false);
        TablePT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablePTMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablePT);

        thuephong.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 590, 360));

        TableCTPT.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableCTPT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phiếu Thuê", "Phòng", "Khuyến Mãi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableCTPT.setFocusable(false);
        TableCTPT.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableCTPT.setRowHeight(25);
        TableCTPT.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableCTPT.setShowVerticalLines(false);
        TableCTPT.getTableHeader().setReorderingAllowed(false);
        TableCTPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableCTPTMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TableCTPT);

        thuephong.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 560, 360));

        TablePhongTrong.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TablePhongTrong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phòng", "Hạng Phòng", "Số Lượng Khách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePhongTrong.setFocusable(false);
        TablePhongTrong.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablePhongTrong.setRowHeight(25);
        TablePhongTrong.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TablePhongTrong.setShowVerticalLines(false);
        TablePhongTrong.getTableHeader().setReorderingAllowed(false);
        TablePhongTrong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablePhongTrongMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TablePhongTrong);

        thuephong.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 590, 210));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 102, 204));
        jLabel44.setText("CHI TIẾT PHIẾU THUÊ");
        thuephong.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 102, 204));
        jLabel46.setText("PHÒNG TRỐNG");
        thuephong.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 102, 204));
        jLabel47.setText("PHIẾU THUÊ");
        thuephong.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Thanh Toán");
        thuephong.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Phiếu Thuê");
        thuephong.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, -1, 25));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("CMND Khách");
        thuephong.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, -1, 25));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Nhân Viên");
        thuephong.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, -1, 25));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Ngày Đến");
        thuephong.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, -1, 25));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Hạng Phòng");
        thuephong.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, -1, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Khuyến Mãi");
        thuephong.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, -1, 25));

        maphieuthue.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thuephong.add(maphieuthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 180, 25));

        khuyenmai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        khuyenmai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                khuyenmaiItemStateChanged(evt);
            }
        });
        khuyenmai.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                khuyenmaiPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        thuephong.add(khuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, 80, 25));

        cmndkthue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmndkthue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmndkthueItemStateChanged(evt);
            }
        });
        cmndkthue.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmndkthuePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        thuephong.add(cmndkthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 180, 25));

        thanhtoan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thanhtoan.setText("0");
        thuephong.add(thanhtoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 180, 25));

        phongcon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phongcon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                phongconItemStateChanged(evt);
            }
        });
        phongcon.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                phongconPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        thuephong.add(phongcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, 80, 25));

        ngaybdt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thuephong.add(ngaybdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 180, 25));

        chuyenctpt.setBackground(new java.awt.Color(229, 229, 229));
        chuyenctpt.setkBorderRadius(50);
        chuyenctpt.setkEndColor(new java.awt.Color(204, 204, 204));
        chuyenctpt.setkGradientFocus(200);
        chuyenctpt.setkStartColor(new java.awt.Color(102, 102, 102));
        chuyenctpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chuyenctptMousePressed(evt);
            }
        });
        chuyenctpt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText(">>");
        chuyenctpt.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 20));

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkBorderRadius(50);
        kGradientPanel4.setkEndColor(new java.awt.Color(32, 136, 203));
        kGradientPanel4.setkGradientFocus(200);
        kGradientPanel4.setkStartColor(new java.awt.Color(32, 136, 203));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("THUÊ PHÒNG");
        kGradientPanel4.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 20));

        chuyenctpt.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 188, 39));

        thuephong.add(chuyenctpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 60, 39));

        luuphieuthue.setBackground(new java.awt.Color(0, 102, 204));
        luuphieuthue.setText("LƯU PHIẾU THUÊ");
        luuphieuthue.setColorHover(new java.awt.Color(102, 102, 102));
        luuphieuthue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luuphieuthue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuphieuthueActionPerformed(evt);
            }
        });
        thuephong.add(luuphieuthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 160, 50));

        xoactpt.setBackground(new java.awt.Color(0, 153, 153));
        xoactpt.setText("XÓA CTPT");
        xoactpt.setColorHover(new java.awt.Color(102, 102, 102));
        xoactpt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        xoactpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoactptActionPerformed(evt);
            }
        });
        thuephong.add(xoactpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 670, 140, -1));

        xoapt.setBackground(new java.awt.Color(0, 153, 153));
        xoapt.setText("XÓA PHIẾU THUÊ");
        xoapt.setColorHover(new java.awt.Color(102, 102, 102));
        xoapt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        xoapt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaptActionPerformed(evt);
            }
        });
        thuephong.add(xoapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 670, 140, -1));

        thongbaophieuthue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thongbaophieuthue.setForeground(new java.awt.Color(255, 0, 51));
        thuephong.add(thongbaophieuthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 290, 30));

        luuy1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        luuy1.setForeground(new java.awt.Color(0, 51, 204));
        luuy1.setText("Lưu Ý: Xóa CTPĐ rồi mới xóa PĐ");
        thuephong.add(luuy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 240, 20));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Phòng");
        thuephong.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, 25));

        hangphongthue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thuephong.add(hangphongthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, 80, 30));

        nvthue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thuephong.add(nvthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 180, 25));

        ispay.setText("Xem Phiếu Đã Thanh Toán");
        ispay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ispay.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        ispay.setkEndColor(new java.awt.Color(51, 51, 51));
        ispay.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        ispay.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ispay.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        ispay.setkSelectedColor(new java.awt.Color(0, 153, 255));
        ispay.setkStartColor(new java.awt.Color(0, 102, 153));
        ispay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ispayActionPerformed(evt);
            }
        });
        thuephong.add(ispay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 200, 30));

        isnotpay.setText("Xem Phiếu Chưa Thanh Toán");
        isnotpay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        isnotpay.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        isnotpay.setkEndColor(new java.awt.Color(0, 153, 153));
        isnotpay.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        isnotpay.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        isnotpay.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        isnotpay.setkSelectedColor(new java.awt.Color(0, 153, 255));
        isnotpay.setkStartColor(new java.awt.Color(153, 153, 153));
        isnotpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isnotpayActionPerformed(evt);
            }
        });
        thuephong.add(isnotpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 220, 30));

        quanly.add(thuephong, "card3");

        dichvu.setBackground(new java.awt.Color(229, 229, 229));
        dichvu.setPreferredSize(new java.awt.Dimension(1264, 720));
        dichvu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableCTPDV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableCTPDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phiếu Thuê", "Phòng", "Dịch Vụ", "Số Lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableCTPDV.setFocusable(false);
        TableCTPDV.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableCTPDV.setRowHeight(25);
        TableCTPDV.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableCTPDV.setShowVerticalLines(false);
        TableCTPDV.getTableHeader().setReorderingAllowed(false);
        TableCTPDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableCTPDVMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(TableCTPDV);

        dichvu.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 700, 370));

        TableDV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Dịch Vụ", "Tên", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableDV.setFocusable(false);
        TableDV.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableDV.setRowHeight(25);
        TableDV.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableDV.setShowVerticalLines(false);
        TableDV.getTableHeader().setReorderingAllowed(false);
        TableDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableDVMousePressed(evt);
            }
        });
        jScrollPane10.setViewportView(TableDV);

        dichvu.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 370));

        sldv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        dichvu.add(sldv, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 310, 25));

        phongdv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phongdv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                phongdvItemStateChanged(evt);
            }
        });
        phongdv.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                phongdvPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        dichvu.add(phongdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 310, 25));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 51, 153));
        jLabel41.setText("Phòng");
        dichvu.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 51, 153));
        jLabel55.setText("Số Lượng Đặt");
        dichvu.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 51, 153));
        jLabel57.setText("Phiếu Thuê");
        dichvu.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        phieuthuedv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phieuthuedv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                phieuthuedvItemStateChanged(evt);
            }
        });
        phieuthuedv.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                phieuthuedvPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        dichvu.add(phieuthuedv, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 310, 25));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 153));
        jLabel58.setText("Dịch Vụ");
        dichvu.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));

        dvctdv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dvctdv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dvctdvItemStateChanged(evt);
            }
        });
        dvctdv.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                dvctdvPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        dichvu.add(dvctdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 310, 25));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 51, 153));
        jLabel59.setText("Mã Dịch Vụ");
        dichvu.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        madv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        dichvu.add(madv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 260, 25));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 51, 153));
        jLabel60.setText("Tên Dịch Vụ");
        dichvu.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        tendv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        dichvu.add(tendv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 260, 25));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 51, 153));
        jLabel61.setText("Đơn Giá");
        dichvu.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        dongia.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        dichvu.add(dongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 260, 25));

        luuctdv.setText("+");
        luuctdv.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        luuctdv.setkBackGroundColor(new java.awt.Color(240, 240, 240));
        luuctdv.setkEndColor(new java.awt.Color(102, 102, 102));
        luuctdv.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        luuctdv.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        luuctdv.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        luuctdv.setkSelectedColor(new java.awt.Color(102, 102, 102));
        luuctdv.setkStartColor(new java.awt.Color(153, 153, 0));
        luuctdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuctdvActionPerformed(evt);
            }
        });
        dichvu.add(luuctdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 60, -1));

        luudv.setText("LƯU DỊCH VỤ");
        luudv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luudv.setkBackGroundColor(new java.awt.Color(240, 240, 240));
        luudv.setkEndColor(new java.awt.Color(102, 102, 102));
        luudv.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        luudv.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        luudv.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        luudv.setkSelectedColor(new java.awt.Color(102, 102, 102));
        luudv.setkStartColor(new java.awt.Color(0, 153, 102));
        luudv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luudvActionPerformed(evt);
            }
        });
        dichvu.add(luudv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, -1));

        thongbaodichvu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dichvu.add(thongbaodichvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, 260, 40));

        xoadv.setText("XÓA DỊCH VỤ");
        xoadv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xoadv.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        xoadv.setkEndColor(new java.awt.Color(153, 153, 153));
        xoadv.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        xoadv.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        xoadv.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        xoadv.setkSelectedColor(new java.awt.Color(0, 153, 204));
        xoadv.setkStartColor(new java.awt.Color(102, 102, 102));
        xoadv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadvActionPerformed(evt);
            }
        });
        dichvu.add(xoadv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 120, -1));

        dvnotpay.setText("DỊCH VỤ CHƯA THANH TOÁN");
        dvnotpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dvnotpay.setkBackGroundColor(new java.awt.Color(240, 240, 240));
        dvnotpay.setkEndColor(new java.awt.Color(102, 102, 102));
        dvnotpay.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        dvnotpay.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        dvnotpay.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        dvnotpay.setkSelectedColor(new java.awt.Color(102, 102, 102));
        dvnotpay.setkStartColor(new java.awt.Color(0, 153, 102));
        dvnotpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvnotpayActionPerformed(evt);
            }
        });
        dichvu.add(dvnotpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 220, -1));

        dvispay.setText("DỊCH VỤ ĐÃ THANH TOÁN");
        dvispay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dvispay.setkBackGroundColor(new java.awt.Color(240, 240, 240));
        dvispay.setkEndColor(new java.awt.Color(102, 102, 102));
        dvispay.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        dvispay.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        dvispay.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        dvispay.setkSelectedColor(new java.awt.Color(102, 102, 102));
        dvispay.setkStartColor(new java.awt.Color(0, 102, 153));
        dvispay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvispayActionPerformed(evt);
            }
        });
        dichvu.add(dvispay, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 210, -1));

        quanly.add(dichvu, "card4");

        hoadon.setBackground(new java.awt.Color(229, 229, 229));
        hoadon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inhoadon.setText("IN HÓA ĐƠN >>>");
        inhoadon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        inhoadon.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        inhoadon.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        inhoadon.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        inhoadon.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        inhoadon.setkSelectedColor(new java.awt.Color(0, 102, 153));
        inhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inhoadonActionPerformed(evt);
            }
        });
        hoadon.add(inhoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 170, 80));

        TableHD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Phiếu Thuê", "Nhân Viên", "Ngày Lập", "Tiền Phòng", "Tiền Dịch Vụ", "Tiền Nhận"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableHD.setFocusable(false);
        TableHD.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableHD.setRowHeight(25);
        TableHD.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableHD.setShowVerticalLines(false);
        TableHD.getTableHeader().setReorderingAllowed(false);
        TableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableHDMousePressed(evt);
            }
        });
        jScrollPane12.setViewportView(TableHD);
        if (TableHD.getColumnModel().getColumnCount() > 0) {
            TableHD.getColumnModel().getColumn(3).setHeaderValue("Ngày Lập");
            TableHD.getColumnModel().getColumn(4).setHeaderValue("Tiền Phòng");
            TableHD.getColumnModel().getColumn(5).setHeaderValue("Tiền Dịch Vụ");
            TableHD.getColumnModel().getColumn(6).setHeaderValue("Tiền Nhận");
        }

        hoadon.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 370));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 102, 102));
        jLabel48.setText("CHI TIẾT HÓA ĐƠN");
        hoadon.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 51, 153));
        jLabel49.setText("Ngày Lập");
        hoadon.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, 20));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 51, 153));
        jLabel64.setText("Mã Hóa Đơn");
        hoadon.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 20));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 51, 153));
        jLabel65.setText("Mã Phiếu Thuê Cần Xem");
        hoadon.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, 20));

        mapthd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mapthd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mapthdItemStateChanged(evt);
            }
        });
        mapthd.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                mapthdPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        hoadon.add(mapthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 190, 30));

        ngaylaphd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(ngaylaphd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 190, 30));

        mahoadon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(mahoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 190, 30));

        LuuHD.setText("LƯU HÓA ĐƠN");
        LuuHD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LuuHD.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        LuuHD.setkEndColor(new java.awt.Color(204, 204, 204));
        LuuHD.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        LuuHD.setkHoverStartColor(new java.awt.Color(0, 153, 102));
        LuuHD.setkSelectedColor(new java.awt.Color(0, 153, 153));
        LuuHD.setkStartColor(new java.awt.Color(0, 102, 204));
        LuuHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuHDActionPerformed(evt);
            }
        });
        hoadon.add(LuuHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 170, 80));

        thongbaohoadon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(thongbaohoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 330, 40));

        TableCTHD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dịch Vụ", "Số Lượng", "Đơn Giá", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableCTHD.setFocusable(false);
        TableCTHD.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableCTHD.setRowHeight(25);
        TableCTHD.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableCTHD.setShowVerticalLines(false);
        TableCTHD.getTableHeader().setReorderingAllowed(false);
        TableCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableCTHDMousePressed(evt);
            }
        });
        jScrollPane13.setViewportView(TableCTHD);

        hoadon.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 480, 110));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 51, 153));
        jLabel68.setText("Ngày Ở");
        hoadon.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, 60, 30));

        tongtiencthd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tongtiencthd.setText("EXAM");
        hoadon.add(tongtiencthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 640, 190, 40));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 51, 153));
        jLabel69.setText("Khuyến Mãi");
        hoadon.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, -1, 30));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 51, 153));
        jLabel70.setText("Nhân Viên");
        hoadon.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, -1, 30));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 51, 153));
        jLabel71.setText("Ngày Đến");
        hoadon.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, 30));

        ngaydenhd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ngaydenhd.setText("EXAM");
        hoadon.add(ngaydenhd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 150, 30));

        ngaydihd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ngaydihd.setText("EXAM");
        hoadon.add(ngaydihd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 150, 30));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 51, 153));
        jLabel72.setText("Tên Khách");
        hoadon.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, 30));

        khachcthd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        khachcthd.setText("EXAM");
        hoadon.add(khachcthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 150, 30));

        TableTienPhong.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableTienPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phòng", "Đơn Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableTienPhong.setFocusable(false);
        TableTienPhong.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableTienPhong.setRowHeight(25);
        TableTienPhong.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableTienPhong.setShowVerticalLines(false);
        TableTienPhong.getTableHeader().setReorderingAllowed(false);
        TableTienPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableTienPhongMousePressed(evt);
            }
        });
        jScrollPane14.setViewportView(TableTienPhong);

        hoadon.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 480, 100));

        cmndkhach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmndkhach.setText("EXAM");
        hoadon.add(cmndkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 150, 30));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 153));
        jLabel73.setText("CMND");
        hoadon.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, 30));

        nvhd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(nvhd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 190, 30));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 153));
        jLabel74.setText("TIỀN PHẢI THANH TOÁN");
        hoadon.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, -1, 40));

        KhuyenMai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(KhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, 130, 30));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 51, 153));
        jLabel75.setText("Tổng Tiền Dịch Vụ");
        hoadon.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, 30));

        tienDV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(tienDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 180, 30));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 51, 153));
        jLabel76.setText("Tiền Phòng");
        hoadon.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, 30));

        TienPhong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(TienPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 130, 30));

        tienDV1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tienDV1.setText("VND");
        hoadon.add(tienDV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 640, 40, 40));

        ngayo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(ngayo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, 80, 30));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 51, 153));
        jLabel77.setText("Ngày Đi");
        hoadon.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 70, 30));

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 51, 153));
        jLabel78.setText("Tổng Tiền Phòng");
        hoadon.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, -1, 30));

        tienphongafter.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(tienphongafter, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 130, 30));

        MPTCX.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        hoadon.add(MPTCX, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 100, 40));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 153));
        jLabel66.setText("Mã Phiếu Thuê");
        hoadon.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, 20));

        xemchitiet.setText("XEM CHI TIẾT");
        xemchitiet.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        xemchitiet.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        xemchitiet.setkEndColor(new java.awt.Color(204, 204, 204));
        xemchitiet.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        xemchitiet.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        xemchitiet.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        xemchitiet.setkSelectedColor(new java.awt.Color(0, 102, 153));
        xemchitiet.setkStartColor(new java.awt.Color(51, 51, 51));
        xemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemchitietActionPerformed(evt);
            }
        });
        hoadon.add(xemchitiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 170, 80));

        quanly.add(hoadon, "card5");

        thongke.setBackground(new java.awt.Color(229, 229, 229));
        thongke.setPreferredSize(new java.awt.Dimension(1250, 700));
        thongke.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tungay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thongke.add(tungay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, 50));

        denngay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thongke.add(denngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 200, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Tổng Doanh Thu");
        thongke.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 230, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Đến Ngày");
        thongke.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, 30));

        TableTK.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Thanh Toán", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableTK.setFocusable(false);
        TableTK.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableTK.setRowHeight(25);
        TableTK.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableTK.setShowVerticalLines(false);
        TableTK.getTableHeader().setReorderingAllowed(false);
        TableTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableTKMousePressed(evt);
            }
        });
        jScrollPane15.setViewportView(TableTK);

        thongke.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1210, 390));

        xemthongke.setText("XEM CHI TIẾT");
        xemthongke.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        xemthongke.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        xemthongke.setkEndColor(new java.awt.Color(204, 204, 204));
        xemthongke.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        xemthongke.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        xemthongke.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        xemthongke.setkSelectedColor(new java.awt.Color(0, 102, 153));
        xemthongke.setkStartColor(new java.awt.Color(51, 51, 51));
        xemthongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemthongkeActionPerformed(evt);
            }
        });
        thongke.add(xemthongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 170, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Từ Ngày");
        thongke.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 30));

        tongdoanhthu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        thongke.add(tongdoanhthu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 609, 230, 70));

        quanly.add(thongke, "card6");

        khachhang.setBackground(new java.awt.Color(229, 229, 229));
        khachhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableKhachHang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CMND", "Tên", "Địa Chỉ", "SĐT", "Email", "Mã Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableKhachHang.setFocusable(false);
        TableKhachHang.setGridColor(new java.awt.Color(204, 204, 204));
        TableKhachHang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableKhachHang.setRowHeight(25);
        TableKhachHang.setSelectionBackground(new java.awt.Color(153, 153, 153));
        TableKhachHang.setShowVerticalLines(false);
        TableKhachHang.getTableHeader().setReorderingAllowed(false);
        TableKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableKhachHangMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(TableKhachHang);

        khachhang.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1230, 283));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setText("CMND");
        khachhang.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, 30));

        cmnd.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khachhang.add(cmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 250, 50));

        diachikhach.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khachhang.add(diachikhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 250, 50));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setText("Tên");
        khachhang.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 30, 30));

        tenkhach.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khachhang.add(tenkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 250, 50));

        sdtkhach.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khachhang.add(sdtkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 250, 50));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setText("SĐT");
        khachhang.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 40, 50));

        emailkhach.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khachhang.add(emailkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 250, 50));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText("Email");
        khachhang.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 40, 50));

        XoaKhach.setBackground(new java.awt.Color(229, 229, 229));
        XoaKhach.setForeground(new java.awt.Color(229, 229, 229));
        XoaKhach.setText("XÓA");
        XoaKhach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        XoaKhach.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        XoaKhach.setkEndColor(new java.awt.Color(255, 255, 255));
        XoaKhach.setkHoverEndColor(new java.awt.Color(102, 102, 0));
        XoaKhach.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        XoaKhach.setkHoverStartColor(new java.awt.Color(0, 153, 204));
        XoaKhach.setkSelectedColor(new java.awt.Color(31, 136, 203));
        XoaKhach.setkStartColor(new java.awt.Color(102, 102, 102));
        XoaKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaKhachActionPerformed(evt);
            }
        });
        khachhang.add(XoaKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 200, 70));

        LuuKhach.setBackground(new java.awt.Color(229, 229, 229));
        LuuKhach.setForeground(new java.awt.Color(229, 229, 229));
        LuuKhach.setText("LƯU");
        LuuKhach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LuuKhach.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        LuuKhach.setkEndColor(new java.awt.Color(102, 102, 102));
        LuuKhach.setkHoverEndColor(new java.awt.Color(102, 102, 0));
        LuuKhach.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        LuuKhach.setkHoverStartColor(new java.awt.Color(0, 153, 204));
        LuuKhach.setkSelectedColor(new java.awt.Color(31, 136, 203));
        LuuKhach.setkStartColor(new java.awt.Color(102, 102, 102));
        LuuKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuKhachActionPerformed(evt);
            }
        });
        khachhang.add(LuuKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 200, 70));

        thongbaokhach.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khachhang.add(thongbaokhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Lưu ý : Khi Nhập Thông Tin Khách Mã Phòng Cứ Để Trống Khi Thuê Phòng Thì Sẽ Tự Động Thêm Mã Phòng Vào");
        khachhang.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 810, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel31.setText("Email");
        khachhang.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 40, 50));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel62.setText("Địa Chỉ");
        khachhang.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 60, 30));

        quanly.add(khachhang, "card7");

        nhanvien.setBackground(new java.awt.Color(229, 229, 229));
        nhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableNhanVien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài Khoản", "Hoạt Động", "Tên", "Phái", "Ngày Sinh", "Địa Chỉ", "SĐT", "Email", "Bộ Phận"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableNhanVien.setFocusable(false);
        TableNhanVien.setGridColor(new java.awt.Color(204, 204, 204));
        TableNhanVien.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableNhanVien.setRowHeight(25);
        TableNhanVien.setSelectionBackground(new java.awt.Color(153, 153, 153));
        TableNhanVien.setShowVerticalLines(false);
        TableNhanVien.getTableHeader().setReorderingAllowed(false);
        TableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableNhanVienMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(TableNhanVien);

        nhanvien.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1230, 283));

        diachi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 250, 50));

        email.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 250, 50));

        sdt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 250, 50));

        phai.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        phai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        nhanvien.add(phai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, 50));

        tenbp.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(tenbp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 250, 50));

        ngaysinh.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 250, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Tên");
        nhanvien.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 30, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Phái");
        nhanvien.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Ngày Sinh");
        nhanvien.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 80, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Hoạt Động");
        nhanvien.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 80, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("SĐT");
        nhanvien.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 30, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("Email");
        nhanvien.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 40, 50));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Tài Khoản");
        nhanvien.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 80, 50));

        tenNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(tenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 250, 50));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("Bộ Phận");
        nhanvien.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 60, 50));

        isActive.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(isActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 250, 50));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Địa Chỉ");
        nhanvien.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 60, 30));

        username.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nhanvien.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 250, 50));

        SuaTT.setText("LƯU");
        SuaTT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SuaTT.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        SuaTT.setkEndColor(new java.awt.Color(102, 102, 102));
        SuaTT.setkHoverEndColor(new java.awt.Color(102, 102, 0));
        SuaTT.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        SuaTT.setkHoverStartColor(new java.awt.Color(0, 153, 204));
        SuaTT.setkSelectedColor(new java.awt.Color(0, 153, 255));
        SuaTT.setkStartColor(new java.awt.Color(102, 102, 102));
        SuaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaTTActionPerformed(evt);
            }
        });
        nhanvien.add(SuaTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 140, 60));

        thongbao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thongbao.setForeground(new java.awt.Color(255, 255, 255));
        nhanvien.add(thongbao, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 250, 30));

        quanly.add(nhanvien, "card8");

        jPanel1.add(quanly, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 1260, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dangxuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangxuatMousePressed
        Login a=new Login();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_dangxuatMousePressed

    private void btnHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOMEActionPerformed
      this.btnHOME.setSelected(true);
      this.btnTHUEPHONG.setSelected(false);
      this.btnDICHVU.setSelected(false);
      this.btnHOADON.setSelected(false);
    
      this.btnKHACHHANG.setSelected(false);
  
      datphong.setVisible(true);
      thuephong.setVisible(false);
      dichvu.setVisible(false);
      hoadon.setVisible(false);
      thongke.setVisible(false);
      khachhang.setVisible(false);
      nhanvien.setVisible(false);
      cmndkdat.setModel(new DefaultComboBoxModel());
      dathp.setModel(new DefaultComboBoxModel());
      datphongtrong.setModel(new DefaultComboBoxModel());
      this.loadComboBoxKhachDat();
      this.loadComboBoxdathp();
      this.loadComboBoxPhongHP();
      this.layCTPD();
      this.layPD();
      
    }//GEN-LAST:event_btnHOMEActionPerformed

    private void btnTHUEPHONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHUEPHONGActionPerformed
      this.btnHOME.setSelected(false);
      this.btnTHUEPHONG.setSelected(true);
      this.btnDICHVU.setSelected(false);
      this.btnHOADON.setSelected(false);
     
      this.btnKHACHHANG.setSelected(false);
    
      datphong.setVisible(false);
      thuephong.setVisible(true);
      dichvu.setVisible(false);
      hoadon.setVisible(false);
      thongke.setVisible(false);
      khachhang.setVisible(false);
      nhanvien.setVisible(false);
      String ID=Login.taikhoan.getText();
      nvthue.setText(ID);
      cmndkthue.setModel(new DefaultComboBoxModel());
      phongcon.setModel(new DefaultComboBoxModel());
      khuyenmai.setModel(new DefaultComboBoxModel());
      this.loadComboBoxKhachThue();
      this.loadComboBoxPhongCon();
      this.loadComboBoxKhuyenMai();
      this.layCTPT();
      this.layPT();
    }//GEN-LAST:event_btnTHUEPHONGActionPerformed

    private void btnDICHVUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDICHVUActionPerformed
       this.btnHOME.setSelected(false);
      this.btnTHUEPHONG.setSelected(false);
      this.btnDICHVU.setSelected(true);
      this.btnHOADON.setSelected(false);
     
      this.btnKHACHHANG.setSelected(false);
     
      datphong.setVisible(false);
      thuephong.setVisible(false);
      dichvu.setVisible(true);
      hoadon.setVisible(false);
      thongke.setVisible(false);
      khachhang.setVisible(false);
      nhanvien.setVisible(false);
      phieuthuedv.setModel(new DefaultComboBoxModel());
      phongdv.setModel(new DefaultComboBoxModel());
      dvctdv.setModel(new DefaultComboBoxModel());
      this.loadComboBoxPhongDV();
     this.loadPhieuThueDV();
      this.loadComboBoxDV();
      this.layDV();
      this.layCTDV();
    }//GEN-LAST:event_btnDICHVUActionPerformed

    private void btnHOADONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOADONActionPerformed
        this.btnHOME.setSelected(false);
      this.btnTHUEPHONG.setSelected(false);
      this.btnDICHVU.setSelected(false);
      this.btnHOADON.setSelected(true);
    
      this.btnKHACHHANG.setSelected(false);
      
       datphong.setVisible(false);
      thuephong.setVisible(false);
      dichvu.setVisible(false);
      hoadon.setVisible(true);
      thongke.setVisible(false);
      khachhang.setVisible(false);
      nhanvien.setVisible(false);
      String ID=Login.taikhoan.getText();
      nvhd.setText(ID);
      this.layTienPhong();
      this.layHD();
      this.layCTHD();
     mapthd.setModel(new DefaultComboBoxModel());
      this.loadComboBoxHD();
      
    }//GEN-LAST:event_btnHOADONActionPerformed

    private void btnKHACHHANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKHACHHANGActionPerformed
      this.btnHOME.setSelected(false);
      this.btnTHUEPHONG.setSelected(false);
      this.btnDICHVU.setSelected(false);
      this.btnHOADON.setSelected(false);
     
      this.btnKHACHHANG.setSelected(true);
    
      datphong.setVisible(false);
      thuephong.setVisible(false);
      dichvu.setVisible(false);
      hoadon.setVisible(false);
      thongke.setVisible(false);
      khachhang.setVisible(true);
      nhanvien.setVisible(false);
        this.layKhach();
    }//GEN-LAST:event_btnKHACHHANGActionPerformed

    private void TableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNhanVienMouseClicked

        
    }//GEN-LAST:event_TableNhanVienMouseClicked

    private void TableNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNhanVienMousePressed
       
        dtm = (DefaultTableModel) TableNhanVien.getModel(); 
        int i = TableNhanVien.getSelectedRow();
        username.setText(dtm.getValueAt(i, 0).toString());
       isActive.setText(dtm.getValueAt(i, 1).toString());
        tenNV.setText(dtm.getValueAt(i, 2).toString()); 
        phai.setSelectedItem(dtm.getValueAt(i, 3).toString()); 
        diachi.setText(dtm.getValueAt(i,5).toString());
        sdt.setText(dtm.getValueAt(i, 6).toString());
        email.setText(dtm.getValueAt(i, 7).toString());
        tenbp.setSelectedItem(dtm.getValueAt(i, 8).toString());
    try {
        
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)dtm.getValueAt(i, 4));
        ngaysinh.setDate(date);
    } 
    catch (ParseException ex) {
        Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_TableNhanVienMousePressed

    private void SuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaTTActionPerformed

        String ID=username.getText();
        String HD=isActive.getText();
        String TEN=tenNV.getText(); 
        String SDT=sdt.getText();
        String EMAIL=email.getText();
        String DIACHI=diachi.getText();
        String regex="\\w+@\\w+\\.\\w+";   
        String pattern="0[0-9]{9}";
        int temp0=0,temp1=0,temp2=0,temp3=0,temp4=0,temp5=0;
         if(TEN.equals("")){
            temp0=1;
             thongbao.setForeground(Color.RED);
             thongbao.setText("Tên Không Được Bỏ Trống ");
        }
        else if(DIACHI.equals("")){
            temp1=1;
            thongbao.setForeground(Color.RED);
             thongbao.setText("Địa Chỉ Không Được Bỏ Trống ");
        }

        else if(SDT.equals("")){
            temp2=1;
             thongbao.setForeground(Color.RED);
             thongbao.setText("SĐT Không Được Bỏ Trống ");
        }
        else if(!SDT.matches(pattern)){
            temp3=1;
            thongbao.setForeground(Color.RED);
             thongbao.setText("SĐT Không Được Hợp Lệ ");
        }
        else if(EMAIL.equals("")  ){
            temp4=1;
             thongbao.setForeground(Color.RED);
             thongbao.setText("Email Không Hợp Lệ ");
        }
        else if(!EMAIL.matches(regex)){
            temp5=1;
             thongbao.setForeground(Color.RED);
             thongbao.setText("Email Không Đúng ");
        }
        else if(temp0!=1 &&temp1!=1 &&temp2!=1 &&temp3!=1 &&temp4!=1 &&temp5!=1  ){
                Luu(ID);
                thongbao.setForeground(Color.BLUE);
                thongbao.setText("Sửa Thành Công");
                this.layNV();
        }
    
    }//GEN-LAST:event_SuaTTActionPerformed

    private void TableKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKhachHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableKhachHangMouseClicked

    private void TableKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKhachHangMousePressed
          dtm = (DefaultTableModel) TableKhachHang.getModel(); 
        int i = TableKhachHang.getSelectedRow();
        cmnd.setText(dtm.getValueAt(i, 0).toString());
       tenkhach.setText(dtm.getValueAt(i, 1).toString());
        diachikhach.setText(dtm.getValueAt(i, 2).toString()); 
         sdtkhach.setText(dtm.getValueAt(i, 3).toString());
        emailkhach.setText(dtm.getValueAt(i,4).toString());
      
        
        
  
    }//GEN-LAST:event_TableKhachHangMousePressed
private void Luu(String CMND,String TEN,String DIACHI,String SDT,String EMAIL,String MAPHONG) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into KHACH values (?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, CMND);
            ps.setString(2, TEN);
            ps.setString(3, DIACHI);
            ps.setString(4, SDT);
            ps.setString(5, EMAIL);
            ps.setString(6, MAPHONG);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void LuuHD(String MAHD,String MAPT,String MANV,String NGAYLAP,String TIENPHONG,String TIENDV,String TIENNHAN) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into HOADON values (?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MAHD);
            ps.setString(2, MAPT);
            ps.setString(3, MANV);
            ps.setString(4, NGAYLAP);
            ps.setString(5, TIENPHONG);
            ps.setString(6, TIENDV);
            ps.setString(7, TIENNHAN);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


private void LuuDV(String MADV,String TENDV,String DONGIA) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into DICHVU values (?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MADV);
            ps.setString(2, TENDV);
            ps.setString(3, DONGIA);  
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void LuuCTDV(String MAPT,String MAPHONG,String MADV,String SL) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into CTPDV values (?,?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MAPT);
            ps.setString(2, MAPHONG);
            ps.setString(3, MADV);
            ps.setString(4, SL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void ThemKhachDat(String MPD,String CMNDKDAT,String NGAYBD,String NGAYKT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into PHIEUDAT values (?,?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPD);
            ps.setString(2, CMNDKDAT);
            ps.setString(3, NGAYBD);
            ps.setString(4, NGAYKT);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void ThemKhachThue(String MPD,String CMNDKTHUE,String NV,String NGAYDEN,String DATT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into PHIEUTHUE values (?,?,?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPD);
            ps.setString(2, CMNDKTHUE);
            ps.setString(3, NV);
            ps.setString(4, NGAYDEN);
            ps.setString(5, DATT);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void ThemCTPD(String MPD,String MHP,String SL) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into CTPD values (?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPD);
            ps.setString(2, MHP);
            ps.setString(3, SL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void ThemCTPT(String MPT,String SP,String KM) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "insert into CTPT values (?,?,?) ";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPT);
            ps.setString(2, SP);
            ps.setString(3, KM);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private int kiemTraCMND(String CMND) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from KHACH where CMND ='" + CMND + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraCMNDKDAT(String CMND) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from PHIEUDAT where CMND ='" + CMND + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraCMNDKTHUE(String CMND) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from PHIEUTHUE where CMND ='" + CMND + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraEmail(String Email) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from KHACH where email ='" + Email + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraSDT(String SDT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from KHACH where sdt ='" + SDT + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraCTPD(String MPD) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from CTPD where maPD ='" + MPD + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraPD(String MPD) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from PHIEUDAT where maPD ='" + MPD + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraPT(String MPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from PHIEUTHUE where maPT ='" + MPT + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraCTPT(String MPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from CTPT where maPT ='" + MPT + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraMDV(String MDV) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from DICHVU where maDV ='" + MDV + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }

private int kiemTraCTDV(String MDV) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from CTPDV where maDV ='" + MDV + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraHD(String MHD) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
        String sql = "select * from HOADON where maHD ='" + MHD + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
private int kiemTraMPTHD(String MPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        int tonTai = 0;
         String MAPTHD=(String)mapthd.getSelectedItem();
        String sql = "select * from HOADON where maHD ='" + MAPTHD + "'";
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
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return tonTai;
    }
   private void xoaKhach(String CMND) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from KHACH where CMND = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, CMND);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      private void xoaPD(String MPD) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from PHIEUDAT where maPD = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void xoaCTPD(String MPD) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from CTPD where maPD = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void xoaPT(String MPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from PHIEUTHUE where maPT = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPT);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   private void xoaCTPT(String MPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from CTPT where maPT = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MPT);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
      private void xoaDV(String MADV) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String sql = "delete from DICHVU where maDV = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MADV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void XoaKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaKhachActionPerformed
        String CMND =cmnd.getText();
        int check;
        int kiemTraCMND = 0;  
        if (CMND.equals("")) {
            kiemTraCMND = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập CMND của Khách bạn muốn xóa");
        }
        else if (kiemTraCMND != 1) {
            check = kiemTraCMND(CMND);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaKhach(CMND);
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    this.layKhach();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "CMND chưa có, bạn hãy thêm thông tin CMND vào hệ thống");
            }
        }
    }//GEN-LAST:event_XoaKhachActionPerformed

    private void LuuKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuKhachActionPerformed
        String CMND=cmnd.getText();
        String TEN=tenkhach.getText();
        String SDT=sdtkhach.getText();
        String EMAIL=emailkhach.getText();
        String DIACHI=diachikhach.getText();
      
        int check=kiemTraCMND(CMND);
        int checkemail=kiemTraEmail(EMAIL);
        int checksdt=kiemTraSDT(SDT);
        String regex="\\w+@\\w+\\.\\w+"; 
        String pattern="0[0-9]{9}";
        int temp0=0,temp1=0,temp2=0,temp3=0,temp4=0,temp5=0;
        if(CMND.equals("")){
                temp0=1;
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("CMND Không Được Bỏ Trống ");
        }
        else if(TEN.equals("")){
            temp1=1;
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("Tên Không Được Bỏ Trống ");
        }
        else if(DIACHI.equals("")){
            temp2=1;
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("Địa Chỉ Không Được Bỏ Trống ");
        }
        else if(SDT.equals("")){
            temp3=1;
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("SĐT Không Được Bỏ Trống ");
        }
        else if(!SDT.matches(pattern)){
            thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("SĐT Không Được Hợp Lệ ");
        }
        else if(EMAIL.equals("")){
            temp4=1;
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("EMAIL Không Được Bỏ Trống ");
        }
        else if(!EMAIL.matches(regex)){
            temp5=1;
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("EMAIL Không Được Hợp Lệ");
        }
        else if(temp0!=1 &&temp1!=1 &&temp2!=1 &&temp3!=1&& temp4!=1&& temp5!=1 ){         
    
              if(check==1 ){
             SuaKhach(CMND);
             thongbaokhach.setForeground(Color.BLUE);
             thongbaokhach.setText("Sửa Thành Công ");
              this.layKhach();
            }
              else if (checkemail==1&&checksdt==1){
            SuaCMND(SDT,EMAIL);
             thongbaokhach.setForeground(Color.BLUE);
             thongbaokhach.setText("Sửa CMND Thành Công ");
             this.layKhach();
              }
            else if (checkemail==1){
             thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("Email Đã Có Người Sử Dụng ");
            }
            else if (checksdt==1){
              thongbaokhach.setForeground(Color.RED);
             thongbaokhach.setText("SĐT Đã Có Người Sử Dụng ");
            }
           
            else{
            
         
             Luu(CMND,  TEN, DIACHI ,SDT , EMAIL,null);
             thongbaokhach.setForeground(Color.BLUE);
             thongbaokhach.setText("Thành Công ");
                this.layKhach();
            }

        }
    }//GEN-LAST:event_LuuKhachActionPerformed

    private void inhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inhoadonActionPerformed
    try {
        TruDate();
    } catch (ParseException ex) {
        Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    UpdatePT((String)mapthd.getSelectedItem());
    mapthd.setModel(new DefaultComboBoxModel());
    loadComboBoxHD();
    UpdateHD(mahoadon.getText());
    
    layHD();
   
    }//GEN-LAST:event_inhoadonActionPerformed
           private void UpdateHD(String HD) {
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "update HOADON set tienphong='"+tienphongafter.getText()+"',tiendv='"+tienDV.getText()+"',tiennhan='"+tongtiencthd.getText()+"' where maHD='"+HD+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            private void UpdatePT(String MPT) {
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "update PHIEUTHUE set isPay='1' where maPT='"+MPT+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    
    public void TruDate() throws ParseException {
  
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    Date firstDate = sdf.parse(ngaydenhd.getText());
    Date secondDate = sdf.parse(ngaydihd.getText());
 
    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    if(diff==0){
        diff=1;
    }
    double KM=Double.parseDouble(KhuyenMai.getText());
    if(KM==0){
        KM=1;
    }
    else{
        KM=KM*0.01;
    }
    tongTienPhong=tongTienPhong*(int)diff;
    String TTP=String.valueOf(tongTienPhong);
    TienPhong.setText(TTP);
    
    tongTienPhong=(int)(tongTienPhong-((double)tongTienPhong*KM));
    String TTAF=String.valueOf(tongTienPhong);
    tienphongafter.setText(TTAF);
    tongTien= (tongTienPhong+tongTienDV);
  
    String TT=String.valueOf(tongTien);
    tongtiencthd.setText(TT);
    String temp=String.valueOf(diff);
    ngayo.setText(temp);
    
}
    private void TablePhieuDatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePhieuDatMousePressed
        dtm = (DefaultTableModel) TablePhieuDat.getModel(); 
        int i = TablePhieuDat.getSelectedRow();
        maphieudat.setText(dtm.getValueAt(i, 0).toString());
       cmndkdat.setSelectedItem(dtm.getValueAt(i, 1).toString());
       try {
        Date datebd = new SimpleDateFormat("yyyy-MM-dd").parse((String)dtm.getValueAt(i, 2));
        Date datekt = new SimpleDateFormat("yyyy-MM-dd").parse((String)dtm.getValueAt(i, 3));
        ngaybd.setDate(datebd);
        ngaykt.setDate(datekt);
    } 
    catch (ParseException ex) {
        Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_TablePhieuDatMousePressed

    private void TablePhieuDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePhieuDatMouseClicked
        
    }//GEN-LAST:event_TablePhieuDatMouseClicked

    private void TableCTPDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCTPDMousePressed
         dtm = (DefaultTableModel) TableCTPD.getModel(); 
        int i = TableCTPD.getSelectedRow();
        maphieudat.setText(dtm.getValueAt(i, 0).toString());       
        dathp.setSelectedItem(dtm.getValueAt(i, 1).toString());
        sldat.setText(dtm.getValueAt(i,2).toString());
    }//GEN-LAST:event_TableCTPDMousePressed

    private void dathpPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_dathpPopupMenuWillBecomeInvisible
        datphongtrong.setModel(new DefaultComboBoxModel());
        loadComboBoxPhongHP();
    }//GEN-LAST:event_dathpPopupMenuWillBecomeInvisible

    private void dathpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dathpItemStateChanged
            Connection ketNoi = AppQLKS.layKetNoi();
        String sql="SELECT * FROM HANGPHONG WHERE maHP=?";
       try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1,(String)this.dathp.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.datloai.setText(rs.getString("loai"));
                this.kieudat.setText(rs.getString("kieu"));
            }
            rs.close();
            ps.close();
           
        }
        catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_dathpItemStateChanged

    private void khuyenmaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_khuyenmaiItemStateChanged
    
    }//GEN-LAST:event_khuyenmaiItemStateChanged

    private void khuyenmaiPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_khuyenmaiPopupMenuWillBecomeInvisible
      
    }//GEN-LAST:event_khuyenmaiPopupMenuWillBecomeInvisible

    private void cmndkthueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmndkthueItemStateChanged
      
    }//GEN-LAST:event_cmndkthueItemStateChanged

    private void cmndkthuePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmndkthuePopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_cmndkthuePopupMenuWillBecomeInvisible

    private void phongconItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_phongconItemStateChanged
         Connection ketNoi = AppQLKS.layKetNoi();
        String sql="select distinct mahP from PHONG where maphong=?";
       try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1,(String)this.phongcon.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.hangphongthue.setText(rs.getString("maHP"));
               
            }
            rs.close();
            ps.close();
           
        }
        catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_phongconItemStateChanged

    private void phongconPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_phongconPopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_phongconPopupMenuWillBecomeInvisible

    private void TablePTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePTMousePressed
        dtm = (DefaultTableModel) TablePT.getModel(); 
        int i = TablePT.getSelectedRow();
        maphieuthue.setText(dtm.getValueAt(i, 0).toString());       
        cmndkthue.setSelectedItem(dtm.getValueAt(i, 1).toString());
  
        thanhtoan.setText(dtm.getValueAt(i,4).toString());
        try {
        Date datebd = new SimpleDateFormat("yyyy-MM-dd").parse((String)dtm.getValueAt(i, 3));
        ngaybdt.setDate(datebd);
    } 
    catch (ParseException ex) {
        Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_TablePTMousePressed

    private void TableCTPTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCTPTMousePressed
       dtm = (DefaultTableModel) TableCTPT.getModel(); 
        int i = TableCTPT.getSelectedRow();
        maphieuthue.setText(dtm.getValueAt(i, 0).toString());       
        phongcon.setSelectedItem(dtm.getValueAt(i, 1).toString());
        khuyenmai.setSelectedItem(dtm.getValueAt(i, 2).toString());
        
    }//GEN-LAST:event_TableCTPTMousePressed

    private void TablePhongTrongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePhongTrongMousePressed
    
    }//GEN-LAST:event_TablePhongTrongMousePressed

    private void TableTrongPDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTrongPDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableTrongPDMousePressed

    private void cmndkdatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmndkdatItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmndkdatItemStateChanged

    private void cmndkdatPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmndkdatPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmndkdatPopupMenuWillBecomeInvisible

    private void luuphieudatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuphieudatActionPerformed
        String MPD=maphieudat.getText();
        String CMNDKDAT=(String)cmndkdat.getSelectedItem();
        String DPT=(String)datphongtrong.getSelectedItem();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String NGAYBD=df.format(ngaybd.getDate());
        String NGAYKT=df.format(ngaykt.getDate());
        int check=kiemTraCMNDKDAT(CMNDKDAT);
        int temp0=0;
        if(MPD.equals("")){
             temp0=1;
             thongbaodatphong.setForeground(Color.RED);
             thongbaodatphong.setText("MPD Không Được Bỏ Trống ");
        }
        else if(temp0!=1  ){              
             if(check==1 ){
             thongbaodatphong.setForeground(Color.RED);
             thongbaodatphong.setText("Khách Này Đã Đặt Phòng "); 
            }    
            else{
                 
             ThemKhachDat(MPD,CMNDKDAT,NGAYBD,NGAYKT);
             thongbaodatphong.setForeground(Color.BLUE);
             thongbaodatphong.setText("Thành Công ");
                this.layPD();
            }

        }  
    }//GEN-LAST:event_luuphieudatActionPerformed

    private void chuyenctpdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chuyenctpdMousePressed
            String MPD=maphieudat.getText();
        String HP=(String)dathp.getSelectedItem();
        String DPT=(String)datphongtrong.getSelectedItem();
         String SL=sldat.getText();
        int temp0=0,temp1=0;
        if(MPD.equals("")){
             temp0=1;
             thongbaodatphong.setForeground(Color.RED);
             thongbaodatphong.setText("MPD Không Được Bỏ Trống ");
        }
        else if(SL.equals("")){
            temp1=1;
             thongbaodatphong.setForeground(Color.RED);
             thongbaodatphong.setText("Số Lượng Không Được Bỏ Trống ");
        }
        else if(temp0!=1 &&temp1!=1 ){  
            SuaTrangThai(DPT);
            ThemCTPD(MPD,HP,SL);
             thongbaodatphong.setForeground(Color.BLUE);
             thongbaodatphong.setText("Thành Công ");
                this.layCTPD();
                this.layPhongTrong();
        }  
                              
    }//GEN-LAST:event_chuyenctpdMousePressed
 
    private void xoapdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoapdActionPerformed
       String MPD =maphieudat.getText();
        int check;
        int kiemTra = 0; 
        if (MPD.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập MPD của Khách bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraPD(MPD);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaPD(MPD);
                    JOptionPane.showMessageDialog(this, "Xóa  thành công");
                    this.layPD();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "MPD chưa có, bạn hãy thêm thông tin CMND vào hệ thống");
            }
        }
       
    }//GEN-LAST:event_xoapdActionPerformed

    private void xoactpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoactpdActionPerformed
     String MPD =maphieudat.getText();
        int check;
        int kiemTra = 0; 
        if (MPD.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập MPD của Khách bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraCTPD(MPD);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaCTPD(MPD);
                    JOptionPane.showMessageDialog(this, "Xóa  thành công");
                    this.layCTPD();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "MPD chưa có, bạn hãy thêm thông tin CMND vào hệ thống");
            }
        }
    }//GEN-LAST:event_xoactpdActionPerformed

    private void luuphieuthueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuphieuthueActionPerformed
        
        String MPT=maphieuthue.getText();
        String CMNDKTHUE=(String)cmndkthue.getSelectedItem();
        String ID=Login.taikhoan.getText();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String NGAYBDT=df.format(ngaybdt.getDate());
        String DATT=thanhtoan.getText();
        int check=kiemTraCMNDKTHUE(CMNDKTHUE);
        int checkMPT=kiemTraPT(MPT);
        int temp0=0;
        if(MPT.equals("")){
             temp0=1;
             thongbaophieuthue.setForeground(Color.RED);
             thongbaophieuthue.setText("MPT Không Được Bỏ Trống ");
        }
        else if(checkMPT==1){
                thongbaophieuthue.setForeground(Color.RED);
             thongbaophieuthue.setText("MPT đã có người sử dụng "); 
       }  
        else if(temp0!=1  ){              
             if(check==1 ){
             thongbaophieuthue.setForeground(Color.RED);
             thongbaophieuthue.setText("Khách Này Đã Thuê Phòng "); 
            }
       else if (!nvthue.getText().equalsIgnoreCase(ID)){
             thongbaophieuthue.setForeground(Color.RED);
             thongbaophieuthue.setText("Bạn Không Phải Nhân Viên Này "); 
       }
      
       else{
             
             ThemKhachThue(MPT,CMNDKTHUE,ID,NGAYBDT,DATT);
            
             thongbaophieuthue.setForeground(Color.BLUE);
             thongbaophieuthue.setText("Thành Công ");
                this.layPT();
            }

        }  
    }//GEN-LAST:event_luuphieuthueActionPerformed

    private void xoactptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoactptActionPerformed
        String MPT =maphieuthue.getText();
        int check;
        int kiemTra = 0; 
        if (MPT.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập MPT của Khách bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraCTPT(MPT);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaCTPT(MPT);
                    JOptionPane.showMessageDialog(this, "Xóa  thành công");
                    this.layCTPT();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "MPD chưa có, bạn hãy thêm thông tin CMND vào hệ thống");
            }
        }
    }//GEN-LAST:event_xoactptActionPerformed

    private void xoaptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaptActionPerformed
         String MPT =maphieuthue.getText();
        int check;
        int kiemTra = 0; 
        if (MPT.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập MPT của Khách bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraPT(MPT);
            if (check == 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaPT(MPT);
                    JOptionPane.showMessageDialog(this, "Xóa  thành công");
                    this.layPT();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "MPD chưa có, bạn hãy thêm thông tin CMND vào hệ thống");
            }
        }
    }//GEN-LAST:event_xoaptActionPerformed

    private void datphongtrongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_datphongtrongItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_datphongtrongItemStateChanged

    private void datphongtrongPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_datphongtrongPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_datphongtrongPopupMenuWillBecomeInvisible

    private void chuyenctptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chuyenctptMousePressed
        String MPT=maphieuthue.getText();
        String PC=(String)phongcon.getSelectedItem();
        String KM=(String)khuyenmai.getSelectedItem();
        String CMNDKTHUE=(String)cmndkthue.getSelectedItem();
        int temp0=0,temp1=0;
        if(MPT.equals("")){
             temp0=1;
             thongbaophieuthue.setForeground(Color.RED);
             thongbaophieuthue.setText("MPT Không Được Bỏ Trống ");
        }
        else if(temp0!=1 &&temp1!=1 ){  
            SuaTrangThai(PC);
            ThemCTPT(MPT,PC,KM);
            ThemPhongVoKhach(CMNDKTHUE);
             phongcon.setModel(new DefaultComboBoxModel());
             this.loadComboBoxPhongCon();
            
             thongbaophieuthue.setForeground(Color.BLUE);
             thongbaophieuthue.setText("Thành Công ");
                this.layCTPT();
                this.layPhongTrong();
                this.layKhach();
        }  
    }//GEN-LAST:event_chuyenctptMousePressed

    private void phongdvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_phongdvItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_phongdvItemStateChanged

    private void phongdvPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_phongdvPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_phongdvPopupMenuWillBecomeInvisible

    private void phieuthuedvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_phieuthuedvItemStateChanged
        phongdv.setModel(new DefaultComboBoxModel());  
        loadComboBoxPhongDV();
    }//GEN-LAST:event_phieuthuedvItemStateChanged

    private void phieuthuedvPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_phieuthuedvPopupMenuWillBecomeInvisible
      
    }//GEN-LAST:event_phieuthuedvPopupMenuWillBecomeInvisible

    private void dvctdvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dvctdvItemStateChanged
      
    }//GEN-LAST:event_dvctdvItemStateChanged

    private void dvctdvPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_dvctdvPopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_dvctdvPopupMenuWillBecomeInvisible

    private void TableDVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDVMousePressed
        dtm = (DefaultTableModel) TableDV.getModel(); 
        int i = TableDV.getSelectedRow();
        madv.setText(dtm.getValueAt(i, 0).toString());       
        tendv.setText(dtm.getValueAt(i,1).toString());
        dongia.setText(dtm.getValueAt(i,2).toString());
    }//GEN-LAST:event_TableDVMousePressed

    private void TableCTPDVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCTPDVMousePressed
        dtm = (DefaultTableModel) TableCTPDV.getModel(); 
        int i = TableCTPDV.getSelectedRow();
        phieuthuedv.setSelectedItem(dtm.getValueAt(i, 0).toString());
        phongdv.setSelectedItem(dtm.getValueAt(i, 1).toString());
        dvctdv.setSelectedItem(dtm.getValueAt(i, 2).toString());
        sldv.setText(dtm.getValueAt(i,3).toString());
        
    }//GEN-LAST:event_TableCTPDVMousePressed

    private void luudvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luudvActionPerformed
        String MADV=madv.getText();
        String TENDV=tendv.getText();
        String DONGIA=dongia.getText();
        int check=kiemTraMDV(MADV);
        int temp0=0,temp1=0,temp2=0;
        if(MADV.equals("")){
                temp0=1;
             thongbaodichvu.setForeground(Color.RED);
             thongbaodichvu.setText("Mã DV Không Được Bỏ Trống ");
        }
        else if(TENDV.equals("")){
            temp1=1;
             thongbaodichvu.setForeground(Color.RED);
             thongbaodichvu.setText("Tên DV Không Được Bỏ Trống ");
        }
        else if(dongia.equals("")){
            temp2=1;
             thongbaodichvu.setForeground(Color.RED);
             thongbaodichvu.setText("Tiền Không Được Bỏ Trống ");
        }
        else if(temp0!=1 &&temp1!=1 &&temp2!=1  ){         
              if(check==1 ){
             SuaDV(MADV);
             thongbaodichvu.setForeground(Color.BLUE);
             thongbaodichvu.setText("Sửa Thành Công ");
              this.layDV();
            }
            else{
                
             LuuDV(MADV,  TENDV, DONGIA );
             thongbaodichvu.setForeground(Color.BLUE);
             thongbaodichvu.setText("Thành Công ");
                dvctdv.setModel(new DefaultComboBoxModel());  
                  this.loadComboBoxDV();
                this.layDV();
            }

        }        
    }//GEN-LAST:event_luudvActionPerformed

    private void luuctdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuctdvActionPerformed
        String MADV=(String)phieuthuedv.getSelectedItem();
        String PHONGDV=(String)phongdv.getSelectedItem();
        String DVCTDV=(String)dvctdv.getSelectedItem();
        String SLDV=sldv.getText();
        int check=kiemTraCTDV(MADV);
        int temp0=0;
         if(sldv.equals("")){
            temp0=1;
            thongbaodichvu.setForeground(Color.RED);
            thongbaodichvu.setText("Số Lượng Không Được Bỏ Trống ");
        }
        else if(temp0!=1  ){         
             if(check==1 ){
             SuaDV(MADV);
             thongbaodichvu.setForeground(Color.BLUE);
             thongbaodichvu.setText("Sửa Thành Công ");
              this.layDV();
            }
            else{
                
             LuuCTDV(MADV,  PHONGDV, DVCTDV ,SLDV);
             thongbaodichvu.setForeground(Color.BLUE);
             thongbaodichvu.setText("Thành Công ");
                dvctdv.setModel(new DefaultComboBoxModel());  
                  this.loadComboBoxDV();
                this.layCTDV();
                this.layCTHD();
            }

        }        
    }//GEN-LAST:event_luuctdvActionPerformed

    private void xoadvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoadvActionPerformed
        String MADV =madv.getText();
        int check;
        int kiemTra = 0; 
        if (MADV.equals("")) {
            kiemTra = 1;
            JOptionPane.showMessageDialog(this, "Hãy nhập MÃ DV  bạn muốn xóa");
        }
        else if (kiemTra != 1) {
            check = kiemTraCTDV(MADV);
            if (check != 1) {

                int ret = JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Muốn Xóa?", "Xác Nhận", 0);
                if(ret == JOptionPane.CANCEL_OPTION)
                return;
                else  if(ret == JOptionPane.OK_OPTION)
                {
                    xoaDV(MADV);
                    JOptionPane.showMessageDialog(this, "Xóa sách thành công");
                    this.layDV();

                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Mã DV đang sử dụng hoặc không có");
            }
        }
    }//GEN-LAST:event_xoadvActionPerformed

    private void TableHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHDMousePressed
        dtm = (DefaultTableModel) TableHD.getModel(); 
        int i = TableHD.getSelectedRow();
        mahoadon.setText(dtm.getValueAt(i, 0).toString());       
        mapthd.setSelectedItem(dtm.getValueAt(i, 1).toString());
        nvhd.setText(dtm.getValueAt(i,2).toString());
        ngaydihd.setText(dtm.getValueAt(i, 3).toString());  
        tienphongafter.setText(dtm.getValueAt(i, 4).toString());  
        tienDV.setText(dtm.getValueAt(i, 5).toString());
        tongtiencthd.setText(dtm.getValueAt(i, 6).toString());
        try {
            Date datebd = new SimpleDateFormat("yyyy-MM-dd").parse((String)dtm.getValueAt(i, 3));
            Date datekt = new SimpleDateFormat("yyyy-MM-dd").parse((String)dtm.getValueAt(i, 3));
            ngaylaphd.setDate(datebd);      
                 
         } 
        catch (ParseException ex) {
        Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_TableHDMousePressed

    private void mapthdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mapthdItemStateChanged
        layTenKhach();
        layKM() ;
    }//GEN-LAST:event_mapthdItemStateChanged

    private void mapthdPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_mapthdPopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_mapthdPopupMenuWillBecomeInvisible

    private void LuuHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuHDActionPerformed
        String MHD=mahoadon.getText();
        String MAPTHD=(String)mapthd.getSelectedItem();
        String NVHD=nvhd.getText();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String NGAYLAPHD=df.format(ngaylaphd.getDate());
        String ID=Login.taikhoan.getText();
        int check=kiemTraHD(MHD);
        int checkMPTHD=kiemTraMPTHD(MAPTHD);
        int temp0=0;
        if(MHD.equals("")){
                temp0=1;
             thongbaohoadon.setForeground(Color.RED);
             thongbaohoadon.setText("Mã Hóa Đơn Không Được Bỏ Trống ");
        }
        else if (!nvhd.getText().equalsIgnoreCase(ID)){
             thongbaohoadon.setForeground(Color.RED);
             thongbaohoadon.setText("Bạn Không Phải Nhân Viên Này "); 
       }
      
        else if(temp0!=1  ){  
            if (checkMPTHD==1){
             thongbaohoadon.setForeground(Color.RED);
             thongbaohoadon.setText("MPT đã có rồi ");
            }
             else if(check==1 ){
             SuaHD(MHD);
             thongbaohoadon.setForeground(Color.BLUE);
             thongbaohoadon.setText("Sửa Thành Công ");
              this.layHD();
            }
       
            else{
             LuuHD(MHD,MAPTHD,  NVHD, NGAYLAPHD ,null , null,null);
             thongbaohoadon.setForeground(Color.BLUE);
             thongbaohoadon.setText("Thành Công ");
                this.layHD();
            }

        }
    }//GEN-LAST:event_LuuHDActionPerformed

    private void TableCTHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCTHDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableCTHDMousePressed

    private void TableTienPhongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTienPhongMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableTienPhongMousePressed

    private void ispayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ispayActionPerformed
        layPTisPay();
        layCTPTisPay();
    }//GEN-LAST:event_ispayActionPerformed

    private void isnotpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isnotpayActionPerformed
        layPT();
         layCTPT();
    }//GEN-LAST:event_isnotpayActionPerformed

    private void dvnotpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvnotpayActionPerformed
      
          layCTDV();
    }//GEN-LAST:event_dvnotpayActionPerformed

    private void dvispayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvispayActionPerformed
            layCTDVisPay();
    }//GEN-LAST:event_dvispayActionPerformed

    private void xemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemchitietActionPerformed
            layTienPhongxem();
            layCTHDxem();
            layKMxem();
            layTenKhachxem();
    }//GEN-LAST:event_xemchitietActionPerformed

    private void TableTKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTKMousePressed
        
    }//GEN-LAST:event_TableTKMousePressed

    
    private void xemthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemthongkeActionPerformed
        layTK();
    }//GEN-LAST:event_xemthongkeActionPerformed
      private void layTK() {
          tongTK=0;
        DefaultTableModel dtm = (DefaultTableModel) TableTK.getModel();
        dtm.setNumRows(0);
        Connection ketNoi = AppQLKS.layKetNoi();
       DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String NGAYBD=df.format(tungay.getDate());
        String NGAYKT=df.format(denngay.getDate());
        String sql = "SELECT * FROM hoadon WHERE ngaylap >= '"+NGAYBD+"' AND ngaylap < '"+NGAYKT+"' ";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("maHD"));
                vt.add(rs.getString("ngaylap"));
                vt.add(rs.getString("tiennhan"));
                tongTK = tongTK +Integer.parseInt(rs.getString("tiennhan"));  
                dtm.addRow(vt);
            }
            TableTK.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
            String TIENTK=String.valueOf(tongTK);
            tongdoanhthu.setText(TIENTK);
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    private void SuaKhach(String id) {
        Connection ketNoi = AppQLKS.layKetNoi();
        
        String sql = "update KHACH set ten=N'"+tenkhach.getText()+"',diachi='"+diachikhach.getText()+"',sdt='"+sdtkhach.getText()+"',email='"+emailkhach.getText()+"'where cmnd='"+cmnd.getText()+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
      private void SuaHD(String MHD) {
        Connection ketNoi = AppQLKS.layKetNoi();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String ns=df.format(ngaylaphd.getDate());
        String sql = "update HOADON set ngaylap='"+ns+"' where maHD='"+MHD+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
      
            private void ThemPhongVoKhach(String CMND) {
        Connection ketNoi = AppQLKS.layKetNoi();
        String MP=(String)phongcon.getSelectedItem();
        String sql = "update KHACH set maphong='"+MP+"'where cmnd='"+CMND+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           private void SuaCMND(String sdt,String email) {
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "update KHACH set cmnd='"+cmnd.getText()+"'where sdt='"+sdt+"'and email='"+email+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void SuaDV(String MADV) {
        Connection ketNoi = AppQLKS.layKetNoi();
       
        String sql = "update DICHVU set tenDV='"+tendv.getText()+"',gia='"+dongia.getText()+"' where maDV='"+MADV+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MainForUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
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
            java.util.logging.Logger.getLogger(MainForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KhuyenMai;
    private keeptoo.KButton LuuHD;
    private keeptoo.KButton LuuKhach;
    private javax.swing.JTextField MPTCX;
    private keeptoo.KButton SuaTT;
    private javax.swing.JTable TableCTHD;
    private javax.swing.JTable TableCTPD;
    private javax.swing.JTable TableCTPDV;
    private javax.swing.JTable TableCTPT;
    private javax.swing.JTable TableDV;
    private javax.swing.JTable TableHD;
    private javax.swing.JTable TableKhachHang;
    private javax.swing.JTable TableNhanVien;
    private javax.swing.JTable TablePT;
    private javax.swing.JTable TablePhieuDat;
    private javax.swing.JTable TablePhongTrong;
    private javax.swing.JTable TableTK;
    private javax.swing.JTable TableTienPhong;
    private javax.swing.JTable TableTrongPD;
    private javax.swing.JLabel TienPhong;
    private keeptoo.KButton XoaKhach;
    private javax.swing.JLabel bophan;
    private rojeru_san.RSButton btnDICHVU;
    private rojeru_san.RSButton btnHOADON;
    private rojeru_san.RSButton btnHOME;
    private rojeru_san.RSButton btnKHACHHANG;
    private rojeru_san.RSButton btnTHUEPHONG;
    private keeptoo.KGradientPanel chuyenctpd;
    private keeptoo.KGradientPanel chuyenctpt;
    private javax.swing.JTextField cmnd;
    private javax.swing.JComboBox<String> cmndkdat;
    private javax.swing.JLabel cmndkhach;
    private javax.swing.JComboBox<String> cmndkthue;
    private javax.swing.JLabel dangxuat;
    private javax.swing.JComboBox<String> dathp;
    private javax.swing.JLabel datloai;
    private javax.swing.JPanel datphong;
    private javax.swing.JComboBox<String> datphongtrong;
    private com.toedter.calendar.JDateChooser denngay;
    private javax.swing.JTextField diachi;
    private javax.swing.JTextField diachikhach;
    private javax.swing.JPanel dichvu;
    private javax.swing.JTextField dongia;
    private javax.swing.JComboBox<String> dvctdv;
    private keeptoo.KButton dvispay;
    private keeptoo.KButton dvnotpay;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailkhach;
    private javax.swing.JLabel hangphongthue;
    private javax.swing.JPanel hoadon;
    private keeptoo.KButton inhoadon;
    private javax.swing.JLabel isActive;
    private keeptoo.KButton isnotpay;
    private keeptoo.KButton ispay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel khachcthd;
    private javax.swing.JPanel khachhang;
    private javax.swing.JComboBox<String> khuyenmai;
    private javax.swing.JLabel kieudat;
    private keeptoo.KButton luuctdv;
    private keeptoo.KButton luudv;
    private rojeru_san.RSButton luuphieudat;
    private rojeru_san.RSButton luuphieuthue;
    private javax.swing.JLabel luuy;
    private javax.swing.JLabel luuy1;
    private javax.swing.JTextField madv;
    private javax.swing.JTextField mahoadon;
    private javax.swing.JTextField maphieudat;
    private javax.swing.JTextField maphieuthue;
    private javax.swing.JComboBox<String> mapthd;
    private com.toedter.calendar.JDateChooser ngaybd;
    private com.toedter.calendar.JDateChooser ngaybdt;
    private javax.swing.JLabel ngaydenhd;
    private javax.swing.JLabel ngaydihd;
    private com.toedter.calendar.JDateChooser ngaykt;
    private com.toedter.calendar.JDateChooser ngaylaphd;
    private javax.swing.JLabel ngayo;
    private com.toedter.calendar.JDateChooser ngaysinh;
    private keeptoo.KButton ngaytraphong;
    private javax.swing.JPanel nhanvien;
    private javax.swing.JTextField nvhd;
    private javax.swing.JLabel nvthue;
    private javax.swing.JComboBox<String> phai;
    private javax.swing.JComboBox<String> phieuthuedv;
    private javax.swing.JComboBox<String> phongcon;
    private javax.swing.JComboBox<String> phongdv;
    private javax.swing.JPanel quanly;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField sdtkhach;
    private javax.swing.JTextField sldat;
    private javax.swing.JTextField sldv;
    private javax.swing.JLabel ten;
    private javax.swing.JTextField tenNV;
    private javax.swing.JComboBox<String> tenbp;
    private javax.swing.JTextField tendv;
    private javax.swing.JTextField tenkhach;
    private javax.swing.JLabel thanhtoan;
    private javax.swing.JLabel thongbao;
    private javax.swing.JLabel thongbaodatphong;
    private javax.swing.JLabel thongbaodichvu;
    private javax.swing.JLabel thongbaohoadon;
    private javax.swing.JLabel thongbaokhach;
    private javax.swing.JLabel thongbaophieuthue;
    private javax.swing.JPanel thongke;
    private javax.swing.JPanel thuephong;
    private javax.swing.JLabel tienDV;
    private javax.swing.JLabel tienDV1;
    private javax.swing.JLabel tienphongafter;
    private javax.swing.JLabel tongdoanhthu;
    private javax.swing.JLabel tongtiencthd;
    private com.toedter.calendar.JDateChooser tungay;
    private javax.swing.JLabel username;
    private keeptoo.KButton xemchitiet;
    private keeptoo.KButton xemthongke;
    private rojeru_san.RSButton xoactpd;
    private rojeru_san.RSButton xoactpt;
    private keeptoo.KButton xoadv;
    private rojeru_san.RSButton xoapd;
    private rojeru_san.RSButton xoapt;
    // End of variables declaration//GEN-END:variables

    private Object String(JComboBox<String> phai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
