import javax.swing.*;


public class Calculadora {

    public static void main(String []args){

    JFrame jFrame = new JFrame("Calculadora");

    jFrame.setSize(400, 400);

    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jPanel = new JPanel();

    jFrame.add(jPanel);

    createComponents(jPanel);

    jFrame.setVisible(true);

    }

    private static void createComponents(JPanel jPanel) {

        jPanel.setLayout(null);

        CalculadoraBasicaImpl calculadora = new CalculadoraBasicaImpl();

        JTextField operador1 = new JTextField(20);
        operador1.setBounds(100,20,165,25);
        jPanel.add(operador1);

        JRadioButton r1=new JRadioButton(" + ");
        JRadioButton r2=new JRadioButton(" - ");
        JRadioButton r3=new JRadioButton(" * ");
        JRadioButton r4=new JRadioButton(" / ");
        r1.setBounds(100,50,50,30);
        r2.setBounds(150,50,50,30);
        r3.setBounds(200,50,50,30);
        r4.setBounds(250,50,50,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        jPanel.add(r1);
        jPanel.add(r2);
        jPanel.add(r3);
        jPanel.add(r4);


        JTextField operador2 = new JTextField(20);
        operador2.setBounds(100,80,165,25);
        jPanel.add(operador2);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(130, 110, 90, 25);
        jPanel.add(calcularButton);

        JLabel resultado = new JLabel("");
        resultado.setBounds(100,150,1000,25);
        jPanel.add(resultado);

        calcularButton.addActionListener(e -> {

            testeOperadores(operador1, operador2);

            if(r1.isSelected()){
                double soma = calculadora.soma(Double.parseDouble(operador1.getText()), Double.parseDouble(operador2.getText()));
//                JOptionPane.showMessageDialog(null, "SOMA: "+soma);
                resultado.setText("Resultado: " +soma);
            }
            if(r2.isSelected()){
                double subtracao = calculadora.subtracao(Double.parseDouble(operador1.getText()), Integer.parseInt(operador2.getText()));
//                JOptionPane.showMessageDialog(null, "SUBTRACAO: "+subtracao);
                resultado.setText("Resultado: " +subtracao);
            }
            if(r3.isSelected()){
                double multiplicacao = calculadora.multiplicacao(Double.parseDouble(operador1.getText()), Double.parseDouble(operador2.getText()));
//                JOptionPane.showMessageDialog(null, "MULTIPLICACAO: "+multiplicacao);
                resultado.setText("Resultado: " +multiplicacao);
            }
            if(r4.isSelected()){
                if(Double.parseDouble(operador1.getText()) == 0 || Double.parseDouble(operador2.getText()) == 0){
                    JOptionPane.showMessageDialog(null, "Não existe divisão por 0");
                }else {
                    double divisao = calculadora.divisao(Double.parseDouble(operador1.getText()), Double.parseDouble(operador2.getText()));
//                    JOptionPane.showMessageDialog(null, "DIVISAO: " + divisao);
                    resultado.setText("Resultado: " +divisao);
                }
            }

        });
    }

    private static void testeOperadores(JTextField operador1, JTextField operador2) {

        try{
            Double.parseDouble(operador1.getText());
            Double.parseDouble(operador2.getText());

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite números de 0 - 9!");
        }
    }

}
