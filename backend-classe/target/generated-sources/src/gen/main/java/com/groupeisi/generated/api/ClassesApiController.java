package com.groupeisi.generated.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-08T19:12:25.595791300Z[Atlantic/Reykjavik]")

@Controller
@RequestMapping("${openapi.aPIDesClasses.base-path:/classes/api}")
public class ClassesApiController implements ClassesApi {

    private final ClassesApiDelegate delegate;

    public ClassesApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ClassesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ClassesApiDelegate() {});
    }

    @Override
    public ClassesApiDelegate getDelegate() {
        return delegate;
    }

}
