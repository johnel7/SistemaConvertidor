
package converciones;


import com.l2fprod.gui.plaf.skin.SkinLookAndFeel;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author USUARIO
 */
public class convercion extends javax.swing.JFrame {

    /**
     * Creates new form convercion
     */
    public convercion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String [] getUnidades(String uni)
     {
        String[] unidad = new String[14];
        
        if(uni.equalsIgnoreCase("MASA"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Arrobas";
            unidad[2]="Centigramo";
            unidad[3]="Gramos";
            unidad[4]="Granos";
            unidad[5]="Kilogramos";
            unidad[6]="Libras Troy";
            unidad[7]="Libras AVDP";
            unidad[8]="Microgramos";
            unidad[9]="Miligramos";
        } 
        if(uni.equalsIgnoreCase("LONGITUD"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="Decimetro";
            unidad[3]="Kilometros";
            unidad[4]="Metros";
            unidad[5]="Mili Pulgadas";
            unidad[6]="Milimetros";
            unidad[7]="Millas";
            unidad[8]="Nudos Lungitud";
            unidad[9]="Pies";
            unidad[10]="Pulgadas";
            unidad[11]="Yardas";
            
        }
        if(uni.equalsIgnoreCase("VOLUMEN"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Acre-Feet";
            unidad[2]="Acre Pulgada";
            unidad[3]="Barriles";
            unidad[4]="Centimetro cubico";
            unidad[5]="Decimetro cubico";
            unidad[6]="Kilometro";
            unidad[7]="Litros";
            unidad[8]="Metro cubicos";
            unidad[9]="Milimitro";
            unidad[10]="Pies Cubico";
            unidad[11]="Pulgadas cubico";
            unidad[12]="Yardas cubicos";
        }
        if(uni.equalsIgnoreCase("TIEMPO"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Años (bisiestro)";
            unidad[2]="Horas (media solar)";
            unidad[3]="Minutos (medio solar)";
            unidad[4]="Minutos (sidereo)";
        }
    return unidad;
    }
    
    
    public String [] getSub(String uni)
     {
         /*PARA MASA*/
        String[] unidad = new String[15];
        if(uni.equalsIgnoreCase("Arrobas"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Kilogramos";
        } 
        if(uni.equalsIgnoreCase("Centigramo"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
        } 
        if(uni.equalsIgnoreCase("Gramos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Decigramos";
            unidad[2]="Kilogramos";
            unidad[3]="Onzas (Troy)";
        }
        if(uni.equalsIgnoreCase("Granos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
        }
        if(uni.equalsIgnoreCase("Kilogramos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
            unidad[2]="Libras (avdp)";
            unidad[3]="Onzas (avdp)";
        }
        if(uni.equalsIgnoreCase("Libras Troy"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
            unidad[2]="Libras (avdp)";
            unidad[3]="Granos";
        }
        if(uni.equalsIgnoreCase("Libras AVDP"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
        }
        if(uni.equalsIgnoreCase("Microgramos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
        }
        if(uni.equalsIgnoreCase("Miligramos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Gramos";
            unidad[2]="Kilogramos";
            unidad[3]="Libras troy";
            unidad[4]="Libras avdp";
            unidad[5]="Onzas troy";
            unidad[6]="Onzas avdp";
        }
        
        /*PARA LONGITUD*/
        
        if(uni.equalsIgnoreCase("Centimetros"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Angstroms";
            unidad[2]="Kilometros";
            unidad[3]="Roja de Cd";
            unidad[4]="Metros";
            unidad[5]="Milimetros";
            unidad[6]="MIllas";
            unidad[7]="Pies";
            unidad[8]="Pulgadas";
            unidad[9]="Yardas";
        }
        if(uni.equalsIgnoreCase("Decimetro"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="Metros";
            unidad[3]="Pies";
            unidad[4]="Pulgadas";
            
        }
        if(uni.equalsIgnoreCase("Kilometros"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetro";
            unidad[2]="Leguas";
            unidad[3]="Metros";
            unidad[4]="Milimetros";
            unidad[5]="Millas";
            unidad[6]="Pies";
            unidad[7]="Pulgadas";
            unidad[8]="Yardas";
        }
        if(uni.equalsIgnoreCase("Metros"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="Kilometros";
            unidad[3]="Milimetros";
            unidad[4]="Millas";
            unidad[5]="Nanometros";
            unidad[6]="Pies";
            unidad[7]="Pulgadas";
            unidad[8]="Toesas";
            unidad[9]="Yardas";
        }
        if(uni.equalsIgnoreCase("Mili Pulgadas"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="Kilometros";
            unidad[3]="Milimetros";
            unidad[4]="Pies";
            unidad[5]="Pulgadas";
            unidad[6]="Yardas";
        }
        if(uni.equalsIgnoreCase("Milimetros"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="Decimetros";
            unidad[3]="Metros";
            unidad[4]="Micrones";
            unidad[5]="Pies";
            unidad[6]="Pulgadas";
            unidad[7]="Yardas";
        }
        if(uni.equalsIgnoreCase("Millas"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="kilometros";
            unidad[3]="Leguas";
            unidad[4]="Metros";
            unidad[5]="Milimetros";
            unidad[6]="pies";
            unidad[7]="Pulgadas";
            unidad[8]="Yardas";
        }
        if(uni.equalsIgnoreCase("Nudos Lungitud"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Metros";
            unidad[2]="Kilometros";
            unidad[3]="Millas";
            unidad[4]="Pies";
            unidad[5]="Yardas";
        }
        if(uni.equalsIgnoreCase("Pies"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros";
            unidad[2]="Kilometros";
            unidad[3]="Metros";
            unidad[4]="Milimetros";
            unidad[5]="Millas";
            unidad[6]="Pulgadsa";
            unidad[7]="Yardas";
        }
        if(uni.equalsIgnoreCase("Pulgadas"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="centimetros";
            unidad[2]="Kilometros";
            unidad[3]="Metros";
            unidad[4]="Metros";
            unidad[5]="Milimetros";
            unidad[6]="Pies";
            unidad[7]="Yardas";
        }
        
        if(uni.equalsIgnoreCase("Yardas"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Kilometros";
            unidad[2]="Metros";
            unidad[3]="Milimetros";
            unidad[4]="Millas";
            unidad[5]="Pies";
            unidad[6]="Pulgadas";
        }
        
        
        /*PARA VOLUMEN*/
        if(uni.equalsIgnoreCase("Acre-Feet"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Galones(US)";
            unidad[2]="Litros";
            unidad[3]="Metros Cubicos";
        }
        if(uni.equalsIgnoreCase("Acre Pulgada"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Galones(US)";
            unidad[2]="Metros Cubicos";
            unidad[3]="Pies Cubicos";
        }
        if(uni.equalsIgnoreCase("Barriles"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Barriles(US dry)";
            unidad[2]="Galones(US liq)";
            unidad[3]="Galones(UK)";
            unidad[4]="Litros";
            unidad[5]="Metros Cubicos";
            unidad[6]="Pies Cubicos";
            unidad[7]="Pulgadas Cubicas";
        }
        if(uni.equalsIgnoreCase("Centimetro cubico"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Galones(US dry)";
            unidad[2]="Metros Cubicos";
            unidad[3]="Pies Cubicos";
            unidad[4]="Pulgadas Cubicas";
            unidad[5]="Yardas Cubicas";
        }
        if(uni.equalsIgnoreCase("Decimetro cubico"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetro Cubicos";
            unidad[1]="Litros";
            unidad[2]="Metros Cubicos";
            unidad[3]="Pies Cubicos";
        }
        if(uni.equalsIgnoreCase("Kilometro"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetro Cubicos";
            unidad[1]="Galones(UK)";
            unidad[1]="Galones(US dry)";
            unidad[1]="Galones(US liq)";
            unidad[2]="Litros";
            unidad[1]="Metros Cubicos";
            unidad[3]="Pies Cubicos";
            unidad[4]="Pulgadas Cubicas";
            unidad[5]="Yardas Cubicas";
        }
        if(uni.equalsIgnoreCase("Litros"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Pies cubicos";
            unidad[2]="Pulgadas cubico";
            unidad[3]="Yardas cubicos";
        }
        if(uni.equalsIgnoreCase("Metro cubicos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetro cubicos";
            unidad[2]="Litros";
            unidad[3]="Pies Cubico";
            unidad[4]="Pulgadas cubico";
            unidad[5]="Yardas cubicos";
        }
        if(uni.equalsIgnoreCase("Milimitro"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Litros";
        }
        if(uni.equalsIgnoreCase("Pies Cubico"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetros cubicos";
            unidad[2]="Litros";
        }
         if(uni.equalsIgnoreCase("Pulgadas cubico"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Litros";
            unidad[2]="Metros Cubicos";
            unidad[3]="Milimitros";
        }
          if(uni.equalsIgnoreCase("Yardas cubicos"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Centimetro cubicos";
            unidad[2]="litros";
            unidad[3]="Onzas fl";
            unidad[4]="Pies Cubicos";
            unidad[5]="Pulgadas cubicas";
        }
          
        /*PARA TIEMPO*/
        if(uni.equalsIgnoreCase("Años (bisiestro)"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Dias(medio solar)";
        }
        if(uni.equalsIgnoreCase("Horas (media solar)"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Dias (sidereo)";
            
        }
        if(uni.equalsIgnoreCase("Minutos (medio solar)"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Dias (medio solar)";
            unidad[2]="Dias (sidereo)";
        }
        if(uni.equalsIgnoreCase("Minutos (sidereo)"))
        {
            unidad[0]="Seleccione una opcion";
            unidad[1]="Meses (medio calendario)";
            unidad[2]="Minutos (medio solar)";
        }
        return unidad;
     }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbx1 = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbx2 = new javax.swing.JComboBox<>();
        txtNum1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbx3 = new javax.swing.JComboBox<>();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA INTERNACIONAL DE UNIDADES");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "MASA", "LONGITUD", "VOLUMEN", "TIEMPO" }));
        cbx1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx1ItemStateChanged(evt);
            }
        });

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", " " }));
        cbx2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx2ItemStateChanged(evt);
            }
        });
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx2, 0, 225, Short.MAX_VALUE)
                    .addComponent(txtNum1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", " " }));
        cbx3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx3ItemStateChanged(evt);
            }
        });
        cbx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultado)
                    .addComponent(cbx3, 0, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConvertir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx1ItemStateChanged

        /*PARA EL COMBOBOX NUMERO 2*/
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.cbx1.getSelectedIndex()>0){
                this.cbx2.setModel(new DefaultComboBoxModel(this.getUnidades(this.cbx1.getSelectedItem().toString())));
            }
        }

       
    }//GEN-LAST:event_cbx1ItemStateChanged

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx3ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        double valor,lb=0,g=0;
        valor=Double.parseDouble(txtNum1.getText());

        //===============================MASA==================================================================
        if(cbx2.getSelectedItem()=="Kilogramos" && cbx3.getSelectedItem()=="Kilogramos"){
            txtResultado.setText(""+valor);
        }
        else if(cbx2.getSelectedItem()=="Kilogramos" && cbx3.getSelectedItem()=="Gramos"){
            txtResultado.setText(""+(valor *(1000/1)));
        }
        else if(cbx2.getSelectedItem()=="Kilogramos" && cbx3.getSelectedItem()=="Libras"){
            txtResultado.setText(""+(valor*2.205));
        }

        //==============================LONGITUD==========================================================
        if(cbx2.getSelectedItem()=="Metros" && cbx3.getSelectedItem()=="Metros"){
            txtResultado.setText(""+valor);
        }
        else if(cbx2.getSelectedItem()=="Metros" && cbx3.getSelectedItem()=="Yardas"){
            txtResultado.setText(""+(valor *1.0936));
        }
        else if(cbx2.getSelectedItem()=="Metros" && cbx3.getSelectedItem()=="Pulgadas"){
            txtResultado.setText(""+(valor *39.370));
        }
        else if(cbx2.getSelectedItem()=="Metros" && cbx3.getSelectedItem()=="Centimetros"){
            txtResultado.setText(""+(valor *100));
        }

        //==============================VOLUMEN==========================================================
        if(cbx2.getSelectedItem()=="Litros" && cbx3.getSelectedItem()=="Litros"){
            txtResultado.setText(""+valor);
        }
        else if(cbx2.getSelectedItem()=="Litros" && cbx3.getSelectedItem()=="Mililitros"){
            txtResultado.setText(""+(valor *1000));
        }
        else if(cbx2.getSelectedItem()=="Litros" && cbx3.getSelectedItem()=="Galones"){
            txtResultado.setText(""+(valor *0.26417));
        }
        else if(cbx2.getSelectedItem()=="Litros" && cbx3.getSelectedItem()=="Barriles"){
            txtResultado.setText(""+(valor *0.0083864));
        }

        /*
        switch(cbx2.getSelectedIndex()){
            case 1:
            lb = kg*2.205;
            txtResultado.setText(""+lb);
            break;
            case 2:
            g=kg *(1000/1);
            txtResultado.setText(""+g);
            break;

        }  */

        //lb = kg*2.205;
        //g=kg *(1000/1);

        // txtResultado.setText(""+lb);
        // txtResultado.setText(""+g);

    }//GEN-LAST:event_btnConvertirActionPerformed

    private void cbx3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx3ItemStateChanged
        
    }//GEN-LAST:event_cbx3ItemStateChanged

    private void cbx2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx2ItemStateChanged
       /*PARA EL COMBOBOX NUMERO 3*/
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.cbx2.getSelectedIndex()>0){
                this.cbx3.setModel(new DefaultComboBoxModel(this.getSub(this.cbx2.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cbx2ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        /*
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceCremeTheme");
        */
        
            
        //DECORAR FORMULARIOS CON TEMAS
        try {
            JFrame.setDefaultLookAndFeelDecorated(true); //decorar a formulario si
            SkinLookAndFeel.setSkin(SkinLookAndFeel.loadThemePack("Themes/chaNinja-Bluethemepack.zip"));
            UIManager.setLookAndFeel("com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        } catch (Exception e) {
        }
        
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convercion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JComboBox<String> cbx3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
