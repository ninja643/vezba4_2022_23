package rs.ac.ni.pmf.oop2.vezbe.invoices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    public void shouldComputeTotalCost()
    {
        final InvoiceItem invoiceItem = new InvoiceItem(1, "", 10, 100.0);
        assertThat(invoiceItem.getTotal()).isEqualTo(1000.0);
    }
}