package rs.ac.ni.pmf.oop2.vezbe.invoices;

import lombok.Getter;
import rs.ac.ni.pmf.oop2.vezbe.Employee;

import java.util.Date;
import java.util.List;


public class Invoice {
    private List<InvoiceItem> items;
    private Employee employee;

    @Getter
    private Date invoiceDate;

    public Invoice(final List<InvoiceItem> items, final Employee employee)
    {
        this.items = items;
        this.employee = employee;
        invoiceDate = new Date();
    }

    public static void main(String[] args) {
        final Invoice invoice = new Invoice(null, null);
        System.out.println(invoice.getInvoiceDate());
    }
}
