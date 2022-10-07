/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

/**
 *
 * @author GUILLERMO
 */
public class resultado3 extends javax.swing.JFrame {

    /**
     * Creates new form resultado3
     */
    public resultado3() {
        initComponents();
    }
    
    
    public resultado3(String dx1, String dx2, String dx3,
            String dy1, String dy2, String dy3, String dyB) {
        initComponents();
        this.setLocationRelativeTo(null);
        y1.setText(dy1);
        y2.setText(dy2);
        y3.setText(dy3);
        
        y1x2.setText("(x - (" + dx2 + "))");
        y1x3.setText("(x - (" + dx3 + "))");
        x1y2.setText("(" + dx1 + " - (" + dx2 + "))");
        x1y3.setText("(" + dx1 + " - (" + dx3 + "))");
        
        y2x1.setText("(x - (" + dx1 + "))");
        y2x3.setText("(x - (" + dx3 + "))");
        x2y1.setText("(" + dx2 + " - (" + dx1 + "))");
        x2y3.setText("(" + dx2 + " - (" + dx3 + "))");
        
        y3x1.setText("(x - (" + dx1 + "))");
        y3x2.setText("(x - (" + dx2 + "))");
        x3y1.setText("(" + dx3 + " - (" + dx1 + "))");
        x3y2.setText("(" + dx3 + " - (" + dx2 + "))");
        
        X1= Float.parseFloat(dx1);
        X2= Float.parseFloat(dx2);
        X3= Float.parseFloat(dx3);
        Y1= Float.parseFloat(dy1);
        Y2= Float.parseFloat(dy2);
        Y3= Float.parseFloat(dy3);
        YB= Float.parseFloat(dyB);
        setTStrings(dx1, dx2, dx3,
                dy1, dy2, dy3, dyB);
    }
    
    private void setTStrings(String cx1, String cx2, String cx3,
            String cy1, String cy2, String cy3, String cyb) {
        TX1 = cx1;
        TX2 = cx2;
        TX3 = cx3;
        TY1 = cy1;
        TY2 = cy2;
        TY3 = cy3;
        TYB = cyb;
    }
    
    private void setYBText() {
        y1x2.setText("(" + TYB + " - (" + TX2 + "))");
        y1x3.setText("(" + TYB + " - (" + TX3 + "))");
        
        y2x1.setText("(" + TYB + " - (" + TX1 + "))");
        y2x3.setText("(" + TYB + " - (" + TX3 + "))");
        
        y3x1.setText("(" + TYB + " - (" + TX1 + "))");
        y3x2.setText("(" + TYB + " - (" + TX2 + "))");
    }
    
    private void procedimiento() {
        switch(paso) {
            case 1:
                setYBText();
                instruccionText.setText("Se cambia las X en la fórmula por y() a buscar.");
                yXLabel.setText("y (" + TYB + ") =");
                yXLabel1.setText("y (" + TYB + ") =");
                paso++;
            break;
            case 2:
                paso2Numeros();
                instruccionText.setText("Se realizan las restas necesarias para obtener sus valores.");
                paso++;
            break;
            case 3:
                paso3Numeros();
                instruccionText.setText("Al realizar las multiplicaciones y divisiones necesarias, se obtienen estos cinco valores.");
                paso++;
            break;
            case 4:
                paso4Numeros();
                instruccionText.setText("Se suman los valores. Se obtiene el resultado y se termina el procedimiento.");
                paso++;
            break;
        }
    }
    
    private void paso2Numeros() {
        Y1X2 = YB - X2;
        Y1X3 = YB - X3;
        X1Y2 = X1 - X2;
        X1Y3 = X1 - X3;
        
        Y2X1 = YB - X1;
        Y2X3 = YB - X3;
        X2Y1 = X2 - X1;
        X2Y3 = X2 - X3;
        
        Y3X1 = YB - X1;
        Y3X2 = YB - X2;
        X3Y1 = X3 - X1;
        X3Y2 = X3 - X2;
        
        y1x2V.setText("( " + Float.toString(Y1X2) + " )");
        y1x3V.setText("( " + Float.toString(Y1X3) + " )");
        x1y2V.setText("( " + Float.toString(X1Y2) + " )");
        x1y3V.setText("( " + Float.toString(X1Y3) + " )");
        
        y2x1V.setText("( " + Float.toString(Y2X1) + " )");
        y2x3V.setText("( " + Float.toString(Y2X3) + " )");
        x2y1V.setText("( " + Float.toString(X2Y1) + " )");
        x2y3V.setText("( " + Float.toString(X2Y3) + " )");
        
        y3x1V.setText("( " + Float.toString(Y3X1) + " )");
        y3x2V.setText("( " + Float.toString(Y3X2) + " )");
        x3y1V.setText("( " + Float.toString(X3Y1) + " )");
        x3y2V.setText("( " + Float.toString(X3Y2) + " )");
        
        My1.setText(TY1);
        My2.setText(TY2);
        My3.setText(TY3);
    }
    
    private void paso3Numeros() {
        R1 = (Y1 * Y1X2 * Y1X3) / (X1Y2 * X1Y3);
        R2 = (Y2 * Y2X1 * Y2X3) / (X2Y1 * X2Y3);
        R3 = (Y3 * Y3X1 * Y3X2) / (X3Y1 * X3Y2);
        
        TR1 = Float.toString(R1);
        TR2 = Float.toString(R2);
        TR3 = Float.toString(R3);
        
        rY1.setText(TR1);
        rY2.setText(TR2);
        rY3.setText(TR3);
    }
    
    private void paso4Numeros() {
        RF = R1 + R2 + R3;
        resultadoLabel.setText(Float.toString(RF));
    }
    
    int paso=1;
    
    float X1, X2, X3, X4,
            Y1, Y2, Y3, Y4, YB;
    
    float Y1X2, Y1X3,
            Y2X1, Y2X3,
            Y3X1, Y3X2;
    float X1Y2, X1Y3,
            X2Y1, X2Y3,
            X3Y1, X3Y2;
    
    float R1, R2, R3, RF;
    
    String TX1, TX2, TX3,
            TY1, TY2, TY3, TYB,
            TR1, TR2, TR3, TRF;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        x2y3 = new javax.swing.JLabel();
        x3y1 = new javax.swing.JLabel();
        x2y1 = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();
        y3x2 = new javax.swing.JLabel();
        y3x1 = new javax.swing.JLabel();
        instruccionText = new javax.swing.JTextField();
        x3y1V = new javax.swing.JLabel();
        x3y2 = new javax.swing.JLabel();
        y3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        add8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        yXLabel = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        My1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        y1x2V = new javax.swing.JLabel();
        y1x3V = new javax.swing.JLabel();
        x1y2V = new javax.swing.JLabel();
        x1y3V = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        y1x2 = new javax.swing.JLabel();
        y1x3 = new javax.swing.JLabel();
        y3x1V = new javax.swing.JLabel();
        add6 = new javax.swing.JLabel();
        My2 = new javax.swing.JLabel();
        y2x1V = new javax.swing.JLabel();
        y2x3V = new javax.swing.JLabel();
        SigPaso = new javax.swing.JButton();
        OmiPaso = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        x3y2V = new javax.swing.JLabel();
        My3 = new javax.swing.JLabel();
        x2y3V = new javax.swing.JLabel();
        x2y1V = new javax.swing.JLabel();
        y3x2V = new javax.swing.JLabel();
        yXLabel1 = new javax.swing.JLabel();
        rY3 = new javax.swing.JTextField();
        x1y2 = new javax.swing.JLabel();
        x1y3 = new javax.swing.JLabel();
        add1 = new javax.swing.JLabel();
        y2 = new javax.swing.JLabel();
        y2x1 = new javax.swing.JLabel();
        y2x3 = new javax.swing.JLabel();
        rY1 = new javax.swing.JTextField();
        rY2 = new javax.swing.JTextField();
        add9 = new javax.swing.JLabel();
        add10 = new javax.swing.JLabel();
        add2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("-------------------------------------");

        x2y3.setText("(1 - 0)");

        x3y1.setText("(1 - 0)");

        x2y1.setText("(1 - 0)");

        resultadoLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        resultadoLabel.setText("???");

        y3x2.setText("(x - 0)");

        y3x1.setText("(x - 0)");

        instruccionText.setEditable(false);
        instruccionText.setText("Se comienza el procedimiento, escribiendo la fórmula.");

        x3y1V.setText("(-----)");

        x3y2.setText("(1 - 0)");

        y3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y3.setText("0");

        jLabel4.setText("-------------------------------------");

        jLabel8.setText("-------------------------------------");

        add8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add8.setText("+");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Procedimiento");

        yXLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yXLabel.setText("y (x) =");

        y1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y1.setText("0");

        My1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My1.setText("0");

        jLabel9.setText("-------------------------------------");

        y1x2V.setText("(x)");

        y1x3V.setText("(x)");

        x1y2V.setText("(-----)");

        x1y3V.setText("(-----)");

        jLabel2.setText("-------------------------------------");

        y1x2.setText("(x - 0)");

        y1x3.setText("(x - 0)");

        y3x1V.setText("(x)");

        add6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add6.setText("+");

        My2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My2.setText("0");

        y2x1V.setText("(x)");

        y2x3V.setText("(x)");

        SigPaso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SigPaso.setText("Siguiente Paso");
        SigPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigPasoMouseClicked(evt);
            }
        });

        OmiPaso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OmiPaso.setText("Omitir Pasos");
        OmiPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OmiPasoMouseClicked(evt);
            }
        });

        regresarButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regresarButton.setText("Regresar");
        regresarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarButtonMouseClicked(evt);
            }
        });

        jLabel11.setText("-------------------------------------");

        x3y2V.setText("(-----)");

        My3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My3.setText("0");

        x2y3V.setText("(-----)");

        x2y1V.setText("(-----)");

        y3x2V.setText("(x)");

        yXLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yXLabel1.setText("y (x) =");

        rY3.setEditable(false);
        rY3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY3.setText("----");

        x1y2.setText("(1 - 0)");

        x1y3.setText("(1 - 0)");

        add1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add1.setText("+");

        y2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y2.setText("0");

        y2x1.setText("(x - 0)");

        y2x3.setText("(x - 0)");

        rY1.setEditable(false);
        rY1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY1.setText("----");

        rY2.setEditable(false);
        rY2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY2.setText("----");

        add9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add9.setText("+");

        add10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add10.setText("+");

        add2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add2.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(yXLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(y1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(y1x2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(y1x3)
                                                        .addGap(72, 72, 72)))
                                                .addGap(18, 18, 18)
                                                .addComponent(add1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(y2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(x2y1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(x2y3))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel3)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(y2x1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(y2x3)
                                                                .addGap(72, 72, 72)))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(add2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(y3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(x3y1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(x3y2))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(y3x1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y3x2)
                                                            .addGap(72, 72, 72)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(x1y2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(x1y3)))
                                        .addGap(403, 403, 403))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SigPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)
                                        .addComponent(OmiPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(178, 178, 178)))
                                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(My1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(add6))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(y1x2V)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(y1x3V)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(My2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(add8))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(y2x1V)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(y2x3V))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(x2y1V)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(x2y3V)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(My3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(x3y1V)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(x3y2V))
                                                    .addComponent(jLabel8)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(y3x1V)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(y3x2V))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(x1y2V)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(x1y3V))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(yXLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rY1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(add9)
                                                .addGap(10, 10, 10)
                                                .addComponent(rY2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(add10)
                                                .addGap(24, 24, 24)
                                                .addComponent(rY3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(57, 57, 57)
                                        .addComponent(resultadoLabel)))
                                .addGap(407, 407, 407)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(y2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y2x1)
                                    .addComponent(y2x3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(add2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x2y1)
                            .addComponent(x2y3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(y1)
                                .addComponent(yXLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y1x2)
                                    .addComponent(y1x3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(add1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x1y2)
                            .addComponent(x1y3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(y3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y3x1)
                                    .addComponent(y3x2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x3y1)
                            .addComponent(x3y2))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(My2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y2x1V)
                                    .addComponent(y2x3V))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(add8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x2y1V)
                            .addComponent(x2y3V)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(My1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y1x2V)
                                    .addComponent(y1x3V))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(add6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x1y2V)
                            .addComponent(x1y3V)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(My3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y3x1V)
                                    .addComponent(y3x2V))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x3y1V)
                            .addComponent(x3y2V))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rY3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rY1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rY2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add9)
                    .addComponent(add10))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yXLabel1)
                    .addComponent(resultadoLabel))
                .addGap(66, 66, 66)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigPaso)
                    .addComponent(OmiPaso)
                    .addComponent(regresarButton))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SigPasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigPasoMouseClicked
        // TODO add your handling code here:
        procedimiento();
    }//GEN-LAST:event_SigPasoMouseClicked

    private void OmiPasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OmiPasoMouseClicked
        // TODO add your handling code here:
        while(paso != 5) {
            procedimiento();
        }
    }//GEN-LAST:event_OmiPasoMouseClicked

    private void regresarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarButtonMouseClicked
        entradaDatos b = new entradaDatos();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(resultado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultado3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel My1;
    private javax.swing.JLabel My2;
    private javax.swing.JLabel My3;
    private javax.swing.JButton OmiPaso;
    private javax.swing.JButton SigPaso;
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add10;
    private javax.swing.JLabel add2;
    private javax.swing.JLabel add6;
    private javax.swing.JLabel add8;
    private javax.swing.JLabel add9;
    private javax.swing.JTextField instruccionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rY1;
    private javax.swing.JTextField rY2;
    private javax.swing.JTextField rY3;
    private javax.swing.JButton regresarButton;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel x1y2;
    private javax.swing.JLabel x1y2V;
    private javax.swing.JLabel x1y3;
    private javax.swing.JLabel x1y3V;
    private javax.swing.JLabel x2y1;
    private javax.swing.JLabel x2y1V;
    private javax.swing.JLabel x2y3;
    private javax.swing.JLabel x2y3V;
    private javax.swing.JLabel x3y1;
    private javax.swing.JLabel x3y1V;
    private javax.swing.JLabel x3y2;
    private javax.swing.JLabel x3y2V;
    private javax.swing.JLabel y1;
    private javax.swing.JLabel y1x2;
    private javax.swing.JLabel y1x2V;
    private javax.swing.JLabel y1x3;
    private javax.swing.JLabel y1x3V;
    private javax.swing.JLabel y2;
    private javax.swing.JLabel y2x1;
    private javax.swing.JLabel y2x1V;
    private javax.swing.JLabel y2x3;
    private javax.swing.JLabel y2x3V;
    private javax.swing.JLabel y3;
    private javax.swing.JLabel y3x1;
    private javax.swing.JLabel y3x1V;
    private javax.swing.JLabel y3x2;
    private javax.swing.JLabel y3x2V;
    private javax.swing.JLabel yXLabel;
    private javax.swing.JLabel yXLabel1;
    // End of variables declaration//GEN-END:variables
}
