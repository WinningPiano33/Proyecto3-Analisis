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
public class resultado5 extends javax.swing.JFrame {

    /**
     * Creates new form resultado5
     */
    public resultado5() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public resultado5(String dx1, String dx2, String dx3, String dx4, String dx5,
            String dy1, String dy2, String dy3, String dy4, String dy5, String dyB) {
        initComponents();
        this.setLocationRelativeTo(null);
        y1.setText(dy1);
        y2.setText(dy2);
        y3.setText(dy3);
        y4.setText(dy4);
        y5.setText(dy5);
        
        y1x2.setText("(x - (" + dx2 + "))");
        y1x3.setText("(x - (" + dx3 + "))");
        y1x4.setText("(x - (" + dx4 + "))");
        y1x5.setText("(x - (" + dx5 + "))");
        x1y2.setText("(" + dx1 + " - (" + dx2 + "))");
        x1y3.setText("(" + dx1 + " - (" + dx3 + "))");
        x1y4.setText("(" + dx1 + " - (" + dx4 + "))");
        x1y5.setText("(" + dx1 + " - (" + dx5 + "))");
        
        y2x1.setText("(x - (" + dx1 + "))");
        y2x3.setText("(x - (" + dx3 + "))");
        y2x4.setText("(x - (" + dx4 + "))");
        y2x5.setText("(x - (" + dx5 + "))");
        x2y1.setText("(" + dx2 + " - (" + dx1 + "))");
        x2y3.setText("(" + dx2 + " - (" + dx3 + "))");
        x2y4.setText("(" + dx2 + " - (" + dx4 + "))");
        x2y5.setText("(" + dx2 + " - (" + dx5 + "))");
        
        y3x1.setText("(x - (" + dx1 + "))");
        y3x2.setText("(x - (" + dx2 + "))");
        y3x4.setText("(x - (" + dx4 + "))");
        y3x5.setText("(x - (" + dx5 + "))");
        x3y1.setText("(" + dx3 + " - (" + dx1 + "))");
        x3y2.setText("(" + dx3 + " - (" + dx2 + "))");
        x3y4.setText("(" + dx3 + " - (" + dx4 + "))");
        x3y5.setText("(" + dx3 + " - (" + dx5 + "))");
        
        y4x1.setText("(x - (" + dx1 + "))");
        y4x2.setText("(x - (" + dx2 + "))");
        y4x3.setText("(x - (" + dx3 + "))");
        y4x5.setText("(x - (" + dx5 + "))");
        x4y1.setText("(" + dx4 + " - (" + dx1 + "))");
        x4y2.setText("(" + dx4 + " - (" + dx2 + "))");
        x4y3.setText("(" + dx4 + " - (" + dx3 + "))");
        x4y5.setText("(" + dx4 + " - (" + dx5 + "))");
        
        y5x1.setText("(x - (" + dx1 + "))");
        y5x2.setText("(x - (" + dx2 + "))");
        y5x3.setText("(x - (" + dx3 + "))");
        y5x4.setText("(x - (" + dx4 + "))");
        x5y1.setText("(" + dx5 + " - (" + dx1 + "))");
        x5y2.setText("(" + dx5 + " - (" + dx2 + "))");
        x5y3.setText("(" + dx5 + " - (" + dx3 + "))");
        x5y4.setText("(" + dx5 + " - (" + dx4 + "))");
        
        X1= Float.parseFloat(dx1);
        X2= Float.parseFloat(dx2);
        X3= Float.parseFloat(dx3);
        X4= Float.parseFloat(dx4);
        X5= Float.parseFloat(dx5);
        Y1= Float.parseFloat(dy1);
        Y2= Float.parseFloat(dy2);
        Y3= Float.parseFloat(dy3);
        Y4= Float.parseFloat(dy4);
        Y5= Float.parseFloat(dy5);
        YB= Float.parseFloat(dyB);
        setTStrings(dx1, dx2, dx3, dx4, dx5,
                dy1, dy2, dy3, dy4, dy5, dyB);
    }
    
    private void setYBText() {
        y1x2.setText("(" + TYB + " - (" + TX2 + "))");
        y1x3.setText("(" + TYB + " - (" + TX3 + "))");
        y1x4.setText("(" + TYB + " - (" + TX4 + "))");
        y1x5.setText("(" + TYB + " - (" + TX5 + "))");
        
        y2x1.setText("(" + TYB + " - (" + TX1 + "))");
        y2x3.setText("(" + TYB + " - (" + TX3 + "))");
        y2x4.setText("(" + TYB + " - (" + TX4 + "))");
        y2x5.setText("(" + TYB + " - (" + TX5 + "))");
        
        y3x1.setText("(" + TYB + " - (" + TX1 + "))");
        y3x2.setText("(" + TYB + " - (" + TX2 + "))");
        y3x4.setText("(" + TYB + " - (" + TX4 + "))");
        y3x5.setText("(" + TYB + " - (" + TX5 + "))");
        
        y4x1.setText("(" + TYB + " - (" + TX1 + "))");
        y4x2.setText("(" + TYB + " - (" + TX2 + "))");
        y4x3.setText("(" + TYB + " - (" + TX3 + "))");
        y4x5.setText("(" + TYB + " - (" + TX5 + "))");
        
        y5x1.setText("(" + TYB + " - (" + TX1 + "))");
        y5x2.setText("(" + TYB + " - (" + TX2 + "))");
        y5x3.setText("(" + TYB + " - (" + TX3 + "))");
        y5x4.setText("(" + TYB + " - (" + TX4 + "))");
    }
    
    private void setTStrings(String cx1, String cx2, String cx3, String cx4, String cx5,
            String cy1, String cy2, String cy3, String cy4, String cy5, String cyb) {
        TX1 = cx1;
        TX2 = cx2;
        TX3 = cx3;
        TX4 = cx4;
        TX5 = cx5;
        TY1 = cy1;
        TY2 = cy2;
        TY3 = cy3;
        TY4 = cy4;
        TY5 = cy5;
        TYB = cyb;
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
        Y1X4 = YB - X4;
        Y1X5 = YB - X5;
        X1Y2 = X1 - X2;
        X1Y3 = X1 - X3;
        X1Y4 = X1 - X4;
        X1Y5 = X1 - X5;
        
        Y2X1 = YB - X1;
        Y2X3 = YB - X3;
        Y2X4 = YB - X4;
        Y2X5 = YB - X5;
        X2Y1 = X2 - X1;
        X2Y3 = X2 - X3;
        X2Y4 = X2 - X4;
        X2Y5 = X2 - X5;
        
        Y3X1 = YB - X1;
        Y3X2 = YB - X2;
        Y3X4 = YB - X4;
        Y3X5 = YB - X5;
        X3Y1 = X3 - X1;
        X3Y2 = X3 - X2;
        X3Y4 = X3 - X4;
        X3Y5 = X3 - X5;
        
        Y4X1 = YB - X1;
        Y4X2 = YB - X2;
        Y4X3 = YB - X3;
        Y4X5 = YB - X5;
        X4Y1 = X4 - X1;
        X4Y2 = X4 - X2;
        X4Y3 = X4 - X3;
        X4Y5 = X4 - X5;
        
        Y5X1 = YB - X1;
        Y5X2 = YB - X2;
        Y5X3 = YB - X3;
        Y5X4 = YB - X4;
        X5Y1 = X5 - X1;
        X5Y2 = X5 - X2;
        X5Y3 = X5 - X3;
        X5Y4 = X5 - X4;
        
        y1x2V.setText("( " + Float.toString(Y1X2) + " )");
        y1x3V.setText("( " + Float.toString(Y1X3) + " )");
        y1x4V.setText("( " + Float.toString(Y1X4) + " )");
        y1x5V.setText("( " + Float.toString(Y1X5) + " )");
        x1y2V.setText("( " + Float.toString(X1Y2) + " )");
        x1y3V.setText("( " + Float.toString(X1Y3) + " )");
        x1y4V.setText("( " + Float.toString(X1Y4) + " )");
        x1y5V.setText("( " + Float.toString(X1Y5) + " )");
        
        y2x1V.setText("( " + Float.toString(Y2X1) + " )");
        y2x3V.setText("( " + Float.toString(Y2X3) + " )");
        y2x4V.setText("( " + Float.toString(Y2X4) + " )");
        y2x5V.setText("( " + Float.toString(Y2X5) + " )");
        x2y1V.setText("( " + Float.toString(X2Y1) + " )");
        x2y3V.setText("( " + Float.toString(X2Y3) + " )");
        x2y4V.setText("( " + Float.toString(X2Y4) + " )");
        x2y5V.setText("( " + Float.toString(X2Y5) + " )");
        
        y3x1V.setText("( " + Float.toString(Y3X1) + " )");
        y3x2V.setText("( " + Float.toString(Y3X2) + " )");
        y3x4V.setText("( " + Float.toString(Y3X4) + " )");
        y3x5V.setText("( " + Float.toString(Y3X5) + " )");
        x3y1V.setText("( " + Float.toString(X3Y1) + " )");
        x3y2V.setText("( " + Float.toString(X3Y2) + " )");
        x3y4V.setText("( " + Float.toString(X3Y4) + " )");
        x3y5V.setText("( " + Float.toString(X3Y5) + " )");
        
        y4x1V.setText("( " + Float.toString(Y4X1) + " )");
        y4x2V.setText("( " + Float.toString(Y4X2) + " )");
        y4x3V.setText("( " + Float.toString(Y4X3) + " )");
        y4x5V.setText("( " + Float.toString(Y4X5) + " )");
        x4y1V.setText("( " + Float.toString(X4Y1) + " )");
        x4y2V.setText("( " + Float.toString(X4Y2) + " )");
        x4y3V.setText("( " + Float.toString(X4Y3) + " )");
        x4y5V.setText("( " + Float.toString(X4Y5) + " )");
        
        y5x1V.setText("( " + Float.toString(Y5X1) + " )");
        y5x2V.setText("( " + Float.toString(Y5X2) + " )");
        y5x3V.setText("( " + Float.toString(Y5X3) + " )");
        y5x4V.setText("( " + Float.toString(Y5X4) + " )");
        x5y1V.setText("( " + Float.toString(X5Y1) + " )");
        x5y2V.setText("( " + Float.toString(X5Y2) + " )");
        x5y3V.setText("( " + Float.toString(X5Y3) + " )");
        x5y4V.setText("( " + Float.toString(X5Y4) + " )");
        
        My1.setText(TY1);
        My2.setText(TY2);
        My3.setText(TY3);
        My4.setText(TY4);
        My5.setText(TY5);
    }
    
    private void paso3Numeros() {
        R1 = (Y1 * Y1X2 * Y1X3 * Y1X4 * Y1X5) / (X1Y2 * X1Y3 * X1Y4 * X1Y5);
        R2 = (Y2 * Y2X1 * Y2X3 * Y2X4 * Y2X5) / (X2Y1 * X2Y3 * X2Y4 * X2Y5);
        R3 = (Y3 * Y3X1 * Y3X2 * Y3X4 * Y3X5) / (X3Y1 * X3Y2 * X3Y4 * X3Y5);
        R4 = (Y4 * Y4X1 * Y4X2 * Y4X3 * Y4X5) / (X4Y1 * X4Y2 * X4Y3 * X4Y5);
        R5 = (Y5 * Y5X1 * Y5X2 * Y5X3 * Y5X4) / (X5Y1 * X5Y2 * X5Y3 * X5Y4);
        
        TR1 = Float.toString(R1);
        TR2 = Float.toString(R2);
        TR3 = Float.toString(R3);
        TR4 = Float.toString(R4);
        TR5 = Float.toString(R5);
        
        rY1.setText(TR1);
        rY2.setText(TR2);
        rY3.setText(TR3);
        rY4.setText(TR4);
        rY5.setText(TR5);
    }
    
    private void paso4Numeros() {
        RF = R1 + R2 + R3 + R4 + R5;
        resultadoLabel.setText(Float.toString(RF));
    }
    
    int paso=1;
    
    float X1, X2, X3, X4, X5,
            Y1, Y2, Y3, Y4, Y5, YB;
    
    float Y1X2, Y1X3, Y1X4, Y1X5,
            Y2X1, Y2X3, Y2X4, Y2X5,
            Y3X1, Y3X2, Y3X4, Y3X5,
            Y4X1, Y4X2, Y4X3, Y4X5,
            Y5X1, Y5X2, Y5X3, Y5X4;
    float X1Y2, X1Y3, X1Y4, X1Y5,
            X2Y1, X2Y3, X2Y4, X2Y5,
            X3Y1, X3Y2, X3Y4, X3Y5,
            X4Y1, X4Y2, X4Y3, X4Y5,
            X5Y1, X5Y2, X5Y3, X5Y4;
    
    float R1, R2, R3, R4, R5, RF;
    
    String TX1, TX2, TX3, TX4, TX5,
            TY1, TY2, TY3, TY4, TY5, TYB,
            TR1, TR2, TR3, TR4, TR5, TRF;
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        y3x4 = new javax.swing.JLabel();
        y3x5 = new javax.swing.JLabel();
        x3y2 = new javax.swing.JLabel();
        y3 = new javax.swing.JLabel();
        add3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        x4y2 = new javax.swing.JLabel();
        x4y3 = new javax.swing.JLabel();
        x4y1 = new javax.swing.JLabel();
        y4x5 = new javax.swing.JLabel();
        x4y5 = new javax.swing.JLabel();
        add4 = new javax.swing.JLabel();
        y4 = new javax.swing.JLabel();
        y4x3 = new javax.swing.JLabel();
        y4x2 = new javax.swing.JLabel();
        y4x1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        x5y2 = new javax.swing.JLabel();
        x5y3 = new javax.swing.JLabel();
        x5y1 = new javax.swing.JLabel();
        y5x4 = new javax.swing.JLabel();
        x5y4 = new javax.swing.JLabel();
        y5 = new javax.swing.JLabel();
        y5x3 = new javax.swing.JLabel();
        y5x2 = new javax.swing.JLabel();
        y5x1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        instruccionText = new javax.swing.JTextField();
        SigPaso = new javax.swing.JButton();
        OmiPaso = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        x3y5V = new javax.swing.JLabel();
        x3y1V = new javax.swing.JLabel();
        x5y3V = new javax.swing.JLabel();
        x5y1V = new javax.swing.JLabel();
        y5x4V = new javax.swing.JLabel();
        x5y4V = new javax.swing.JLabel();
        My5 = new javax.swing.JLabel();
        add7 = new javax.swing.JLabel();
        y5x3V = new javax.swing.JLabel();
        My4 = new javax.swing.JLabel();
        y3x1V = new javax.swing.JLabel();
        y4x3V = new javax.swing.JLabel();
        y4x2V = new javax.swing.JLabel();
        y2x5V = new javax.swing.JLabel();
        y4x1V = new javax.swing.JLabel();
        add8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        x5y2V = new javax.swing.JLabel();
        y5x2V = new javax.swing.JLabel();
        x3y4V = new javax.swing.JLabel();
        y5x1V = new javax.swing.JLabel();
        y3x4V = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        y3x5V = new javax.swing.JLabel();
        x3y2V = new javax.swing.JLabel();
        My3 = new javax.swing.JLabel();
        x2y4V = new javax.swing.JLabel();
        add5 = new javax.swing.JLabel();
        x2y3V = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        x2y1V = new javax.swing.JLabel();
        x2y5V = new javax.swing.JLabel();
        y3x2V = new javax.swing.JLabel();
        yXLabel1 = new javax.swing.JLabel();
        rY3 = new javax.swing.JTextField();
        rY1 = new javax.swing.JTextField();
        rY2 = new javax.swing.JTextField();
        add9 = new javax.swing.JLabel();
        x4y2V = new javax.swing.JLabel();
        x4y3V = new javax.swing.JLabel();
        My1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        y1x2V = new javax.swing.JLabel();
        y1x3V = new javax.swing.JLabel();
        y1x4V = new javax.swing.JLabel();
        y1x5V = new javax.swing.JLabel();
        add10 = new javax.swing.JLabel();
        x1y2V = new javax.swing.JLabel();
        add11 = new javax.swing.JLabel();
        x1y3V = new javax.swing.JLabel();
        rY4 = new javax.swing.JTextField();
        yXLabel = new javax.swing.JLabel();
        add12 = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        rY5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();
        y1x2 = new javax.swing.JLabel();
        y1x3 = new javax.swing.JLabel();
        y1x4 = new javax.swing.JLabel();
        y1x5 = new javax.swing.JLabel();
        x1y2 = new javax.swing.JLabel();
        x1y4V = new javax.swing.JLabel();
        x1y5V = new javax.swing.JLabel();
        add6 = new javax.swing.JLabel();
        My2 = new javax.swing.JLabel();
        y2x1V = new javax.swing.JLabel();
        y2x3V = new javax.swing.JLabel();
        y2x4V = new javax.swing.JLabel();
        x4y1V = new javax.swing.JLabel();
        x1y3 = new javax.swing.JLabel();
        y4x5V = new javax.swing.JLabel();
        x1y4 = new javax.swing.JLabel();
        x4y5V = new javax.swing.JLabel();
        x1y5 = new javax.swing.JLabel();
        add1 = new javax.swing.JLabel();
        y2 = new javax.swing.JLabel();
        y2x1 = new javax.swing.JLabel();
        y2x3 = new javax.swing.JLabel();
        y2x4 = new javax.swing.JLabel();
        y2x5 = new javax.swing.JLabel();
        add2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        x2y4 = new javax.swing.JLabel();
        x2y3 = new javax.swing.JLabel();
        x2y1 = new javax.swing.JLabel();
        x2y5 = new javax.swing.JLabel();
        y3x2 = new javax.swing.JLabel();
        x3y5 = new javax.swing.JLabel();
        x3y1 = new javax.swing.JLabel();
        y3x1 = new javax.swing.JLabel();
        x3y4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        y3x4.setText("(x - 0)");

        y3x5.setText("(x - 0)");

        x3y2.setText("(1 - 0)");

        y3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y3.setText("0");

        add3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add3.setText("+");

        jLabel4.setText("-------------------------------------");

        x4y2.setText("(1 - 0)");

        x4y3.setText("(1 - 0)");

        x4y1.setText("(1 - 0)");

        y4x5.setText("(x - 0)");

        x4y5.setText("(1 - 0)");

        add4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add4.setText("+");

        y4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y4.setText("0");

        y4x3.setText("(x - 0)");

        y4x2.setText("(x - 0)");

        y4x1.setText("(x - 0)");

        jLabel5.setText("-------------------------------------");

        x5y2.setText("(1 - 0)");

        x5y3.setText("(1 - 0)");

        x5y1.setText("(1 - 0)");

        y5x4.setText("(x - 0)");

        x5y4.setText("(1 - 0)");

        y5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y5.setText("0");

        y5x3.setText("(x - 0)");

        y5x2.setText("(x - 0)");

        y5x1.setText("(x - 0)");

        jLabel6.setText("-------------------------------------");

        instruccionText.setEditable(false);
        instruccionText.setText("Se comienza el procedimiento, escribiendo la fórmula.");

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

        x3y5V.setText("(-----)");

        x3y1V.setText("(-----)");

        x5y3V.setText("(-----)");

        x5y1V.setText("(-----)");

        y5x4V.setText("(x)");

        x5y4V.setText("(-----)");

        My5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My5.setText("0");

        add7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add7.setText("+");

        y5x3V.setText("(x)");

        My4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My4.setText("0");

        y3x1V.setText("(x)");

        y4x3V.setText("(x)");

        y4x2V.setText("(x)");

        y2x5V.setText("(x)");

        y4x1V.setText("(x)");

        add8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add8.setText("+");

        jLabel10.setText("-------------------------------------");

        jLabel11.setText("-------------------------------------");

        x5y2V.setText("(-----)");

        y5x2V.setText("(x)");

        x3y4V.setText("(-----)");

        y5x1V.setText("(x)");

        y3x4V.setText("(x)");

        jLabel7.setText("-------------------------------------");

        y3x5V.setText("(x)");

        x3y2V.setText("(-----)");

        My3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My3.setText("0");

        x2y4V.setText("(-----)");

        add5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add5.setText("+");

        x2y3V.setText("(-----)");

        jLabel8.setText("-------------------------------------");

        x2y1V.setText("(-----)");

        x2y5V.setText("(-----)");

        y3x2V.setText("(x)");

        yXLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yXLabel1.setText("y (x) =");

        rY3.setEditable(false);
        rY3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY3.setText("----");

        rY1.setEditable(false);
        rY1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY1.setText("----");

        rY2.setEditable(false);
        rY2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY2.setText("----");

        add9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add9.setText("+");

        x4y2V.setText("(-----)");

        x4y3V.setText("(-----)");

        My1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My1.setText("0");

        jLabel9.setText("-------------------------------------");

        y1x2V.setText("(x)");

        y1x3V.setText("(x)");

        y1x4V.setText("(x)");

        y1x5V.setText("(x)");

        add10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add10.setText("+");

        x1y2V.setText("(-----)");

        add11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add11.setText("+");

        x1y3V.setText("(-----)");

        rY4.setEditable(false);
        rY4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY4.setText("----");

        yXLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yXLabel.setText("y (x) =");

        add12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add12.setText("+");

        y1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y1.setText("0");

        rY5.setEditable(false);
        rY5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rY5.setText("----");

        jLabel2.setText("-------------------------------------");

        resultadoLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        resultadoLabel.setText("???");

        y1x2.setText("(x - 0)");

        y1x3.setText("(x - 0)");

        y1x4.setText("(x - 0)");

        y1x5.setText("(x - 0)");

        x1y2.setText("(1 - 0)");

        x1y4V.setText("(-----)");

        x1y5V.setText("(-----)");

        add6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add6.setText("+");

        My2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        My2.setText("0");

        y2x1V.setText("(x)");

        y2x3V.setText("(x)");

        y2x4V.setText("(x)");

        x4y1V.setText("(-----)");

        x1y3.setText("(1 - 0)");

        y4x5V.setText("(x)");

        x1y4.setText("(1 - 0)");

        x4y5V.setText("(-----)");

        x1y5.setText("(1 - 0)");

        add1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add1.setText("+");

        y2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        y2.setText("0");

        y2x1.setText("(x - 0)");

        y2x3.setText("(x - 0)");

        y2x4.setText("(x - 0)");

        y2x5.setText("(x - 0)");

        add2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add2.setText("+");

        jLabel3.setText("-------------------------------------");

        x2y4.setText("(1 - 0)");

        x2y3.setText("(1 - 0)");

        x2y1.setText("(1 - 0)");

        x2y5.setText("(1 - 0)");

        y3x2.setText("(x - 0)");

        x3y5.setText("(1 - 0)");

        x3y1.setText("(1 - 0)");

        y3x1.setText("(x - 0)");

        x3y4.setText("(1 - 0)");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Procedimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(SigPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(OmiPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(yXLabel)
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(y1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(x1y2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1y3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1y4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1y5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(y1x2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y1x3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y1x4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y1x5)))
                                    .addGap(18, 18, 18)
                                    .addComponent(add1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(y2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(x2y1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x2y3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x2y4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x2y5))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(y2x1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y2x3)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y2x4)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y2x5)))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(add2)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(x3y1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x3y2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x3y4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x3y5))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(y3x1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y3x2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y3x4)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y3x5)))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(add3)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y4)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(x4y1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x4y2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x4y3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(x4y5))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(y4x1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y4x2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y4x3)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(y4x5)))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(add4))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(203, 203, 203)
                                            .addComponent(jLabel1)))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(y5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(y5x1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y5x2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y5x3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y5x4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(x5y1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x5y2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x5y3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x5y4))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(My1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(add6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(y1x2V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y1x3V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y1x4V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y1x5V)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(My2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(add8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(y2x1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y2x3V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y2x4V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y2x5V))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(x2y1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x2y3V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x2y4V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x2y5V)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(My3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(x3y1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x3y2V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x3y4V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x3y5V))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(add5))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(y3x1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y3x2V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y3x4V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y3x5V)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(My4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(x4y1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x4y2V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x4y3V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x4y5V))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(add7))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(y4x1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y4x2V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y4x3V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y4x5V))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(x1y2V)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1y3V)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1y4V)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1y5V))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rY1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(add9)
                                    .addGap(10, 10, 10)
                                    .addComponent(rY2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(add10)
                                    .addGap(24, 24, 24)
                                    .addComponent(rY3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(add11)
                                    .addGap(24, 24, 24)
                                    .addComponent(rY4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(add12)
                                    .addGap(24, 24, 24)
                                    .addComponent(rY5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(97, 97, 97)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(My5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(y5x1V)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y5x2V)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y5x3V)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y5x4V))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(x5y1V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x5y2V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x5y3V)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(x5y4V))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(353, 353, 353)
                            .addComponent(yXLabel1)
                            .addGap(57, 57, 57)
                            .addComponent(resultadoLabel)))
                    .addContainerGap(162, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigPaso)
                    .addComponent(OmiPaso)
                    .addComponent(regresarButton))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(y5x1)
                                .addComponent(y5x2)
                                .addComponent(y5x3)
                                .addComponent(y5x4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x5y1)
                                .addComponent(x5y2)
                                .addComponent(x5y3)
                                .addComponent(x5y4)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(y2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y2x1)
                                        .addComponent(y2x3)
                                        .addComponent(y2x4)
                                        .addComponent(y2x5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(add2))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x2y1)
                                .addComponent(x2y3)
                                .addComponent(x2y4)
                                .addComponent(x2y5)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y1)
                                    .addComponent(yXLabel))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y1x2)
                                        .addComponent(y1x3)
                                        .addComponent(y1x4)
                                        .addComponent(y1x5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(add1))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x1y2)
                                .addComponent(x1y3)
                                .addComponent(x1y4)
                                .addComponent(x1y5)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(y3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y3x1)
                                        .addComponent(y3x2)
                                        .addComponent(y3x4)
                                        .addComponent(y3x5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(add3))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x3y1)
                                .addComponent(x3y2)
                                .addComponent(x3y4)
                                .addComponent(x3y5)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(y4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y4x1)
                                        .addComponent(y4x2)
                                        .addComponent(y4x3)
                                        .addComponent(y4x5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(add4)))
                                .addComponent(y5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x4y1)
                                .addComponent(x4y2)
                                .addComponent(x4y3)
                                .addComponent(x4y5))))
                    .addGap(57, 57, 57)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(y5x1V)
                                .addComponent(y5x2V)
                                .addComponent(y5x3V)
                                .addComponent(y5x4V))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x5y1V)
                                .addComponent(x5y2V)
                                .addComponent(x5y3V)
                                .addComponent(x5y4V)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(My2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y2x1V)
                                        .addComponent(y2x3V)
                                        .addComponent(y2x4V)
                                        .addComponent(y2x5V))
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(add8))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x2y1V)
                                .addComponent(x2y3V)
                                .addComponent(x2y4V)
                                .addComponent(x2y5V)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(My1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y1x2V)
                                        .addComponent(y1x3V)
                                        .addComponent(y1x4V)
                                        .addComponent(y1x5V))
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(add6))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x1y2V)
                                .addComponent(x1y3V)
                                .addComponent(x1y4V)
                                .addComponent(x1y5V)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(My3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y3x1V)
                                        .addComponent(y3x2V)
                                        .addComponent(y3x4V)
                                        .addComponent(y3x5V))
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(add5))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x3y1V)
                                .addComponent(x3y2V)
                                .addComponent(x3y4V)
                                .addComponent(x3y5V)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(My4)
                                .addComponent(My5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(y4x1V)
                                        .addComponent(y4x2V)
                                        .addComponent(y4x3V)
                                        .addComponent(y4x5V))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(add7))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x4y1V)
                                .addComponent(x4y2V)
                                .addComponent(x4y3V)
                                .addComponent(x4y5V))))
                    .addGap(71, 71, 71)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rY3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rY1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rY2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add9)
                        .addComponent(add10)
                        .addComponent(rY4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add11)
                        .addComponent(rY5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add12))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yXLabel1)
                        .addComponent(resultadoLabel))
                    .addGap(148, 148, 148)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(resultado5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultado5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultado5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultado5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultado5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel My1;
    private javax.swing.JLabel My2;
    private javax.swing.JLabel My3;
    private javax.swing.JLabel My4;
    private javax.swing.JLabel My5;
    private javax.swing.JButton OmiPaso;
    private javax.swing.JButton SigPaso;
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add10;
    private javax.swing.JLabel add11;
    private javax.swing.JLabel add12;
    private javax.swing.JLabel add2;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JLabel add5;
    private javax.swing.JLabel add6;
    private javax.swing.JLabel add7;
    private javax.swing.JLabel add8;
    private javax.swing.JLabel add9;
    private javax.swing.JTextField instruccionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField rY1;
    private javax.swing.JTextField rY2;
    private javax.swing.JTextField rY3;
    private javax.swing.JTextField rY4;
    private javax.swing.JTextField rY5;
    private javax.swing.JButton regresarButton;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel x1y2;
    private javax.swing.JLabel x1y2V;
    private javax.swing.JLabel x1y3;
    private javax.swing.JLabel x1y3V;
    private javax.swing.JLabel x1y4;
    private javax.swing.JLabel x1y4V;
    private javax.swing.JLabel x1y5;
    private javax.swing.JLabel x1y5V;
    private javax.swing.JLabel x2y1;
    private javax.swing.JLabel x2y1V;
    private javax.swing.JLabel x2y3;
    private javax.swing.JLabel x2y3V;
    private javax.swing.JLabel x2y4;
    private javax.swing.JLabel x2y4V;
    private javax.swing.JLabel x2y5;
    private javax.swing.JLabel x2y5V;
    private javax.swing.JLabel x3y1;
    private javax.swing.JLabel x3y1V;
    private javax.swing.JLabel x3y2;
    private javax.swing.JLabel x3y2V;
    private javax.swing.JLabel x3y4;
    private javax.swing.JLabel x3y4V;
    private javax.swing.JLabel x3y5;
    private javax.swing.JLabel x3y5V;
    private javax.swing.JLabel x4y1;
    private javax.swing.JLabel x4y1V;
    private javax.swing.JLabel x4y2;
    private javax.swing.JLabel x4y2V;
    private javax.swing.JLabel x4y3;
    private javax.swing.JLabel x4y3V;
    private javax.swing.JLabel x4y5;
    private javax.swing.JLabel x4y5V;
    private javax.swing.JLabel x5y1;
    private javax.swing.JLabel x5y1V;
    private javax.swing.JLabel x5y2;
    private javax.swing.JLabel x5y2V;
    private javax.swing.JLabel x5y3;
    private javax.swing.JLabel x5y3V;
    private javax.swing.JLabel x5y4;
    private javax.swing.JLabel x5y4V;
    private javax.swing.JLabel y1;
    private javax.swing.JLabel y1x2;
    private javax.swing.JLabel y1x2V;
    private javax.swing.JLabel y1x3;
    private javax.swing.JLabel y1x3V;
    private javax.swing.JLabel y1x4;
    private javax.swing.JLabel y1x4V;
    private javax.swing.JLabel y1x5;
    private javax.swing.JLabel y1x5V;
    private javax.swing.JLabel y2;
    private javax.swing.JLabel y2x1;
    private javax.swing.JLabel y2x1V;
    private javax.swing.JLabel y2x3;
    private javax.swing.JLabel y2x3V;
    private javax.swing.JLabel y2x4;
    private javax.swing.JLabel y2x4V;
    private javax.swing.JLabel y2x5;
    private javax.swing.JLabel y2x5V;
    private javax.swing.JLabel y3;
    private javax.swing.JLabel y3x1;
    private javax.swing.JLabel y3x1V;
    private javax.swing.JLabel y3x2;
    private javax.swing.JLabel y3x2V;
    private javax.swing.JLabel y3x4;
    private javax.swing.JLabel y3x4V;
    private javax.swing.JLabel y3x5;
    private javax.swing.JLabel y3x5V;
    private javax.swing.JLabel y4;
    private javax.swing.JLabel y4x1;
    private javax.swing.JLabel y4x1V;
    private javax.swing.JLabel y4x2;
    private javax.swing.JLabel y4x2V;
    private javax.swing.JLabel y4x3;
    private javax.swing.JLabel y4x3V;
    private javax.swing.JLabel y4x5;
    private javax.swing.JLabel y4x5V;
    private javax.swing.JLabel y5;
    private javax.swing.JLabel y5x1;
    private javax.swing.JLabel y5x1V;
    private javax.swing.JLabel y5x2;
    private javax.swing.JLabel y5x2V;
    private javax.swing.JLabel y5x3;
    private javax.swing.JLabel y5x3V;
    private javax.swing.JLabel y5x4;
    private javax.swing.JLabel y5x4V;
    private javax.swing.JLabel yXLabel;
    private javax.swing.JLabel yXLabel1;
    // End of variables declaration//GEN-END:variables
}
