package IGU;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.Metodos;

public class Principal extends javax.swing.JFrame {

    //HABILITO EL USO DE METODOS DE LA LOGICA
    Metodos metodos = new Metodos();

    //DECLARO VECTORES PARA CADA VARIABLE Y FORMATO PARA FECHAS
    int dni[] = new int[10];
    String nombre[] = new String[10];
    String apellido[] = new String[10];
    String direccion[] = new String[10];
    String telefono[] = new String[10];
    Date nacimiento[] = new Date[10];
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Principal() {
        initComponents();
        //INICIALIZO INDICE EN CERO
        txtIndice.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel2.setText("DNI        :");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Apellido :");

        jLabel5.setText("Direccion :");

        jLabel6.setText("Telefono :");

        jLabel7.setText("F. Nac     :");

        txtDni.setNextFocusableComponent(txtNombre);

        txtNombre.setNextFocusableComponent(txtApellido);

        txtApellido.setNextFocusableComponent(txtDireccion);

        txtDireccion.setNextFocusableComponent(txtTelefono);

        txtTelefono.setNextFocusableComponent(txtNacimiento);

        txtNacimiento.setNextFocusableComponent(btnGuardar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDni))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtTelefono)
                    .addComponent(txtNacimiento))
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, txtApellido, txtDireccion, txtDni, txtNacimiento, txtNombre, txtTelefono});

        btnAtras.setText("<<");
        btnAtras.setNextFocusableComponent(txtDni);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setNextFocusableComponent(txtDni);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAdelante.setText(">>");
        btnAdelante.setNextFocusableComponent(txtDni);
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        jLabel8.setText("Indice :");

        txtIndice.setEditable(false);
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addGap(31, 31, 31)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtIndice)))
                .addGap(44, 44, 44)
                .addComponent(btnAdelante)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnGuardar)
                    .addComponent(btnAdelante))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda Electrónica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        
        //LEO EL INDICE, SI ES MAYOR A CERO LE RESTO 1 Y MUESTRO DATOS DE ESE INDICE
        int indice = Integer.parseInt(txtIndice.getText());
        if (indice > 0) {
            indice = indice - 1;
            txtIndice.setText(String.valueOf(indice));
            if (dni[indice] != 0) { //PORQUE EN INDICES SIN DATOS TIRABA ERROR
                txtDni.setText(String.valueOf(dni[indice]));
            } else {
                txtDni.setText("");
            }
            txtNombre.setText(nombre[indice]);
            txtApellido.setText(apellido[indice]);
            txtDireccion.setText(direccion[indice]);
            txtTelefono.setText(telefono[indice]);
            if (nacimiento[indice] != null) { //PORQUE EN INDICES SIN DATOS TIRABA ERROR
                txtNacimiento.setText(sdf.format(nacimiento[indice]));
            } else {
                txtNacimiento.setText("");
            }
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //LEO EL INDICE, SI HAY DATOS CARGADOS EN TEXTFIELDS, LOS CARGO EN VECTORES
        int indice = Integer.parseInt(txtIndice.getText());

        //VERIFICO QUE HAY DATOS EN TEXTFIELDS
        if (!txtDni.getText().equals("") && !txtNombre.getText().equals("") && !txtApellido.getText().equals("")
                && !txtDireccion.getText().equals("") && !txtTelefono.getText().equals("") && !txtNacimiento.getText().equals("")) {

            //VERIFICO QUE LA FECHA CARGADA SEA VALIDA Y EL DNI NUMERICO
            if (Metodos.validarFecha(txtNacimiento.getText()) && Metodos.validarDni(txtDni.getText())) {
                try {
                    //SI NO HAY PROBLEMA, CARGO LOS DATOS EN VECTORES
                    dni[indice] = Integer.parseInt(txtDni.getText());
                    nombre[indice] = txtNombre.getText();
                    apellido[indice] = txtApellido.getText();
                    direccion[indice] = txtDireccion.getText();
                    telefono[indice] = txtTelefono.getText();
                    sdf.setLenient(false); //EVITA QUE LA FECHA SE CAMBIE POR EJEMPLO DE 30/02 A 01/03
                    nacimiento[indice] = sdf.parse(txtNacimiento.getText());
                    // CONFIRMO QUE DATOS SE GUARDARON    
                    JOptionPane.showMessageDialog(rootPane, "DATOS CARGADOS EXITOSAMENTE", "OK!!", HEIGHT);
                } catch (ParseException e) {
                    //ESTA VACIO PORQUE YA NO SE PRODUCEN EXCEPTION, CATCH ESTA PORQUE EL SYSTEMA OBLIGA
                }
            } else {
                try {
                    //SI HAY PROBLEMA, VEO QUE TIPO DE ERROR SURGE
                    dni[indice] = Integer.parseInt(txtDni.getText());
                    sdf.setLenient(false); //EVITA QUE LA FECHA SE CAMBIE POR EJEMPLO DE 30/02 A 01/03
                    nacimiento[indice] = sdf.parse(txtNacimiento.getText());
                } catch (HeadlessException | NumberFormatException e) {
                    //EN ESTE CASO EL PROBLEMA ES DNI NO NUMERICO, AVISO Y BORRO ESE CAMPO
                    JOptionPane.showMessageDialog(rootPane, "DEBE CARGAR DNI SOLO CON VALOR NUMERICO", "Error!!", HEIGHT);
                    txtDni.setText("");
                } catch (ParseException e) {
                    //EN ESTE CASO AVISO QUE FECHA ES INVALIDA Y BORRO ESE CAMPO
                    JOptionPane.showMessageDialog(rootPane, "DEBE CARGAR FECHA NACIMIENTO VALIDA (dd/MM/yyyy)", "Error!!", HEIGHT);
                    txtNacimiento.setText("");
                }
            }
        } else {
            //SI NO CARGUE DATOS, PONGO MENSAJE DE ERROR EN PANTALLA (SI NO HAGO ESTO SALE EXCEPTION)
            JOptionPane.showMessageDialog(rootPane, "DEBE CARGAR DATOS EN TODOS LOS CAMPOS", "Error!!", HEIGHT);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed

        //LEO EL INDICE, SI ES MENOR A 9 LE RESTO 1 Y MUESTRO DATOS DE ESE INDICE
        int indice = Integer.parseInt(txtIndice.getText());
        if (indice < 9) {
            indice = indice + 1;
            txtIndice.setText(String.valueOf(indice));
            if (dni[indice] != 0) { //PORQUE EN INDICES SIN DATOS TIRABA ERROR
                txtDni.setText(String.valueOf(dni[indice]));
            } else {
                txtDni.setText("");
            }
            txtNombre.setText(nombre[indice]);
            txtApellido.setText(apellido[indice]);
            txtDireccion.setText(direccion[indice]);
            txtTelefono.setText(telefono[indice]);
            if (nacimiento[indice] != null) { 
                txtNacimiento.setText(sdf.format(nacimiento[indice]));
            } else {
                txtNacimiento.setText("");
            }
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
