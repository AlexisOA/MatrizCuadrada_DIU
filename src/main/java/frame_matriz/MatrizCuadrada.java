package frame_matriz;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Alexis
 */
public class MatrizCuadrada extends javax.swing.JFrame {
    
    int matriz[][] = new int[10][10];
    int minimo = 0;
    int maximo = 100;
    
    public MatrizCuadrada() {
        initComponents();
        input_minimo.setText(minimo+"");
        input_maximo.setText(maximo+"");
        deslizador.setMajorTickSpacing(10);
        deslizador.setMinorTickSpacing(2);
        deslizador.setPaintTicks(true);
        deslizador.setPaintLabels(true);
        deslizador.setMaximum(maximo);
        deslizador.setValue(maximo/2);
        initMatriz(0,100);
        rellenarMatriz(50);
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deslizador = new javax.swing.JSlider();
        etiqueta_minimo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        input_minimo = new javax.swing.JTextField();
        input_maximo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatexto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(104, 120, 148));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deslizador.setMaximum(0);
        deslizador.setPaintLabels(true);
        deslizador.setPaintTicks(true);
        deslizador.setToolTipText("Valores de la matriz");
        deslizador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deslizador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deslizadorStateChanged(evt);
            }
        });

        etiqueta_minimo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        etiqueta_minimo.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_minimo.setText("Valor mínimo de la matriz:");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor máximo de la matriz:");

        input_minimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_minimoFocusLost(evt);
            }
        });

        input_maximo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_maximoFocusLost(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(104, 120, 148));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(104, 120, 148));

        areatexto.setEditable(false);
        areatexto.setColumns(20);
        areatexto.setRows(5);
        jScrollPane1.setViewportView(areatexto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Romel Pino de Paz y Marlon Alexis Ochoa Álvarez, grupo 22");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Matriz Cuadrada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(deslizador, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiqueta_minimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_minimo, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(input_maximo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_minimo)
                    .addComponent(input_minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addComponent(deslizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deslizadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deslizadorStateChanged
        try {
            if(validarNumero(input_minimo) && validarNumero(input_maximo)){
                rellenarMatriz(deslizador.getValue());
            }else{
                JOptionPane.showMessageDialog(null,
                "Por favor, introduzco un valor entero en los campos mínimo y máximo",
                "Data Error", 
                JOptionPane.ERROR_MESSAGE);
                  
            }
            
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_deslizadorStateChanged

    private void input_minimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_minimoFocusLost
       try {
            minimo = Integer.parseInt(input_minimo.getText());
            deslizador.setMinimum(minimo);
            deslizador.setValue((minimo+maximo)/2);
            initMatriz(minimo, maximo);
        } catch (NumberFormatException ex) {
            if(!StringUtils.isNumeric(input_minimo.getText())){
                    JOptionPane.showMessageDialog(null, "Por favor, introduzco un valor entero en el campo mínimo", "Data Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        }finally{
           
       }
    }//GEN-LAST:event_input_minimoFocusLost

    private void input_maximoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_maximoFocusLost
        try {
            maximo = Integer.parseInt(input_maximo.getText());
            if(minimo > maximo){
                JOptionPane.showMessageDialog(null, "El valor mínimo debe ser mayor que el valor máximo", "Data Error", 
            JOptionPane.ERROR_MESSAGE);
            }
            initMatriz(minimo, maximo);
            deslizador.setMinimum(minimo);
            deslizador.setMaximum(maximo);
            deslizador.setValue((minimo+maximo)/2);
            
        } catch (NumberFormatException ex) {
            if(!StringUtils.isNumeric(input_maximo.getText())){
                JOptionPane.showMessageDialog(null, "Por favor, introduzco un valor entero en el campo maximo", "Data Error", 
            JOptionPane.ERROR_MESSAGE);
            }
        }finally{
           
       }
    }//GEN-LAST:event_input_maximoFocusLost
    
    private boolean validarNumero(JTextField textfield){
        return !textfield.getText().isEmpty() && textfield.getText().matches("\\d*");
                
    }
    
    private void rellenarMatriz(int valor) {
        String resultado = "";
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
              if(matriz[x][y] <= valor){
                  resultado += "-" + "        ";
                  continue;
              }
                switch (Integer.toString(matriz[x][y]).length()) {
                    case 1:
                        resultado += matriz[x][y] + "        ";
                        break;
                    case 2:
                        resultado += matriz[x][y] + "       ";
                        break;
                    default:
                        resultado += matriz[x][y] + "      ";
                        break;
                }
            }
            resultado += "\n";
        }
        areatexto.setText(resultado);
    } 
    
    public void initMatriz(int min, int max){
        System.out.println(min);
        System.out.println(max);
        String resultado = "";
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
              matriz[x][y] = (int) (Math.random()*(min-max)+max);
                switch (Integer.toString(matriz[x][y]).length()) {
                    case 1:
                        resultado += matriz[x][y] + "        ";
                        break;
                    case 2:
                        resultado += matriz[x][y] + "      ";
                        break;
                    default:
                        resultado += matriz[x][y] + "      ";
                        break;
                }
            }
            resultado += "\n";
        }
        areatexto.setText(resultado);
        
    }
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
            java.util.logging.Logger.getLogger(MatrizCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrizCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrizCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrizCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrizCuadrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areatexto;
    private javax.swing.JSlider deslizador;
    private javax.swing.JLabel etiqueta_minimo;
    private javax.swing.JTextField input_maximo;
    private javax.swing.JTextField input_minimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
