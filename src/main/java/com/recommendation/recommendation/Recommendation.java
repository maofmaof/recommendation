package com.recommendation.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {

    int recommendationId;
    int productId;
    int rating;
    String comment;
    String email;

}
