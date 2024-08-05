import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Figuras Geométricas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Componentes para Círculo
        JLabel lblRadio = new JLabel("Radio del Círculo (cm):");
        lblRadio.setBounds(10, 10, 150, 25);
        frame.add(lblRadio);

        JTextField txtRadio = new JTextField();
        txtRadio.setBounds(170, 10, 100, 25);
        frame.add(txtRadio);

        JButton btnCalcularCirculo = new JButton("Calcular Círculo");
        btnCalcularCirculo.setBounds(10, 45, 150, 25);
        frame.add(btnCalcularCirculo);

        JLabel lblAreaCirculo = new JLabel("Área Círculo:");
        lblAreaCirculo.setBounds(10, 80, 150, 25);
        frame.add(lblAreaCirculo);

        JLabel lblPerimetroCirculo = new JLabel("Perímetro Círculo:");
        lblPerimetroCirculo.setBounds(10, 115, 150, 25);
        frame.add(lblPerimetroCirculo);

        // Componentes para Rectángulo
        JLabel lblBaseRectangulo = new JLabel("Base del Rectángulo (cm):");
        lblBaseRectangulo.setBounds(10, 150, 150, 25);
        frame.add(lblBaseRectangulo);

        JTextField txtBaseRectangulo = new JTextField();
        txtBaseRectangulo.setBounds(170, 150, 100, 25);
        frame.add(txtBaseRectangulo);

        JLabel lblAlturaRectangulo = new JLabel("Altura del Rectángulo (cm):");
        lblAlturaRectangulo.setBounds(10, 185, 150, 25);
        frame.add(lblAlturaRectangulo);

        JTextField txtAlturaRectangulo = new JTextField();
        txtAlturaRectangulo.setBounds(170, 185, 100, 25);
        frame.add(txtAlturaRectangulo);

        JButton btnCalcularRectangulo = new JButton("Calcular Rectángulo");
        btnCalcularRectangulo.setBounds(10, 220, 150, 25);
        frame.add(btnCalcularRectangulo);

        JLabel lblAreaRectangulo = new JLabel("Área Rectángulo:");
        lblAreaRectangulo.setBounds(170, 220, 150, 25);
        frame.add(lblAreaRectangulo);

        JLabel lblPerimetroRectangulo = new JLabel("Perímetro Rectángulo:");
        lblPerimetroRectangulo.setBounds(170, 245, 150, 25);
        frame.add(lblPerimetroRectangulo);

        // Componentes para Cuadrado
        JLabel lblLadoCuadrado = new JLabel("Lado del Cuadrado (cm):");
        lblLadoCuadrado.setBounds(10, 260, 150, 25);
        frame.add(lblLadoCuadrado);

        JTextField txtLadoCuadrado = new JTextField();
        txtLadoCuadrado.setBounds(170, 260, 100, 25);
        frame.add(txtLadoCuadrado);

        JButton btnCalcularCuadrado = new JButton("Calcular Cuadrado");
        btnCalcularCuadrado.setBounds(10, 295, 150, 25);
        frame.add(btnCalcularCuadrado);

        JLabel lblAreaCuadrado = new JLabel("Área Cuadrado:");
        lblAreaCuadrado.setBounds(170, 295, 150, 25);
        frame.add(lblAreaCuadrado);

        JLabel lblPerimetroCuadrado = new JLabel("Perímetro Cuadrado:");
        lblPerimetroCuadrado.setBounds(170, 320, 150, 25);
        frame.add(lblPerimetroCuadrado);

        // Componentes para Triángulo Rectángulo
        JLabel lblBaseTriangulo = new JLabel("Base del Triángulo (cm):");
        lblBaseTriangulo.setBounds(10, 335, 150, 25);
        frame.add(lblBaseTriangulo);

        JTextField txtBaseTriangulo = new JTextField();
        txtBaseTriangulo.setBounds(170, 335, 100, 25);
        frame.add(txtBaseTriangulo);

        JLabel lblAlturaTriangulo = new JLabel("Altura del Triángulo (cm):");
        lblAlturaTriangulo.setBounds(10, 370, 150, 25);
        frame.add(lblAlturaTriangulo);

        JTextField txtAlturaTriangulo = new JTextField();
        txtAlturaTriangulo.setBounds(170, 370, 100, 25);
        frame.add(txtAlturaTriangulo);

        JButton btnCalcularTriangulo = new JButton("Calcular Triángulo");
        btnCalcularTriangulo.setBounds(10, 405, 150, 25);
        frame.add(btnCalcularTriangulo);

        JLabel lblAreaTriangulo = new JLabel("Área Triángulo:");
        lblAreaTriangulo.setBounds(170, 405, 150, 25);
        frame.add(lblAreaTriangulo);

        JLabel lblPerimetroTriangulo = new JLabel("Perímetro Triángulo:");
        lblPerimetroTriangulo.setBounds(170, 430, 150, 25);
        frame.add(lblPerimetroTriangulo);

        JLabel lblTipoTriangulo = new JLabel("Tipo de Triángulo:");
        lblTipoTriangulo.setBounds(170, 455, 150, 25);
        frame.add(lblTipoTriangulo);

        // Acción para calcular Círculo
        btnCalcularCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int radio = Integer.parseInt(txtRadio.getText());
                Circulo circulo = new Circulo(radio);
                lblAreaCirculo.setText("Área Círculo: " + circulo.calcularArea());
                lblPerimetroCirculo.setText("Perímetro Círculo: " + circulo.calcularPerimetro());
            }
        });
// Acción para calcular Rectángulo
btnCalcularRectangulo.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        int base = Integer.parseInt(txtBaseRectangulo.getText());
        int altura = Integer.parseInt(txtAlturaRectangulo.getText());
        Rectangulo rectangulo = new Rectangulo(base, altura);
        lblAreaRectangulo.setText("Área Rectángulo: " + rectangulo.calcularArea());
        lblPerimetroRectangulo.setText("Perímetro Rectángulo: " + rectangulo.calcularPerimetro());
    }
});

// Acción para calcular Cuadrado
btnCalcularCuadrado.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        int lado = Integer.parseInt(txtLadoCuadrado.getText());
        Cuadrado cuadrado = new Cuadrado(lado);
        lblAreaCuadrado.setText("Área Cuadrado: " + cuadrado.calcularArea());
        lblPerimetroCuadrado.setText("Perímetro Cuadrado: " + cuadrado.calcularPerimetro());
    }
});

// Acción para calcular Triángulo Rectángulo
btnCalcularTriangulo.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        int base = Integer.parseInt(txtBaseTriangulo.getText());
        int altura = Integer.parseInt(txtAlturaTriangulo.getText());
        TrianguloRectangulo triangulo = new TrianguloRectangulo(base, altura);
        lblAreaTriangulo.setText("Área Triángulo: " + triangulo.calcularArea());
        lblPerimetroTriangulo.setText("Perímetro Triángulo: " + triangulo.calcularPerimetro());
        lblTipoTriangulo.setText("Tipo de Triángulo: " + triangulo.tipoDeTriangulo());
    }
});

frame.setVisible(true);
}
}