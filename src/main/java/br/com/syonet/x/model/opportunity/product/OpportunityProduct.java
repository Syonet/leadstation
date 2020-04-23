package br.com.syonet.x.model.opportunity.product;

import java.io.Serializable;
import java.util.UUID;

import br.com.syonet.x.model.product.Product;

public class OpportunityProduct implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private UUID opportunityId;
    private UUID productId;
    private int quantity;
    private float discount;
    private float totalPrice;
    private Product product;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public UUID getOpportunityId () {
        return opportunityId;
    }

    public void setOpportunityId ( UUID opportunityId ) {
        this.opportunityId = opportunityId;
    }

    public UUID getProductId () {
        return productId;
    }

    public void setProductId ( UUID productId ) {
        this.productId = productId;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity ( int quantity ) {
        this.quantity = quantity;
    }

    public float getDiscount () {
        return discount;
    }

    public void setDiscount ( float discount ) {
        this.discount = discount;
    }

    public float getTotalPrice () {
        return totalPrice;
    }

    public void setTotalPrice ( float totalPrice ) {
        this.totalPrice = totalPrice;
    }

    public Product getProduct () {
        return product;
    }

    public void setProduct ( Product product ) {
        this.product = product;
    }
}
