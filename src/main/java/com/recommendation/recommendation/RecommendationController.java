package com.recommendation.recommendation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class RecommendationController {
    /*
     * Get all recommendations
     * GET /api/v1/recommendations
     * • Get all recommendations for a product
     * GET /api/v1/recommendations/productId
     * • Create a recommendation for a product
     * POST /api/v1/recommendation
     * • Delete all recommendation for a product
     * DELETE /api/v1/recommendation/productId
     * 
     */
    @GetMapping("/recommendations")
    public String getAllRecommendations() {
        return "Hello";
    }

    @GetMapping("/recommendations/{productId}")
    public void getRecommendationsForProduct() {

    }

    @PostMapping("/recommendation")
    public void createRecommendation() {

    }

    @DeleteMapping("/recommendation/{productId}")
    public void deleteRecommendation() {

    }

}
