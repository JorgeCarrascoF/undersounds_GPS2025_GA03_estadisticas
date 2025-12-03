package io.swagger.api;

import io.swagger.model.AlbumStats;
import io.swagger.model.ArtistStats;
import io.swagger.model.Error;
import io.swagger.model.MerchStats;
import io.swagger.model.Song;
import io.swagger.service.StatService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
        // String accept = request.getHeader("Accept");
        // if (accept != null && accept.contains("application/json")) {
        //     try {
        //         return new ResponseEntity<List<Song>>(objectMapper.readValue(
        //                 "[ {\n  \"trackNumber\" : 6,\n  \"artist\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  },\n  \"album\" : {\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"title\" : \"title\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"label\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  },\n  \"audio\" : {\n    \"codec\" : \"codec\",\n    \"bitrate\" : 1,\n    \"url\" : \"http://example.com/aeiou\"\n  },\n  \"title\" : \"title\",\n  \"durationSec\" : 0\n}, {\n  \"trackNumber\" : 6,\n  \"artist\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  },\n  \"album\" : {\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"title\" : \"title\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"label\" : {\n    \"name\" : \"name\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  },\n  \"audio\" : {\n    \"codec\" : \"codec\",\n    \"bitrate\" : 1,\n    \"url\" : \"http://example.com/aeiou\"\n  },\n  \"title\" : \"title\",\n  \"durationSec\" : 0\n} ]",
        //                 List.class), HttpStatus.NOT_IMPLEMENTED);
        //     } catch (IOException e) {
        //         log.error("Couldn't serialize response for content type application/json", e);
        //         return new ResponseEntity<List<Song>>(HttpStatus.INTERNAL_SERVER_ERROR);
        //     }
        // }

        return new ResponseEntity<List<Song>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
