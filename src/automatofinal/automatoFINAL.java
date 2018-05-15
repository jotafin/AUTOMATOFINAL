/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatofinal;

/**
 *
 * @author Jefinho
 */
public class automatoFINAL extends javax.swing.JFrame {

    /**
     * Creates new form automatoFINAL
     */
    public automatoFINAL() {
        initComponents();
    }
    String palavra,recusado = "AUTOMATO REJEITADO", aceito = "AUTOMATO ACEITO";
    int tamanho, contador;
    
    public void verificar(){
        palavra = entrada.getText();
        while(tamanho < palavra.length()){
            // incrementa o tamanho
            tamanho++;
            }System.out.println(tamanho);
            
            estadoQ0();
         }
    public void estadoQ0(){
        q0.setText("Estado Q0 Acessado");
        if("".equals(palavra)){
            resultado.setText(recusado);
            System.out.println(recusado);
        }else{
            if(palavra.charAt(contador)== 'a' ){
                estadoQ1();
            }else if(palavra.charAt(contador) == 'b'){
                estadoQ2();
            }else if(palavra.charAt(contador) == 'c'){
                estadoQ3();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }
    }
    public void estadoQ1(){
        contador++;
        q1.setText("Estado Q1 Acessado");
        if(palavra.charAt(contador)== 'a' ){
            estadoQ4();
        }else if(palavra.charAt(contador) == 'b'){
            estadoQ5();
        }else if(palavra.charAt(contador) == 'c'){
            estadoQ6();
        }else{
            resultado.setText(recusado);
            System.out.println(recusado);
        }
        
    }
     public void estadoQ2(){
        contador++;
        q2.setText("Estado Q2 Acessado");
        if(palavra.charAt(contador) == 'b'){
            estadoQ7();
        }else if(palavra.charAt(contador) == 'c'){
            estadoQ3();
        }else{
            resultado.setText(recusado);
            System.out.println(recusado);
        }
        
    }
      public void estadoQ3(){
        contador++;
        q3.setText("Estado Q3 Acessado");
        if(palavra.charAt(contador)== 'a' ){
            estadoQ8();
        }else{
            resultado.setText(recusado);
            System.out.println(recusado);
        }
        
    }
       public void estadoQ4(){
        contador++;
        q4.setText("Estado Q4 Acessado");
        if(contador == tamanho){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{          
        
            if(palavra.charAt(contador)== 'a' ){
                estadoQ4();
            }else if(palavra.charAt(contador) == 'b'){
                estadoQ5();
            }else if(palavra.charAt(contador) == 'c'){
                estadoQ6();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }
        
    }
        public void estadoQ5(){
        contador++;
        q5.setText("Estado Q5 Acessado");
        if(contador == tamanho){
            resultado.setText(aceito);
            System.err.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a' ){
                estadoQ9();
            }else if(palavra.charAt(contador) == 'b'){
                estadoQ9();
            }else if(palavra.charAt(contador) == 'c'){
                estadoQ6();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }
    }
     public void estadoQ6(){
        contador++;
        q6.setText("Estado Q6 Acessado");
        if(contador == tamanho){
            resultado.setText(aceito);
            System.err.println(aceito);
        }else{            
            if(palavra.charAt(contador) == 'c'){
                estadoQ6();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }
    }
    public void estadoQ7(){
        contador++;
        q7.setText("Estado Q7 Acessado");
        if(contador == tamanho){
            resultado.setText(aceito);
            System.err.println(aceito);
        }else{
            if(palavra.charAt(contador) == 'b'){
                estadoQ7();
            }else if(palavra.charAt(contador) == 'c'){
                estadoQ3();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }
    
    } 
    public void estadoQ8(){
        contador++;
        q8.setText("Estado Q8 Acessado");
        if(contador == tamanho){
            resultado.setText(aceito);
            System.out.println(aceito);           
        }else{
            resultado.setText(recusado);
            System.out.println(recusado);
        }
    }
    public void estadoQ9(){
         contador++;
         q9.setText("Estado Q9 Acessado");
        if(palavra.charAt(contador)== 'a'){
            estadoQ9();
        }else if(palavra.charAt(contador) == 'b'){
            estadoQ9();
        }else if(palavra.charAt(contador) == 'c'){
            estadoQ6();
        }else{
            resultado.setText(recusado);
            System.out.println(recusado);
        }
        
    }
    public void novo(){
        contador = 0;
        palavra = "";
        resultado.setText("");
        entrada.setText("");
        
        q0.setText("Estado Q0");
        q1.setText("Estado Q1");
        q2.setText("Estado Q2");
        q3.setText("Estado Q3");
        q4.setText("Estado Q4");
        q5.setText("Estado Q5");
        q6.setText("Estado Q6");
        q7.setText("Estado Q7");
        q8.setText("Estado Q8");
        q9.setText("Estado Q9");
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrada = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        q0 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite a Expressão:");

        q0.setText("Estado Q0:");

        q1.setText("Estado Q1:");

        q2.setText("Estado Q2:");

        q3.setText("Estado Q3:");

        q4.setText("Estado Q4:");

        q5.setText("Estado Q5:");

        q6.setText("Estado Q6:");

        q7.setText("Estado Q7:");

        q8.setText("Estado Q8:");

        q9.setText("Estado Q9:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entrada))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q0)
                            .addComponent(q1)
                            .addComponent(q3)
                            .addComponent(q4)
                            .addComponent(q5)
                            .addComponent(q6)
                            .addComponent(q7)
                            .addComponent(q8)
                            .addComponent(q2)
                            .addComponent(q9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(q0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        verificar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        novo();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(automatoFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(automatoFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(automatoFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(automatoFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new automatoFINAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel q0;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
