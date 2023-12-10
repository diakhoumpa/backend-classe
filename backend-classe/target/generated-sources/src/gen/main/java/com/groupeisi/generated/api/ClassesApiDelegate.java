package com.groupeisi.generated.api;

import com.groupeisi.generated.model.ClasseDTO;
import com.groupeisi.generated.model.ClassesResultListDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ClassesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-08T19:12:25.595791300Z[Atlantic/Reykjavik]")

public interface ClassesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /classes : Get All Actifs Classes
     *
     * @param currentPage  (required)
     * @param sizePage  (required)
     * @return SUCCESS (status code 200)
     *         or NOT FOUND (status code 404)
     *         or BAD REQUEST (status code 400)
     * @see ClassesApi#getAllClasses
     */
    default ResponseEntity<ClassesResultListDTO> getAllClasses(Integer currentPage,
        Integer sizePage) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"classeList\" : [ { \"idClasse\" : 0, \"name\" : \"name\" }, { \"idClasse\" : 0, \"name\" : \"name\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /classes/{idClasse} : Retrieve an classe
     *
     * @param idClasse  (required)
     * @return SUCCESS (status code 200)
     *         or NOT FOUND (status code 404)
     *         or BAD REQUEST (status code 400)
     * @see ClassesApi#getClasse
     */
    default ResponseEntity<ClasseDTO> getClasse(Long idClasse) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"idClasse\" : 0, \"name\" : \"name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
