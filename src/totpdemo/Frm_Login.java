/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package totpdemo;
import javax.swing.JOptionPane;
public class Frm_Login extends javax.swing.JFrame {
         private String secretKey;
    public Frm_Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponentss() {
        lblusername = new javax.swing.JLabel("Tên tài khoản:");
        lblpassword = new javax.swing.JLabel("Mật khẩu:");
        txtlogin = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton("Đăng nhập");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        btnlogin.addActionListener(evt -> btnloginActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGap(30)
            .addGroup(layout.createParallelGroup()
                .addComponent(lblusername)
                .addComponent(lblpassword)
                .addComponent(btnlogin))
            .addGap(20)
            .addGroup(layout.createParallelGroup()
                .addComponent(txtlogin, 150, 150, 200)
                .addComponent(txtpassword, 150, 150, 200))
            .addGap(30));
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGap(30)
            .addGroup(layout.createParallelGroup().addComponent(lblusername).addComponent(txtlogin, 30, 30, 30))
            .addGap(20)
            .addGroup(layout.createParallelGroup().addComponent(lblpassword).addComponent(txtpassword, 30, 30, 30))
            .addGap(20)
            .addComponent(btnlogin)
            .addGap(30));

        pack();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusername = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblusername.setText("Tên Đăng Nhập");

        lblpassword.setText("Mật Khẩu");

        btnlogin.setText("Đăng Nhập");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Đăng Nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnlogin)
                                .addGap(193, 193, 193))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtlogin))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusername)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnlogin)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
       String username = txtlogin.getText();
    String password = new String(txtpassword.getPassword());

    if (username.equals("admin") && password.equals("123456")) {
        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
        // Khởi tạo frm_TrangChu và hiển thị
        new Frm_TrangChu().setVisible(true);
        this.dispose(); // Đóng màn hình đăng nhập
    } else {
        JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnloginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
