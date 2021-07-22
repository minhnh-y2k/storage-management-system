/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import com.stoman.dao.KhoDAO;
import com.stoman.dao.NhanVienDAO;
import com.stoman.entity.Kho;
import com.stoman.entity.NhanVien;
import com.stoman.utils.Auth;
import com.stoman.utils.DragPanel;
import com.stoman.utils.MsgBox;
import java.awt.Point;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MinhNH
 */
public class KhoJDialog extends javax.swing.JDialog {

    /**
     * Creates new form KhoJDialog
     */
    public KhoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        pnlThongTinKho = new javax.swing.JPanel();
        lblDiaChi = new javax.swing.JLabel();
        pnlTxtDiaChi = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        lblMaKho = new javax.swing.JLabel();
        txtMaKho = new javax.swing.JFormattedTextField();
        lblTruongKho = new javax.swing.JLabel();
        cboTruongKho = new javax.swing.JComboBox<>();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        pnlTblKho = new javax.swing.JScrollPane();
        tblKho = new javax.swing.JTable();
        pnlThanhTieuDe = new DragPanel(this);
        lblTieuDe = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoMan - Quản lý kho");
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 153, 204)));

        pnlChucNang.setOpaque(false);
        pnlChucNang.setLayout(new java.awt.GridLayout(1, 0));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnThem);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/cancel.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnXoa);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/edit-property.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnSua);

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/new-document.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnMoi);

        pnlThongTinKho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin kho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlThongTinKho.setOpaque(false);

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(51, 51, 51));
        lblDiaChi.setText("Địa chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setLineWrap(true);
        txtDiaChi.setRows(3);
        txtDiaChi.setWrapStyleWord(true);
        pnlTxtDiaChi.setViewportView(txtDiaChi);

        lblMaKho.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaKho.setForeground(new java.awt.Color(51, 51, 51));
        lblMaKho.setText("Kho số");

        txtMaKho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblTruongKho.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTruongKho.setForeground(new java.awt.Color(51, 51, 51));
        lblTruongKho.setText("Trưởng kho");

        javax.swing.GroupLayout pnlThongTinKhoLayout = new javax.swing.GroupLayout(pnlThongTinKho);
        pnlThongTinKho.setLayout(pnlThongTinKhoLayout);
        pnlThongTinKhoLayout.setHorizontalGroup(
            pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi)
                    .addComponent(lblMaKho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTxtDiaChi)
                    .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                        .addComponent(txtMaKho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTruongKho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTruongKho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlThongTinKhoLayout.setVerticalGroup(
            pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKho)
                    .addComponent(txtMaKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTruongKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTruongKho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                        .addComponent(lblDiaChi)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addComponent(pnlTxtDiaChi))
                .addContainerGap())
        );

        lblTimKiem.setForeground(new java.awt.Color(51, 51, 51));
        lblTimKiem.setText("Tìm kiếm");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        pnlTblKho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách kho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlTblKho.setOpaque(false);

        tblKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKho.setOpaque(false);
        tblKho.setRowHeight(25);
        tblKho.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblKho.getTableHeader().setReorderingAllowed(false);
        tblKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoMouseClicked(evt);
            }
        });
        pnlTblKho.setViewportView(tblKho);
        if (tblKho.getColumnModel().getColumnCount() > 0) {
            tblKho.getColumnModel().getColumn(0).setResizable(false);
            tblKho.getColumnModel().getColumn(1).setResizable(false);
            tblKho.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlThanhTieuDe.setBackground(new java.awt.Color(0, 153, 204));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("STOMAN - QUẢN LÝ KHO");

        lblThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/close(2).png"))); // NOI18N
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThoatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlThanhTieuDeLayout = new javax.swing.GroupLayout(pnlThanhTieuDe);
        pnlThanhTieuDe.setLayout(pnlThanhTieuDeLayout);
        pnlThanhTieuDeLayout.setHorizontalGroup(
            pnlThanhTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThanhTieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlThanhTieuDeLayout.setVerticalGroup(
            pnlThanhTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThanhTieuDeLayout.createSequentialGroup()
                .addGroup(pnlThanhTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThanhTieuDeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTieuDe))
                    .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThanhTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTblKho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlThongTinKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem))
                    .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlThanhTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlThongTinKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(pnlTblKho, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoMouseClicked
        // TODO add your handling code here:
        this.row = tblKho.getSelectedRow();
        this.edit();
    }//GEN-LAST:event_tblKhoMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        fillToTable();
        clearForm();
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void lblThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseEntered
        // TODO add your handling code here:
        lblThoat.setIcon(new ImageIcon(getClass().getResource("/com/stoman/icons/close.png")));
    }//GEN-LAST:event_lblThoatMouseEntered

    private void lblThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseExited
        // TODO add your handling code here:
        lblThoat.setIcon(new ImageIcon(getClass().getResource("/com/stoman/icons/close(2).png")));
    }//GEN-LAST:event_lblThoatMouseExited

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
            java.util.logging.Logger.getLogger(KhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhoJDialog dialog = new KhoJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTruongKho;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaKho;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTruongKho;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JScrollPane pnlTblKho;
    private javax.swing.JPanel pnlThanhTieuDe;
    private javax.swing.JPanel pnlThongTinKho;
    private javax.swing.JScrollPane pnlTxtDiaChi;
    private javax.swing.JTable tblKho;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JFormattedTextField txtMaKho;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private KhoDAO kDAO;
    private NhanVienDAO nvDAO;

    private DefaultTableModel tblModel;
    private int row = -1;
    private Point initialClick;

    private void init() {
        setLocationRelativeTo(null);

        this.kDAO = new KhoDAO();
        this.nvDAO = new NhanVienDAO();

        this.formatTable();

        this.fillToComboBox();
        this.fillToTable();
        this.updateStatus();

    }

    // Tạo tiêu đề và định dạng bảng
    private void formatTable() {
        String header[] = {"Mã kho", "Địa chỉ", "Trưởng kho"};
        tblModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int columnIndex) {
                if (getValueAt(0, columnIndex) == null) {
                    return Object.class;
                }
                return getValueAt(0, columnIndex).getClass();
            }
        };
        tblKho.setModel(tblModel);
    }

    // Đổ dữ liệu combobox mã kho
    private void fillToComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTruongKho.getModel();
        model.removeAllElements();
        try {
            List<NhanVien> list = nvDAO.selectTruongKho();
            model.addElement(new NhanVien("Chọn trưởng kho..."));
            for (NhanVien nv : list) {
                model.addElement(nv);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    // Đổ dữ liệu vào bảng
    private void fillToTable() {
        tblModel.setRowCount(0);
        String keyword = txtTimKiem.getText();
        try {
            List<Kho> list = kDAO.selectByKeyword(keyword);
            for (Kho k : list) {
                NhanVien tk = nvDAO.selectByID(k.getMaTK());
                tblModel.addRow(new Object[]{
                    k.getMaKho(),
                    k.getDiaChi(),
                    tk == null ? new NhanVien("<none>") : tk
                });
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    // Cập nhật trạng thái nút và form
    private void updateStatus() {
        boolean edit = (this.row >= 0);

        txtMaKho.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    // Lấy dữ liệu từ form
    private Kho getForm() {
        Kho k = new Kho();
        NhanVien nv = new NhanVien();
        if (cboTruongKho.getSelectedIndex() == 0) {
            nv.setMaNV(null);
        } else {
            nv = (NhanVien) cboTruongKho.getSelectedItem();
        }
        k.setMaKho(Integer.parseInt(txtMaKho.getText()));
        k.setDiaChi(txtDiaChi.getText());
        int index = this.cboTruongKho.getSelectedIndex();
        if (index != 0) {
            k.setMaTK(((NhanVien) this.cboTruongKho.getSelectedItem()).getMaNV());
        } else {
            k.setMaTK(null);
        }
        return k;
    }

    // Hiển thị dữ liệu lên form
    private void setForm(Kho k, NhanVien nv) {
        txtMaKho.setText(String.valueOf(k.getMaKho()));
        txtDiaChi.setText(k.getDiaChi());
        cboTruongKho.getModel().setSelectedItem(nv);
    }

    // Xoá trắng form
    private void clearForm() {
        txtMaKho.setText("");
        txtDiaChi.setText("");
        tblKho.clearSelection();
        cboTruongKho.setSelectedIndex(0);
        this.row = -1;
        this.updateStatus();
    }

    // Hiển thị dữ liệu đang chọn trên bảng lên form
    private void edit() {
        int maKho = (int) tblKho.getValueAt(this.row, 0);
        String maNV = ((NhanVien) tblKho.getValueAt(this.row, 2)).getMaNV();
        Kho k = kDAO.selectByID(maKho);
        NhanVien nv = nvDAO.selectByID(maNV);
        this.setForm(k, nv);
        this.updateStatus();
    }

    // Xác thực dữ liệu trên form
    private boolean isValidated() {
        if (txtMaKho.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập số kho!");
        } else if (txtDiaChi.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập địa chỉ!");
        } else {
            return true;
        }
        return false;
    }

    // Thêm kho mới
    private void insert() {
        if (isValidated()) {
            Kho k = getForm();
            try {
                kDAO.insert(k);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
                e.printStackTrace();
            }
        }
    }

    // Cập nhật kho
    private void update() {
        if (isValidated()) {
            Kho k = getForm();
            try {
                kDAO.update(k);
                this.fillToTable();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
                e.printStackTrace();
            }
        }
    }

    // Xoá kho
    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xoá kho!");
        } else if (MsgBox.confirm(this, "Bạn có chắc chắn muốn xoá kho hàng này?")) {
            int maKho = (int) tblKho.getValueAt(this.row, 0);
            try {
                kDAO.delete(maKho);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Xoá kho thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xoá kho thất bại!");
                e.printStackTrace();
            }
        }
    }

}
