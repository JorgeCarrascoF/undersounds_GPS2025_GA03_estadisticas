package io.swagger.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.model.Album;
import io.swagger.service.RecommendationService;

@RequestMapping("/recommendations")
public interface RecommendationsApi {

    @GetMapping("/user/{id}")
    ResponseEntity<List<Album>> getRecommendationsForUser(@PathVariable("id") String userId);
}
