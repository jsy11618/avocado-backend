package avocado.ecommercebackend.review.dto;

import lombok.Data;

    @Data
    public class IReview {

        private Long id;
        private String text;
        private Long userId;
        private Long productId;
    }

