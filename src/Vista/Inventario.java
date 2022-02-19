
package Vista;

import Modelo.Detalle;
import Modelo.Productos;
import Modelo.ProductosINV;
import Modelo.VentaRealizada;
import Modelo.VentaRealizadaINV;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inventario extends javax.swing.JFrame {

    Productos pro = new Productos();
    ProductosINV proINV = new ProductosINV();
    DefaultTableModel modelo = new DefaultTableModel();
    VentaRealizada v = new VentaRealizada();
    VentaRealizadaINV VINV = new VentaRealizadaINV();
    Detalle Dv = new Detalle();
    int item;
    
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtIDpro.setVisible(false);
    }
    public void ListarProductos(){
        List<Productos> Listarpro = proINV.ListarProductos();
        modelo = (DefaultTableModel) TableProducto.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < Listarpro.size(); i++) {
            ob[0] = Listarpro.get(i).getIDproducto();
            ob[1] = Listarpro.get(i).getNombreProducto();
            ob[2] = Listarpro.get(i).getReferencia();
            ob[3] = Listarpro.get(i).getPrecio();
            ob[4] = Listarpro.get(i).getPeso();
            ob[5] = Listarpro.get(i).getCategoria();
            ob[6] = Listarpro.get(i).getStock();
            ob[7] = Listarpro.get(i).getFechaCreacion();
            modelo.addRow(ob);
            
            TableProducto.setModel(modelo);
                

        }
    }

    public void LimpiarTable(){
    for (int i = 0; i <modelo.getRowCount();i++){
        modelo.removeRow(i);
        i = i-1;
    }
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jproducto = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNomPro = new javax.swing.JTextField();
        txtRefPro = new javax.swing.JTextField();
        txtPrepro = new javax.swing.JTextField();
        txtPesoPro = new javax.swing.JTextField();
        txtCatPro = new javax.swing.JTextField();
        txtstPro = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Buttonlistarproductos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        Guardarproducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtfcpro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDpro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablaventasrealizadas = new javax.swing.JTable();
        txtStockDisponible = new javax.swing.JPanel();
        Labelidventa = new javax.swing.JLabel();
        Labelcantidadventa = new javax.swing.JLabel();
        txtIDventa = new javax.swing.JTextField();
        txtcantidadventa = new javax.swing.JTextField();
        Eliminarventa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        Generarventa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnproventa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtrefventa = new javax.swing.JTextField();
        txtpreventa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jButton1.setText("Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Productos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ventas Realizadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafecasa.jpg"))); // NOI18N

        jLabel7.setText("Nombre Producto");

        jLabel8.setText("Referencia");

        jLabel9.setText("Precio");

        jLabel10.setText("Peso");

        jLabel11.setText("Categoria");

        jLabel12.setText("Stock");

        btnCrear.setText("Crear");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Buttonlistarproductos.setText("Listar");
        Buttonlistarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonlistarproductosActionPerformed(evt);
            }
        });

        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Producto", "Referencia", "Precio", "Peso", "Categoria", "Stock", "Fecha"
            }
        ));
        TableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProducto);
        if (TableProducto.getColumnModel().getColumnCount() > 0) {
            TableProducto.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableProducto.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableProducto.getColumnModel().getColumn(2).setPreferredWidth(20);
            TableProducto.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableProducto.getColumnModel().getColumn(4).setPreferredWidth(15);
            TableProducto.getColumnModel().getColumn(5).setPreferredWidth(30);
            TableProducto.getColumnModel().getColumn(6).setPreferredWidth(20);
            TableProducto.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        Guardarproducto.setText("Guardar");
        Guardarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarproductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Creacion");

        jLabel3.setText("IDproducto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41)
                                .addComponent(txtRefPro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtstPro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfcpro))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPesoPro, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtPrepro)
                                    .addComponent(txtCatPro)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomPro, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtIDpro))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Guardarproducto)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buttonlistarproductos)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtIDpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtRefPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrepro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPesoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCatPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtstPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtfcpro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar)
                    .addComponent(Guardarproducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonlistarproductos)
                    .addComponent(btnEliminar))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jproducto.addTab("Productos", jPanel3);

        Tablaventasrealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Producto", "Referencia", "Precio"
            }
        ));
        Tablaventasrealizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaventasrealizadasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tablaventasrealizadas);
        if (Tablaventasrealizadas.getColumnModel().getColumnCount() > 0) {
            Tablaventasrealizadas.getColumnModel().getColumn(0).setPreferredWidth(5);
            Tablaventasrealizadas.getColumnModel().getColumn(1).setPreferredWidth(30);
            Tablaventasrealizadas.getColumnModel().getColumn(2).setPreferredWidth(10);
            Tablaventasrealizadas.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jproducto.addTab("VentasRealizadas", jPanel4);

        Labelidventa.setText("ID");

        Labelcantidadventa.setText("Cantidad");

        txtIDventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDventaKeyPressed(evt);
            }
        });

        txtcantidadventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadventaActionPerformed(evt);
            }
        });
        txtcantidadventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadventaKeyPressed(evt);
            }
        });

        Eliminarventa.setText("Eliminar");

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDprod", "Cantidad", "NombreProd", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TableVenta);
        if (TableVenta.getColumnModel().getColumnCount() > 0) {
            TableVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        Generarventa.setText("Generar Venta");
        Generarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarventaActionPerformed(evt);
            }
        });

        jLabel4.setText("Stock Disponible");

        jLabel6.setText("NProducto");

        txtnproventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnproventaActionPerformed(evt);
            }
        });

        jLabel13.setText("Referencia");

        jLabel14.setText("Precio");

        javax.swing.GroupLayout txtStockDisponibleLayout = new javax.swing.GroupLayout(txtStockDisponible);
        txtStockDisponible.setLayout(txtStockDisponibleLayout);
        txtStockDisponibleLayout.setHorizontalGroup(
            txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labelidventa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtnproventa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)))
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Labelcantidadventa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtrefventa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtpreventa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtcantidadventa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
            .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(Eliminarventa))
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(Generarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtStockDisponibleLayout.setVerticalGroup(
            txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Labelidventa)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Labelcantidadventa)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtStockDisponibleLayout.createSequentialGroup()
                        .addGroup(txtStockDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnproventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrefventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpreventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(Eliminarventa))
                    .addComponent(txtcantidadventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(Generarventa)
                .addGap(37, 37, 37))
        );

        jproducto.addTab("Ventas", txtStockDisponible);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jproducto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarproductoActionPerformed
        // TODO add your handling code here
        if (!"".equals(txtNomPro.getText()) || !"".equals(txtRefPro.getText()) || !"".equals(txtPrepro.getText()) || !"".equals(txtPesoPro.getText()) || !"".equals(txtCatPro.getText()) || !"".equals(txtstPro.getText()) || !"".equals(txtfcpro.getText())){
            pro.setNombreProducto(txtNomPro.getText());
            pro.setReferencia(txtRefPro.getText());
            pro.setPrecio(Integer.parseInt(txtPrepro.getText()));
            pro.setPeso(Integer.parseInt(txtPesoPro.getText()));
            pro.setCategoria(txtCatPro.getText());
            pro.setStock(Integer.parseInt(txtstPro.getText()));
            pro.setFechaCreacion(txtfcpro.getText());
            proINV.RegistrarProductos(pro);
            LimpiarTable();
            LimpiarProducto();
            ListarProductos();
            JOptionPane.showMessageDialog(null, "Producto Guardado");
        }else{
            JOptionPane.showMessageDialog(null, "Los Campos Estan Vacios");
    }//GEN-LAST:event_GuardarproductoActionPerformed
    }
    private void ButtonlistarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonlistarproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonlistarproductosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarProductos();
        jproducto.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaventasrealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaventasrealizadasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaventasrealizadasMouseClicked

    private void TableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductoMouseClicked
        // TODO add your handling code here:
        int fila = TableProducto.rowAtPoint(evt.getPoint());
        txtIDpro.setText(TableProducto.getValueAt(fila,0).toString());
        txtNomPro.setText(TableProducto.getValueAt(fila,1).toString());
        txtRefPro.setText(TableProducto.getValueAt(fila,2).toString());
        txtPrepro.setText(TableProducto.getValueAt(fila,3).toString());
        txtPesoPro.setText(TableProducto.getValueAt(fila,4).toString());
        txtCatPro.setText(TableProducto.getValueAt(fila,5).toString());
        txtstPro.setText(TableProducto.getValueAt(fila,6).toString());
        txtfcpro.setText(TableProducto.getValueAt(fila,7).toString());
        
    }//GEN-LAST:event_TableProductoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIDpro.getText())){
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta Seguro De Elimnar El Producto");
        if(pregunta==0) {
            int IDproducto = Integer.parseInt(txtIDpro.getText());
            proINV.EliminarProducto(IDproducto);
            LimpiarTable();
            LimpiarProducto();
            ListarProductos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtIDpro.getText())) {
         JOptionPane.showMessageDialog(null, "Seleccione Una Fila");
        }else{
            
            if(!"".equals(txtNomPro.getText()) || !"".equals(txtRefPro.getText()) || !"".equals(txtPrepro.getText())|| !"".equals(txtPesoPro.getText())|| !"".equals(txtCatPro.getText())|| !"".equals(txtstPro.getText())|| !"".equals(txtfcpro.getText())){
            pro.setNombreProducto(txtNomPro.getText());
            pro.setReferencia(txtRefPro.getText());
            pro.setPrecio(Integer.parseInt(txtPrepro.getText()));
            pro.setPeso(Integer.parseInt(txtPesoPro.getText()));
            pro.setCategoria(txtCatPro.getText());
            pro.setStock(Integer.parseInt(txtstPro.getText()));
            pro.setFechaCreacion(txtfcpro.getText());
            pro.setIDproducto(Integer.parseInt(txtIDpro.getText()));
            proINV.EditarProducto(pro);
            JOptionPane.showMessageDialog(null, "Producto Actualizado");
            LimpiarTable();
            LimpiarProducto();
            ListarProductos();
            }else{
                JOptionPane.showMessageDialog(null, "Los Campos Estan Vacios");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    }
    private void GenerarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarventaActionPerformed
        // TODO add your handling code here:
        RegistrarVentaRealizada();
        RegistrarDetalle();
    }//GEN-LAST:event_GenerarventaActionPerformed

    private void txtcantidadventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadventaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(txtcantidadventa.getText())){
                int IDprod =Integer.parseInt(txtIDventa.getText());
                String NombreProd = (txtnproventa.getText());
                String Refe= (txtrefventa.getText());
                int Prec =Integer.parseInt(txtpreventa.getText());
                int Cantidad =Integer.parseInt(txtcantidadventa.getText());
                int stock = Integer.parseInt(txtStock.getText());
                if (stock >=Cantidad) {
                    item = item +1;
                    modelo = (DefaultTableModel) TableVenta.getModel();
                    ArrayList Lista = new ArrayList();
                    Lista.add(item);
                    Lista.add(IDprod);
                    Lista.add(Cantidad);
                    Lista.add(NombreProd);
                    Lista.add(Refe);
                    Lista.add(Prec);
                    Object[] O = new Object[4];
                    O[0] = Lista.get(1);
                    O[1] = Lista.get(2);
                    O[2] = Lista.get(3);
                    O[3] = Lista.get(4);
                    modelo.addRow(O);
                    TableVenta.setModel(modelo);
                }else{
                    JOptionPane.showMessageDialog(null, "No Es Posible Realizar La Venta");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese Cantidad");
            }
        }
    }//GEN-LAST:event_txtcantidadventaKeyPressed

    private void txtcantidadventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadventaActionPerformed

    private void txtIDventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDventaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!"".equals(txtIDventa.getText())) {
                int IDproducto = Integer.parseInt(txtIDventa.getText());
                pro = proINV.BuscarPro(IDproducto);
                if(pro.getNombreProducto() !=null){
                    txtnproventa.setText(""+pro.getNombreProducto());
                    txtrefventa.setText(""+pro.getReferencia());
                    txtpreventa.setText(""+pro.getPrecio());
                    txtStock.setText(""+pro.getStock());
                    txtcantidadventa.requestFocus();
                }else{
                    txtnproventa.setText("");
                    txtrefventa.setText("");
                    txtpreventa.setText("");
                    txtStock.setText("");
                    txtIDventa.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese El ID Del Producto");
                txtIDventa.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIDventaKeyPressed

    private void txtnproventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnproventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnproventaActionPerformed
          private void LimpiarVenta(){
           txtIDventa.setText("");
           txtcantidadventa.setText("");
           txtnproventa.setText("");
           txtrefventa.setText("");
           txtpreventa.setText("");
           txtStock.setText("");
        }
       private void RegistrarVentaRealizada(){
       String Nombre_pvr = txtnproventa.getText();
       String Referencia_pvr = txtrefventa.getText();
       int Precio_pvr = Integer.parseInt(txtpreventa.getText());
       v.setNombre_pvr(Nombre_pvr);
       v.setReferencia_pvr(Referencia_pvr);
       v.setPrecio_pvr(Precio_pvr);
       VINV.RegistrarVenta(v);
       }
       private void RegistrarDetalle(){
        for (int i = 0; i <TableVenta.getRowCount(); i++){
            int IDprod = Integer.parseInt(TableVenta.getValueAt(i, 0).toString());
            int Cant = Integer.parseInt(TableVenta.getValueAt(i, 2).toString());
            int Prec = Integer.parseInt(TableVenta.getValueAt(i, 3).toString());
            int IDV = 1;
            Dv.setID_prod(IDprod);
            Dv.setCantidaddetalle(Cant);
            Dv.setPreciodetalle(Prec);
            Dv.setID_Venta(IDV);
            VINV.RegistrarDetalle(Dv);
        }
       }
    
      
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonlistarproductos;
    private javax.swing.JButton Eliminarventa;
    private javax.swing.JButton Generarventa;
    private javax.swing.JButton Guardarproducto;
    private javax.swing.JLabel Labelcantidadventa;
    private javax.swing.JLabel Labelidventa;
    private javax.swing.JTable Tablaventasrealizadas;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTable TableVenta;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jproducto;
    private javax.swing.JTextField txtCatPro;
    private javax.swing.JTextField txtIDpro;
    private javax.swing.JTextField txtIDventa;
    private javax.swing.JTextField txtNomPro;
    private javax.swing.JTextField txtPesoPro;
    private javax.swing.JTextField txtPrepro;
    private javax.swing.JTextField txtRefPro;
    private javax.swing.JTextField txtStock;
    private javax.swing.JPanel txtStockDisponible;
    private javax.swing.JTextField txtcantidadventa;
    private javax.swing.JTextField txtfcpro;
    private javax.swing.JTextField txtnproventa;
    private javax.swing.JTextField txtpreventa;
    private javax.swing.JTextField txtrefventa;
    private javax.swing.JTextField txtstPro;
    // End of variables declaration//GEN-END:variables
private void LimpiarProducto(){
    txtIDpro.setText("");
    txtNomPro.setText("");
    txtRefPro.setText("");
    txtPrepro.setText("");
    txtPesoPro.setText("");
    txtCatPro.setText("");
    txtstPro.setText("");
    txtfcpro.setText("");
}

}

