package de.agrirouter.middleware.controller;

import de.agrirouter.middleware.api.Routes;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

/**
 * Base class for the private API controllers.
 */
@SecurityScheme(
        name = "secured",
        description = "Default security scheme, used for the private flows.",
        type = SecuritySchemeType.HTTP,
        scheme = "basic"
)
@SecurityRequirement(
        name = "secured-api"
)
public interface SecuredApiController {

    String API_PREFIX = Routes.SecuredRestEndpoints.ALL_REQUESTS;

}
