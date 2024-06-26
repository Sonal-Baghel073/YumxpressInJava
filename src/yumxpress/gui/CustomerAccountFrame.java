package yumxpress.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import yumxpress.dao.CustomerDAO;
import yumxpress.pojo.CustomerPojo;
import yumxpress.util.PasswordEncryption;
import yumxpress.util.UserProfile;
import yumxpress.util.Validator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sanja
 */
public class CustomerAccountFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerAccountFrame
     */
    private CustomerPojo customer;

    public CustomerAccountFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Customer Account Frame");
        lblUserProfile.setText("Hello " + UserProfile.getUserName());
        this.txtEmail.setText(UserProfile.getEmailId().trim());
        loadCustomerDetailsById(UserProfile.getUserId());
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
        myPanel2 = new javax.swing.JPanel();
        iconPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserProfile = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnMyCart = new javax.swing.JButton();
        btnOrderFood = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        myPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        myPanel2.setBackground(new java.awt.Color(153, 102, 255));

        iconPanel.setBackground(new java.awt.Color(153, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N

        lblUserProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserProfile.setForeground(new java.awt.Color(255, 255, 0));
        lblUserProfile.setText("Sanjay");

        javax.swing.GroupLayout iconPanelLayout = new javax.swing.GroupLayout(iconPanel);
        iconPanel.setLayout(iconPanelLayout);
        iconPanelLayout.setHorizontalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconPanelLayout.createSequentialGroup()
                .addGroup(iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iconPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(iconPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        iconPanelLayout.setVerticalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        optionPanel.setBackground(new java.awt.Color(153, 102, 255));

        btnLogout.setBackground(new java.awt.Color(255, 255, 51));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnMyCart.setBackground(new java.awt.Color(255, 255, 51));
        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });

        btnOrderFood.setBackground(new java.awt.Color(255, 255, 51));
        btnOrderFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderFood.setText("Order Food");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });

        btnCancelOrder.setBackground(new java.awt.Color(255, 255, 51));
        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        btnOrderHistory.setBackground(new java.awt.Color(255, 255, 51));
        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMyCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnMyCart)
                .addGap(18, 18, 18)
                .addComponent(btnOrderFood)
                .addGap(18, 18, 18)
                .addComponent(btnCancelOrder)
                .addGap(18, 18, 18)
                .addComponent(btnOrderHistory)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout myPanel2Layout = new javax.swing.GroupLayout(myPanel2);
        myPanel2.setLayout(myPanel2Layout);
        myPanel2Layout.setHorizontalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        myPanel2Layout.setVerticalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Enter Email Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 255));
        jLabel3.setText("Enter Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("Password ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 255));
        jLabel5.setText("Enter Mobile No.");

        btnUpdate.setBackground(new java.awt.Color(153, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 255));
        jLabel6.setText("Enter Address");

        btnBack.setBackground(new java.awt.Color(153, 102, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 255));
        jLabel7.setText("My Account");

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(myPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        new OrderFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
        new CustomerCartFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new CustomerLoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!validateInputs()) {
            return;
        }
        try {
            customer.setCustomerName(txtName.getText().trim());
            customer.setMobileNo(txtMobileNo.getText().trim());
            customer.setAddress(txtAddress.getText().trim());
            char[] pwd = txtPassword.getPassword();
            String pwdStr = String.valueOf(pwd);
            pwdStr = PasswordEncryption.getEncryptedPassword(pwdStr);
            customer.setPassword(pwdStr);
            boolean result = CustomerDAO.updateCustomer(customer);
            if (result) {
                JOptionPane.showMessageDialog(null, "Customer Updation Successfull");
                clearAll();
                return;
            }
            JOptionPane.showMessageDialog(null, "Registration UnSuccessfull");

        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN CustomerRegistrationFrame");
            sq.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerOptionFrame showFrame = new CustomerOptionFrame();
        showFrame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        new OrderHistoryFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccountFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserProfile;
    private javax.swing.JPanel myPanel;
    private javax.swing.JPanel myPanel2;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
     public boolean validateInputs() {
        char[] pwd = this.txtPassword.getPassword();
        if (pwd.length == 0 || this.txtName.getText().trim().isEmpty() || this.txtEmail.getText().trim().isEmpty() || this.txtMobileNo.getText().isEmpty() || this.txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
            return false;
        }
        if (Validator.isValidMobile(this.txtMobileNo.getText().trim()) == false) {
            JOptionPane.showMessageDialog(null, "Please input a valid mobile no");
            return false;
        }
        return true;
    }

    private void loadCustomerDetailsById(String userId) {
        try {
            customer = CustomerDAO.getCustomerDetailsById(userId);
            this.txtName.setText(customer.getCustomerName().trim());
            String password = PasswordEncryption.getDecryptedPassword(customer.getPassword().trim());
            this.txtPassword.setText(password);
            this.txtMobileNo.setText(customer.getMobileNo().trim());
            this.txtAddress.setText(customer.getAddress().trim());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error In CustomerAccountsFrame");
            ex.printStackTrace();

        }

    }

    private void clearAll() {
        this.txtEmail.setText("");
        this.txtAddress.setText("");
        this.txtMobileNo.setText("");
        this.txtName.setText("");
        this.txtPassword.setText("");
        this.txtName.requestFocus();

    }
}
