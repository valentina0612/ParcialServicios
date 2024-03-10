package co.com.beca.microservice.resolveEnigmaApi.api;

import co.com.beca.microservice.resolveEnigmaApi.model.GetEnigmaRequest;
import co.com.beca.microservice.resolveEnigmaApi.model.GetEnigmaStepResponse;
import co.com.beca.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.beca.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;
import co.com.beca.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-10T17:17:20.850724300-05:00[America/Bogota]")
@Controller
public class GetStepApiController implements GetStepApi {

    private static final Logger log = LoggerFactory.getLogger(GetStepApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetStepApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<JsonApiBodyResponseSuccess>> getStep(@ApiParam(value = "request body get enigma step", required = true) @Valid @RequestBody JsonApiBodyRequest body) {
        List<GetEnigmaRequest> enigma = body.getData();
        GetEnigmaStepResponse enigmaStepResponse = new GetEnigmaStepResponse();

        enigmaStepResponse.setHeader(enigma.get(0).getHeader());
        enigmaStepResponse.setAnswer("Paso 2: Poner la jirafa adentro");
        JsonApiBodyResponseSuccess responseBody = new JsonApiBodyResponseSuccess();

        responseBody.addDataItem(enigmaStepResponse);
        List<JsonApiBodyResponseSuccess> responseList = Collections.singletonList(responseBody);
        return new ResponseEntity<>(responseList, HttpStatus.OK);
    }

}
