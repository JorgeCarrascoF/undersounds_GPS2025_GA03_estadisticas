package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.Album;
import io.swagger.service.RecommendationService;

@RestController
public class RecommendationsApiController implements RecommendationsApi {

    private final RecommendationService recommendationService;

    public RecommendationsApiController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @Override
    public ResponseEntity<List<Album>> getRecommendationsForUser(String userId) {
        List<Album> recommendedAlbums = recommendationService.getRecommendationsForUser(userId);
        return ResponseEntity.ok(recommendedAlbums);
    }
}
