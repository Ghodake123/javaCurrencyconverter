import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JTextField amountField;
    private JLabel resultLabel;

    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Initialize exchange rates (these are just example rates)
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("INR", 74.0);

        fromCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        toCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        amountField = new JTextField();
        resultLabel = new JLabel("Result:");

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertButtonListener());

        add(new JLabel("From:"));
        add(fromCurrency);
        add(new JLabel("To:"));
        add(toCurrency);
        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel());
        add(convertButton);
        add(new JLabel());
        add(resultLabel);

        setVisible(true);
    }

    private class ConvertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                String from = (String) fromCurrency.getSelectedItem();
                String to = (String) toCurrency.getSelectedItem();
                double rateFrom = exchangeRates.get(from);
                double rateTo = exchangeRates.get(to);
                double result = amount * (rateTo / rateFrom);
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CurrencyConverter::new);
    }
}
