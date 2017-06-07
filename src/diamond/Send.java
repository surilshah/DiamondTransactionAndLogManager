package diamond;
public class Send extends javax.swing.JFrame {

    /**
     * Creates new form Send
     */
    public Send() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sdate = new javax.swing.JTextField();
        swt = new javax.swing.JTextField();
        spacket = new javax.swing.JTextField();
        slot = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        l10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        sdate.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        sdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdateActionPerformed(evt);
            }
        });
        getContentPane().add(sdate);
        sdate.setBounds(198, 33, 109, 27);

        swt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(swt);
        swt.setBounds(198, 71, 109, 27);

        spacket.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        spacket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spacketActionPerformed(evt);
            }
        });
        getContentPane().add(spacket);
        spacket.setBounds(198, 109, 109, 27);

        slot.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(slot);
        slot.setBounds(198, 147, 109, 27);

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l1.setText("Date");
        getContentPane().add(l1);
        l1.setBounds(100, 36, 32, 21);

        l2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l2.setText("Initial Wt.");
        getContentPane().add(l2);
        l2.setBounds(100, 74, 69, 21);

        l3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l3.setText("Packet No.");
        getContentPane().add(l3);
        l3.setBounds(100, 112, 69, 21);

        l4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l4.setText("Lot No.");
        getContentPane().add(l4);
        l4.setBounds(100, 150, 47, 21);

        l5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l5.setText("Workshop");
        getContentPane().add(l5);
        l5.setBounds(100, 188, 64, 21);

        l6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l6.setText("Send To");
        getContentPane().add(l6);
        l6.setBounds(100, 226, 54, 21);

        l7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l7.setText("dd/mm/yyyy");
        getContentPane().add(l7);
        l7.setBounds(320, 40, 80, 20);

        l8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l8.setText("in Cents");
        getContentPane().add(l8);
        l8.setBounds(320, 80, 60, 21);

        l9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(l9);
        l9.setBounds(80, 330, 330, 20);

        b1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b1.setText("Done");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b1KeyPressed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(198, 276, 75, 29);

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b2.setText("Back");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(10, 330, 63, 29);

        cb1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Designing", "Cutting", "Polishing" }));
        getContentPane().add(cb1);
        cb1.setBounds(198, 185, 109, 27);

        cb2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Grant Road", "Andheri", "Vile Parle" }));
        getContentPane().add(cb2);
        cb2.setBounds(198, 223, 105, 27);

        l10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Diamond\\bg.jpg")); // NOI18N
        getContentPane().add(l10);
        l10.setBounds(0, 0, 520, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdateActionPerformed

    private void spacketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spacketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spacketActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        String date=sdate.getText();
        String initialwt=swt.getText();
        String packno=spacket.getText();
        String lotno=slot.getText();
        String process=cb1.getSelectedItem().toString();
        String sendto=cb2.getSelectedItem().toString();
        DBManager d=new DBManager();              
        if(date.equals("")||initialwt.equals("")||packno.equals("")||lotno.equals("")||process.equals("")||sendto.equals("")){
            l9.setText("Enter all fields");
        }
        else{
            if(!dateval(date)){
                l9.setText("Enter a valid Date");
                sdate.setText("");
            }
        
            else if(d.isPresent(packno,lotno)){
                l9.setText("Already Existing Lot no has this Packet no.");
                slot.setText("");
                spacket.setText("");
            }
            else{
                String s="insert into main (dtsend,lotno,packno,process,iniwt,sendto) values('"+date+"',"+lotno+","+packno+",'"+process+"',"+initialwt+",'"+sendto+"')";
                d.addData(s);
                sdate.setText("");
                swt.setText("");
                spacket.setText("");
                slot.setText("");
                cb1.setSelectedIndex(0);
                cb2.setSelectedIndex(0);
                l9.setText("New Item Added");
            }
        }
        d.close();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_b1KeyPressed
    public boolean dateval(String date){
        if(date.length()<10){
            return false;
        }
        else{
            int day=Integer.parseInt(date.substring(0,2));
            int month=Integer.parseInt(date.substring(3,5));
            int year=Integer.parseInt(date.substring(6,10));
            if((day>0&&day<=31)&&(month>0&&month<=12)&&(year>2000)){
                return true;
            }
            return false;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Send().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField sdate;
    private javax.swing.JTextField slot;
    private javax.swing.JTextField spacket;
    private javax.swing.JTextField swt;
    // End of variables declaration//GEN-END:variables
}
