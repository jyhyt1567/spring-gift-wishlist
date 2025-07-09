package gift.entity;

public class Wish {
    private Long id;
    private Long productId;
    private String memberEmail;
    private Long quantity;

    public Wish(Long id, Long productId, String memberEmail, Long quantity) {
        this.id = id;
        this.productId = productId;
        this.memberEmail = memberEmail;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public Long getQuantity() {
        return quantity;
    }
}
