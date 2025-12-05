package io.swagger.api;

import io.swagger.model.AlbumStats;
import io.swagger.model.ArtistStats;
import io.swagger.model.MerchStats;
import io.swagger.model.Song;
import io.swagger.service.StatService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")
@RestController
public class StatsApiController implements StatsApi {

    private static final Logger log = LoggerFactory.getLogger(StatsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final StatService statService;

    @org.springframework.beans.factory.annotation.Autowired
    public StatsApiController(ObjectMapper objectMapper, HttpServletRequest request, StatService statService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.statService = statService;
    }

    public ResponseEntity<AlbumStats> statsAlbumIdGet(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") String id) {
        return new ResponseEntity<AlbumStats>(statService.getAlbumStats(id), HttpStatus.OK);
    }

    public ResponseEntity<ArtistStats> statsArtistIdGet(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") String id) {
        return new ResponseEntity<ArtistStats>(statService.getArtistStats(id), HttpStatus.OK);
    }

    public ResponseEntity<MerchStats> statsMerchIdGet(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") String id) {
        return new ResponseEntity<MerchStats>(statService.getMerchStats(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Song>> statsSongsTopGet(
            @Parameter(in = ParameterIn.QUERY, description = "Number of songs to return", schema = @Schema(defaultValue = "10")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit) {
        return new ResponseEntity<List<Song>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
