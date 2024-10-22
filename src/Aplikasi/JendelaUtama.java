
package Aplikasi;

import app.db.Mahasiswa;
import app.db.MahasiswaManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JendelaUtama extends javax.swing.JFrame {

   List<Mahasiswa> mahasiswa = new ArrayList<>();
    int currentRow = 0;
//Constructor
    public JendelaUtama() {
        String lookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
            try {
                javax.swing.UIManager.setLookAndFeel(lookAndFeel);
            } catch (Exception e) {
            }
       
            initComponents();
                loadData();
                bindData();

                txtNoBP.setEditable(false);
                txtNama.setEditable(false);
                txtTmpLahir.setEditable(false);
                txtTglLahir.setEditable(false);
                txtAlamat.setEditable(false);
                txtPhone.setEditable(false);
                txtAsalSekolah.setEditable(false);
            
            
    }
    private void loadData() {
        MahasiswaManager mhsmgr = new MahasiswaManager();
        mahasiswa = mhsmgr.getMahasiswa();
        mhsmgr.closeConnection();
    }
     private void bindData() {
        if (mahasiswa.size()>0) {
            Mahasiswa m = mahasiswa.get(currentRow);
            txtNoBP.setText(m.getnobp());
            txtNama.setText(m.getnama());
            txtTmpLahir.setText(m.gettmplahir());
            txtTglLahir.setText(m.gettgllahir());
            txtAlamat.setText(m.getalamat());
            txtPhone.setText(m.getphone());
            txtAsalSekolah.setText(m.getasalsekolah());
        } else {
            currentRow = 0;
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTmpLahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTglLahir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtPhone = new javax.swing.JTextField();
        txtAsalSekolah = new javax.swing.JTextField();
        txtNoBP = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mahasiswa"));

        jLabel1.setText("No BP");

        jLabel2.setText("Nama");

        jLabel3.setText("Tempat/Tgl lahir");

        jLabel4.setText("Alamat");

        jLabel5.setText("No Telphone");

        jLabel6.setText("Asal Sekolah");

        jLabel7.setText("/");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTglLahir))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAsalSekolah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoBP, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtNama))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
      if(btnNew.getText().equals("New")){
           txtNoBP.setText("");
           txtNama.setText("");
           txtTmpLahir.setText("");
           txtTglLahir.setText("");
           txtAlamat.setText("");
           txtPhone.setText("");
           txtAsalSekolah.setText("");
           txtNoBP.setEditable(true);
           txtNama.setEditable(true);
           txtTmpLahir.setEditable(true);
           txtTglLahir.setEditable(true);
           txtAlamat.setEditable(true);
           txtPhone.setEditable(true);
           txtAsalSekolah.setEditable(true);
           txtNoBP.requestFocus();
           btnNew.setText("Simpan");
           btnDelete.setText("Batal");
           btnEdit.setEnabled(false);
           btnPrev.setEnabled(false);
           btnNext.setEnabled(false);
           }else {
           if (!txtNoBP.getText().equals("") && !txtNama.getText().equals("")){
           MahasiswaManager mhsmgr = new MahasiswaManager();
           Mahasiswa m = new Mahasiswa();
           m.setnobp(txtNoBP.getText());
           m.setnama(txtNama.getText());
           m.settmplahir(txtTmpLahir.getText());
           m.settgllahir(txtTglLahir.getText());
           m.setalamat(txtAlamat.getText());
           m.setphone(txtPhone.getText());
           m.setasalsekolah(txtAsalSekolah.getText());
           if (mhsmgr.Insert(m)>0) {
               loadData();
               currentRow = mahasiswa.size()-1;
               bindData();
               JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
           } else {
              JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
           }
           txtNoBP.setEditable(false);
           txtNama.setEditable(false);
           txtTmpLahir.setEditable(false);
           txtTglLahir.setEditable(false);
           txtAlamat.setEditable(false);
           txtPhone.setEditable(false);
           txtAsalSekolah.setEditable(false);
           btnNew.setText("Baru");
           btnDelete.setText("Hapus");
           btnEdit.setEnabled(true);
           btnPrev.setEnabled(true);
           btnNext.setEnabled(true);
           mhsmgr.closeConnection();
          } else {
           JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
          }
    }
 
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       if (btnEdit.getText().equals("Edit")){
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
            txtNoBP.setEditable(true);
            txtNama.setEditable(true);
            txtTmpLahir.setEditable(true);
            txtTglLahir.setEditable(true);
            txtAlamat.setEditable(true);
            txtPhone.setEditable(true);
            txtAsalSekolah.setEditable(true);
            txtNoBP.requestFocus();
            btnNew.setText("Simpan");
            btnDelete.setText("Batal");
            btnEdit.setEnabled(false);
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            MahasiswaManager mhsmgr = new MahasiswaManager();
            Mahasiswa m = new Mahasiswa();
            m.setnobp(txtNoBP.getText());
            m.setnama(txtNama.getName());
            m.settmplahir(txtTmpLahir.getText());
            m.settgllahir(txtTglLahir.getText());
            m.setalamat(txtAlamat.getText());
            m.setphone(txtPhone.getText());
            m.setasalsekolah(txtAsalSekolah.getText());
               if (mhsmgr.Update(m)>0){
                    loadData();
                    bindData();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
           txtNoBP.setEditable(false);
           txtNama.setEditable(false);
           txtTmpLahir.setEditable(false);
           txtTglLahir.setEditable(false);
           txtAlamat.setEditable(false);
           txtPhone.setEditable(false);
           txtAsalSekolah.setEditable(false);
           btnNew.setText("Baru");
           btnDelete.setText("Hapus");
           btnPrev.setEnabled(true);
           btnNext.setEnabled(true);
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      if (btnDelete.getText().equals("Delete")){
             int dialog = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Akan Menghapus Data Ini ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
             MahasiswaManager mhsmgr = new MahasiswaManager();

             Mahasiswa m = mahasiswa.get(currentRow);

                if (dialog == JOptionPane.YES_NO_OPTION) {
                    if (mhsmgr.Delete(m)>0){
                        loadData();
                        currentRow = currentRow - 1;
                        bindData();
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
             } else if (btnDelete.getText().equals("Batal")) {
                loadData();
                bindData();
                btnNew.setText("Baru");
                btnEdit.setText("Edit");
                btnDelete.setText("Hapus");
                btnEdit.setEnabled(true);
                btnNew.setEnabled(true);
                btnNext.setEnabled(true);
                btnPrev.setEnabled(true);
                txtNoBP.setEditable(false);
                txtNama.setEditable(false);
                txtTmpLahir.setEditable(false);
                txtTglLahir.setEditable(false);
                txtAlamat.setEditable(false);
                txtPhone.setEditable(false);
                txtAsalSekolah.setEditable(false);
             }
             
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (currentRow < mahasiswa.size()-1){
                 ++currentRow;
                 btnPrev.setEnabled(true);
                 }else {
                 btnNext.setEnabled(false);
                 }
                 bindData();
                 
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       if (currentRow < mahasiswa.size()-1){
                 --currentRow;
                 btnPrev.setEnabled(true);
                 }else {
                 btnNext.setEnabled(false);
                 }
                 bindData();
    }//GEN-LAST:event_btnNextActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JendelaUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JendelaUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtAsalSekolah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoBP;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTglLahir;
    private javax.swing.JTextField txtTmpLahir;
    // End of variables declaration//GEN-END:variables
}
