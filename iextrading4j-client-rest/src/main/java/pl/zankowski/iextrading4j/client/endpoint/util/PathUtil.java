package pl.zankowski.iextrading4j.client.endpoint.util;

import javax.ws.rs.client.WebTarget;

/**
 * @author Wojciech Zankowski
 */
public class PathUtil {

    private PathUtil() {}

    public static WebTarget appendQuery(WebTarget webTarget, String param, String value) {
        return webTarget.queryParam(param, value);
    }

    public static WebTarget appendPaths(WebTarget webTarget, String... paths) {
        for (String path : paths) {
            webTarget = webTarget.path(path);
        }
        return webTarget;
    }

}
