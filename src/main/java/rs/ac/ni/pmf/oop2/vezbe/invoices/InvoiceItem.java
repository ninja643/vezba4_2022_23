package rs.ac.ni.pmf.oop2.vezbe.invoices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class InvoiceItem {
    private int id;
    private String description;
    private int quantity;
    private double unitPrice;

    public double getTotal()
    {
        return quantity * unitPrice;
    }
}
