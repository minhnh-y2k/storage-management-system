/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import com.stoman.dao.HangHoaDAO;
import com.stoman.dao.LoaiHangHoaDAO;
import com.stoman.entity.HangHoa;
import com.stoman.entity.LoaiHangHoa;
import com.stoman.utils.Auth;
import com.stoman.utils.MsgBox;
import com.stoman.utils.XNumber;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MinhNH
 */
public class HangHoaJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HangHoaJDialog
     */
    public HangHoaJDialog(java.awt.Frame parent, boolean modal) {
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

        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        pnlLoaiHangHoa = new javax.swing.JPanel();
        pnlLstLoaiHangHoa = new javax.swing.JScrollPane();
        lstLHH = new javax.swing.JList<>();
        pnlButtonLoaiHH = new javax.swing.JPanel();
        btnThemList = new javax.swing.JButton();
        btnXoaList = new javax.swing.JButton();
        pnlThongTinHangHoa = new javax.swing.JPanel();
        lblMaHangHoa = new javax.swing.JLabel();
        txtMaHH = new javax.swing.JTextField();
        lblTenHangHoa = new javax.swing.JLabel();
        txtTenHH = new javax.swing.JTextField();
        lblDonViTinh = new javax.swing.JLabel();
        txtDonViTinh = new javax.swing.JTextField();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JFormattedTextField();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        pnlChuyen = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlTblHangHoa = new javax.swing.JScrollPane();
        tblHangHoa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoMan - Quản lý hàng hoá");
        setAlwaysOnTop(true);

        lblTimKiem.setText("Tìm kiếm");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        pnlLoaiHangHoa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loại hàng hoá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        pnlLoaiHangHoa.setLayout(new java.awt.BorderLayout());

        lstLHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstLHHMouseClicked(evt);
            }
        });
        pnlLstLoaiHangHoa.setViewportView(lstLHH);

        pnlLoaiHangHoa.add(pnlLstLoaiHangHoa, java.awt.BorderLayout.CENTER);

        pnlButtonLoaiHH.setLayout(new java.awt.GridLayout(1, 0));

        btnThemList.setText("Thêm");
        btnThemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemListActionPerformed(evt);
            }
        });
        pnlButtonLoaiHH.add(btnThemList);

        btnXoaList.setText("Xoá");
        btnXoaList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaListActionPerformed(evt);
            }
        });
        pnlButtonLoaiHH.add(btnXoaList);

        pnlLoaiHangHoa.add(pnlButtonLoaiHH, java.awt.BorderLayout.PAGE_END);

        pnlThongTinHangHoa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hàng hoá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        lblMaHangHoa.setText("Mã hàng hoá");

        lblTenHangHoa.setText("Tên hàng hoá");

        lblDonViTinh.setText("Đơn vị tính");

        lblDonGia.setText("Đơn giá");

        txtDonGia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        javax.swing.GroupLayout pnlThongTinHangHoaLayout = new javax.swing.GroupLayout(pnlThongTinHangHoa);
        pnlThongTinHangHoa.setLayout(pnlThongTinHangHoaLayout);
        pnlThongTinHangHoaLayout.setHorizontalGroup(
            pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinHangHoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenHangHoa)
                    .addComponent(lblMaHangHoa)
                    .addComponent(lblDonViTinh)
                    .addComponent(lblDonGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(txtMaHH)
                    .addComponent(txtTenHH)
                    .addComponent(txtDonGia))
                .addContainerGap())
        );
        pnlThongTinHangHoaLayout.setVerticalGroup(
            pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinHangHoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHangHoa)
                    .addComponent(txtMaHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenHangHoa)
                    .addComponent(txtTenHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonViTinh)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonGia)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        pnlChucNang.setLayout(new java.awt.GridLayout(0, 1));

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

        pnlChuyen.setLayout(new java.awt.GridLayout(1, 0));

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlChuyen.add(btnFirst);

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlChuyen.add(btnPrev);

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlChuyen.add(btnNext);

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlChuyen.add(btnLast);

        tblHangHoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng hoá", "Tên hàng hoá", "Đơn vị tính", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHangHoa.getTableHeader().setReorderingAllowed(false);
        tblHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHangHoaMouseClicked(evt);
            }
        });
        pnlTblHangHoa.setViewportView(tblHangHoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTblHangHoa)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTimKiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTimKiem))
                            .addComponent(pnlLoaiHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnlThongTinHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlChuyen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlThongTinHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLoaiHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTblHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHangHoaMouseClicked
        this.row = tblHangHoa.getSelectedRow();
        this.edit();
    }//GEN-LAST:event_tblHangHoaMouseClicked

    private void lstLHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstLHHMouseClicked
        // TODO add your handling code here:
        fillToTable();
        this.updateStatus();
    }//GEN-LAST:event_lstLHHMouseClicked

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        // Chỉ được đổ dữ liệu vào bảng khi loại hàng hoá được chọn
        if (!lstLHH.isSelectionEmpty()) {
            fillToTable();
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemListActionPerformed
        // TODO add your handling code here:
        insertLHH();
    }//GEN-LAST:event_btnThemListActionPerformed

    private void btnXoaListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaListActionPerformed
        // TODO add your handling code here:
        deleteLHH();
    }//GEN-LAST:event_btnXoaListActionPerformed

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

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

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
            java.util.logging.Logger.getLogger(HangHoaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangHoaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangHoaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangHoaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HangHoaJDialog dialog = new HangHoaJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemList;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaList;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblDonViTinh;
    private javax.swing.JLabel lblMaHangHoa;
    private javax.swing.JLabel lblTenHangHoa;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JList<LoaiHangHoa> lstLHH;
    private javax.swing.JPanel pnlButtonLoaiHH;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlChuyen;
    private javax.swing.JPanel pnlLoaiHangHoa;
    private javax.swing.JScrollPane pnlLstLoaiHangHoa;
    private javax.swing.JScrollPane pnlTblHangHoa;
    private javax.swing.JPanel pnlThongTinHangHoa;
    private javax.swing.JTable tblHangHoa;
    private javax.swing.JFormattedTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtMaHH;
    private javax.swing.JTextField txtTenHH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private HangHoaDAO hhDAO = new HangHoaDAO();
    private LoaiHangHoaDAO lhhDAO = new LoaiHangHoaDAO();
    private int row = -1;
    private String numPattern = "#,##0";
    private DefaultTableModel tblModel;

    private DefaultListModel<LoaiHangHoa> lstModel;

    private void init() {
        this.setLocationRelativeTo(null);
        this.lstModel = new DefaultListModel<>();

        String header[] = {"MÃ HH", "TÊN HH", "ĐƠN GIÁ", "ĐVT"};
        this.tblModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblHangHoa.setModel(tblModel);
        tblHangHoa.setAutoCreateRowSorter(true);
        tblHangHoa.setRowHeight(25);
        tblHangHoa.getColumnModel().getColumn(0).setPreferredWidth(125);
        tblHangHoa.getColumnModel().getColumn(1).setPreferredWidth(464);
        tblHangHoa.getColumnModel().getColumn(2).setPreferredWidth(125);
        tblHangHoa.getColumnModel().getColumn(3).setPreferredWidth(125);

        this.fillToList();
        this.updateStatus();
    }

    // Đổ dữ liệu vào bảng.
    private void fillToTable() {
        tblModel.setRowCount(0);
        int maLHH = lstLHH.getSelectedValue().getMaLHH();
        String keyword = txtTimKiem.getText();
        try {
            List<HangHoa> list = hhDAO.selectByKeyword(maLHH, keyword);
            for (HangHoa hh : list) {
                Object[] row = {
                    hh.getMaHH(),
                    hh.getTenHH(),
                    XNumber.toString(hh.getDonGia(), numPattern),
                    hh.getDonViTinh()
                };
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    //Đổ dữ liệu vào List.
    private void fillToList() {
        lstModel.removeAllElements();
        try {
            List<LoaiHangHoa> list = lhhDAO.selectAll();
            for (LoaiHangHoa lhh : list) {
                lstModel.addElement(lhh);
            }
            lstLHH.setModel(lstModel);
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    // Lấy dữ liệu từ form
    private HangHoa getForm() {
        HangHoa hh = new HangHoa();
        hh.setMaHH(txtMaHH.getText());
        hh.setTenHH(txtTenHH.getText());
        hh.setDonViTinh(txtDonViTinh.getText());
        hh.setDonGia(XNumber.toDouble(txtDonGia.getText(), numPattern));
        hh.setMaLHH(lstLHH.getSelectedValue().getMaLHH());
        return hh;
    }

    // Làm mới form
    private void clearForm() {
        this.setForm(new HangHoa());
        this.row = -1;
        tblHangHoa.clearSelection();
        this.updateStatus();
    }

    // Đưa dữ liệu lên form
    private void setForm(HangHoa hh) {
        txtMaHH.setText(hh.getMaHH());
        txtTenHH.setText(hh.getTenHH());
        txtDonViTinh.setText(hh.getDonViTinh());
        txtDonGia.setText(XNumber.toString(hh.getDonGia(), numPattern));
    }

    //Code phương thức updateStatus.
    void updateStatus() {
        if (lstLHH.isSelectionEmpty()) {
            btnThem.setEnabled(false);
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
            btnMoi.setEnabled(false);
            return;
        } else {
            btnThem.setEnabled(true);
            btnMoi.setEnabled(true);
        }

        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblHangHoa.getRowCount() - 1);

        // Chọn hàng trên bảng
        if (edit) {
            tblHangHoa.setRowSelectionInterval(row, row);
        }

        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }
    
    void edit() {
        String maHH = (String) tblHangHoa.getValueAt(this.row, 0);
        HangHoa hh = hhDAO.selectByID(maHH);
        this.setForm(hh);
        this.updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < (tblHangHoa.getRowCount() - 1)) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblHangHoa.getRowCount() - 1;
        this.edit();
    }
    
    void insertLHH() {
        String tenLHH = MsgBox.prompt(this, "Nhập tên loại hàng hoá mới:");
        if (tenLHH != null && !tenLHH.isEmpty()) {
            LoaiHangHoa lhh = new LoaiHangHoa(tenLHH);
            try {
                lhhDAO.insert(lhh);
                this.fillToList();
                this.clearForm();
                tblModel.setRowCount(0);
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
                e.printStackTrace();
            }
        }
    }

    void deleteLHH() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xoá loại đối tác!");
        } else if (lstLHH.isSelectionEmpty()) {
            MsgBox.alert(this, "Chưa chọn loại hàng hoá!");
        } else if (MsgBox.confirm(this, "Bạn chắc chắn muốn xoá loại hàng hoá này?")) {
            LoaiHangHoa lhh = lstLHH.getSelectedValue();
            try {
                lhhDAO.delete(lhh.getMaLHH());
                this.fillToList();
                this.clearForm();
                tblModel.setRowCount(0);
                MsgBox.alert(this, "Xoá thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xoá thất bại!");
                e.printStackTrace();
            }
        }
    }

    boolean isValidated() {
        if (txtMaHH.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập mã hàng hoá!");
            txtMaHH.requestFocus();
        } else if (txtTenHH.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập tên hàng hoá!");
            txtMaHH.requestFocus();
        } else if (txtDonGia.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập đơn giá!");
            txtMaHH.requestFocus();
        } else if (txtDonViTinh.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập đơn vị tính!");
            txtMaHH.requestFocus();
        } else {
            return true;
        }
        return false;
    }

    void insert() {
        if (isValidated()) {
            HangHoa dt = getForm();
            try {
                hhDAO.insert(dt);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
                e.printStackTrace();
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xoá hàng hoá!");
        } else if (MsgBox.confirm(this, "Bạn có chắc chắc muốn xoá hàng hoá này?")) {
            String maHH = (String) tblHangHoa.getValueAt(this.row, 0);
            try {
                hhDAO.delete(maHH);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Xoá thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xoá thất bại!");
                e.printStackTrace();
            }
        }
    }
    
    void update() {
        if (isValidated()) {
            HangHoa hh = getForm();
            try {
                hhDAO.insert(hh);
                this.fillToTable();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
                e.printStackTrace();
            }
        }
    }
}
