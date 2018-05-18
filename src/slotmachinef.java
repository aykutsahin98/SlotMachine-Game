
public class slotmachinef extends javax.swing.JFrame {
    String ad="";
    String [] skorlardata=new String[10];
    int oyuncu_skor=100;
     int i=0;
    public slotmachinef() {
        initComponents();
        panel_oyunalani.setVisible(false);
        panel_durum.setVisible(false);
        panel_skor.setVisible(false);
    }

     // new javax.swing.ImageIcon(getClass().getResource("/slotmachine/of.png"))
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_oyuncu_bilgileri = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buton_basla = new javax.swing.JButton();
        textfield_isim = new javax.swing.JTextField();
        panel_durum = new javax.swing.JPanel();
        label_oyuncuadi = new javax.swing.JLabel();
        label_skor_oyuncu = new javax.swing.JLabel();
        buton_yenioyun = new javax.swing.JButton();
        panel_oyunalani = new javax.swing.JPanel();
        b0 = new javax.swing.JButton();
        buton_oyna = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label_durum = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        panel_skor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buton_yeni_oyuncu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncu_bilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OYUNCU BİLGİLERİ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N

        jLabel6.setText("Adınızı Girin");

        buton_basla.setText("BAŞLA");
        buton_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncu_bilgileriLayout = new javax.swing.GroupLayout(panel_oyuncu_bilgileri);
        panel_oyuncu_bilgileri.setLayout(panel_oyuncu_bilgileriLayout);
        panel_oyuncu_bilgileriLayout.setHorizontalGroup(
            panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textfield_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buton_basla)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel_oyuncu_bilgileriLayout.setVerticalGroup(
            panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textfield_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_basla))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_durum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PUAN DURUMU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N

        label_oyuncuadi.setText("Oyuncu:");

        label_skor_oyuncu.setText("0");

        buton_yenioyun.setText("YENİ OYUN");
        buton_yenioyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_yenioyunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_durumLayout = new javax.swing.GroupLayout(panel_durum);
        panel_durum.setLayout(panel_durumLayout);
        panel_durumLayout.setHorizontalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buton_yenioyun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_durumLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label_oyuncuadi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_skor_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        panel_durumLayout.setVerticalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_oyuncuadi)
                    .addComponent(label_skor_oyuncu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton_yenioyun, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_oyunalani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OYUN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N

        b0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b0.setContentAreaFilled(false);

        buton_oyna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachine/of.png"))); // NOI18N
        buton_oyna.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachine/on.png"))); // NOI18N
        buton_oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_oynaActionPerformed(evt);
            }
        });

        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.setContentAreaFilled(false);

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setText("DURUM: ");

        label_durum.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        label_durum.setText("Bilgisayar Kazandı");

        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.setContentAreaFilled(false);

        javax.swing.GroupLayout panel_oyunalaniLayout = new javax.swing.GroupLayout(panel_oyunalani);
        panel_oyunalani.setLayout(panel_oyunalaniLayout);
        panel_oyunalaniLayout.setHorizontalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(label_durum)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buton_oyna, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_oyunalaniLayout.setVerticalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_durum)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_oyunalaniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buton_oyna, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_skor.setBorder(javax.swing.BorderFactory.createTitledBorder("SKORLAR"));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        buton_yeni_oyuncu.setText("Yeni Oyuncu");
        buton_yeni_oyuncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_yeni_oyuncuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_skorLayout = new javax.swing.GroupLayout(panel_skor);
        panel_skor.setLayout(panel_skorLayout);
        panel_skorLayout.setHorizontalGroup(
            panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(buton_yeni_oyuncu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_skorLayout.setVerticalGroup(
            panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_skorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(buton_yeni_oyuncu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_oyunalani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_oyuncu_bilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_durum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_oyuncu_bilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_oyunalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panel_skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void buton_oynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_oynaActionPerformed
      int a=(int)(Math.random()*8);
       int b=(int)(Math.random()*8);
        int c=(int)(Math.random()*8);
        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachine/"+String.valueOf(a)+".png")));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachine/"+String.valueOf(b)+".png")));
         b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachine/"+String.valueOf(c)+".png")));
       if(a==b && b==c)
       { 
           oyuncu_skor+=250;
           label_durum.setText("TEBRİKLER HEPSİ AYNI 250 PUAN EKLENDİ");
       }
       else if(a==b || b==c ||a==c)
       {
           oyuncu_skor+=100;           
           label_durum.setText("TEBRİKLER İKİSİ AYNI 100 PUAN EKLENDİ");
       }
       else if(a!=b&b!=c)
       {
           oyuncu_skor-=150;           
           label_durum.setText("ÜZGÜNÜM :) HEPSİ FARKLI 150 PUAN EKSİLDİ");
       }
       
      label_skor_oyuncu.setText(String.valueOf(oyuncu_skor));
    }//GEN-LAST:event_buton_oynaActionPerformed
    
    private void buton_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_baslaActionPerformed
      ad=textfield_isim.getText();
      oyuncu_skor=100;
      panel_oyuncu_bilgileri.setEnabled(false);
      textfield_isim.setEnabled(false);
      buton_basla.setEnabled(false);
      panel_oyunalani.setVisible(true);
      panel_durum.setVisible(true);
      label_oyuncuadi.setText(ad);
      label_skor_oyuncu.setText(String.valueOf(oyuncu_skor));
    }//GEN-LAST:event_buton_baslaActionPerformed
   
    private void buton_yenioyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_yenioyunActionPerformed
        
        b0.setIcon(null);
        b1.setIcon(null);
        b2.setIcon(null);
      
      label_oyuncuadi.setText(ad);
      label_durum.setText(":P Haydi yeniden başla bakalım"); 
      panel_skor.setVisible(true);
      skorlardata[i]=ad+": "+String.valueOf(oyuncu_skor);
      if(i==10)   i=0;
      else i++;
      jList1.setListData(skorlardata);
      oyuncu_skor=100;
      label_skor_oyuncu.setText(String.valueOf(oyuncu_skor));
     
    }//GEN-LAST:event_buton_yenioyunActionPerformed

    private void buton_yeni_oyuncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_yeni_oyuncuActionPerformed
        b0.setIcon(null);
        b1.setIcon(null);
        b2.setIcon(null);      
        oyuncu_skor=100;
        ad="";
        panel_oyunalani.setVisible(false);
        panel_durum.setVisible(false);
        panel_skor.setVisible(false);
        textfield_isim.setEnabled(true);
        buton_basla.setEnabled(true);
    }//GEN-LAST:event_buton_yeni_oyuncuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slotmachinef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton buton_basla;
    private javax.swing.JButton buton_oyna;
    private javax.swing.JButton buton_yeni_oyuncu;
    private javax.swing.JButton buton_yenioyun;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_durum;
    private javax.swing.JLabel label_oyuncuadi;
    private javax.swing.JLabel label_skor_oyuncu;
    private javax.swing.JPanel panel_durum;
    private javax.swing.JPanel panel_oyunalani;
    private javax.swing.JPanel panel_oyuncu_bilgileri;
    private javax.swing.JPanel panel_skor;
    private javax.swing.JTextField textfield_isim;
    // End of variables declaration//GEN-END:variables
}
